package Airline_v1;

public class Airplane_6 extends Airplane{
	public Airplane_6(String flightNo){
		this.id = Airplane.NEXTID;
		Airplane.NEXTID = Airplane.NEXTID +1;
		this.flighNo = flightNo;
	}
	@Override
	public void loadSeat() {
		// TODO Auto-generated method stub
		
	}

}
