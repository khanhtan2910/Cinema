package com.assignment.Entity;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

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
@Table(name = "Chair")
@Embeddable
public class Chair implements Serializable {
	@EmbeddedId
	Integer col;
	String row;
	
	@OneToOne
	ShowBooking showBooing;
	Boolean isActive;
	@ManyToOne
	@JoinColumn(name = "Chairtypeid")
	ChairType chairType;
	@ManyToOne
	@JoinColumn(name  ="Roomid")
	Room room;
}
