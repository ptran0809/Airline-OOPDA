package Airline_v1;

public abstract class Airplane {
	protected int id;
	protected String flighNo;
	protected int numberofSeat;
	protected int numberofSeatPerRow;
	protected int[] exitsRow;
	protected static int NEXTID = 1;
	public int getId() {
		return id;
	}

	public String getFlighNo() {
		return flighNo;
	}
	public void setFlighNo(String flighNo) {
		this.flighNo = flighNo;
	}
	public int getNumberofSeat() {
		return numberofSeat;
	}
	public void setNumberofSeat(int numberofSeat) {
		this.numberofSeat = numberofSeat;
	}
	public int getNumberofSeatPerRow() {
		return numberofSeatPerRow;
	}
	public void setNumberofSeatPerRow(int numberofSeatPerRow) {
		this.numberofSeatPerRow = numberofSeatPerRow;
	}
	public int[] getExitsRow() {
		return exitsRow;
	}
	public void setExitsRow(int[] exitsRow) {
		this.exitsRow = exitsRow;
	}
	public abstract void loadSeat();
	

}
