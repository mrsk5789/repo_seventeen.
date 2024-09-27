package com.example.hybe.infra.classes;

import java.util.Date;

public class ClassesDto {
	
	private Integer seq;
	private String  className;
	private String teacher;
	private String classDesc;
	private Date  regDate;
	private Date modDate;
	private String price;
	private String  terms;
	private Integer delny;
	private Integer UseNy;
	private Integer orders;
	
	
	public Integer getSeq() {
		return seq;
	}
	public void setSeq(Integer seq) {
		this.seq = seq;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	public String getClassDesc() {
		return classDesc;
	}
	public void setClassDesc(String classDesc) {
		this.classDesc = classDesc;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public Date getModDate() {
		return modDate;
	}
	public void setModDate(Date modDate) {
		this.modDate = modDate;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getTerms() {
		return terms;
	}
	public void setTerms(String terms) {
		this.terms = terms;
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
	public Integer getOrders() {
		return orders;
	}
	public void setOrders(Integer orders) {
		this.orders = orders;
	}
}
