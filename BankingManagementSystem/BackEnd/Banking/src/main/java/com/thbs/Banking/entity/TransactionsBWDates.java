package com.thbs.Banking.entity;

//import java.sql.Date;

//import java.util.Date;

public class TransactionsBWDates {
  
	private String startDate;
	private String endDate;
	private String accountNum;
	
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	@Override
	public String toString() {
		return "TransactionsBWDates [startDate=" + startDate + ", endDate=" + endDate + ", accountNum=" + accountNum
				+ "]";
	}
	
	
	

}
