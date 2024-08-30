package com.example.hybe.infra.information;


import java.util.Date;

public class InformationDto {
	
	private Integer seq;
	private String name;
	private String opentime;
	private String closetime;
	private String telNumber;
	private String eadress;
	private String parking;
	private String reservation;
	private String freecal;
	private String letter;
	private Date regDate;
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
	public String getOpentime() {
		return opentime;
	}
	public void setOpentime(String opentime) {
		this.opentime = opentime;
	}
	public String getClosetime() {
		return closetime;
	}
	public void setClosetime(String closetime) {
		this.closetime = closetime;
	}
	public String getTelNumber() {
		return telNumber;
	}
	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}
	public String getEadress() {
		return eadress;
	}
	public void setEadress(String eadress) {
		this.eadress = eadress;
	}
	public String getParking() {
		return parking;
	}
	public void setParking(String parking) {
		this.parking = parking;
	}
	public String getReservation() {
		return reservation;
	}
	public void setReservation(String reservation) {
		this.reservation = reservation;
	}
	public String getFreecal() {
		return freecal;
	}
	public void setFreecal(String freecal) {
		this.freecal = freecal;
	}
	public String getLetter() {
		return letter;
	}
	public void setLetter(String letter) {
		this.letter = letter;
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
	
	
	
	
	
}
