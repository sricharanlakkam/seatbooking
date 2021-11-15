package com.seatbooking.seatbooking.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin {
	@Id
	int id;
	private String adminName;
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

	public Admin(int id, String adminName, String password, String firstName, String lastName, String email,
			String addLocation, String changeSeat, String deleteSeat, String modifyLocation, String removeLocation,
			String approveRequest, String cancelRequest) {
		super();
		this.id = id;
		this.adminName = adminName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.addLocation = addLocation;
		this.changeSeat = changeSeat;
		this.deleteSeat = deleteSeat;
		this.modifyLocation = modifyLocation;
		this.removeLocation = removeLocation;
		this.approveRequest = approveRequest;
		this.cancelRequest = cancelRequest;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
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
}
