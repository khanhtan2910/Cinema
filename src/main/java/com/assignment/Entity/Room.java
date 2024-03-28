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
	public Room() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Room(Integer roomid, String name, String type, List<Chair> chairs, List<Show> shows, Cinema cinema) {
		super();
		this.roomid = roomid;
		this.name = name;
		this.type = type;
		this.chairs = chairs;
		this.shows = shows;
		this.cinema = cinema;
	}
	public Integer getRoomid() {
		return roomid;
	}
	public void setRoomid(Integer roomid) {
		this.roomid = roomid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<Chair> getChairs() {
		return chairs;
	}
	public void setChairs(List<Chair> chairs) {
		this.chairs = chairs;
	}
	public List<Show> getShows() {
		return shows;
	}
	public void setShows(List<Show> shows) {
		this.shows = shows;
	}
	public Cinema getCinema() {
		return cinema;
	}
	public void setCinema(Cinema cinema) {
		this.cinema = cinema;
	}
	
	
	
}
