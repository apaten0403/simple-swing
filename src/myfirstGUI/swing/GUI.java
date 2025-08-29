package myfirstGUI.swing;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 * This code is based on a tutorial by Alex Lee
 * Link: https://youtu.be/5o3fMLPY7qY?si=zdr6_5REw04D1g7Q
 * I used it as a learning tool and added my own comments for understanding
 */
//need to add unimplemented methods 
public class GUI implements ActionListener{
	
	private int count = 0;
	private JLabel label;
	private JFrame frame;
	
	/**
	 * Default Constructor
	 */
	public GUI() {
		frame = new JFrame();
		
		JButton button = new JButton("Click me");
		
		//add "implements ActionListener" when adding this so it doesn't show underline
		button.addActionListener(this); //it goes to the class its already in
		
		label = new JLabel("Number of clicks: 0");
		
		//Really common for panel is to set up the boarder from the frame, set the layout, 
		//then add elements to the layout
		JPanel panel = new JPanel(); 
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		panel.setLayout(new GridLayout(0, 1));
		panel.add(button);
		panel.add(label);
		
		//Best practice is this
		frame.add(panel, BorderLayout.CENTER);//add panel to frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//set what happens when they close the frame
		frame.setTitle("My GUI");//set title
		frame.pack();//set window to match certain size
		frame.setVisible(true); //set window to be visible	
	}
	
	/**
	 * Shows number of times button was clicked
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		count++;
		label.setText("Number of clicks: " + count);	
	}
}