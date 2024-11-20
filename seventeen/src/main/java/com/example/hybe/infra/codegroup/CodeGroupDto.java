package com.example.hybe.infra.codegroup;

import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

public class CodeGroupDto {
	
	private String ifcgSeq;
	private String ifcgName;
	private Integer ifcgUseNy;
	private Integer ifcgOrder;
	private String ifcgDesc;
	private Integer ifcgDelNy;
	private Date ifcgRegDate;
	private Date ifcgRenDate;
	private Integer xcount;
	
	private MultipartFile uploadFile;
	private MultipartFile[] uploadFiles;
	
	public Integer getXcount() {
		return xcount;
	}
	public void setXcount(Integer xcount) {
		this.xcount = xcount;
	}
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
	public Integer getIfcgUseNy() {
		return ifcgUseNy;
	}
	public void setIfcgUseNy(Integer ifcgUseNy) {
		this.ifcgUseNy = ifcgUseNy;
	}
	public Integer getIfcgOrder() {
		return ifcgOrder;
	}
	public void setIfcgOrder(Integer ifcgOrder) {
		this.ifcgOrder = ifcgOrder;
	}
	public String getIfcgDesc() {
		return ifcgDesc;
	}
	public void setIfcgDesc(String ifcgDesc) {
		this.ifcgDesc = ifcgDesc;
	}
	public Integer getIfcgDelNy() {
		return ifcgDelNy;
	}
	public void setIfcgDelNy(Integer ifcgDelNy) {
		this.ifcgDelNy = ifcgDelNy;
	}
	public Date getIfcgRegDate() {
		return ifcgRegDate;
	}
	public void setIfcgRegDate(Date ifcgRegDate) {
		this.ifcgRegDate = ifcgRegDate;
	}
	public Date getIfcgRenDate() {
		return ifcgRenDate;
	}
	public void setIfcgRenDate(Date ifcgRenDate) {
		this.ifcgRenDate = ifcgRenDate;
	}
	
}