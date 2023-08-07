package com.assignment.Service;

import java.util.List;


import com.assignment.Entity.Calendar;

public interface CalendarService {
	
	public int maxDay(int month, int year);
	public List<Calendar> calendarShows();
		

}
