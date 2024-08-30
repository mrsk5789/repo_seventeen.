package com.example.hybe.infra.member;

import org.thymeleaf.expression.Dates;

public class MemberDto {
	
	
	private Integer Seq;
	private String Name;
	private String id;
	private String Nickname;
	private Integer Delny;
	private String email;
	private Integer phonenumber;
	private String adress;
	private Dates regdate;
	private String gender;
	private String password;
	private String desc;
	private Dates modDate;
	
	
	public Integer getSeq() {
		return Seq;
	}
	public void setSeq(Integer seq) {
		Seq = seq;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNickname() {
		return Nickname;
	}
	public void setNickname(String nickname) {
		Nickname = nickname;
	}
	public Integer getDelny() {
		return Delny;
	}
	public void setDelny(Integer delny) {
		Delny = delny;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(Integer phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public Dates getRegdate() {
		return regdate;
	}
	public void setRegdate(Dates regdate) {
		this.regdate = regdate;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Dates getModDate() {
		return modDate;
	}
	public void setModDate(Dates modDate) {
		this.modDate = modDate;
	}
	
	
	
}
