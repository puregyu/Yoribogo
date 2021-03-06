package com.yoribogo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Member {
	
	@Id
	private String id;
	private String pwd;
	private String name;
	private String nickname;
	private String email;
	@Column(insertable=false,updatable=false)//insert할 때 빼줘라 / DB에서 지정한 기본값으로 들어가라   
	private Date regDate;
	private String file;
	
	
	public Member() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Member(String id, String pwd, String name, String nickname, String email, String file) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.nickname = nickname;
		this.email = email;
		this.file = file;
	}


	public Member(String id, String pwd, String name, String nickname, String email, Date regDate, String file) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.nickname = nickname;
		this.email = email;
		this.regDate = regDate;
		this.file = file;
	}





	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPwd() {
		return pwd;
	}


	public void setPwd(String pwd) {
		this.pwd = pwd;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getNickname() {
		return nickname;
	}


	public void setNickname(String nickname) {
		this.nickname = nickname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}


	public String getPhoto() {
		return file;
	}


	public void setPhoto(String photo) {
		this.file = photo;
	}

	@Override
	public String toString() {
		return "Member [nickname=" + nickname + ", regDate=" + regDate + ", id=" + id + ", pwd=" + pwd + ", name=" + name + ", file=" + file + "]";
	}


	public String getPhoto(String writerId) {
		return file;
		
	}
	
	
	
}