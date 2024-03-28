package com.assignment.Entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "RolePermistion")
public class RolePermission implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer rolepermistionid;
	String isnable;
	@ManyToOne
	@JoinColumn(name = "Roleid")
	Role role;
	@ManyToOne
	@JoinColumn(name = "Permissionid")
	Permission Permission;
	public RolePermission() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RolePermission(Integer rolepermistionid, String isnable, Role role,
			com.assignment.Entity.Permission permission) {
		super();
		this.rolepermistionid = rolepermistionid;
		this.isnable = isnable;
		this.role = role;
		Permission = permission;
	}
	public Integer getRolepermistionid() {
		return rolepermistionid;
	}
	public void setRolepermistionid(Integer rolepermistionid) {
		this.rolepermistionid = rolepermistionid;
	}
	public String getIsnable() {
		return isnable;
	}
	public void setIsnable(String isnable) {
		this.isnable = isnable;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public Permission getPermission() {
		return Permission;
	}
	public void setPermission(Permission permission) {
		Permission = permission;
	}
	
	
}
