package com.assignment.ServiceImpl;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.assignment.Service.CalendarService;
@Service
public class CalendarServiceImpl implements CalendarService{
	
	@Override
	public int maxDay(int month, int year) {
	    Calendar cal = Calendar.getInstance();
	    cal.set(Calendar.MONTH, month-1);
	    cal.set(Calendar.DAY_OF_MONTH, month-1);
	    cal.set(Calendar.YEAR, year);
	    int maxDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
	    return maxDay;
	}

	@Override
	public List<com.assignment.Entity.Calendar> calendarShows() {
		LocalDate currentdate = LocalDate.now();
		List<com.assignment.Entity.Calendar> calendarShows = new ArrayList<>();
		for (int i = 0; i < 7; i++) {
			Calendar calendar = Calendar.getInstance();
			int currentMonth = currentdate.getMonthValue();
			int currentYear  = currentdate.getYear();
			calendar.set(Calendar.DAY_OF_MONTH, currentdate.getDayOfMonth()+i);
			if (currentdate.getDayOfMonth()+i >= maxDay(currentMonth, currentYear)) {
				currentMonth+=1;
			}else if(currentdate.getDayOfMonth()+i >= maxDay(currentMonth, currentYear) && currentMonth ==12){
				currentMonth =1;
				currentYear+=1;
			}		
			calendar.set(Calendar.MONTH, currentMonth);
			calendar.set(Calendar.YEAR, currentYear);
			Date day = calendar.getTime();
			String dayOfWeek = new SimpleDateFormat("EEEE").format(day);
			com.assignment.Entity.Calendar calendarShow = new com.assignment.Entity.Calendar(currentdate.getDayOfMonth()+i,currentMonth,currentYear,dayOfWeek,i+1);
			calendarShows.add(calendarShow);
		}
		return calendarShows;
	}
}
