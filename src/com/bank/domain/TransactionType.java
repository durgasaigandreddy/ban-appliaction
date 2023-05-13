package com.bank.domain;

public class TransactionType {

	private int transactionId;
	private String typeName;

	public TransactionType() {

	}

	public TransactionType(int transactionId, String typeName) {
		super();
		this.transactionId = transactionId;
		this.typeName = typeName;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	@Override
	public String toString() {
		return "TransactionType [transactionId=" + transactionId + ", typeName=" + typeName + "]";
	}

}
