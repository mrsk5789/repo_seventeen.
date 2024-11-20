package com.example.hybe.infra.information;


import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

public class InformationDto {
	
	private String iSeq;
	private Integer iSpecifics;
	private Integer iPtNy;
	private Integer iGroupNy;
	private Integer iDelNy;
	private String iName;
	private String iCeoName;
	private String iAdress;
	private String iOpentime;
	private String iClosetime;
	private String iTelNumber;
	private String iEadress;
	private Integer iParkingNy;
	private String iLetter;
	private Date iRegDate;
	private Date iModDate;
	private String iEmail;
	private String Path;
	private String OriginalName;
	private String OriginalFilename;
	private String ContentType;
	private String UuidName;
	private String InputStream;
	private long size;

	private MultipartFile uploadFile;
	private MultipartFile[] uploadFiles;
	
	
	
	public String getInputStream() {
		return InputStream;
	}
	public void setInputStream(String inputStream) {
		InputStream = inputStream;
	}
	public String getUuidName() {
		return UuidName;
	}
	public void setUuidName(String uuidName) {
		UuidName = uuidName;
	}
	public String getContentType() {
		return ContentType;
	}
	public void setContentType(String contentType) {
		ContentType = contentType;
	}
	public String getPath() {
		return Path;
	}
	public void setPath(String path) {
		Path = path;
	}
	public String getOriginalName() {
		return OriginalName;
	}
	public void setOriginalName(String originalName) {
		OriginalName = originalName;
	}
	public String getOriginalFilename() {
		return OriginalFilename;
	}
	public void setOriginalFilename(String originalFilename) {
		OriginalFilename = originalFilename;
	}
	public MultipartFile getUploadFile() {
		return uploadFile;
	}
	public void setUploadFile(MultipartFile uploadFile) {
		this.uploadFile = uploadFile;
	}
	public MultipartFile[] getUploadFiles() {
		return uploadFiles;
	}
	public void setUploadFiles(MultipartFile[] uploadFiles) {
		this.uploadFiles = uploadFiles;
	}
	public String getiEmail() {
		return iEmail;
	}
	public void setiEmail(String iEmail) {
		this.iEmail = iEmail;
	}
	public String getiSeq() {
		return iSeq;
	}
	public void setiSeq(String iSeq) {
		this.iSeq = iSeq;
	}
	public Integer getiSpecifics() {
		return iSpecifics;
	}
	public void setiSpecifics(Integer iSpecifics) {
		this.iSpecifics = iSpecifics;
	}
	public Integer getiPtNy() {
		return iPtNy;
	}
	public void setiPtNy(Integer iPtNy) {
		this.iPtNy = iPtNy;
	}
	public Integer getiGroupNy() {
		return iGroupNy;
	}
	public void setiGroupNy(Integer iGroupNy) {
		this.iGroupNy = iGroupNy;
	}
	public Integer getiDelNy() {
		return iDelNy;
	}
	public void setiDelNy(Integer iDelNy) {
		this.iDelNy = iDelNy;
	}
	public String getiName() {
		return iName;
	}
	public void setiName(String iName) {
		this.iName = iName;
	}
	public String getiCeoName() {
		return iCeoName;
	}
	public void setiCeoName(String iCeoName) {
		this.iCeoName = iCeoName;
	}
	public String getiAdress() {
		return iAdress;
	}
	public void setiAdress(String iAdress) {
		this.iAdress = iAdress;
	}
	public String getiOpentime() {
		return iOpentime;
	}
	public void setiOpentime(String iOpentime) {
		this.iOpentime = iOpentime;
	}
	public String getiClosetime() {
		return iClosetime;
	}
	public void setiClosetime(String iClosetime) {
		this.iClosetime = iClosetime;
	}
	public String getiTelNumber() {
		return iTelNumber;
	}
	public void setiTelNumber(String iTelNumber) {
		this.iTelNumber = iTelNumber;
	}
	public String getiEadress() {
		return iEadress;
	}
	public void setiEadress(String iEadress) {
		this.iEadress = iEadress;
	}
	public Integer getiParkingNy() {
		return iParkingNy;
	}
	public void setiParkingNy(Integer iParkingNy) {
		this.iParkingNy = iParkingNy;
	}
	public String getiLetter() {
		return iLetter;
	}
	public void setiLetter(String iLetter) {
		this.iLetter = iLetter;
	}
	public Date getiRegDate() {
		return iRegDate;
	}
	public void setiRegDate(Date iRegDate) {
		this.iRegDate = iRegDate;
	}
	public Date getiModDate() {
		return iModDate;
	}
	public void setiModDate(Date iModDate) {
		this.iModDate = iModDate;
	}
	public long getSize() {
		return size;
	}
	public void setSize(long size) {
		this.size = size;
	}
	
	public void setExt(String ext) {
		// TODO Auto-generated method stub
		
	}
	public void setType(Object type) {
		// TODO Auto-generated method stub
		
	}
	public void setTableName(Object tableName) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}