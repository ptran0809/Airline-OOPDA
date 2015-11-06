/**
 * MemberPassenger.java a Subclass of Passenger.java which represents a Passenger who has a membership with Acme Airlines.
 * @author Sean Zimmerman, Matthew Gimbut, Phong Tran
 * @version 2015.10.16
 */

package airline_v1;

public class MemberPassenger extends Passenger {

	public enum MemberType {
		PLATINUM, GOLD, SILVER
	}
	private MemberType type;
	
	/**
	 * Only constructor, takes all information about the Passenger and its membership type
	 * @param id The id of the passenger
	 * @param firstName The passenger's first name
	 * @param middleName The passenger's last name
	 * @param lastName The passenger's middle name
	 * @param email The passenger's email
	 * @param password The passenger's password
	 * @param memberType The passenger's membership type
	 */
	public MemberPassenger(int id, String firstName, String middleName, String lastName, String email, String password, String memberType) {
		super(id, firstName, middleName, lastName, email, password);	
		switch(memberType.toLowerCase()) {
		case "platinum":	this.type = MemberType.PLATINUM;
		case "gold":		this.type = MemberType.GOLD;
		case "silver":		this.type = MemberType.SILVER;
		default:			this.type = null;
		}
	}

	/**
	 * An accessor method for the private MemberType field type
	 * @return The type of member the Passenger is
	 */
	public MemberType getType() {
		return this.type;
	}
	
	/**
	 * Override of the toString method to return the formatted full name of the person plus their membership type
	 * @return The full name of the person plus their membership
	 */
	public String toString() {
		return super.toString() + " " + printFormat(type) + " member.";
	}
	
	/**
	 * A method which takes in an enum value and returns the value in a print friendly format (first digit capital rest lowercase)
	 * @param type The type to be formatted
	 * @return The print friendly format of the type
	 */
	public String printFormat(MemberType type) {
		switch(type) {
		case PLATINUM:	return "Platinum";
		case GOLD:		return "Gold";
		case SILVER:	return "Silver";
		default:		return null;
		}
	}
}
