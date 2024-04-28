package gui;

import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;

public class ProgressDialog extends JDialog {

	private JButton cancelButton;
	private JProgressBar progressBar;
	private ProgressDialogListener listener;

	public ProgressDialog(Window parent, String title) {
		super(parent, title, ModalityType.APPLICATION_MODAL);

		cancelButton = new JButton("Cancel");
		progressBar = new JProgressBar();
		progressBar.setStringPainted(true);

		progressBar.setMaximum(10);

		progressBar.setString("Retrieving messages...");

		// progressBar.setIndeterminate(true);

		setLayout(new FlowLayout());

		Dimension size = cancelButton.getPreferredSize();
		size.width = 400;
		progressBar.setPreferredSize(size);

		add(progressBar);
		add(cancelButton);
		
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(listener != null) {
					listener.progressDialogCancelled();
				}
			}
		});
		
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent arg0) {
				if(listener != null) {
					listener.progressDialogCancelled();
				}
			}
		});

		pack();

		setLocationRelativeTo(parent);
	}

	public void setListener(ProgressDialogListener listener) {
		this.listener = listener;
	}

	public void setMaximum(int value) {
		progressBar.setMaximum(value);
	}

	public void setValue(int value) {

		int progress = 100 * value / progressBar.getMaximum();

		progressBar.setString(String.format("%d%% complete", progress));

		progressBar.setValue(value);
	}

	@Override
	public void setVisible(final boolean visible) {

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {

				if (visible == false) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {
					progressBar.setValue(0);
				}
				
				if(visible) {
					setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
				}
				else {
					setCursor(Cursor.getDefaultCursor());
				}

				ProgressDialog.super.setVisible(visible);
			}
		});
	}

}
