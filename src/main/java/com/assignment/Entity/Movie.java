package com.assignment.Entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;



import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Movie")
public class Movie implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long movieid;
	String name;
	String image;
	@Temporal(TemporalType.DATE)
	@Column(name = "Createat")
	Date createAt = new Date();
	@Temporal(TemporalType.DATE)
	@Column(name = "Updateat")
	Date updateAt = new Date();
	Double imdb;	
	String region;
	Boolean isdeleted;
	String description;
	Integer age;
	String trailerurl;
	@Temporal(TemporalType.DATE)
	@Column(name = "Time")
	Date time = new Date();
	Boolean has2d;
	Boolean has3d;
	Integer filmlength;
	@OneToMany(mappedBy = "movie")
	@JsonIgnore
	List<Show> shows;
	@OneToMany(mappedBy = "movie")
	@JsonIgnore
	List<FilmMaking> filmMakings;
	@OneToMany(mappedBy = "movie" 	)
	@JsonIgnore
	List<Movietype> movieTypes;
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Movie(Long movieid, String name, String image, Date createAt, Date updateAt, Double imdb, String region,
			Boolean isdeleted, String description, Integer age, String trailerurl, Date time, Boolean has2d,
			Boolean has3d, Integer filmlength, List<Show> shows, List<FilmMaking> filmMakings,
			List<Movietype> movieTypes) {
		super();
		this.movieid = movieid;
		this.name = name;
		this.image = image;
		this.createAt = createAt;
		this.updateAt = updateAt;
		this.imdb = imdb;
		this.region = region;
		this.isdeleted = isdeleted;
		this.description = description;
		this.age = age;
		this.trailerurl = trailerurl;
		this.time = time;
		this.has2d = has2d;
		this.has3d = has3d;
		this.filmlength = filmlength;
		this.shows = shows;
		this.filmMakings = filmMakings;
		this.movieTypes = movieTypes;
	}
	public Long getMovieid() {
		return movieid;
	}
	public void setMovieid(Long movieid) {
		this.movieid = movieid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	public Date getUpdateAt() {
		return updateAt;
	}
	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}
	public Double getImdb() {
		return imdb;
	}
	public void setImdb(Double imdb) {
		this.imdb = imdb;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public Boolean getIsdeleted() {
		return isdeleted;
	}
	public void setIsdeleted(Boolean isdeleted) {
		this.isdeleted = isdeleted;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getTrailerurl() {
		return trailerurl;
	}
	public void setTrailerurl(String trailerurl) {
		this.trailerurl = trailerurl;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public Boolean getHas2d() {
		return has2d;
	}
	public void setHas2d(Boolean has2d) {
		this.has2d = has2d;
	}
	public Boolean getHas3d() {
		return has3d;
	}
	public void setHas3d(Boolean has3d) {
		this.has3d = has3d;
	}
	public Integer getFilmlength() {
		return filmlength;
	}
	public void setFilmlength(Integer filmlength) {
		this.filmlength = filmlength;
	}
	public List<Show> getShows() {
		return shows;
	}
	public void setShows(List<Show> shows) {
		this.shows = shows;
	}
	public List<FilmMaking> getFilmMakings() {
		return filmMakings;
	}
	public void setFilmMakings(List<FilmMaking> filmMakings) {
		this.filmMakings = filmMakings;
	}
	public List<Movietype> getMovieTypes() {
		return movieTypes;
	}
	public void setMovieTypes(List<Movietype> movieTypes) {
		this.movieTypes = movieTypes;
	}
	
	
}
