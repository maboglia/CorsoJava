/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es01.cambio;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author teacher
 */
public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        Text testo = new Text("questo è un testo");
        TextField tf = new TextField();
        btn.setText("Cambia monete");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            int contatore = 0;
            @Override
            public void handle(ActionEvent event) {
            contatore++;
                String input = tf.getText();
                int euro = Integer.parseInt(input);
                
                int[] euroCambiati = CambiaMonete.cambia(euro);
                
                testo.setText("" + euroCambiati );
                System.out.println("Hai premuto il bottone" + contatore);
            }
        });
        
        VBox root = new VBox();
        root.getChildren().add(tf);
        root.getChildren().add(btn);
        root.getChildren().add(testo);
        
        Scene scene = new Scene(root, 400, 300);
        
        primaryStage.setTitle("Cambia Monete");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
