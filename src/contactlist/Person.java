package contactlist;
/**
 * The one object of the Person represents firstName, lastName, streetAddress ,emailId, phoneNmuber and notes.
 */
public class Person {
	private String firstName; // firstName is a data member
	private String lastName; // lastName is a data member
	private String streetAddress; // streetAddress is a data member
	private String emailId; // emailId is a data member
	private String phoneNumber; // phoneNumber is a data member
	private String notes; // notes is a data member
	
	/**
	 * returns the firstName of Person
	 */
	public String getFirstName() {
		return "";
	}
	/**
	 * sets the firstName of Person
	 * For example, "setFirstName("abc") sets firstName as "abc"
	 */
	public void setFirstName(String firstName) {
	}
	/**
	 * returns the lastName of Person
	 */
	public String getLastName() {
		return "";
	}
	/**
	 * sets the lastName of Person
	 * For example, "setLastName("xyz") sets lastName as "xyz"
	 */
	
	public void setLastName(String lastName) {
	}
	/**
	 * returns  the streetAddress of Person
	 */
	public String getStreetAddress() {
		return "";
	}
	/**
	 * sets the streetAddress of Person
	 * For example, "setStreetAddress("foothill") sets streetAddress as "foothill"
	 */
	
	public void setStreetAddress(String streetAddress) {
	}
	/**
	 * returns the emailId of Person
	 */
	public String getEmailId() {
		return "";
	}
	/**
	 * sets the emailId of Person
	 * For example, "setEmailId("xyz@gmail.com") sets emailId as "xyz@gmail.com"
	 */
	
	public void setEmailId(String emailId) {
	}
	/**
	 * returns the phoneNumber of Person
	 */
	public String getPhoneNumber() {
		return "";
	}
	/**
	 * sets the phoneNumber of Person
	 * For example, "setPhoneNumber("1234567890") sets phoneNumber as "1234567890"
	 */
	
	public void setPhoneNumber(String phoneNumber) {
	}
	/**
	 * returns the notes of Person
	 */
	public String getNotes() {
		return "";
	}
	/**
	 * sets the notes of Person
	 *  For example, "setNotes("test notes") sets notes as "test notes"
	 */
	public void setNotes(String notes) {
	} 
	/**
	 * returns persons` information
	 */
	public String toString(){
		return firstName + " " + lastName +"\n"+ streetAddress+"/n"  + emailId + "\n" + phoneNumber +"/n" + notes;
	} 
}
