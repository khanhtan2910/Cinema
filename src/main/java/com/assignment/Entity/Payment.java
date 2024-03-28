package com.assignment.Entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "Payment")
public class Payment implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer paymentid;
	String type;
	Double cost;
	Integer status;
	@Temporal(TemporalType.DATE)
	@Column(name = "Createat")
	Date createAt = new Date();
	@ManyToOne
	@JoinColumn(name = "Userid")
	Users User;
	@ManyToOne
	@JoinColumn(name = "Bookid")
	Booking Booking;
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Payment(Integer paymentid, String type, Double cost, Integer status, Date createAt, Users user,
			com.assignment.Entity.Booking booking) {
		super();
		this.paymentid = paymentid;
		this.type = type;
		this.cost = cost;
		this.status = status;
		this.createAt = createAt;
		User = user;
		Booking = booking;
	}
	public Integer getPaymentid() {
		return paymentid;
	}
	public void setPaymentid(Integer paymentid) {
		this.paymentid = paymentid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	public Users getUser() {
		return User;
	}
	public void setUser(Users user) {
		User = user;
	}
	public Booking getBooking() {
		return Booking;
	}
	public void setBooking(Booking booking) {
		Booking = booking;
	}
	
	
}
