package Airline_v1;

/**
 * 
 * FirstClassSeat subclass of Seat
 * @author Matthew Gimbut
 * @author Sean Zimmerman
 * @author Phong Tran
 *
 */
public class FirstClassSeat extends Seat{
	private double priceFaction;

	/**
	 * @return the priceFaction
	 */
	public double getPriceFaction() {
		return priceFaction;
	}

	/**
	 * @param priceFaction the priceFaction to set
	 */
	public void setPriceFaction(double priceFaction) {
		this.priceFaction = priceFaction;
	}
	

}
