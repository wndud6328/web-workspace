package servlet.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import config.ServerInfo;
import servlet.model.vo.MemberDTO;

public class MemberDAO implements MemberDAOTemplate {

	public MemberDAO() {
		try {
			Class.forName(ServerInfo.DRIVER_NAME);
			System.out.println("DRIVER LOADING..");
		} catch (ClassNotFoundException e) {}
	}
	@Override
	public Connection getConnection() throws SQLException {
		Connection conn = DriverManager.getConnection(ServerInfo.URL, ServerInfo.USER, ServerInfo.PASSWORD);
		System.out.println("DB Connection..");
		return conn;
	}

	@Override
	public void closeAll(PreparedStatement ps, Connection conn) throws SQLException {
		ps.close();
		conn.close();
	}

	@Override
	public void closeAll(ResultSet rs, PreparedStatement ps, Connection conn) throws SQLException {
		rs.close();
		closeAll(ps,conn);
	}

	@Override
	public void registerMember(MemberDTO dto) throws SQLException {
		Connection conn = getConnection();
		
		String query = "INSERT INTO MEMBER(ID, PASSWORD, NAME, ADDRESS) VALUES (?, ?, ?, ?)";
		PreparedStatement ps = conn.prepareStatement(query);
		
		ps.setString(1, dto.getId());
		ps.setString(2, dto.getPassword());
		ps.setString(3, dto.getName());
		ps.setString(4, dto.getAddress());	
		
		ps.executeUpdate();
		
		closeAll(ps, conn);

	}

	@Override
	public MemberDTO login(String id, String password) throws SQLException {
		Connection conn = getConnection();
		
		String query = "SELECT * FROM MEMBER WHERE ID=? AND PASSWORD=?";
		PreparedStatement ps = conn.prepareStatement(query);
		
		ps.setString(1, id);
		ps.setString(2, password);
		
		ResultSet rs = ps.executeQuery();
		MemberDTO dto = null;
		if(rs.next()) {
			dto = new MemberDTO();
			dto.setId(rs.getString("id"));
			dto.setPassword(rs.getString("password"));
			dto.setName(rs.getString("name"));
			dto.setAddress(rs.getString("address"));
		} 
		closeAll(rs, ps, conn);
		return dto;
	}

	@Override
	public MemberDTO findByMemberDTO(String id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<MemberDTO> showAllMember() throws SQLException {
		return null;
	}
	public static void main(String[] args) {
		MemberDAO dao = new MemberDAO();
		
		MemberDTO dto = new MemberDTO();
		dto.setId("user1");
		dto.setPassword("user1");
		dto.setName("김유저");
		dto.setAddress("경기 광주");
		
		try {
//			dao.registerMember(dto);
			dto = dao.login("user1", "user1");
			System.out.println("name : " + dto.getName());
			System.out.println("address : " + dto.getAddress());
		
		} catch (SQLException e) {}
	}
}
