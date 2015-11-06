import javax.swing.JOptionPane;

/**
 * Abstract class seat for the Airline project
 * @author Matthew Gimbut
 * @author Sean Zimmerman
 * @author Phong Tran
 */
public abstract class Seat {
	
	private int id;
	private int rowLocation;
	private Passenger passenger;
	// If passenger is null that means the seat is empty
	private boolean isExitSeat;

	/**
	 * Constructor for seats with no passenger
	 * 
	 * @param id
	 * @param rowLocation
	 * @param priceFaction
	 * @param isExitSeat
	 */
	public Seat(int id, int rowLocation, boolean isExitSeat) {
		this.id = id;
		this.rowLocation = rowLocation;
		this.isExitSeat = isExitSeat;
	}
	
	public Seat() {
		
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the rowLocation
	 */
	public int getRowLocation() {
		return rowLocation;
	}

	/**
	 * @param rowLocation the rowLocation to set
	 */
	public void setRowLocation(int rowLocation) {
		this.rowLocation = rowLocation;
	}


	/**
	 * @return the passenger
	 */
	/**public Passenger getPassenger() {
		return passenger;
	}**/

	/**
	 * @param passenger the passenger to set
	 */
	
	public void setPassenger(Passenger passenger) {
		if (this.passenger == null){
			this.passenger = passenger;
		}
		else {
			JOptionPane.showMessageDialog(null, "this is a temp error message so i can feel cool about using error messages.");
		}
	}

	/**
	 * @return the isExitSeat
	 */
	public boolean isExitSeat() {
		return isExitSeat;
	}

	/**
	 * @param isExitSeat the isExitSeat to set
	 */
	public void setExitSeat(boolean isExitSeat) {
		this.isExitSeat = isExitSeat;
	}
	
	/**
	 * Checks to see if the seat is currently available
	 * @return Whether or not the seat is available
	 */
	public boolean isAvailable() {
		if (this.passenger == null){
			return true;
		}
		else {
			return false;
		}		
	}
	
	public abstract double getPriceFaction();
	public abstract void setPriceFaction(double priceFaction);
	
}
