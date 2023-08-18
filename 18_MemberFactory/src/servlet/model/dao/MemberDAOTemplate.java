<<<<<<< HEAD
package servlet.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import servlet.model.vo.MemberVO;

public interface MemberDAOTemplate {
	Connection getConnection()  throws SQLException;
	void closeAll(PreparedStatement ps, Connection conn) throws SQLException;
	void closeAll(ResultSet rs, PreparedStatement ps, Connection conn) throws SQLException;
	
	void registerMember(MemberVO vo) throws SQLException;
	MemberVO login(String id, String password) throws SQLException;
	MemberVO findMyIdMember(String id) throws SQLException;
	ArrayList<MemberVO> showAllMember() throws SQLException;
	
}
=======
package servlet.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import servlet.model.vo.MemberVO;

public interface MemberDAOTemplate {
	Connection getConnection()  throws SQLException;
	void closeAll(PreparedStatement ps, Connection conn) throws SQLException;
	void closeAll(ResultSet rs, PreparedStatement ps, Connection conn) throws SQLException;
	
	void registerMember(MemberVO vo) throws SQLException;
	MemberVO login(String id, String password) throws SQLException;
	MemberVO findMyIdMember(String id) throws SQLException;
	ArrayList<MemberVO> showAllMember() throws SQLException;
	
}
>>>>>>> 39962ce69ee23085eb516ff40cf41f72958c13ab
