package gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

public class PrefsDialog extends JDialog {
	
	private JButton okButton;
	private JButton cancelButton;
	private JSpinner portSpinner;
	private SpinnerNumberModel spinnerModel;
	private JTextField userField;
	private JPasswordField passField;
	
	private PrefsListener prefsListener;
	
	public PrefsDialog(JFrame parent) {
		super(parent, "Preferences", false);
		
		okButton = new JButton("OK");
		cancelButton = new JButton("Cancel");
		
		spinnerModel = new SpinnerNumberModel(3306, 0, 9999, 1);
		portSpinner = new JSpinner(spinnerModel);
		
		userField = new JTextField(10);
		passField = new JPasswordField(10);
		
		passField.setEchoChar('*');
		
		setLayout(new GridBagLayout());
		
		GridBagConstraints gc = new GridBagConstraints();
		
		gc.gridy = 0;
		
		/////// First row /////////////////////////////
		
		gc.weightx = 1;
		gc.weighty = 1;
		gc.fill = GridBagConstraints.NONE;
		
		gc.gridx = 0;
		
		add(new JLabel("User: "), gc);
		
		gc.gridx++;
		add(userField, gc);
		
//////// Next row ////////////////////////////
		
		gc.gridy++;
		
		gc.weightx = 1;
		gc.weighty = 1;
		gc.fill = GridBagConstraints.NONE;
		
		gc.gridx = 0;
		
		add(new JLabel("Password: "), gc);
		
		gc.gridx++;
		add(passField, gc);
		
		
		//////// Next row ////////////////////////////
		
		gc.gridy++;
		
		gc.weightx = 1;
		gc.weighty = 1;
		gc.fill = GridBagConstraints.NONE;
		
		gc.gridx = 0;
		
		add(new JLabel("Port: "), gc);
		
		gc.gridx++;
		add(portSpinner, gc);
		
		//////////// Next row ///////////////
		
		gc.gridy++;
		
		gc.gridx = 0;
		add(okButton, gc);
		
		gc.gridx++;
		add(cancelButton, gc);
		
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Integer port = (Integer)portSpinner.getValue();
				
				String user = userField.getText();
				char[] password = passField.getPassword();
				
				if(prefsListener != null) {
					prefsListener.preferencesSet(user, new String(password), port);
				}
				
				setVisible(false);
			}
		});
		
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		
		setSize(400, 300);
		setLocationRelativeTo(parent);
	}
	
	public void setDefaults(String user, String password, int port) {
		userField.setText(user);
		passField.setText(password);
		portSpinner.setValue(port);
	}

	public void setPrefsListener(PrefsListener prefsListener) {
		this.prefsListener = prefsListener;
		
	}
}
