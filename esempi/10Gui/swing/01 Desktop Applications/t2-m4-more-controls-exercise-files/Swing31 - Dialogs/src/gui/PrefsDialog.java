package gui;

import javax.swing.JDialog;
import javax.swing.JFrame;

public class PrefsDialog extends JDialog {
	public PrefsDialog(JFrame parent) {
		super(parent, "Preferences", false);
		
		setSize(400, 300);
	}
}
