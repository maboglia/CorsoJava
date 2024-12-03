/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es03.login;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author teacher
 */
public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        
        GridPane griglia = new GridPane();
        griglia.setAlignment(Pos.CENTER);
        
        griglia.setHgap(10);
        griglia.setVgap(10);
        
        griglia.setPadding(new Insets(5));
        
        Scene scena = new Scene(griglia, 400, 300);
        
        Text titolo = new Text("Banca San Pietro");
        titolo.setFont(Font.font("Arial", FontWeight.EXTRA_BOLD, FontPosture.REGULAR, 30));
        
        //riga 0 titolo spannato su 2 colonne
        griglia.add(titolo, 0, 0, 2, 1);
        
        Label lblUser = new Label("username");
        Label lblPass = new Label("password");
        
        TextField tfUser = new TextField();
        PasswordField tfPas = new PasswordField();
        
        //riga 1 username
        griglia.add(lblUser, 0, 1);
        griglia.add(tfUser, 1, 1);
        
        
        //riga 2 password
        griglia.add(lblPass, 0, 2);
        griglia.add(tfPas, 1, 2);
        
        Button btnLogin = new Button("Login");
        
        btnLogin.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("user: " + tfUser.getText());
                System.out.println("pass: " + tfPas.getText());
                
                if (  tfUser.getText().equals("mauro")  &&  tfPas.getText().equals("12345")   )
                {
                
                    StackPane root = new StackPane();
                    Text testo = new Text("area riservata");
                    root.getChildren().add(testo);
                    Scene areariservata = new Scene(root, 400, 300);
                    primaryStage.setScene(areariservata);
                            
                }
                
                else{
                    System.out.println("NON puoi entrare!!!!!!");
                }
                             
            }
        });
        
        
        //riga 3 button nella colonna destra
        griglia.add(btnLogin, 1, 3);
        
        
        
        primaryStage.setTitle("Login Form");
        primaryStage.setScene(scena);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
