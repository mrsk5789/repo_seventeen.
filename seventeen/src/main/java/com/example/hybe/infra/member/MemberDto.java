package com.example.hybe.infra.member;

import java.util.Date;

public class MemberDto {
	
	
	private Integer seq;
	private String name;
	private String id;
	private String nickname;
	private Integer delny;
	private Integer UseNy;
	private Integer ordere;
	private String email;
	private String phonenumber;
	private String adress;
	private Date regdate;
	private String gender;
	private String password;
	private String desce;
	private Date modDate;
	
	public Integer getSeq() {
		return seq;
	}
	public void setSeq(Integer seq) {
		this.seq = seq;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public Integer getDelny() {
		return delny;
	}
	public void setDelny(Integer delny) {
		this.delny = delny;
	}
	public Integer getUseNy() {
		return UseNy;
	}
	public void setUseNy(Integer useNy) {
		UseNy = useNy;
	}
	public Integer getOrdere() {
		return ordere;
	}
	public void setOrdere(Integer ordere) {
		this.ordere = ordere;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
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
	public String getDesce() {
		return desce;
	}
	public void setDesce(String desce) {
		this.desce = desce;
	}
	public Date getModDate() {
		return modDate;
	}
	public void setModDate(Date modDate) {
		this.modDate = modDate;
	}
	
	
	
	
}