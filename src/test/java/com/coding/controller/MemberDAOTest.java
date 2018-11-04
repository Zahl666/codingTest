package com.coding.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.coding.persistence.MemberDAO;
import com.coding.vo.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class MemberDAOTest {

	@Inject
	private MemberDAO dao;
	
	@Test
	public void testCreateMember() throws Exception{
		
		String from = "2017-11-06 10:10:10";
		SimpleDateFormat transFormat = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
		Date to = transFormat.parse(from);
		MemberVO vo = new MemberVO();
		vo.setUser_Id("admin");
		vo.setUser_Name("name");
		vo.setUser_Email("admin@host.com");
		vo.setUser_NickName("adm");
		vo.setUser_RegDate(to);
		
		dao.createMember(vo);
		
/*		
  		private String user_Id;
		private String user_Name;
		private String user_Email;
		private String user_NickName;
		private Date user_RegDate;
*/
	}
		
}
