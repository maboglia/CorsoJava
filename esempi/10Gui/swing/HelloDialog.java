package dialoghi;

import javax.swing.JOptionPane;

public class HelloDialog {

	public static void main(String[] args) {
		String saluto = "Hello, World!";
		String domanda = "vuoi uscire stasera?";
		Object[] options = {"si, grazie", "no, grazie", "forse, grazie"};
		
//		JOptionPane.showMessageDialog(null, saluto, "titolo", JOptionPane.WARNING_MESSAGE);
//		int r = JOptionPane.showOptionDialog(
//				null, 
//				domanda, 
//				saluto, 
//				JOptionPane.YES_NO_CANCEL_OPTION, 
//				JOptionPane.QUESTION_MESSAGE, 
//				null, 
//				options, 
//				options[2]
//						);
//		JOptionPane.showMessageDialog(null, "hai scelto" + r, "titolo", JOptionPane.WARNING_MESSAGE);
//		

String s = JOptionPane.showInputDialog(domanda);
JOptionPane.showMessageDialog(null, "hai scelto " +  s, "titolo", JOptionPane.WARNING_MESSAGE);

		
	}

}
