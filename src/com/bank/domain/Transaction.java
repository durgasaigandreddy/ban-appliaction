package com.bank.domain;

import java.util.Date;

public class Transaction {

	private int transactionId;
	private String description;
	private String toAccount;
	private String fromAccount;
	private double balanceAmount;
	private Date transactionDate;
	private TransactionType transactionType;

	public Transaction() {

	}

	public Transaction(int transactionId, String description, String toAccount, String fromAccount,
			double balanceAmount, Date transactionDate, TransactionType transactionType) {
		super();
		this.transactionId = transactionId;
		this.description = description;
		this.toAccount = toAccount;
		this.fromAccount = fromAccount;
		this.balanceAmount = balanceAmount;
		this.transactionDate = transactionDate;
		this.transactionType = transactionType;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getToAccount() {
		return toAccount;
	}

	public void setToAccount(String toAccount) {
		this.toAccount = toAccount;
	}

	public String getFromAccount() {
		return fromAccount;
	}

	public void setFromAccount(String fromAccount) {
		this.fromAccount = fromAccount;
	}

	public double getBalanceAmount() {
		return balanceAmount;
	}

	public void setBalanceAmount(double balanceAmount) {
		this.balanceAmount = balanceAmount;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public TransactionType getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(TransactionType transactionType) {
		this.transactionType = transactionType;
	}

	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", description=" + description + ", toAccount="
				+ toAccount + ", fromAccount=" + fromAccount + ", balanceAmount=" + balanceAmount + ", transactionDate="
				+ transactionDate + ", transactionType=" + transactionType + "]";
	}

}
