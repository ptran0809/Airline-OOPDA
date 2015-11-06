package airline_v1;

/**
 * Route.java is a class which represents the details of an Airplane Route.
 * Includes fields for the departure location, destination, approximate departure and arrival times, and the base price of the route.
 * @author Sean Zimmerman, Matthew Gimbut, Phong Tran
 * @version 2015.10.23
 */
public class Route {

	private String departure;
	private String destination;
	private String departTime;
	private String landingTime;
	private double price;
	
	 /**
	  * A constructor for the Route class which takes in all fields 
	  * @param departure The departure location of the Route
	  * @param destination The destination of the Route
	  * @param departTime The departure time of the Route
	  * @param landingTime The approximate landing time of the Route
	  * @param price The base price of the Route
	  */
	public Route(String departure, String destination, String departTime, String landingTime, double price) {
		this.departure = departure;
		this.destination = destination;
		this.departTime = departTime;
		this.landingTime = landingTime;
		this.price = price;
	}
	
	/**
	 * An accessor method for the private String field departure
	 * @return The departure location of the Route
	 */
	public String getDeparture() {
		return this.departure;
	}
	
	/**
	 * An accessor method for the private String field destination
	 * @return The destination of the Route
	 */
	public String getDestnation() {
		return this.destination;
	}
	
	/**
	 * An accessor method for the private String field departTime
	 * @return The departure time of the Route
	 */
	public String getDepartTime() {
		return this.departTime;
	}
	
	/**
	 * An accessor method for the private String field landingTime
	 * @return The approximate landing time of the Route
	 */
	public String getLandingTime() {
		return this.landingTime;
	}
	
	/**
	 * An accessor method for the private double field price
	 * @return The base price of the Route
	 */
	public double getPrice() {
		return this.price;
	}
}
