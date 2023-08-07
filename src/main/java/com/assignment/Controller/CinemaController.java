package com.assignment.Controller;

import java.text.SimpleDateFormat;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.assignment.Service.CalendarService;
import com.assignment.Service.CinemaService;

@Controller
public class CinemaController {
	@Autowired
	CinemaService cinemaService;
	@Autowired
	CalendarService calendarService;

	@RequestMapping("/cinema")
	public String Cinema(Model model) {

		return "cinema/cinema";
	}

	@RequestMapping("/{cinemaCompany}")
	public String detailCinema(@PathVariable("cinemaCompany") String cinemaCompany, Model model,
			@RequestParam(name = "address", defaultValue = "Hồ Chí Minh") String address) {
		List<com.assignment.Entity.Cinema> cinemas = cinemaService.findByCompany(cinemaCompany);
		List<com.assignment.Entity.Cinema> cinemaList = new ArrayList<>();

		for (com.assignment.Entity.Cinema cinema : cinemas) {
			if (cinema.getAddress().contains(address)) {
				cinemaList.add(cinema);
			}
		}

		LocalDate currentdate = LocalDate.now();
		int currentDay = currentdate.getDayOfMonth();
		int currentMonth = currentdate.getMonthValue();
		int currentYear = currentdate.getYear();
		String[] days = new String[] { "", "", "", "", "", "", "" };

		for (int i = 1; i < 7; i++) {
			Calendar calendar = Calendar.getInstance();
			calendar.set(Calendar.DAY_OF_MONTH, currentdate.getDayOfMonth() + i);
			if (currentDay >= calendarService.maxDay(currentMonth, currentYear)) {
				currentMonth+=1;
			}else if(currentDay >= calendarService.maxDay(currentMonth, currentYear) && currentMonth ==12){
				currentMonth =1;
				currentYear+=1;
			}
			calendar.set(Calendar.MONTH, currentMonth);
			calendar.set(Calendar.YEAR, currentYear);
			Date day = calendar.getTime();
			String dayOfWeek = new SimpleDateFormat("EEEE").format(day);
			days[i] = String.valueOf(dayOfWeek);
		}
		model.addAttribute("days", days);
		model.addAttribute("dayOfWeek", currentdate.getDayOfMonth());
		model.addAttribute("cinemaCompany", cinemaCompany);
		model.addAttribute("cinemaList", cinemaList);

		return "cinema/detailCinema";
	}

	@RequestMapping("/cinemaWithAddress")
	public String cinemaWithAddress(@RequestParam(name = "cinemaId") String cinemaId, Model model) {
		com.assignment.Entity.Cinema cinema = cinemaService.findById(Integer.parseInt(cinemaId));
		LocalDate currentdate = LocalDate.now();
		int currentDay = currentdate.getDayOfMonth();
		int currentMonth = currentdate.getMonthValue();
		int currentYear = currentdate.getYear();
		String[] days = new String[] { "", "", "", "", "", "", "" };

		for (int i = 1; i < 7; i++) {
			Calendar calendar = Calendar.getInstance();
			calendar.set(Calendar.DAY_OF_MONTH, currentdate.getDayOfMonth() + i);
			if (currentDay >= calendarService.maxDay(currentMonth, currentYear)) {
				currentMonth+=1;
			}else if(currentDay >= calendarService.maxDay(currentMonth, currentYear) && currentMonth ==12){
				currentMonth =1;
				currentYear+=1;
			}
			calendar.set(Calendar.MONTH, currentMonth);
			calendar.set(Calendar.YEAR, currentYear);
			Date day = calendar.getTime();
			String dayOfWeek = new SimpleDateFormat("EEEE").format(day);
			days[i] = String.valueOf(dayOfWeek);
		}
		model.addAttribute("days", days);
		model.addAttribute("dayOfWeek", currentdate.getDayOfMonth());
		model.addAttribute("cinema", cinema);
		return "cinema/cinemaWithAddress";
	}
}
