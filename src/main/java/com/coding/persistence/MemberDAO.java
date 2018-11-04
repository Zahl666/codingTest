package com.coding.persistence;

import java.util.List;

import com.coding.vo.MemberVO;

public interface MemberDAO {

	public void createMember(MemberVO vo)throws Exception; //회원생성 c
	public List<MemberVO> listMember()throws Exception; //전체 회원 조회 r
	public void infoMember(MemberVO vo)throws Exception; //회원 상세조회 u
	public void deleteMember(MemberVO vo)throws Exception; //회원탈퇴 d
	public MemberVO readMember(String user_Id)throws Exception;
	
}
