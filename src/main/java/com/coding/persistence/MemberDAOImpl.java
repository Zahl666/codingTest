package com.coding.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.coding.vo.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO {

	@Inject
	private SqlSession session;
	private static String namespace = "com.coding.mapper.Mapper";
	
	@Override
	public void createMember(MemberVO vo) throws Exception {
		session.insert(namespace+".createMember", vo);
	}

	@Override
	public List<MemberVO> listMember() throws Exception {
		return session.selectList(namespace+".listMember");
	}

	@Override
	public void infoMember(MemberVO vo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMember(MemberVO vo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MemberVO readMember(String user_Id) throws Exception {
		return session.selectOne(namespace+".readMember", user_Id);
	}

}
