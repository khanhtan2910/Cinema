package com.assignment.Controller;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowtimesController {
	@RequestMapping("/Showtime")
	public String showTime(Model model) {
		LocalDate currentdate = LocalDate.now();
		int currentMonth = currentdate.getMonthValue();
		int currentYear = currentdate.getYear();
		String[] days = new String[] { "", "", "", "", "", "", "" };

		for (int i = 1; i < 7; i++) {
			Calendar calendar = Calendar.getInstance();
			calendar.set(Calendar.DAY_OF_MONTH, currentdate.getDayOfMonth() + i);
			calendar.set(Calendar.MONTH, currentMonth);
			calendar.set(Calendar.YEAR, currentYear);
			Date day = calendar.getTime();
			String dayOfWeek = new SimpleDateFormat("EEEE").format(day);
			days[i] = String.valueOf(dayOfWeek);
		}
		model.addAttribute("days", days);
		model.addAttribute("dayOfWeek", currentdate.getDayOfMonth());
		
		return "showTimes/showtimeMovie";
	}
	
	
}
