package com.jhta.projectdb.vo;

public class TotalVo {
	private int totalNum;
	private int totalPeople;
	private int totalPrice;
	private int filmNum;
	private String totalDate;
	public TotalVo() {}
	public TotalVo(int totalNum, int totalPeople, int totalPrice, int filmNum, String totalDate) {
		super();
		this.totalNum = totalNum;
		this.totalPeople = totalPeople;
		this.totalPrice = totalPrice;
		this.filmNum = filmNum;
		this.totalDate = totalDate;
	}
	public int getTotalNum() {
		return totalNum;
	}
	public void setTotalNum(int totalNum) {
		this.totalNum = totalNum;
	}
	public int getTotalPeople() {
		return totalPeople;
	}
	public void setTotalPeople(int totalPeople) {
		this.totalPeople = totalPeople;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	public int getFilmNum() {
		return filmNum;
	}
	public void setFilmNum(int filmNum) {
		this.filmNum = filmNum;
	}
	public String getTotalDate() {
		return totalDate;
	}
	public void setTotalDate(String totalDate) {
		this.totalDate = totalDate;
	}
	
}
