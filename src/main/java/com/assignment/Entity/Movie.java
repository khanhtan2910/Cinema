package com.assignment.Entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

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
	@Temporal(TemporalType.DATE)
	@Column(name = "Createat")
	Date createAt = new Date();
	@Temporal(TemporalType.DATE)
	@Column(name = "Updateat")
	Date updateAt = new Date();

	String region;
	Boolean isdelete;
	String desciption;
	Integer age;
	String trailerurl;
	@Temporal(TemporalType.DATE)
	@Column(name = "Time")
	Date time = new Date();
	Boolean has2d;
	boolean has3d;
	Integer filmlength;
	@OneToMany(mappedBy = "movie")
	List<Show> shows;
	@OneToMany(mappedBy = "movie")
	List<FilmMaking> filmMakings;
	@OneToMany(mappedBy = "movie")
	List<MovieType> movieTypes;
}
