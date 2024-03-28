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
@Table(name = "Category")
public class Category implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer categoryid;
	String name;
	@Temporal(TemporalType.DATE)
	@Column(name = "Createat")
	Date createAt = new Date();
	
	@OneToMany(mappedBy = "category")
	@JsonIgnore
	List<Movietype> movieTypes;


	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Category(Integer categoryid, String name, Date createAt, List<Movietype> movieTypes, List<Movie> movie) {
		super();
		this.categoryid = categoryid;
		this.name = name;
		this.createAt = createAt;
		this.movieTypes = movieTypes;
	}

	public Integer getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(Integer categoryid) {
		this.categoryid = categoryid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public List<Movietype> getMovieTypes() {
		return movieTypes;
	}

	public void setMovieTypes(List<Movietype> movieTypes) {
		this.movieTypes = movieTypes;
	}

	
	
	
	
}
