package com.assignment.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.assignment.Service.CinemaService;


@Controller
public class CinemaController {
	@Autowired
	CinemaService cinemaService;
	
	@RequestMapping("/cinema")
	public String Cinema( Model model) {
			
		return "cinema/cinema";
	}
	@RequestMapping("/detailCinema")
	public String detailCinema(@RequestParam("cinemaId") String cinemaId, Model model) {
		com.assignment.Entity.Cinema cinema =  cinemaService.findById(Integer.valueOf(cinemaId));
		model.addAttribute("cinema", cinema);
		
		return "cinema/detailCinema";
	}
	
}
