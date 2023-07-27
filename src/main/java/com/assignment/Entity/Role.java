package com.assignment.Entity;

import java.io.Serializable;
import java.util.Date;
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
@Table(name = "Role")
public class Role implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	String roleid;
	String name;
	boolean isdelete;
	String code;
	@OneToMany(mappedBy = "Role")
	List<Users> Users;
	@OneToMany(mappedBy = "Role")
	List<RolePermission> rolePermisson;
}
