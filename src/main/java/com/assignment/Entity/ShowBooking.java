package com.assignment.Entity;

import java.io.Serializable;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ShowBooking")
public class ShowBooking implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer showbookingid;
	@ManyToOne
	@JoinColumn(name = "Bookid")
	Booking Booking;
	@ManyToOne
	@JoinColumn(name = "showBooking")
	Show show;
	@ManyToOne
	@JoinColumn(name  ="Chairid")
	Chair chair;
	public ShowBooking() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ShowBooking(Integer showbookingid, com.assignment.Entity.Booking booking, Show show, Chair chair) {
		super();
		this.showbookingid = showbookingid;
		Booking = booking;
		this.show = show;
		this.chair = chair;
	}
	public Integer getShowbookingid() {
		return showbookingid;
	}
	public void setShowbookingid(Integer showbookingid) {
		this.showbookingid = showbookingid;
	}
	public Booking getBooking() {
		return Booking;
	}
	public void setBooking(Booking booking) {
		Booking = booking;
	}
	public Show getShow() {
		return show;
	}
	public void setShow(Show show) {
		this.show = show;
	}
	public Chair getChair() {
		return chair;
	}
	public void setChair(Chair chair) {
		this.chair = chair;
	}
	
	
}
