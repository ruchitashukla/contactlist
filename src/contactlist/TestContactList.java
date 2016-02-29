package contactlist;

public class TestContactList {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1 = new Person();
		person1.setFirstName("abc");
		person1.setLastName("xyz");
		person1.setStreetAddress("Foothill");
		person1.setPhoneNumber("1234567890");
		person1.setEmailId("abc@gmail.com");
		person1.setNotes("test 1");
		
		ContactList contactList = new ContactList(1);
		contactList.addNewContact(person1);
		contactList.printAllContacts();
		contactList.getContactByLastName("xyz");
		contactList.storeContactsOnDisk();
	}
}
