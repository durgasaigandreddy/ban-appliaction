package com.bank.domain;

import java.util.Date;
import java.util.List;

public class Customer extends Address {

	private int customerId;
	private String firstName;
	private String middleName;
	private String lastName;
	private Date dob;
	private String gender;
	private String martialStatus;
	private long aadharNumber;
	private String panNumber;
	private List<Contact> contacts;

	public Customer() {

	}

	public Customer(int customerId, String firstName, String middleName, String lastName, Date dob, String gender,
			String martialStatus, long aadharNumber, String panNumber, List<Contact> contacts) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.dob = dob;
		this.gender = gender;
		this.martialStatus = martialStatus;
		this.aadharNumber = aadharNumber;
		this.panNumber = panNumber;
		this.contacts = contacts;
	}

	public Customer(int customerId, String firstName, String middleName, String lastName, Date dob, String gender,
			String martialStatus, long aadharNumber, String panNumber) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.dob = dob;
		this.gender = gender;
		this.martialStatus = martialStatus;
		this.aadharNumber = aadharNumber;
		this.panNumber = panNumber;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMartialStatus() {
		return martialStatus;
	}

	public void setMartialStatus(String martialStatus) {
		this.martialStatus = martialStatus;
	}

	public long getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", dob=" + dob + ", gender=" + gender + ", martialStatus=" + martialStatus
				+ ", aadharNumber=" + aadharNumber + ", panNumber=" + panNumber + ", contacts=" + contacts + "]";
	}

}
