package contactlist;
/**
 * The one object of the Person represents firstName, lastName, streetAddress ,emailId, phoneNmuber and notes.
 * skeleton by R.S.
 */
public class Person implements Comparable {
	private String firstName; // firstName is a data membercd
	private String lastName; // lastName is a data member
	private String streetAddress; // streetAddress is a data member
	private String emailId; // emailId is a data member
	private String phoneNumber; // phoneNumber is a data member
	private String notes; // notes is a data member
	
	/**
	 * returns the firstName of Person
	 * R.S.
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * sets the firstName of Person
	 * For example, "setFirstName("abc") sets firstName as "abc"
	 * R.S.
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * returns the lastName of Person
	 * R.S.
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * sets the lastName of Person
	 * For example, "setLastName("xyz") sets lastName as "xyz"
	 * R.S.
	 */
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * returns  the streetAddress of Person
	 * R.S.
	 */
	public String getStreetAddress() {
		return streetAddress;
	}
	/**
	 * sets the streetAddress of Person
	 * For example, "setStreetAddress("foothill") sets streetAddress as "foothill"
	 * R.S.
	 */
	
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	/**
	 * returns the emailId of Person
	 * R.S.
	 */
	public String getEmailId() {
		return emailId;
	}
	/**
	 * sets the emailId of Person
	 * For example, "setEmailId("xyz@gmail.com") sets emailId as "xyz@gmail.com"
	 * R.S.
	 */
	
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	/**
	 * returns the phoneNumber of Person
	 * R.S.
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * sets the phoneNumber of Person
	 * For example, "setPhoneNumber("1234567890") sets phoneNumber as "1234567890"
	 * R.S.
	 */
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	/**
	 * returns the notes of Person
	 * R.S.
	 */
	public String getNotes() {
		return notes;
	}
	/**
	 *  sets the notes of Person
	 *  For example, "setNotes("test notes") sets notes as "test notes"
	 *  R.S.
	 */
	public void setNotes(String notes) {
		this.notes = notes;
	} 
	/**
	 * returns persons` information
	 * ECS
	 */
	public String toString(){
		return 
				"\n--------------------------------------------------" 
				+ "\nNAME: " + getLastName() + ", " + getFirstName() 
				+ "\n\nADDRESS: " + getStreetAddress() 
				+ "\n\nEMAIL: " + getEmailId() 
				+ "\n\nPHONE NUMBER: " + getPhoneNumber()
				+ "\n\nUser Notes: " + getNotes() + "\n"
				+ "--------------------------------------------------\n";
	}
	/**
	 * compares persons by their lasNname, if lastName is same then compares with persons' firstName
	 * R.S.
	 */
	@Override
	public int compareTo(Object person){
		Person newperson = (Person)person;
		
		if (this.lastName.equalsIgnoreCase(newperson.lastName)){
			return this.firstName.compareTo(newperson.firstName);
		}
		return this.lastName.compareTo(newperson.lastName);
	}
}
