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
	@Autowired
	MovieService movieService;
	@Autowired
	SessionService session;

	@RequestMapping("/movieScreenings")

	public String searchAndPage(Model model, @RequestParam("page") Optional<Integer> page,
			@RequestParam("size") Optional<Integer> size,  @RequestParam("keywords") Optional<String> keyword,@RequestParam("cid") Optional<String> cid ) {
		String kwords = keyword.orElse(session.get("keywords", ""));
		session.set("keywords", kwords);
		
		int currentPage = page.orElse(1);
		int pageSize = size.orElse(9);

		Page<Movie> moviePage;
		if(cid.isPresent()) {
			 moviePage = movieService.findPaginated(PageRequest.of(currentPage - 1, pageSize), movieService.findAllByCategory(cid.get()));
		}else {
			 moviePage = movieService.findPaginated(PageRequest.of(currentPage - 1, pageSize),movieService.findAllByName("%" + kwords + "%"));
		}
		model.addAttribute("moviePage", moviePage);

		int totalPages = moviePage.getTotalPages();
		if (totalPages > 0) {
			List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages).boxed().collect(Collectors.toList());
			model.addAttribute("pageNumbers", pageNumbers);
		}

		return "movieScreenings/movie";
	}

	@RequestMapping("/movieScreeningsDetail{movieId}")
	public String MovieScreeningsDetail(Model model, @PathVariable("movieId") Integer movieId) {

		return "movieScreenings/detailMovie";
	}

}