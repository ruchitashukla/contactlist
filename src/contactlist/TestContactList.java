package contactlist;
/**
 * Tests class ContactList by calling all methods on a ContactList object.
 */
public class TestContactList {
	
	public static void main(String[] args) {
		System.out.println("Program started.");
		Person person1 = new Person();
		person1.setFirstName("abc");
		person1.setLastName("xyz");
		person1.setStreetAddress("Foothill");
		person1.setPhoneNumber("1234567890");
		person1.setEmailId("abc@gmail.com");
		person1.setNotes("test 1");
		
		ContactList contactList = new ContactList();
		contactList.getContactsFromDisk();
		contactList.addNewContact(person1);
		contactList.printAllContacts();
		contactList.getContactByLastName("xyz");
		contactList.storeContactsOnDisk();
		System.out.println("Program completed.");
	}
}
/*
Program started.
Program completed.
*/