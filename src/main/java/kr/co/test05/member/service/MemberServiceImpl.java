package kr.co.test05.member.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.test05.member.dao.MemberDao;
import kr.co.test05.member.vo.MemberVO;

@Service
public class MemberServiceImpl implements MemberService{

	@Inject
    private MemberDao dao;

	@Override
	public void insertMember(MemberVO vo) {
		dao.insertMember(vo);
	}
}
