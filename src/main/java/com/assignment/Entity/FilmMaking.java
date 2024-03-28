package com.assignment.Entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

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
@Table(name = "FilmMaking")
public class FilmMaking implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer filmmakingid;
	@ManyToOne
	@JoinColumn(name  ="Movieid")
	Movie movie;
	@ManyToOne
	@JoinColumn(name  ="Castandcrewid")
	CastAndCrew castAndCrew;
	public FilmMaking() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FilmMaking(Integer filmmakingid, Movie movie, CastAndCrew castAndCrew) {
		super();
		this.filmmakingid = filmmakingid;
		this.movie = movie;
		this.castAndCrew = castAndCrew;
	}
	public Integer getFilmmakingid() {
		return filmmakingid;
	}
	public void setFilmmakingid(Integer filmmakingid) {
		this.filmmakingid = filmmakingid;
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public CastAndCrew getCastAndCrew() {
		return castAndCrew;
	}
	public void setCastAndCrew(CastAndCrew castAndCrew) {
		this.castAndCrew = castAndCrew;
	}
	
	
}
