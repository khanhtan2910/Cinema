package com.assignment.Entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "Show")
public class Show implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer showid;
	@ManyToOne
	@JoinColumn(name = "Roomid")
	Room room;
	@OneToMany(mappedBy = "show")
	@JsonIgnore
	List<ShowBooking> showBookings;
	@ManyToOne
	@JoinColumn(name = "Movieid")
	Movie movie;
	@Temporal(TemporalType.DATE)
	@Column(name = "Createat")
	Date createAt = new Date();
	@Temporal(TemporalType.DATE)
	@Column(name = "Date")
	Date date = new Date();
	@Temporal(TemporalType.TIME)
	@Column(name = "Starttime")
	Date startTime = new Date();
	@Temporal(TemporalType.TIME)
	@Column(name = "Endtime")
	Date EndTime = new Date();
	String status;
	public Show() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Show(Integer showid, Room room, List<ShowBooking> showBookings, Movie movie, Date createAt, Date date,
			Date startTime, Date endTime, String status) {
		super();
		this.showid = showid;
		this.room = room;
		this.showBookings = showBookings;
		this.movie = movie;
		this.createAt = createAt;
		this.date = date;
		this.startTime = startTime;
		EndTime = endTime;
		this.status = status;
	}
	public Integer getShowid() {
		return showid;
	}
	public void setShowid(Integer showid) {
		this.showid = showid;
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
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return EndTime;
	}
	public void setEndTime(Date endTime) {
		EndTime = endTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
