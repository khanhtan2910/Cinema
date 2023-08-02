package com.assignment.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TopfilmController {
	@RequestMapping("/Topfilm")
	public String hello() {
		return "Topfilm/index";
	}
}
