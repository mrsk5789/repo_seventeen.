package com.example.hybe.infra.code;

import java.util.Date;

public class CodeDto {
	
	private Integer ifcdSeq;
	private String ifcdName;
	private Integer ifcdUseNy;
	private Integer ifcdOrder;
	private String ifcdDesc;
	private Integer ifcdDelny;
	private Date ifcdRegDate;
	private Date ifcdmodDate;
	private String ifcgSeq;
	private String ifcgName;
	
	public String getIfcgSeq() {
		return ifcgSeq;
	}
	public void setIfcgSeq(String ifcgSeq) {
		this.ifcgSeq = ifcgSeq;
	}
	public String getIfcgName() {
		return ifcgName;
	}
	public void setIfcgName(String ifcgName) {
		this.ifcgName = ifcgName;
	}
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
	public Integer getIfcdDelny() {
		return ifcdDelny;
	}
	public void setIfcdDelny(Integer ifcdDelny) {
		this.ifcdDelny = ifcdDelny;
	}
	
	public Date getIfcdRegDate() {
		return ifcdRegDate;
	}
	public void setIfcdRegDate(Date ifcdRegDate) {
		this.ifcdRegDate = ifcdRegDate;
	}
	public Date getIfcdmodDate() {
		return ifcdmodDate;
	}
	public void setIfcdmodDate(Date ifcdmodDate) {
		this.ifcdmodDate = ifcdmodDate;
	}

}
