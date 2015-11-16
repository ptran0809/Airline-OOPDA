package Airline_v1;

import java.util.ArrayList;

public abstract class Airplane {
	protected int id;
	protected String flighNo;
	protected int numberofSeat;
	protected int numberofSeatPerRow;
	protected ArrayList<Seat> seats;
	protected int[] exitsRow;
	protected Route route;
	public Route getRoute() {
		return route;
	}

	public void setRoute(Route route) {
		this.route = route;
	}
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
	public int getNumberOfRow(){
		return this.numberofSeat/this.numberofSeatPerRow;
	}
	
	public ArrayList<Seat> getSeats() {
		return seats;
	}

	public void setSeats(ArrayList<Seat> seats) {
		this.seats = seats;
	}

	public abstract void loadSeat();
	

}
