package main;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.JTextPane;

public class Guessing extends JFrame {
	private JTextField tfGuess;
	private JTextPane lblMsg;
	private int numeroScelto;
	private int tentativi = 7;
	
	
	public void checkGuess() {
		
		String numeroProva = tfGuess.getText();
		String messaggio = "";
				
		
		int guess=0;
		try {
				guess = Integer.parseInt(numeroProva);
				tentativi--;
			if (guess > numeroScelto) {
				messaggio= guess + " troppo alto. Prova ancora, Paolo!";
				messaggio += "\nHai ancora " + tentativi + " tentativi";
				lblMsg.setText(messaggio);
			} else if (guess < numeroScelto) {
				messaggio= guess + " troppo basso. Prova ancora, Paolo!";
				messaggio += "\nHai ancora " + tentativi + " tentativi";
				lblMsg.setText(messaggio);
			} else {
				messaggio= guess + " è giusto. Bravo, Paolo!";
				lblMsg.setText(messaggio);
				newGame();
				
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			lblMsg.setText("Valore inserito non corretto! \nInserisci un numero intero tra 1 e 100");
		}
		
		tfGuess.requestFocus();
		tfGuess.selectAll();
		
	}
	
	public void newGame() {
		numeroScelto = (int)(Math.random()*100)+1;
		tentativi=7;
	}
	
	public Guessing() {
		getContentPane().setBackground(new Color(135, 206, 250));
		setBackground(new Color(30, 144, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		JLabel  lbl = new JLabel("Ciao, indovina il numero :)");
		lbl.setForeground(new Color(178, 34, 34));
		lbl.setFont(new Font("FreeMono", Font.BOLD, 20));
		lbl.setBounds(34, 0, 380, 37);
		
		lbl.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lbl);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(135, 206, 250));
		panel.setBounds(16, 57, 412, 29);
		getContentPane().add(panel);
		
		JLabel lblIndovinaIlNumero = new JLabel("Indovina un numero tra 1 e 100");
		panel.add(lblIndovinaIlNumero);
		
		tfGuess = new JTextField();
		panel.add(tfGuess);
		tfGuess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				checkGuess();
			}
		});

		tfGuess.setHorizontalAlignment(SwingConstants.CENTER);
		tfGuess.setColumns(10);
		
		JButton btnGuess = new JButton("Indovina");
		btnGuess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				checkGuess();
			}
		});
		btnGuess.setBounds(250, 103, 117, 25);
		getContentPane().add(btnGuess);
		
		lblMsg = new JTextPane();
		lblMsg.setText("Scrivi un numero intero tra 1 e 100 e premi invio");
		lblMsg.setForeground(new Color(255, 0, 0));
		lblMsg.setBounds(34, 207, 380, 51);
		getContentPane().add(lblMsg);
		
		
		
	}
	
	
	public static void main(String[] args) {

		Guessing g = new Guessing();
		g.newGame();
		g.setSize(500, 400);
		g.setVisible(true);
		
		
	}
}
