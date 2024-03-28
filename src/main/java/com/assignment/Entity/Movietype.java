package com.assignment.Entity;

import java.io.Serializable;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "MovieType")
public class Movietype implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer movietypeid;
	@ManyToOne
	@JoinColumn(name = "Movieid")
	Movie movie;
	@ManyToOne
	@JoinColumn(name = "Categoryid")
	Category category;
	public Movietype() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Movietype(Integer movietypeid, Movie movie, Category category) {
		super();
		this.movietypeid = movietypeid;
		this.movie = movie;
		this.category = category;
	}
	public Integer getMovietypeid() {
		return movietypeid;
	}
	public void setMovietypeid(Integer movietypeid) {
		this.movietypeid = movietypeid;
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
	
}
