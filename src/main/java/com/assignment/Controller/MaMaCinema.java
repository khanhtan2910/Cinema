package com.assignment.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MaMaCinema {
	@RequestMapping("/mamaCinema")
	public String Cinema() {
		return "showTimes/index";
	}
}
