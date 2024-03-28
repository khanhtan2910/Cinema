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
@Table(name = "Chair")
public class Chair implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer chairid;
	Integer col;
	String row;
	Boolean isActive;
	@ManyToOne
	@JoinColumn(name = "Chairtypeid")
	ChairType chairType;
	@ManyToOne
	@JoinColumn(name  ="Roomid")
	Room room;
	@OneToMany(mappedBy ="chair")
	@JsonIgnore
	List<ShowBooking> showBookings;
	public Chair() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Chair(Integer chairid, Integer col, String row, Boolean isActive, ChairType chairType, Room room,
			List<ShowBooking> showBookings) {
		super();
		this.chairid = chairid;
		this.col = col;
		this.row = row;
		this.isActive = isActive;
		this.chairType = chairType;
		this.room = room;
		this.showBookings = showBookings;
	}
	public Integer getChairid() {
		return chairid;
	}
	public void setChairid(Integer chairid) {
		this.chairid = chairid;
	}
	public Integer getCol() {
		return col;
	}
	public void setCol(Integer col) {
		this.col = col;
	}
	public String getRow() {
		return row;
	}
	public void setRow(String row) {
		this.row = row;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	public ChairType getChairType() {
		return chairType;
	}
	public void setChairType(ChairType chairType) {
		this.chairType = chairType;
	}
	public Room getRoom() {
		return room;
	}
	public void setRoom(Room room) {
		this.room = room;
	}
	public List<ShowBooking> getShowBookings() {
		return showBookings;
	}
	public void setShowBookings(List<ShowBooking> showBookings) {
		this.showBookings = showBookings;
	}
	
	
}
