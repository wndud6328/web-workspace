package servlet.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet.model.vo.MemberDTO;

public class ShowAllMember extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// 1. 폼 데이터 받아오기
	String name = request.getParameter("name");
	
	// 2. DAO 리턴 받아서
	MemberDTO dto = new MemberDTO();
	
	
	// 3. 멤버 정보 1개 바인딩
	
	// 4. 네비게이션 -> view.jsp
	if(dto!=null) {
		//성공
		request.getRequestDispatcher("find_ok.jsp").forward(request, response);
	} else {
		//실패
		request.getRequestDispatcher("find_fail.jsp").forward(request, response);
}}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
}
