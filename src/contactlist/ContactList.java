package contactlist;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * One object of this class represents information about many people
 * skeleton by R.S.
 */
public class ContactList {
	/**
	 * arrayList will save all persons` data.
	 * R.S.
	 */
	private ArrayList<Person> myList = new ArrayList<Person>();
	
	/**
	 * Adds the new contact
	 * ECS W/help from team!
	 */
	public void addNewContact() {
		
		Scanner scanner;
		scanner = new Scanner(System.in);
				
		System.out.print("Please enter FIRST name: ");
		String firstName = scanner.nextLine();		
	
		System.out.print("Please enter LAST name: ");
		String lastName = scanner.nextLine();

		System.out.print("Please enter ADDRESS: ");
		String streetAddress = scanner.nextLine();

		System.out.print("Please enter EMAIL: ");
		String emailID = scanner.nextLine();

		System.out.print("Please enter PHONE NUMBER: ");
		String phoneNumber = scanner.nextLine();

		System.out.print("User Notes: ");
		String userNotes = scanner.nextLine();
		
		Person newPerson = new Person();
		
		newPerson.setFirstName(firstName);
		newPerson.setLastName(lastName);
		newPerson.setStreetAddress(streetAddress);
		newPerson.setEmailId(emailID);
		newPerson.setPhoneNumber(phoneNumber);
		newPerson.setNotes(userNotes);
				
		myList.add(newPerson);
	}
	/**
	 * Prints all contacts sorted by last name
	 * R.S.
	 */
	public void printAllContacts() {
		Collections.sort(myList);
		System.out.println("Current List: \n" + myList.toString());
	}
	/**
	 * it finds person by last name and prints its information like first name, 
	 * last name using toString() of person class
	 */
	
	public void printContactByLastName(String lastName){
	}
	/**
	 * Stores contacts on disk from arrayList
	 */
	public void storeContactsOnDisk() {
	}
	/**
	 * gets contacts from disk to arrayList
	 */
	public void getContactsFromDisk() {
	}
	/**
	 * sorts the contacts by lastname using predefined sort method
	 */
	public void sortContactsbyLastname(){	
	}
	/**
	 * prints contact information
	 */
	public String toString(){
		return "";
	}
}