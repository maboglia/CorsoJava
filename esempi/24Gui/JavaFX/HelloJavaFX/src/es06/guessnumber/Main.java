/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es06.guessnumber;

import java.util.Random;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
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
        
    static int counter=0;
    
    @Override
    public void start(Stage primaryStage) {
    
    //campo per l'inserimento del numero
        TextField user = new TextField();
        
        Text messaggio = new Text("premi il pulsante per giocare");
        
        Text tentativi = new Text("0");
        
        //numero dell'oracolo
        Random oracoloNum = new Random();
        
        int numero = oracoloNum.nextInt(100) + 1;
        
        //contatore tentativi

  
        user.setPromptText("Indovina il numero pensato dall'oracolo");
        
        Button btn = new Button();
        btn.setText("prova");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            
            
            @Override
            public void handle(ActionEvent event) {
            Integer guess = Integer.parseInt(user.getText());
            counter++;
            if (guess == numero)
                messaggio.setText("indovinato in " +  counter + " tentativi");
            else if (guess > numero)
                messaggio.setText("troppo alto");
            else if (guess < numero)
                messaggio.setText("troppo basso");
            
            
                tentativi.setText("Tentativi: " + counter);
            
            }
        });
        
        VBox root = new VBox();
        root.getChildren().addAll( messaggio, user, btn, tentativi);
        root.setAlignment(Pos.CENTER);

        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Indovina il numero pensato dall'oracolo");
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
