package Airline_v1;

import javax.swing.*;
import java.awt.*;

public class WelcomeGUI extends JFrame {

	private JPanel centerPanel;
	private JPanel southPanel;
	private BorderLayout borderLayout;
	private JLabel testLabel;
	private Dimension minimumSize;
	
	public WelcomeGUI() {
		centerPanel = new JPanel();
		southPanel = new JPanel();
		borderLayout = new BorderLayout();
		testLabel = new JLabel("asdfjkagbrhise");
		centerPanel.add(testLabel);
		minimumSize = new Dimension(300, 300);
		
		this.setLayout(borderLayout);
		this.add(centerPanel, BorderLayout.CENTER);
		this.add(southPanel, BorderLayout.SOUTH);
		this.setTitle("Don't forget to change this");
		this.setVisible(true);
		this.setMinimumSize(minimumSize);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
}
