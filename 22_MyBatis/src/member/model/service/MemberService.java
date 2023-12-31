package member.model.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import common.SqlSessionTemplate;
import member.model.dao.MemberDAO;
import member.model.vo.MemberVO;

// 연결순서 : DAO - Service - Controller 
public class MemberService {
	
	public int registerMember(MemberVO vo) {
		SqlSession sqlSession = SqlSessionTemplate.getSqlSession();
		int result = MemberDAO.getInstance().registerMember(sqlSession, vo);
		
		if(result > 0) sqlSession.commit();
		sqlSession.close();
		
		return result;
		
	}
	// showAllMember, findByIdMember, login, updateMember
	public List<MemberVO> showAllMember(){
		SqlSession sqlSession = SqlSessionTemplate.getSqlSession();
		List<MemberVO> list = MemberDAO.getInstance().showAllMember(sqlSession);
		sqlSession.close();
		return list;
	}
	public MemberVO findByIdMember(String id) {
		SqlSession sqlSession = SqlSessionTemplate.getSqlSession();
		MemberVO member = MemberDAO.getInstance().findMyIdMember(sqlSession, id);
		sqlSession.close();
		return member;
	}
	public MemberVO login(MemberVO vo) {
		SqlSession sqlSession = SqlSessionTemplate.getSqlSession();
		MemberVO member = MemberDAO.getInstance().login(sqlSession, vo);
		sqlSession.close();
		return member;
	}
	public int updateMember(MemberVO vo) {
		SqlSession sqlSession = SqlSessionTemplate.getSqlSession();
		int result = MemberDAO.getInstance().updateMember(sqlSession, vo);
		if(result > 0) sqlSession.commit();
		sqlSession.close();
		return result;
	}
}
