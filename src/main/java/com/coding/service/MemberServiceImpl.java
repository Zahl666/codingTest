package com.coding.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.coding.persistence.MemberDAO;
import com.coding.vo.MemberVO;

@Service
//spring의 bean으로 인식되기 위해 애노테이션 적용
public class MemberServiceImpl implements MemberService{

	@Inject
	private MemberDAO dao;
	@Override
	public void regist(MemberVO member) throws Exception {
		dao.createMember(member);
	}
	@Override
	public List<MemberVO> listMember() throws Exception {
		return dao.listMember();
	}
	@Override
	public MemberVO readMember(String user_Id) throws Exception {
		return dao.readMember(user_Id);
	}

}
