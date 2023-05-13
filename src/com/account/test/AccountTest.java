package com.account.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.bank.domain.Account;
import com.bank.domain.AccountType;
import com.bank.domain.Contact;
import com.bank.domain.ContactType;
import com.bank.domain.Customer;

public class AccountTest {

	public static void main(String[] args) {
		Account account1 = new Account();
		account1.setAccountId(1);
		account1.setAccountNumber("255345675");
		account1.setCreatedDate(new Date());
		account1.setBalanceAmount(123456);

		AccountType accountType = new AccountType(1, "savings");
		account1.setAccountType(accountType);

		Customer customer = new Customer();
		customer.setCustomerId(1);
		customer.setFirstName("durga");
		customer.setMiddleName("sai");
		customer.setLastName("ganireddy");
		customer.setDob(null);
		customer.setGender("male");
		customer.setMartialStatus("single");
		customer.setAadharNumber(7407627);
		customer.setPanNumber("cixpg707m");
		account1.setCustomer(customer);

		account1.setAddressId(1);
		account1.setAddressLine1("FLAT NO 5, DURGA COMPLEX");
		account1.setAddressLine2("GUNP,ROAD5,CHINNIMAERAM");
		account1.setAddressLine3("NEAR MAVULLAMA TEMPLE");
		account1.setCity("CHINNIMARAM");
		account1.setState("AP");
		account1.setPinCode(534201);

		Contact contact1 = new Contact();
		contact1.setContactId(1);
		ContactType contactType = new ContactType(1, "E-mail");
		contact1.setContactType(contactType);
		contact1.setValue("durgasai2856@gmail.com");

		Contact contact2 = new Contact(2, new ContactType(2, "landline"), "0881623456");
		contact2.setContactType(contactType);
		List<Contact> contacts = new ArrayList<>();
		contacts.add(contact1);
		contacts.add(contact2);

		System.out.println("account1--->" + account1);

	}

}
