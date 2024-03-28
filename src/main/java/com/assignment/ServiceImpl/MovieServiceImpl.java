package com.assignment.ServiceImpl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.assignment.DAO.MovieDAO;
import com.assignment.Entity.Movie;
import com.assignment.Service.MovieService;

@Service
public class MovieServiceImpl implements MovieService{
	@Autowired
	MovieDAO movieDAO;

	@Override
	public List<Movie> findAll() {
		// TODO Auto-generated method stub
		return movieDAO.findAll();
	}
	
	@Override
	public List<Movie> findAllByName(String keyword) {
		// TODO Auto-generated method stub
		return movieDAO.findAllByNameLike(keyword);
	}
	
	
	public Movie findById(Long movieid) {
		return movieDAO.findById(movieid).get();
	}

	public Movie create(Movie movie) {
		return movieDAO.save(movie);
	}

	public Movie update(Movie movie) {
		return movieDAO.save(movie);
	}

	public void delete(Long movieid) {
		movieDAO.deleteById(movieid);
	}
	
	@Override
	public Page<Movie> findPaginated(Pageable pageable,List<Movie> movies) {
        int pageSize = pageable.getPageSize();
        int currentPage = pageable.getPageNumber();
        int startItem = currentPage * pageSize;
        List<Movie> list;

        if (movies.size() < startItem) {
            list = Collections.emptyList();
        } else {
            int toIndex = Math.min(startItem + pageSize, movies.size());
            list = movies.subList(startItem, toIndex);
        }

        Page<Movie> moviePage
          = new PageImpl<Movie>(list, PageRequest.of(currentPage, pageSize),movies.size());

        return moviePage;
    }


	

	
}
