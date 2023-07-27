package com.assignment.Entity;

import java.io.Serializable;
import java.util.List;

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
	List<FilmMaking> filmMaking; 
}
