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
	@JsonIgnore
	List<RolePermission> rolePermisson;
	public Permission() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Permission(String permissionid, String clainName, Boolean defaultp, String displayname, Boolean isactive,
			String parentid, String type, List<RolePermission> rolePermisson) {
		super();
		this.permissionid = permissionid;
		ClainName = clainName;
		Defaultp = defaultp;
		this.displayname = displayname;
		this.isactive = isactive;
		this.parentid = parentid;
		this.type = type;
		this.rolePermisson = rolePermisson;
	}
	public String getPermissionid() {
		return permissionid;
	}
	public void setPermissionid(String permissionid) {
		this.permissionid = permissionid;
	}
	public String getClainName() {
		return ClainName;
	}
	public void setClainName(String clainName) {
		ClainName = clainName;
	}
	public Boolean getDefaultp() {
		return Defaultp;
	}
	public void setDefaultp(Boolean defaultp) {
		Defaultp = defaultp;
	}
	public String getDisplayname() {
		return displayname;
	}
	public void setDisplayname(String displayname) {
		this.displayname = displayname;
	}
	public Boolean getIsactive() {
		return isactive;
	}
	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
	}
	public String getParentid() {
		return parentid;
	}
	public void setParentid(String parentid) {
		this.parentid = parentid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<RolePermission> getRolePermisson() {
		return rolePermisson;
	}
	public void setRolePermisson(List<RolePermission> rolePermisson) {
		this.rolePermisson = rolePermisson;
	}
	
	
}
