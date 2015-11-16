package Airline_v1;

import java.awt.event.ActionListener;

import javax.swing.*;

public class SeatButton extends JButton {
	protected JLabel seatName;
	public SeatButton (Seat seat){
		this.seatName = new JLabel(String.valueOf(seat.getRowLocation()+seat.getId()));
		
		//MAKE AN OPENER SEAT
		this.addActionListener(event -> System.out.println("Clicked"));
	}
}
