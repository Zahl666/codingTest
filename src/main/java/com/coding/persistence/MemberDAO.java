package com.coding.persistence;

import java.util.List;

import com.coding.vo.MemberVO;

public interface MemberDAO {

	public void createMember(MemberVO vo)throws Exception; //ȸ������ c
	public List<MemberVO> listMember()throws Exception; //��ü ȸ�� ��ȸ r
	public void infoMember(MemberVO vo)throws Exception; //ȸ�� ����ȸ u
	public void deleteMember(MemberVO vo)throws Exception; //ȸ��Ż�� d
	public MemberVO readMember(String user_Id)throws Exception;
	
}
