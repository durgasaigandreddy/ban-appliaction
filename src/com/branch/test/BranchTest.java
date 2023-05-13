package com.branch.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.bank.domain.Branch;
import com.bank.domain.Contact;
import com.bank.domain.ContactType;

public class BranchTest {

	public static void main(String[] args) {

		Branch bhimavaram = new Branch();
		
		bhimavaram.setRegisterDate(new Date());
		bhimavaram.setAddressId(1);
		bhimavaram.setAddressLine1("FLAT NO 3, SUNKARA COMPLEX");
		bhimavaram.setAddressLine2("GUNP,ROAD1,bhimavaram");
		bhimavaram.setAddressLine3("NEAR BHIMESAVARA TEMPLE");
		bhimavaram.setCity("BHIMAVARAM");
		bhimavaram.setState("AP");
		bhimavaram.setPinCode(687);
		Contact contact = new Contact();
		contact.setContactId(1);
		ContactType contactType = new ContactType(2, "Mobile");
		contact.setContactType(contactType);

		contact.setValue("6303629926");
		Contact contact1 = new Contact(2, new ContactType(1, "TELEPHONE"), "08816534201");
		List<Contact> contacts = new ArrayList<>();
		contacts.add(contact1);
		contacts.add(contact);
		bhimavaram.setContacts(contacts);
		System.out.println("bhimavaram--->" + bhimavaram);

	}

}
