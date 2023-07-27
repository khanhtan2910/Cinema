package com.assignment.Entity;

import java.io.Serializable;
import java.util.List;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Cinema")
public class Cinema implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer cinemaid;
	String name;
	String address;
	Integer phone;
	double longitude;
	double latitude;
	@OneToMany(mappedBy = "cinema")
	List<Room> rooms;
}
