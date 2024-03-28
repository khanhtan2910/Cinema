package com.assignment.Entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

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
@Table(name = "Users")
public class Users implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer userid;
	String password;
	@Temporal(TemporalType.DATE)
	@Column(name = "Dayofbirth")
	Date DateOfBirth = new Date();
	Integer phone;
	Boolean isadmin;
	@OneToMany(mappedBy="Users")
	@JsonIgnore
	List<Booking> Booking;
	@ManyToOne
	@JoinColumn(name = "Roleid")
	Role role;
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Users(Integer userid, String password, Date dateOfBirth, Integer phone, Boolean isadmin,
			List<com.assignment.Entity.Booking> booking, Role role) {
		super();
		this.userid = userid;
		this.password = password;
		DateOfBirth = dateOfBirth;
		this.phone = phone;
		this.isadmin = isadmin;
		Booking = booking;
		this.role = role;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public Integer getPhone() {
		return phone;
	}
	public void setPhone(Integer phone) {
		this.phone = phone;
	}
	public Boolean getIsadmin() {
		return isadmin;
	}
	public void setIsadmin(Boolean isadmin) {
		this.isadmin = isadmin;
	}
	public List<Booking> getBooking() {
		return Booking;
	}
	public void setBooking(List<Booking> booking) {
		Booking = booking;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	
	
}
