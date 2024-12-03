/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es07.calcolatrice;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author teacher
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private TextField op1;
    
    @FXML
    private TextField op2;
    
    
    @FXML
    private void addizione(ActionEvent event) {
        
        Integer o1 = Integer.parseInt(op1.getText());
        Integer o2 = Integer.parseInt(op2.getText());
        
        label.setText("Risultato addizione " + (o1+o2));
    }
    
    
    @FXML
    private void sottrazione(ActionEvent event) {
        
        Integer o1 = Integer.parseInt(op1.getText());
        Integer o2 = Integer.parseInt(op2.getText());
        
        label.setText("Risultato sottrazione " + (o1-o2));
    }
    
    @FXML
    private void moltiplicazione(ActionEvent event) {
        
        Integer o1 = Integer.parseInt(op1.getText());
        Integer o2 = Integer.parseInt(op2.getText());
        
        label.setText("Risultato moltiplicazione " + (o1*o2));
    }
    
    @FXML
    private void divisione(ActionEvent event) {
        
        Double o1 = Double.parseDouble(op1.getText());
        Double o2 = Double.parseDouble(op2.getText());
        
        label.setText("Risultato divisione " + (o1/o2));
    }
            
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
