package com.coding.vo;



import java.sql.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class MemberVO {
	
	@NotNull
	@Size(min=4,max=10,message="���̵�� 4~10�� ���̷� �Է��ϼ���")
	private String user_Id;
	@NotNull
	@Size(min=2,max=10,message="�̸��� 2~10�� ���̷� �Է��ϼ���")
	private String user_Name;
	@NotNull
	@Size(min=10,max=50,message="�̸����� 10~50�� ���̷� �Է��ϼ���")
	@Pattern(regexp="^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$")
	private String user_Email;
	@Size(min=2,max=20,message="������ 2~20�� ���̷� �Է��ϼ���")
	private String user_NickName;
	@NotNull(message="��¥�� �����ϼ���") //�����ؾ��� view���� ��¥�� ������������ ���ó�¥
	private Date user_RegDate;
	
	@Override
	public String toString() {
		return "MemberVO [user_Id=" + user_Id + ", user_Name=" + user_Name + ", user_Email=" + user_Email
				+ ", user_NickName=" + user_NickName + ", user_RegDate=" + user_RegDate + "]";
	}
	public String getUser_Id() {
		return user_Id;
	}
	public void setUser_Id(String user_Id) {
		this.user_Id = user_Id;
	}
	public String getUser_Name() {
		return user_Name;
	}
	public void setUser_Name(String user_Name) {
		this.user_Name = user_Name;
	}
	public String getUser_Email() {
		return user_Email;
	}
	public void setUser_Email(String user_Email) {
		this.user_Email = user_Email;
	}
	public String getUser_NickName() {
		return user_NickName;
	}
	public void setUser_NickName(String user_NickName) {
		this.user_NickName = user_NickName;
	}
	public Date getUser_RegDate() {
		return user_RegDate;
	}
	public void setUser_RegDate(Date user_RegDate) {
		this.user_RegDate = user_RegDate;
	}
}
