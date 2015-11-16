package Airline_v1;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.Border;

public class Airplane_panel extends JPanel {
	JLabel airplan_name;
	JLabel destination;
	JLabel depart_time;
	JLabel landingTime;
	JLabel departure;
	JPanel seats;
	JPanel departure_panel;
	JPanel destination_panel;
	public Airplane_panel (Airplane airplane){
		
		this.airplan_name = new JLabel(airplane.getFlighNo());
		this.destination = new JLabel(airplane.getRoute().getDestnation());
		this.depart_time = new JLabel(airplane.getRoute().getDepartTime());
		this.landingTime = new JLabel(airplane.getRoute().getLandingTime());
		this.departure = new JLabel(airplane.getRoute().getDeparture());
		this.setLayout(new BorderLayout());
		
		this.seats.setLayout(new GridLayout(airplane.getNumberOfRow(),airplane.getNumberofSeatPerRow()));
		
		
		this.departure_panel.setLayout(new GridLayout(2,1));
		this.destination_panel.setLayout(new GridLayout(2,1));
		this.departure_panel.add(this.departure);
		this.departure_panel.add(this.depart_time);
		this.destination_panel.add(this.destination);
		this.destination_panel.add(this.landingTime);
		this.addSeat(airplane);
		this.add(this.airplan_name,BorderLayout.NORTH);
		this.add(this.departure_panel, BorderLayout.WEST);
		this.add(this.seats, BorderLayout.CENTER);
		this.add(this.destination_panel, BorderLayout.EAST);
	
		
	}
	private void addSeat(Airplane airplane){
		ArrayList<Seat> seats = airplane.getSeats();
		for(Seat s : seats){
			this.seats.add(new SeatButton(s));
		}
		
	}
}
