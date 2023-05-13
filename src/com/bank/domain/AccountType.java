package com.bank.domain;

public class AccountType {

	private int accountTypeId;
	private String description;

	public AccountType() {

	}

	public AccountType(int accountTypeId, String description) {
		super();
		this.accountTypeId = accountTypeId;
		this.description = description;
	}

	public int getAccountTypeId() {
		return accountTypeId;
	}

	public void setAccountTypeId(int accountTypeId) {
		this.accountTypeId = accountTypeId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "AccountType [accountTypeId=" + accountTypeId + ", description=" + description + "]";
	}

}
