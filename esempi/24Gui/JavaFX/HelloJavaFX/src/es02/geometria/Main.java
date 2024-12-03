/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es02.geometria;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author teacher
 */
public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Label lbl = new Label("Cerchio");

        Circle cerchio = new Circle(25);
        cerchio.setFill(Color.CHOCOLATE);
        
        Rectangle rettangolo = new Rectangle(40, 30, Color.LIME);
        
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
        
            int counter = 0;
            
            @Override
            public void handle(ActionEvent event) {
                counter++;
                cerchio.setScaleY(counter);
                cerchio.setScaleX(counter);
                System.out.println("Hello World!" + counter);
            }
        });
        
        GridPane root = new GridPane();
        
        root.setHgap(10);
        root.setVgap(10);
        
        root.add(lbl,0,0);
        root.add(btn,1,0);
        
        root.add(rettangolo, 0,1);
        root.add(cerchio, 1,1);

        
        root.setGridLinesVisible(true);
        
//        root.getChildren().add(btn);
//        root.getChildren().add(lbl);
        
        Scene scene = new Scene(root, 300, 250);
        scene.getStylesheets()
                .add(Main.class
                .getResource("stile.css")
                .toExternalForm()
                );
        primaryStage.setTitle("Hello World!");
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
