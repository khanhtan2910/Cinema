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
}
