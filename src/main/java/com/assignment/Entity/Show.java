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
}
