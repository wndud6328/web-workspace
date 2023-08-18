<<<<<<< HEAD
package member.controller.component;

import javax.member.http.HttpServletRequest;
import javax.member.http.HttpServletResponse;
import javax.member.http.HttpSession;

import member.controller.Controller;
import member.controller.ModelAndView;
import member.model.dao.MemberDAO;
import member.model.vo.MemberVO;

public class UpdateController implements Controller {

	@Override
	public ModelAndView handle(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		
		MemberVO vo = new MemberVO(id, password, name, address);
		MemberDAO.getInstance().updateMember(vo);
		
		HttpSession session = request.getSession();
		if(session.getAttribute("vo")!=null) {
			session.setAttribute("vo", vo);
		}
		
		return new ModelAndView("views/update_result.jsp");
	}

}
=======
package member.controller.component;

import javax.member.http.HttpServletRequest;
import javax.member.http.HttpServletResponse;
import javax.member.http.HttpSession;

import member.controller.Controller;
import member.controller.ModelAndView;
import member.model.dao.MemberDAO;
import member.model.vo.MemberVO;

public class UpdateController implements Controller {

	@Override
	public ModelAndView handle(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		
		MemberVO vo = new MemberVO(id, password, name, address);
		MemberDAO.getInstance().updateMember(vo);
		
		HttpSession session = request.getSession();
		if(session.getAttribute("vo")!=null) {
			session.setAttribute("vo", vo);
		}
		
		return new ModelAndView("views/update_result.jsp");
	}

}
>>>>>>> 39962ce69ee23085eb516ff40cf41f72958c13ab
