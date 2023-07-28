package com.assignment.Entity;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Room")
public class Room implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer roomid;
	String name;
	Integer column;
	Integer row;
	String type;
	@OneToMany(mappedBy = "room")
	@JsonIgnore
	List<Chair> chairs;
	@OneToMany(mappedBy = "room")
	@JsonIgnore
	List<Show> shows;
	@ManyToOne
	@JoinColumn(name  ="Cinemaid")
	Cinema cinema;
}
