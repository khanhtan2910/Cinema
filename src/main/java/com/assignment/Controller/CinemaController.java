package com.assignment.Controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
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
	@RequestMapping("/{cinemaCompany}")
	public String detailCinema(@PathVariable("cinemaCompany") String cinemaCompany, Model model, @RequestParam(name= "address", defaultValue = "Hồ Chí Minh") String address) {
		List<com.assignment.Entity.Cinema> cinemas =  cinemaService.findByCompany(cinemaCompany);		
		List<com.assignment.Entity.Cinema> cinemaList = new ArrayList<>();

		for (com.assignment.Entity.Cinema cinema : cinemas) {
			if (cinema.getAddress().contains(address)) {
				cinemaList.add(cinema);
			}
		}
		model.addAttribute("cinemaCompany", cinemaCompany);
		model.addAttribute("cinemaList", cinemaList);
		
		return "cinema/detailCinema";
	}
	@RequestMapping("/cinemaWithAddress")
	public String cinemaWithAddress(@RequestParam(name="cinemaId") String cinemaId, Model model) {
		com.assignment.Entity.Cinema cinema = cinemaService.findById(Integer.parseInt(cinemaId));
		
		model.addAttribute("cinema", cinema);		
		return "cinema/cinemaWithAddress";
	}
}
