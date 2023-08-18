package member.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.model.service.MemberService;
import member.model.vo.MemberVO;

public class AllMemberController implements Controller{

	public ModelAndView handle(HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<MemberVO> list = new MemberService().showAllMember();
		request.setAttribute("list", list);
		return new ModelAndView("views/allShow.jsp");
	}

}
