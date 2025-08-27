package swing;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI {
	public GUI() {
		JFrame frame = new JFrame();
		
		//Really common for panel is to set up the boarder from the frame, set the layout, 
		//then add elements to the layout
		JPanel panel = new JPanel(); 
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		panel.setLayout(new GridLayout(0, 1));
		
		//Best practice is this
		frame.add(panel, BorderLayout.CENTER);//add panel to frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//set what happens when they close the frame
		frame.setTitle("My GUI");//set title
		frame.pack();//set window to match certain size
		frame.setVisible(true); //set window to be visible
			
	}
	
	public static void main(String[] args) {
		new GUI();

	}

}
