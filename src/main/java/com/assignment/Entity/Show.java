package com.assignment.Entity;

import java.io.Serializable;
import java.util.List;

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
@Table(name = "Show")
public class Show implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer showid;
	@ManyToOne
	@JoinColumn(name = "Roomid")
	Room room;
	@OneToMany(mappedBy = "show")
	List<ShowBooking> showBookings;
	@ManyToOne
	@JoinColumn(name = "Movieid")
	Movie movie;
}
