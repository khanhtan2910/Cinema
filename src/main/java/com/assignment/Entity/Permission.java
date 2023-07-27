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
@Table(name = "Permistion")
public class Permission implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	String permissionid;
	String ClainName;
	Boolean Defaultp;
	String displayname;
	Boolean isactive;
	String parentid;
	String type;
	@OneToMany(mappedBy = "Permission")
	List<RolePermission> rolePermisson;
}
