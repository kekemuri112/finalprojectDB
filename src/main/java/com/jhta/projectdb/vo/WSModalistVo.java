package com.jhta.projectdb.vo;

public class WSModalistVo {
	private int staffnum;
	private String sffname;
	private String divisionname;
	private String sffposition;
	public WSModalistVo() {}
	
	public WSModalistVo(int staffnum, String sffname, String divisionname, String sffposition) {
		super();
		this.staffnum = staffnum;
		this.sffname = sffname;
		this.divisionname = divisionname;
		this.sffposition = sffposition;
	}
	public int getStaffnum() {
		return staffnum;
	}
	
	public void setStaffnum(int staffnum) {
		this.staffnum = staffnum;
	}
	public String getSffname() {
		return sffname;
	}
	public void setSffname(String sffname) {
		this.sffname = sffname;
	}
	public String getDivisionname() {
		return divisionname;
	}
	public void setDivisionname(String divisionname) {
		this.divisionname = divisionname;
	}
	public String getSffposition() {
		return sffposition;
	}
	public void setSffposition(String sffposition) {
		this.sffposition = sffposition;
	}
	
}
