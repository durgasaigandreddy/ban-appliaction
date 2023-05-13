package com.transaction.test;

import java.util.Date;

import com.bank.domain.Transaction;
import com.bank.domain.TransactionType;

public class TransactionTest {

	public static void main(String[] args) {

		Transaction transaction1 = new Transaction();
		transaction1.setTransactionId(1);
		transaction1.setDescription("IMPS");
		transaction1.setToAccount("sai");
		transaction1.setFromAccount("ram");
		transaction1.setBalanceAmount(123456);
		transaction1.setTransactionDate(new Date());

		TransactionType transactionType = new TransactionType(1, "UPI");
		transaction1.setTransactionType(transactionType);

		System.out.println("transaction1--->" + transaction1);

	}

}
