import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;
import java.util.*;
// Ken Kawano
public class PokemonPanel extends JPanel {
// components
	private JTextArea text1;
   private JTextArea text2;
   private JButton button1;
   private JButton button2;
   private JButton button3;
   private JButton button4;
   private JButton button5;
   private JButton button6;
   private JOptionPane pane1;
   private JPanel panel1;
// values and arrays to help gui work   
   private int encounterPokemon;
   private boolean notFighting = true;
   
   PokeTree tree = new PokeTree();
   
   ArrayList<Pokemon> recentArray = new ArrayList<Pokemon>();
   int[] numberArray = new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0};
   
   
   String display = "";
	
   String[] RandomPokemon = {"1","2","3","4","5","6","7","8","9","10","11","12","13"};
   
   
   
	public PokemonPanel () {
// grid layout for panel		
      setLayout(new GridLayout(2,3));
// text fields and buttons      
      text1 = new JTextArea ("Press Hunt to hunt Pokemon");
      text2 = new JTextArea ("Select sort mode");
      button1 = new JButton ("Hunt");
      button2 = new JButton ("Capture");
      button3 = new JButton ("Pokedex");
      button4 = new JButton ("Bag");
            
// action listeners
      button1.addActionListener (new Button1Listener1());
      button2.addActionListener (new Button2Listener2());
      button3.addActionListener (new Button3Listener3());
      button4.addActionListener (new Button4Listener4());
// add components in order for grid
		add (button1);
		add (text1);
      add (button2);
      add (button3);
      add (text2);
      add (button4);
      
      this.setMinimumSize(new Dimension(1200,1200));
      
   }
// Hunt button
   private class Button1Listener1 implements ActionListener {
		   public void actionPerformed (ActionEvent event) {
            Random randGen = new Random();
            notFighting = false;
            encounterPokemon = randGen.nextInt(RandomPokemon.length);
// randomly generated pokemon
            switch(RandomPokemon[encounterPokemon]){
               case"1":
               text1.setText("A wild Bulbasaur appears");
               break;
               case"2":
               text1.setText("A wild Ivysaur appears");
               break;
               case"3":
               text1.setText("A wild Venusaur appears");
               break;
               case"4":
               text1.setText("A wild Charmander appears");
               break;
               case"5":
               text1.setText("A wild Charmeleon appears");
               break;
               case"6":
               text1.setText("A wild Charizard appears");
               break;
               case"7":
               text1.setText("A wild Squirtle appears");
               break;
               case"8":
               text1.setText("A wild Wartortle appears");
               break;
               case"9":
               text1.setText("A wild Blastoise appears");
               break;
               case"10":
               text1.setText("A wild Eevee appears");
               break;
               case"11":
               text1.setText("A wild Vaporeon appears");
               break;
               case"12":
               text1.setText("A wild Jolteon appears");
               break;
               case"13":
               text1.setText("A wild Flareon appears");
               break;
               default:
               break;
            }     
		   }
	}
// catch button
   private class Button2Listener2 implements ActionListener {
		   public void actionPerformed (ActionEvent event) {
		  	Random randGen = new Random();
// will not catch if there is no pokemon or if previous pokemon ran away
         if (notFighting){
            text1.setText("Press Hunt to hunt a pokemon");
         }
// 2/3 chance to capture pokemon
         else{
            int catchChance = randGen.nextInt(3);
            if (catchChance == 0){
               text1.setText("Failed to catch pokemon. Pokemon has run away");
               notFighting = true;
            }   
            else {   
               notFighting = true;
// adding pokemon to various arrays and tree
               switch(RandomPokemon[encounterPokemon]){
                  case"1":
                  text1.setText("You caught a Bulbasaur");
                  tree.add(new Bulbasaur());
                  recentArray.add(new Bulbasaur());
                  numberArray[0] =+ 1;
                  break;
                  case"2":
                  text1.setText("You caught an Ivysaur");
                  tree.add(new Ivysaur());
                  recentArray.add(new Ivysaur());
                  numberArray[1] =+ 1;
                  break;
                  case"3":
                  text1.setText("You caught a Venusaur");
                  tree.add(new Venusaur());
                  recentArray.add(new Venusaur());
                  numberArray[2] =+ 1;
                  break;
                  case"4":
                  text1.setText("You caught a Charmander");
                  tree.add(new Charmander());
                  recentArray.add(new Charmander());
                  numberArray[3] =+ 1;
                  break;
                  case"5":
                  text1.setText("You caught a Charmeleon");
                  tree.add(new Charmeleon());
                  recentArray.add(new Charmeleon());
                  numberArray[4] =+ 1;
                  break;
                  case"6":
                  text1.setText("You caught a Charizard");
                  tree.add(new Charizard());
                  recentArray.add(new Charizard());
                  numberArray[5] =+ 1;
                  break;
                  case"7":
                  text1.setText("You caught a Squirtle");
                  tree.add(new Squirtle());
                  recentArray.add(new Squirtle());
                  numberArray[6] =+ 1;
                  break;
                  case"8":
                  text1.setText("You caught a Wartortle");
                  tree.add(new Wartortle());
                  recentArray.add(new Wartortle());
                  numberArray[7] =+ 1;
                  break;
                  case"9":
                  text1.setText("You caught a Blastoise");
                  tree.add(new Blastoise());
                  recentArray.add(new Blastoise());
                  numberArray[8] =+ 1;
                  break;
                  case"10":
                  text1.setText("You caught an Eevee");
                  tree.add(new Eevee());
                  recentArray.add(new Eevee());
                  numberArray[9] =+ 1;
                  break;
                  case"11":
                  text1.setText("You caught a Vaporeon");
                  tree.add(new Vaporeon());
                  recentArray.add(new Vaporeon());
                  numberArray[10] =+ 1;
                  break;
                  case"12":
                  text1.setText("You caught a Jolteon");
                  tree.add(new Jolteon());
                  recentArray.add(new Jolteon());
                  numberArray[11] =+ 1;
                  break;
                  case"13":
                  text1.setText("You caught a Flareon");
                  tree.add(new Flareon());
                  recentArray.add(new Flareon());
                  numberArray[12] =+ 1;
                  break;
                  default:
                  break;
               }
            }      
		   }
      }   
	} 
// Pokedex button uses Pokedex print
// Sometimes doesn't work for some reason
   private class Button3Listener3 implements ActionListener {
		   public void actionPerformed (ActionEvent event) {
            text2.setText(tree.toString());
         }
	}
// Bag button brings up another window that holds recent and number button
   private class Button4Listener4 implements ActionListener {
		   public void actionPerformed (ActionEvent event) {         
            JFrame frame1 = new JFrame("Select your sort option");
            frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame1.setSize(300, 300);
            frame1.setMinimumSize( new Dimension (300,300));
            
            JPanel panel1 = new JPanel();
            panel1.setSize(300,300);
            panel1.setMinimumSize( new Dimension (300,300));
            
            panel1.setLayout(new GridLayout(1,2));
            
            JButton button5 = new JButton("Recent");
            JButton button6 = new JButton("Number");
            
            panel1.add(button5);
            panel1.add(button6);
            
            button5.addActionListener (new Button5Listener5());
            button6.addActionListener (new Button6Listener6());
            
            frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            
            frame1.getContentPane().add(panel1);
            frame1.pack();
            frame1.setVisible(true);
         }            
	}
// Recent button prints from recentArray
   private class Button5Listener5 implements ActionListener {
		   public void actionPerformed (ActionEvent event) {
            for(int i = 0;i < recentArray.size(); i++){
               display = display + recentArray.get(i).toString();
            }
            text2.setText(display);
            display = "";
         }
   }
// number button displays how many of each pokemon has been caught
   private class Button6Listener6 implements ActionListener {
		   public void actionPerformed (ActionEvent event) {
            text2.setText(
               "Bulbasaur: " + numberArray[0] + "\n" +
               "Ivysaur: " + numberArray[1] + "\n" +
               "Venusaur: " + numberArray[2] + "\n" +
               "Charmander: " + numberArray[3] + "\n" +
               "Charmeleon: " + numberArray[4] + "\n" +
               "Charizard: " + numberArray[5] + "\n" +
               "Squirtle: " + numberArray[6] + "\n" +
               "Wartortle: " + numberArray[7] + "\n" +
               "Blastoise: " + numberArray[8] + "\n" +
               "Eevee: " + numberArray[9] + "\n" +
               "Vaporeon: " + numberArray[10] + "\n" +
               "Jolteon: " + numberArray[11] + "\n" +
               "Flareon: " + numberArray[12] + "\n");
         }
   }                             
}