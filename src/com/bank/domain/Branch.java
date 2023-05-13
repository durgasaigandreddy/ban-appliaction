package com.bank.domain;

import java.util.Date;
import java.util.List;

public class Branch extends Address {

	private int branchId;
	private String name;
	private long code;
	private String ifscCode;
	private Date registerDate;
	private List<Contact> contacts;

	public Branch() {

	}

	public Branch(int branchId, String name, long code, String ifscCode, Date registerDate, List<Contact> contacts) {
		super();
		this.branchId = branchId;
		this.name = name;
		this.code = code;
		this.ifscCode = ifscCode;
		this.registerDate = registerDate;
		this.contacts = contacts;
	}

	public Branch(int branchId, String name, long code, String ifscCode, Date registerDate) {
		super();
		this.branchId = branchId;
		this.name = name;
		this.code = code;
		this.ifscCode = ifscCode;
		this.registerDate = registerDate;
	}

	public int getBranchId() {
		return branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getCode() {
		return code;
	}

	public void setCode(long code) {
		this.code = code;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public Date getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}

	@Override
	public String toString() {
		return "Branch [branchId=" + branchId + ", name=" + name + ", code=" + code + ", ifscCode=" + ifscCode
				+ ", registerDate=" + registerDate + ", contacts=" + contacts + "]";
	}

}
