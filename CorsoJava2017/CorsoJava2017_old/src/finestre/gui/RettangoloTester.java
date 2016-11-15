package finestre.gui;

import javax.swing.JFrame;

public class RettangoloTester {

	public static void main(String[] args) {
		
		JFrame mioFrame = new JFrame();
		mioFrame.setSize(400, 300);
		mioFrame.setTitle("Due rettangoli");
		mioFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		RettangoloBase component = new RettangoloBase();
		mioFrame.add(component);
		
		mioFrame.setVisible(true);
		
	}

}
