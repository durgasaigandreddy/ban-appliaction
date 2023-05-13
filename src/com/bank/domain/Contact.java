package com.bank.domain;

public class Contact extends RuntimeException{

	private int contactId;
	private ContactType contactType;
	private String value;

	public Contact() {

	}

	public Contact(int contactId, ContactType contactType, String value) {
		super();
		this.contactId = contactId;
		this.contactType = contactType;
		this.value = value;
	}

	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public ContactType getContactType() {
		return contactType;
	}

	public void setContactType(ContactType contactType) {
		this.contactType = contactType;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Contact [contactId=" + contactId + ", contactType=" + contactType + ", value=" + value + "]";
	}

}
