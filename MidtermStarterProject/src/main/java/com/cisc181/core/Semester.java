package com.cisc181.core;
import java.util.Date;
import java.util.UUID;

public class Semester extends Course {
	private UUID SemesterId;
	private Date StartDate;
	private Date EndDate;
	
	
	public UUID getSemesterId() {
		return SemesterId;
	}
	public void setSemesterId(UUID semesterId) {
		SemesterId = semesterId;
	}
	public Date getStartDate() {
		return StartDate;
	}
	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}
	public Date getEndDate() {
		return EndDate;
	}
	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}


}
