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
	List<ShowBooking> showBookings;
	
}
