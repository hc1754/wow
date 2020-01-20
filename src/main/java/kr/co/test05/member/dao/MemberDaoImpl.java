package kr.co.test05.member.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kr.co.test05.member.vo.MemberVO;

@Repository
public class MemberDaoImpl implements MemberDao{

    @Inject
    private SqlSession session;
    
	@Override
	public void insertMember(MemberVO vo) {
		session.insert("insertMember", vo);
	}

}
