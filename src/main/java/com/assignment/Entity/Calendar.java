package com.assignment.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Calendar {
	Integer day;
	Integer month;
	Integer year;
	String dayName;
	Integer index;
	public Calendar() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Calendar(Integer day, Integer month, Integer year, String dayName, Integer index) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
		this.dayName = dayName;
		this.index = index;
	}
	public Integer getDay() {
		return day;
	}
	public void setDay(Integer day) {
		this.day = day;
	}
	public Integer getMonth() {
		return month;
	}
	public void setMonth(Integer month) {
		this.month = month;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public String getDayName() {
		return dayName;
	}
	public void setDayName(String dayName) {
		this.dayName = dayName;
	}
	public Integer getIndex() {
		return index;
	}
	public void setIndex(Integer index) {
		this.index = index;
	}
	
	
}
