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
Welcome to the: TEAM 4 CONTACT LIST APPLICATION!

program test started.

step 1

Current List: 
[]
step 2

Please enter FIRST name: Eric
Please enter LAST name: Cavazos-Smith
Please enter ADDRESS: 920 Bluebonnet Drive, Sunnyvale, CA 94086
Please enter EMAIL: talk2ericacs@outlook.com
Please enter PHONE NUMBER: 408-796-9991
User Notes: Team member of Team 4 Project
step 3

Current List: 
[
--------------------------------------------------
NAME: Eric, Cavazos-Smith

ADDRESS: 920 Bluebonnet Drive, Sunnyvale, CA 94086

EMAIL: talk2ericacs@outlook.com

PHONE NUMBER: 408-796-9991

User Notes: Team member of Team 4 Project
--------------------------------------------------
]
step 4

Please enter FIRST name: John
Please enter LAST name: Doe
Please enter ADDRESS: 555 JohnDoe Street, City of JohnDoe, CA 55555
Please enter EMAIL: johndoe@johndoe.com
Please enter PHONE NUMBER: 555-555-5555
User Notes: Not a real person :)
step 5

Current List: 
[
--------------------------------------------------
NAME: Cavazos-Smith, Eric

ADDRESS: 920 Bluebonnet Drive, Sunnyvale, CA 94086

EMAIL: talk2ericacs@outlook.com

PHONE NUMBER: 408-796-9991

User Notes: Team member of Team 4 Project
--------------------------------------------------
, 
--------------------------------------------------
NAME: Doe, John

ADDRESS: 555 JohnDoe Street, City of JohnDoe, CA 55555

EMAIL: johndoe@johndoe.com

PHONE NUMBER: 555-555-5555

User Notes: Not a real person :)
--------------------------------------------------
]

program test completed.

*/