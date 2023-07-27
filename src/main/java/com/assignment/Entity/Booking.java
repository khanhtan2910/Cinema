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
@Table(name = "Booking")
public class Booking implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	Integer bookid;
	@ManyToOne
	@JoinColumn(name = "Userid")
	Users Users;
	Boolean paidstatus;
	@Temporal(TemporalType.DATE)
	@Column(name = "Createat")
	Date createAt = new Date();
	@Temporal(TemporalType.DATE)
	@Column(name = "Updateat")
	Date updateAt = new Date();
	String code;
	@OneToMany(mappedBy = "Booking")
	List<ShowBooking> showBookings;
	@OneToMany(mappedBy = "Booking")
	List<Payment> payments;
	
}
