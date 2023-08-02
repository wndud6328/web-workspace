package servlet.header;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PrintHeaderServlet
 */
public class PrintHeaderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String id = request.getParameter("id");
		
		PrintWriter out = response.getWriter();
		
		out.println("<h2>여기는 서비스입니다...</h2>");
		out.println("<p>ID : " + id + "</p>");
		out.close();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doget~~~~");
		
		PrintWriter out = response.getWriter();
		
		out.println("<h2>여기는 doGet입니다...</h2>");
		
		// header 정보
		Enumeration<String> en = request.getHeaderNames();
		while(en.hasMoreElements()) {
			String key = en.nextElement();
			String value = request.getHeader(key);
			out.println("<p> key:" + key + ", value : " + value + "</p>");
		}
		out.close();
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
	}

}
