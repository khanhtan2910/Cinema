package com.assignment.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowtimesController {
	@RequestMapping("/hello")
	public String hello() {
		return "/hello/test1";
	}
}
