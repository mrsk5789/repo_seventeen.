package com.example.hybe.infra.code;

public class CodeVo {
	
	private Integer shDelny;
	private Integer shUseNy;
	private String shValue;
	private String shOption;
	private Integer shOptionDate;
	private String shDateEnd;
	private String shDateStart;
	
	//paging
	private int thisPage = 1;									// 현재 페이지
	private int rowNumToShow=10;		// 화면에 보여줄 데이터 줄 갯수
	private int pageNumToShow=10;		// 화면에 보여줄 페이징 번호 갯수
	private int totalRows;										// 전체 데이터 갯수
	private int totalPages;										// 전체 페이지 번호
	private int startPage;										// 시작 페이지 번호
	private int endPage;										// 마지막 페이지 번호

	private int startRnumForMysql=0;							// 쿼리 시작 row
	
	
	public Integer getShOptionDate() {
		return shOptionDate;
	}
	public void setShOptionDate(Integer shOptionDate) {
		this.shOptionDate = shOptionDate;
	}
	public String getShDateEnd() {
		return shDateEnd;
	}
	public void setShDateEnd(String shDateEnd) {
		this.shDateEnd = shDateEnd;
	}
	public String getShDateStart() {
		return shDateStart;
	}
	public void setShDateStart(String shDateStart) {
		this.shDateStart = shDateStart;
	}
	public Integer getShDelny() {
		return shDelny;
	}
	public void setShDelny(Integer shDelny) {
		this.shDelny = shDelny;
	}
	public Integer getShUseNy() {
		return shUseNy;
	}
	public void setShUseNy(Integer shUseNy) {
		this.shUseNy = shUseNy;
	}
	public String getShValue() {
		return shValue;
	}
	public void setShValue(String shValue) {
		this.shValue = shValue;
	}
	public String getShOption() {
		return shOption;
	}
	public void setShOption(String shOption) {
		this.shOption = shOption;
	}
	public int getThisPage() {
		return thisPage;
	}
	public void setThisPage(int thisPage) {
		this.thisPage = thisPage;
	}
	public int getRowNumToShow() {
		return rowNumToShow;
	}
	public void setRowNumToShow(int rowNumToShow) {
		this.rowNumToShow = rowNumToShow;
	}
	public int getPageNumToShow() {
		return pageNumToShow;
	}
	public void setPageNumToShow(int pageNumToShow) {
		this.pageNumToShow = pageNumToShow;
	}
	public int getTotalRows() {
		return totalRows;
	}
	public void setTotalRows(int totalRows) {
		this.totalRows = totalRows;
	}
	public int getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	public int getStartPage() {
		return startPage;
	}
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
	public int getEndPage() {
		return endPage;
	}
	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}
	public int getStartRnumForMysql() {
		return startRnumForMysql;
	}
	public void setStartRnumForMysql(int startRnumForMysql) {
		this.startRnumForMysql = startRnumForMysql;
	}
	public void setParamsPaging(int totalRows) {
		
		setTotalRows(totalRows);
		
		if(getTotalRows() == 0) {	// 입력받은 전체 데이터 갯수가 0이면
			setTotalPages(1);		// 전체 페이지 번호는 1
		} else {	// 입력받은 전체 데이터 갯수가 0이 아니면
			setTotalPages(getTotalRows() / getRowNumToShow());	// 전체 페이지 번호 =  전체 데이터 갯수 / 화면에 보여줄 데이터 줄 갯수
		}
		
		if(getTotalRows() % getRowNumToShow() > 0) {	// 전체 데이터 갯수 % 화면에 보여줄 데이터 줄 갯수 > 0 (나머지가 0 보다 클 때)
			setTotalPages(getTotalPages() + 1);		// 전체 페이지 번호 = 전체 페이지 번호 + 1
		}
		
		if(getTotalPages() < getThisPage()) {	// 전체 페이지 번호 < 현재 페이지
			setThisPage(getTotalPages());		// 현재페이지(전체 페이지 번호)
		}
		
		// 시작 페이지 번호(현재 페이지 - 1) / 화면에 보여줄 페이징 번호 개수 * 화면에 보여줄 페이징 번호 개수 + 1
		setStartPage(((getThisPage() - 1) / getPageNumToShow()) * getPageNumToShow() + 1);

		// 마지막 페이지 번호 = 시작 페이지 번호 + 화면에 보여줄 페이징 번호 개수 -1
		setEndPage(getStartPage() + getPageNumToShow() - 1);

		if (getEndPage() > getTotalPages()) {	// 마지막 페이지 번호 > 전체 페이지 번호
			setEndPage(getTotalPages());
		}

		System.out.println("this page : "+getThisPage());
		System.out.println("rowNumToShow : "+getRowNumToShow());
		System.out.println("pageNumToShow : "+getPageNumToShow());
		System.out.println("totalPages : "+getTotalPages());
		System.out.println("startPage : "+getStartPage());
		System.out.println("totalRows : "+getTotalRows());
		System.out.println("endPage : "+getEndPage());
		System.out.println("startRnumForMysql : "+getStartRnumForMysql());
	}

}
