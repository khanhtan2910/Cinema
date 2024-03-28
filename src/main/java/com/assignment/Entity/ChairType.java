package com.assignment.Entity;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
@Table(name = "ChairType")
public class ChairType implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer chairtype;
	double price;
	String color;
	String name;
	@OneToMany(mappedBy = "chairType")
	@JsonIgnore
	List<Chair> Chairs;
	public ChairType() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ChairType(Integer chairtype, double price, String color, String name, List<Chair> chairs) {
		super();
		this.chairtype = chairtype;
		this.price = price;
		this.color = color;
		this.name = name;
		Chairs = chairs;
	}
	public Integer getChairtype() {
		return chairtype;
	}
	public void setChairtype(Integer chairtype) {
		this.chairtype = chairtype;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Chair> getChairs() {
		return Chairs;
	}
	public void setChairs(List<Chair> chairs) {
		Chairs = chairs;
	}
	
	
}
