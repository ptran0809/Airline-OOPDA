/**
 * Passenger.java a class which represents a Passenger on an airline.
 * Includes static methods for validating an email and password to be used by the Passenger.
 * @author Sean Zimmerman, Matthew Gimbut, Phong Tran
 * @version 2015.10.16
 */

package Airline_v1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Passenger {

	private int id;
	private String firstName;
	private String lastName;
	private String middleName;
	private String email;
	private String password;
	
	 /**
	  * A constructor for the Passenger class which takes in all fields 
	  * @param id The id of the passenger
	  * @param firstName The passenger's first name
	  * @param middleName The passenger's last name
	  * @param lastName The passenger's middle name
	  * @param email The passenger's email
	  * @param password The passenger's password
	  */
	public Passenger(int id, String firstName, String middleName, String lastName, String email, String password) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.email = email;
		this.password = password;
	}
	
	/**
	  * A constructor for the Passenger class which takes in all fields middle name
	  * @param id The id of the passenger
	  * @param firstName The passenger's first name
	  * @param middleName The passenger's last name
	  * @param email The passenger's email
	  * @param password The passenger's password
	  */
	public Passenger(int id, String firstName, String lastName, String email, String password) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.middleName = "";
	}
	
	/**
	 * An accessor method for the private int field id
	 * @return The id of the person
	 */
	public int getId() {
		return this.id;
	}
	
	/**
	 * An accessor method for the private String field firstName
	 * @return The first name of the person
	 */
	public String getFirstName() {
		return this.firstName;
	}
	
	/**
	 * An accessor method for the private String field lastName
	 * @return The last name of the person
	 */
	public String getLastName() {
		return this.lastName;
	}
	
	/**
	 * An accessor method for the private String field middleName
	 * @return The middle name of the person
	 */
	public String getMiddleName() {
		return this.middleName;
	}
	
	/**
	 * An accessor method for the private String field email
	 * @return The email of the person
	 */
	public String getEmail() {
		return this.email;
	}
	
	/**
	 * An accessor method for the private String field password
	 * @return The password of the person
	 */
	public String getPassword() {
		return this.password;
	}
	
	/**
	 * Override of the toString method to return the formatted full name of the person
	 * @return The full name of the person
	 */
	public String toString() {
		if(this.middleName.trim().length() > 0) {
			return this.firstName + " " + this.middleName + " " + this.lastName;
		}
		return this.firstName + " " + this.lastName;
	}
	
	/**
	 * A mutator method for the private String field firstName
	 * @param firstName The first name of the person
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * A mutator method for the private String field lastName
	 * @param lastName The last name of the person
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * A mutator method for the private String field middleName
	 * @param middleName The middle name of the person
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	/**
	 * A mutator method for the private String field email
	 * @param email The new email for the person
	 */
	public void setEmail(String email) {
		if(validateEmail(email)) {
			this.email = email;
		}
	}
	
	/**
	 * A mutator method for the private String field password
	 * @param email The new password for the person
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * The three conditions that have to be met for an email to be valid are:
	 * At least one '@' and '.'
	 * At least one of the '.' most proceed the '@'
	 * There must only be one '@'
	 * @param email The email address to be tested
	 * @return If the email is valid or not
	 */
	public static boolean validateEmail(String email) {
		Pattern p = Pattern.compile(".+@.+\\..+");
		Matcher m = p.matcher(email);
		return m.matches();
	}
	
	/**
	 * The three conditions that have to be met for a password to be valid are:
	 * At least 6 characters no more than 20
	 * At least one capital letter
	 * At least one digit
	 * @param password The password to be tested
	 * @return If the password is valid or not
	 */
	public static boolean validatePassword(String password) {
		Pattern p = Pattern.compile("(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{6,20}");
		Matcher m = p.matcher(password);
		return m.matches();
	}
}
