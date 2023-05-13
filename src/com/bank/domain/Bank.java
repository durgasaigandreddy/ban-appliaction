package com.bank.domain;

import java.util.Date;
import java.util.List;

public class Bank extends Address {

	private int bankId;
	private String name;
	private String description;
	private long registerNumber;
	private Date createdDate;
	private List<Contact> contacts;

	public Bank() {

	}

	public Bank(int bankId, String name, String description, long registerNumber, Date createdDate,
			List<Contact> contacts) {
		super();
		this.bankId = bankId;
		this.name = name;
		this.description = description;
		this.registerNumber = registerNumber;
		this.createdDate = createdDate;
		this.contacts = contacts;
	}

	public Bank(int bankId, String name, String description, long registerNumber, Date createdDate) {
		super();
		this.bankId = bankId;
		this.name = name;
		this.description = description;
		this.registerNumber = registerNumber;
		this.createdDate = createdDate;
	}

	public int getBankId() {
		return bankId;
	}

	public void setBankId(int bankId) {
		this.bankId = bankId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getRegisterNumber() {
		return registerNumber;
	}

	public void setRegisterNumber(long registerNumber) {
		this.registerNumber = registerNumber;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}

	@Override
	public String toString() {
		return "Bank [bankId=" + bankId + ", name=" + name + ", description=" + description + ", registerNumber="
				+ registerNumber + ", createdDate=" + createdDate + ", contacts=" + contacts + "]";
	}

}
