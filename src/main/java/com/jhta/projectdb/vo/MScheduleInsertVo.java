package com.jhta.projectdb.vo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class MScheduleInsertVo {
	private int[] theatherNum;
	private String date;
	private String time;
	private int purchasefilmNum;
	@JsonFormat(shape=JsonFormat.Shape.STRING,pattern="yyyy-MM-dd", timezone="Asia/Seoul")
	private Date filmDeadline;
	public MScheduleInsertVo() {
		super();
	}
	public MScheduleInsertVo(int[] theatherNum, String date, String time, int purchasefilmNum, Date filmDeadline) {
		super();
		this.theatherNum = theatherNum;
		this.date = date;
		this.time = time;
		this.purchasefilmNum = purchasefilmNum;
		this.filmDeadline = filmDeadline;
	}
	public int[] getTheatherNum() {
		return theatherNum;
	}
	public void setTheatherNum(int[] theatherNum) {
		this.theatherNum = theatherNum;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getPurchasefilmNum() {
		return purchasefilmNum;
	}
	public void setPurchasefilmNum(int purchasefilmNum) {
		this.purchasefilmNum = purchasefilmNum;
	}
	public Date getFilmDeadline() {
		return filmDeadline;
	}
	public void setFilmDeadline(Date filmDeadline) {
		this.filmDeadline = filmDeadline;
	}
	
}
