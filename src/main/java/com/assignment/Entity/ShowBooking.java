package com.assignment.Entity;

import java.io.Serializable;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
	Integer bookid;
	@ManyToOne
	@JoinColumn(name = "Bookid")
	Booking Booking;
	@ManyToOne
	@JoinColumn(name = "showBooking")
	Show Show;
	@OneToOne(mappedBy = "showBooking")	
	Chair chair;
	
}
