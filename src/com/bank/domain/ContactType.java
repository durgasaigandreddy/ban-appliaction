package com.bank.domain;

public class ContactType {

	private int contactTypeId;
	private String typeName;

	public ContactType() {

	}

	public ContactType(int contactTypeId, String typeName) {
		super();
		this.contactTypeId = contactTypeId;
		this.typeName = typeName;
	}

	public int getContactTypeId() {
		return contactTypeId;
	}

	public void setContactTypeId(int contactTypeId) {
		this.contactTypeId = contactTypeId;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	@Override
	public String toString() {
		return "ContactType [contactTypeId=" + contactTypeId + ", typeName=" + typeName + "]";
	}

}
