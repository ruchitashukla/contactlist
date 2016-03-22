package contactlist;

import java.util.Scanner;

/**
 * Tests class ContactList by calling all methods on a ContactList object.
 * skeleton by R.S.
 */
public class TestContactList {
	
	public static void main(String[] args) {
		System.out.println("Welcome to the: TEAM 4 CONTACT LIST APPLICATION!\n");
		
		/**
		 * Run a loop to get user input about which task to perform
		 */
		Scanner scanner;
		scanner = new Scanner(System.in);
		while (true) {
			System.out.print(
					"These are the tasks you can perform:\n"
					+ "1. Print all contacts\n"
					+ "2. Add new Contact\n"
					+ "3. Find contacts by last name\n"
					+ "4. Save and quit program\n"
					+ "Please enter the task number you'd like to perform: ");
			int option = scanner.nextInt();

			switch (option) {
				case 1: {
					contactList.printAllContacts();
					break;
				}
				case 2: {
					contactList.addNewContact();
					break;
				}
				case 3: {
					//contactList.printContactByLastName();
					break;
				}
				case 4: {
					System.out.println("Saving data and exiting program!");
					contactList.storeContactsOnDisk();
					System.exit(0);
				}
				default: {
					System.out.println("Invalid option:" + option + " Please choose in between 1:4.");
				}
			}
		}

		
	}
}
/*
Welcome to the: TEAM 4 CONTACT LIST APPLICATION!

These are the tasks you can perform:
1. Print all contacts
2. Add new Contact
3. Find contacts by last name
4. Save and quit program
Please enter the task number you'd like to perform: 1
Current List: 
[]
These are the tasks you can perform:
1. Print all contacts
2. Add new Contact
3. Find contacts by last name
4. Save and quit program
Please enter the task number you'd like to perform: 2
Please enter FIRST name: ruchita
Please enter LAST name: shukla
Please enter ADDRESS: abc
Please enter EMAIL: abc@gmail.com
Please enter PHONE NUMBER: 1231231234
User Notes: test
These are the tasks you can perform:
1. Print all contacts
2. Add new Contact
3. Find contacts by last name
4. Save and quit program
Please enter the task number you'd like to perform: 2
Please enter FIRST name: Hari
Please enter LAST name: Shukla
Please enter ADDRESS: abc
Please enter EMAIL: xyz@gmail.com
Please enter PHONE NUMBER: 1234567890
User Notes: test
These are the tasks you can perform:
1. Print all contacts
2. Add new Contact
3. Find contacts by last name
4. Save and quit program
Please enter the task number you'd like to perform: 2
Please enter FIRST name: Ishaan
Please enter LAST name: shah
Please enter ADDRESS: aaa
Please enter EMAIL: aaa@gmail.com
Please enter PHONE NUMBER: 1234567811
User Notes: test
These are the tasks you can perform:
1. Print all contacts
2. Add new Contact
3. Find contacts by last name
4. Save and quit program
Please enter the task number you'd like to perform: 1
Current List: 
[
--------------------------------------------------
NAME: shah, Ishaan

ADDRESS: aaa

EMAIL: aaa@gmail.com

PHONE NUMBER: 1234567811

User Notes: test
--------------------------------------------------
, 
--------------------------------------------------
NAME: Shukla, Hari

ADDRESS: abc

EMAIL: xyz@gmail.com

PHONE NUMBER: 1234567890

User Notes: test
--------------------------------------------------
, 
--------------------------------------------------
NAME: shukla, ruchita

ADDRESS: abc

EMAIL: abc@gmail.com

PHONE NUMBER: 1231231234

User Notes: test
--------------------------------------------------
]
These are the tasks you can perform:
1. Print all contacts
2. Add new Contact
3. Find contacts by last name
4. Save and quit program
Please enter the task number you'd like to perform: 4
Saving data and exiting program!
*/