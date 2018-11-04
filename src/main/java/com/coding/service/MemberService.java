package com.coding.service;

import java.util.List;

import com.coding.vo.MemberVO;

public interface MemberService {

	public void regist(MemberVO member)throws Exception;
	public List<MemberVO> listMember() throws Exception;
	public MemberVO readMember(String user_Id)throws Exception;
}
