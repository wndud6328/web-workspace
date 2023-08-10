package servlet.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import servlet.model.dao.MemberDAO;
import servlet.model.vo.MemberDTO;
import servlet.model.vo.MemberVO;

@WebServlet(urlPatterns="/front.do")
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 요청이 어디에서 들어는 요청인지.. command 값 받는다.
		String command = request.getParameter("command");
		String path = "index.jsp";
				
		try {
			if(command.equals("register")) {
				path = register(request, response);
			}
		} catch (SQLException e) {}
		
		// 네비게이션
		request.getRequestDispatcher(path).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	protected String register(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		
		MemberVO vo = new MemberVO(id, password, name, address);
		
		MemberDAO.getInstance().registerMember(vo);
		
		return "index.jsp";
	}

}
