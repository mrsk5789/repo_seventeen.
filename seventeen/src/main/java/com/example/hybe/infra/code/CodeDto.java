package com.example.hybe.infra.code;

import java.util.Date;

public class CodeDto {
	
	private Integer ifcdSeq;
	private String ifcdName;
	private Integer ifcdUseNy;
	private Integer ifcdOrder;
	private String ifcdDesc;
	private Integer ifcdDelNy;
	private String ifcdDelete;
	private Date ifcdRegDate;
	private Date ifcdRenDate;
	private Integer codegroup_seq;
	
	
	
	public Integer getIfcdSeq() {
		return ifcdSeq;
	}
	public void setIfcdSeq(Integer ifcdSeq) {
		this.ifcdSeq = ifcdSeq;
	}
	public String getIfcdName() {
		return ifcdName;
	}
	public void setIfcdName(String ifcdName) {
		this.ifcdName = ifcdName;
	}
	public Integer getIfcdUseNy() {
		return ifcdUseNy;
	}
	public void setIfcdUseNy(Integer ifcdUseNy) {
		this.ifcdUseNy = ifcdUseNy;
	}
	public Integer getIfcdOrder() {
		return ifcdOrder;
	}
	public void setIfcdOrder(Integer ifcdOrder) {
		this.ifcdOrder = ifcdOrder;
	}
	public String getIfcdDesc() {
		return ifcdDesc;
	}
	public void setIfcdDesc(String ifcdDesc) {
		this.ifcdDesc = ifcdDesc;
	}
	public Integer getIfcdDelNy() {
		return ifcdDelNy;
	}
	public void setIfcdDelNy(Integer ifcdDelNy) {
		this.ifcdDelNy = ifcdDelNy;
	}
	public String getIfcdDelete() {
		return ifcdDelete;
	}
	public void setIfcdDelete(String ifcdDelete) {
		this.ifcdDelete = ifcdDelete;
	}
	public Date getIfcdRegDate() {
		return ifcdRegDate;
	}
	public void setIfcdRegDate(Date ifcdRegDate) {
		this.ifcdRegDate = ifcdRegDate;
	}
	public Date getIfcdRenDate() {
		return ifcdRenDate;
	}
	public void setIfcdRenDate(Date ifcdRenDate) {
		this.ifcdRenDate = ifcdRenDate;
	}
	public Integer getCodegroup_seq() {
		return codegroup_seq;
	}
	public void setCodegroup_seq(Integer codegroup_seq) {
		this.codegroup_seq = codegroup_seq;
	}

}
