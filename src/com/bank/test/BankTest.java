package com.bank.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.bank.domain.Bank;
import com.bank.domain.Contact;
import com.bank.domain.ContactType;

public class BankTest {

	public static void main(String[] args) {
		
		Bank iciciBank = new Bank();
		iciciBank.setBankId(1);
		iciciBank.setName("ICICI");
		iciciBank.setDescription("consumer bank");
		iciciBank.setRegisterNumber(1234567);
		iciciBank.setCreatedDate(new Date());
		 
		iciciBank.setAddressId(1);
		iciciBank.setCity("Hyderabad");
		iciciBank.setState("TS");
		iciciBank.setPinCode(500085);
		
		Contact contact= new Contact();
		contact.setContactId(1);
		ContactType contactType = new ContactType(2,"Mobile");
		contact.setContactType(contactType);
		contact.setValue("9089978790");
		
		Contact contact1= new Contact(2,new ContactType(1,"email"),"Guntur@gmail.com");
		
		List<Contact> contacts = new ArrayList<>();
		contacts.add(contact1);
		contacts.add(contact);
			
		iciciBank.setContacts(contacts);
		System.out.println();
		

	}

}
