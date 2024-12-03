/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es04.dipendenti;

import java.util.ArrayList;

import es04.dipendenti.controller.LibroMatricola;
import es04.dipendenti.model.Dipendente;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author teacher
 */
public class Main extends Application {
    LibroMatricola lm = new LibroMatricola();
    ArrayList<Dipendente> dipendenti = lm.dipendenti;
    
    @Override
    public void start(Stage primaryStage) {
        Text elenco = new Text();

        Button btn = new Button();
        btn.setText("Dipendenti");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                String s = lm.getAll();
                elenco.setText(s);
            }
        });
        
        
        BorderPane root = new BorderPane();

        HBox menu = new HBox();
        
        Button btn2 = new Button();
        btn2.setText("Impiegati");
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                String s = lm.getImpiegato();
                elenco.setText(s);
            }
        });
        
        
        
        Button btn3 = new Button();
        btn3.setText("Fattorini");        
        btn3.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                String s = lm.getFattorini();
                elenco.setText(s);
            }
        });
        
         
        
        menu.getChildren().addAll(btn, btn2, btn3);
        
        root.setTop(menu);
        
        


        
        root.setCenter(elenco);
        
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Gestione dipendenti");
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
