package com.assignment.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class CinemaController {
	@RequestMapping("/cinema")
	public String Cinema() {
		return "cinema/cinema";
	}
	@RequestMapping("/detailCinema")
	public String Cinemama() {
		return "cinema/detailCinema";
	}
	
}
