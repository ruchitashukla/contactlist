package contactlist;
import java.util.ArrayList;

/**
 * One object of this class represents information about many people
 */
public class ContactList {
	/**
	 * arrayList will save all persons` data.
	 */
	ArrayList<Person> myList = new ArrayList<Person>();
	
	/**
	 * Adds the new contact
	 */
	public void addNewContact(Person newPerson) {
	}
	/**
	 * Prints all contacts
	 */
	public void printAllContacts() {
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