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

	
}
