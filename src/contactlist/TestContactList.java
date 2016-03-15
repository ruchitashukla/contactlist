package contactlist;
/**
 * Tests class ContactList by calling all methods on a ContactList object.
 * skeleton by R.S.
 */
public class TestContactList {
	
	public static void main(String[] args) {
		/**
		 * R.S.
		 */
		System.out.println("Program started.");
		Person person1 = new Person();
		person1.setFirstName("abc");
		person1.setLastName("xyz");
		person1.setStreetAddress("Foothill");
		person1.setPhoneNumber("1234567890");
		person1.setEmailId("abc@gmail.com");
		person1.setNotes("test 1");
		
		/**
		 * R.S.
		 */
		System.out.println(person1.getFirstName());
		System.out.println(person1.getLastName());
		System.out.println(person1.getStreetAddress());
		System.out.println(person1.getPhoneNumber());
		System.out.println(person1.getEmailId());
		System.out.println(person1.getNotes());
		System.out.println(person1.toString());
		
		/**
		 * R.S.
		 */
		ContactList contactList = new ContactList();
		contactList.getContactsFromDisk();
		contactList.addNewContact(person1);
		contactList.printAllContacts();
		contactList.printContactByLastName("xyz");
		contactList.storeContactsOnDisk();
		System.out.println("Program completed.");
	}
}
/*
Program started.
Program completed.
*/