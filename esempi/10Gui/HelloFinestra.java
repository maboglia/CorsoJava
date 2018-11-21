import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import javax.swing.text.html.HTMLDocument.HTMLReader.TagAction;

import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class HelloFinestra {

	private JFrame frame;
	private JTextField tfTodo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HelloFinestra window = new HelloFinestra();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HelloFinestra() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("Todo List");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 1;
		frame.getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		tfTodo = new JTextField();
		GridBagConstraints gbc_tfTodo = new GridBagConstraints();
		gbc_tfTodo.insets = new Insets(0, 0, 5, 0);
		gbc_tfTodo.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfTodo.gridx = 3;
		gbc_tfTodo.gridy = 1;
		frame.getContentPane().add(tfTodo, gbc_tfTodo);
		tfTodo.setColumns(10);
		
		JTextArea taTodoList = new JTextArea();
		GridBagConstraints gbc_taTodoList = new GridBagConstraints();
		gbc_taTodoList.fill = GridBagConstraints.BOTH;
		gbc_taTodoList.gridx = 3;
		gbc_taTodoList.gridy = 3;
		frame.getContentPane().add(taTodoList, gbc_taTodoList);
		
		JButton btnTodo = new JButton("Cliccami");
		btnTodo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = tfTodo.getText();
				System.out.println("ciao " + s  );
				String testo = taTodoList.getText();
				taTodoList.setText(testo + "\n" + s);
			}
		});
		GridBagConstraints gbc_btnTodo = new GridBagConstraints();
		gbc_btnTodo.insets = new Insets(0, 0, 5, 5);
		gbc_btnTodo.gridx = 1;
		gbc_btnTodo.gridy = 2;
		frame.getContentPane().add(btnTodo, gbc_btnTodo);
	}

}
