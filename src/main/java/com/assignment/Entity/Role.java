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
}
