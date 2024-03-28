package com.assignment.Controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.assignment.Entity.Movie;
import com.assignment.Service.MovieService;
import com.assignment.Service.SessionService;

@Controller
public class MovieScreeningsController {
	@RequestMapping("/mamaMovie")
	public String Movie() {
		return "movieScreenings/moviee";
	}

	@RequestMapping("/mamadetalMovie")
	public String Moviedetial() {
		return "movieScreenings/detailMovie";
	}
	}

	

