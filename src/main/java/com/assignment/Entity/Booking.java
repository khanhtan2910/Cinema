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
	@JsonIgnore
	List<ShowBooking> showBookings;
	@OneToMany(mappedBy = "Booking")
	@JsonIgnore
	List<Payment> payments;
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Booking(Integer bookid, com.assignment.Entity.Users users, Boolean paidstatus, Date createAt, Date updateAt,
			String code, List<ShowBooking> showBookings, List<Payment> payments) {
		super();
		this.bookid = bookid;
		Users = users;
		this.paidstatus = paidstatus;
		this.createAt = createAt;
		this.updateAt = updateAt;
		this.code = code;
		this.showBookings = showBookings;
		this.payments = payments;
	}
	public Integer getBookid() {
		return bookid;
	}
	public void setBookid(Integer bookid) {
		this.bookid = bookid;
	}
	public Users getUsers() {
		return Users;
	}
	public void setUsers(Users users) {
		Users = users;
	}
	public Boolean getPaidstatus() {
		return paidstatus;
	}
	public void setPaidstatus(Boolean paidstatus) {
		this.paidstatus = paidstatus;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	public Date getUpdateAt() {
		return updateAt;
	}
	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public List<ShowBooking> getShowBookings() {
		return showBookings;
	}
	public void setShowBookings(List<ShowBooking> showBookings) {
		this.showBookings = showBookings;
	}
	public List<Payment> getPayments() {
		return payments;
	}
	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}
	
	
	
}
