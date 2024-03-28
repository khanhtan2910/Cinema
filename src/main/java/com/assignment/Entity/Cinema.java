package com.assignment.Entity;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
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
	@JsonIgnore
	List<Room> rooms;
	String company;
	public Cinema() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cinema(Integer cinemaid, String name, String address, Integer phone, double longitude, double latitude,
			List<Room> rooms, String company) {
		super();
		this.cinemaid = cinemaid;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.longitude = longitude;
		this.latitude = latitude;
		this.rooms = rooms;
		this.company = company;
	}
	public Integer getCinemaid() {
		return cinemaid;
	}
	public void setCinemaid(Integer cinemaid) {
		this.cinemaid = cinemaid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getPhone() {
		return phone;
	}
	public void setPhone(Integer phone) {
		this.phone = phone;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public List<Room> getRooms() {
		return rooms;
	}
	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	
}
