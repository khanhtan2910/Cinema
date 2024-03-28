package com.assignment.Entity;

import java.io.Serializable;
import java.util.Date;
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
@Table(name = "Role")
public class Role implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	String roleid;
	String name;
	boolean isdelete;
	String code;
	@OneToMany(mappedBy = "role")
	@JsonIgnore
	List<Users> Users;
	@OneToMany(mappedBy = "role")
	@JsonIgnore
	List<RolePermission> rolePermisson;
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Role(String roleid, String name, boolean isdelete, String code, List<com.assignment.Entity.Users> users,
			List<RolePermission> rolePermisson) {
		super();
		this.roleid = roleid;
		this.name = name;
		this.isdelete = isdelete;
		this.code = code;
		Users = users;
		this.rolePermisson = rolePermisson;
	}
	public String getRoleid() {
		return roleid;
	}
	public void setRoleid(String roleid) {
		this.roleid = roleid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isIsdelete() {
		return isdelete;
	}
	public void setIsdelete(boolean isdelete) {
		this.isdelete = isdelete;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public List<Users> getUsers() {
		return Users;
	}
	public void setUsers(List<Users> users) {
		Users = users;
	}
	public List<RolePermission> getRolePermisson() {
		return rolePermisson;
	}
	public void setRolePermisson(List<RolePermission> rolePermisson) {
		this.rolePermisson = rolePermisson;
	}
	
	
}
