package Airline_v1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;

public class LoginGUI extends JFrame {

	private JPanel panel;
	private JLabel username;
	private JLabel password;
	private Dimension minSize;
	private Dimension maxSize;
	private JTextField usernameText;
	private JPasswordField passwordText;
	private JButton loginButton;
	private JButton createButton;
	
	public LoginGUI() {
		
		panel = new JPanel();
		password = new JLabel("Password: ");
		username = new JLabel("Username: ");
		usernameText = new JTextField(20);
		passwordText = new JPasswordField(20);
		loginButton = new JButton("Login");
		createButton = new JButton("Create account");
		minSize = new Dimension(650, 475);
	
		loginButton.addActionListener(new LoginListener());
		createButton.addActionListener(new CreateListener());
		
		panel.setLayout(new FlowLayout());
		panel.add(username);
		panel.add(usernameText);
		panel.add(password);
		panel.add(passwordText);
		panel.add(loginButton);
		panel.add(createButton);
		panel.add(new JLabel(new ImageIcon("Images\\airbus-a350-580x366.jpg")));

		this.add(panel);
		this.pack();
		this.setVisible(true);
		this.setTitle("Welcome to Acme Airlines!");
		this.setSize(650, 475);
		this.setMinimumSize(minSize);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	

	private class LoginListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	private class CreateListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
}
