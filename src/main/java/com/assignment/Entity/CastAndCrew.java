package com.assignment.Entity;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "CastAndCrew")
public class CastAndCrew implements Serializable{
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	Integer castandcrewid;
	String stagename;
	String realname;
	String maojor;
	@OneToMany(mappedBy = "castAndCrew")
	@JsonIgnore
	List<FilmMaking> filmMaking;
	public CastAndCrew() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CastAndCrew(Integer castandcrewid, String stagename, String realname, String maojor,
			List<FilmMaking> filmMaking) {
		super();
		this.castandcrewid = castandcrewid;
		this.stagename = stagename;
		this.realname = realname;
		this.maojor = maojor;
		this.filmMaking = filmMaking;
	}
	public Integer getCastandcrewid() {
		return castandcrewid;
	}
	public void setCastandcrewid(Integer castandcrewid) {
		this.castandcrewid = castandcrewid;
	}
	public String getStagename() {
		return stagename;
	}
	public void setStagename(String stagename) {
		this.stagename = stagename;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public String getMaojor() {
		return maojor;
	}
	public void setMaojor(String maojor) {
		this.maojor = maojor;
	}
	public List<FilmMaking> getFilmMaking() {
		return filmMaking;
	}
	public void setFilmMaking(List<FilmMaking> filmMaking) {
		this.filmMaking = filmMaking;
	} 
	
	
}
