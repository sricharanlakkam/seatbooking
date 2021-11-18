package com.seatbooking.seatbooking.entity;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="users")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	
	private String userName;
	private String password;
	private String firstName;
	private String lastName;
	private String email;
	private String addLocation;
	private String changeSeat;
	private String deleteSeat;
	private String modifyLocation;
	private String removeLocation;
	private String approveRequest;
	private String cancelRequest;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddLocation() {
		return addLocation;
	}
	public void setAddLocation(String addLocation) {
		this.addLocation = addLocation;
	}
	public String getChangeSeat() {
		return changeSeat;
	}
	public void setChangeSeat(String changeSeat) {
		this.changeSeat = changeSeat;
	}
	public String getDeleteSeat() {
		return deleteSeat;
	}
	public void setDeleteSeat(String deleteSeat) {
		this.deleteSeat = deleteSeat;
	}
	public String getModifyLocation() {
		return modifyLocation;
	}
	public void setModifyLocation(String modifyLocation) {
		this.modifyLocation = modifyLocation;
	}
	public String getRemoveLocation() {
		return removeLocation;
	}
	public void setRemoveLocation(String removeLocation) {
		this.removeLocation = removeLocation;
	}
	public String getApproveRequest() {
		return approveRequest;
	}
	public void setApproveRequest(String approveRequest) {
		this.approveRequest = approveRequest;
	}
	public String getCancelRequest() {
		return cancelRequest;
	}
	public void setCancelRequest(String cancelRequest) {
		this.cancelRequest = cancelRequest;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public User() {
		super();
	
	}
}

	
