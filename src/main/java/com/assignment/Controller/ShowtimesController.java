package com.assignment.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.assignment.Service.CalendarService;

@Controller
public class ShowtimesController {
	@Autowired
	CalendarService calendarService;
	@RequestMapping("/mamaCinema")
	public String CinemaWeb() {
		return "redirect:/Showtime";
	}
	@RequestMapping("/Showtime")
	public String showTime(Model model) {		
		model.addAttribute("calendarShows", calendarService.calendarShows());
		return "showTimes/showtimeMovie";
	}
		
}

