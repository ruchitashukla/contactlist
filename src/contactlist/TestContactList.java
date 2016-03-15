package contactlist;
/**
 * Tests class ContactList by calling all methods on a ContactList object.
 * skeleton by R.S.
 */
public class TestContactList {
	
	public static void main(String[] args) {
		System.out.println("Welcome to the: TEAM 4 CONTACT LIST APPLICATION!\n");
		
		System.out.println("program test started.\n");
		
		/**
		 * [1] create a new, empty list of contacts
		 * ECS
		 */
		System.out.println("step 1\n");
		
		ContactList contactList = new ContactList();
		contactList.printAllContacts();

		/**
		 * [2] add a new contact to the list
		 * ECS
		 */
		System.out.println("step 2\n");
		
		contactList.addNewContact();
		
		/**
		 * [3] print the list to show that the new contact was added to the list
		 * ECS
		 */
		System.out.println("step 3\n");
		
		contactList.printAllContacts();
		
		/**
		 * [4] add another new contact to the list
		 * ECS
		 */
		System.out.println("step 4\n");
		
		contactList.addNewContact();
		
		/**
		 * [5] print the list to show that the second contact was added to the list
		 * ECS
		 */
		System.out.println("step 5\n");
		
		contactList.printAllContacts();
		
		System.out.println("\nprogram test completed.");
	}
}
/*
Program started.
Program completed.
*/