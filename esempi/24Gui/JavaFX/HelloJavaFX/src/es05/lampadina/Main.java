/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es05.lampadina;

import es05.lampadina.model.Lampadina;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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
        
        Lampadina l = new Lampadina(5);

        
        
        ImageView iv = new ImageView();
        Image lamp_on = new Image("file:img/accesa.jpg");
        Image lamp_off = new Image("file:img/spenta.jpg");
        iv.setImage(lamp_off);
        iv.setFitWidth(140);
        iv.setFitHeight(200);
        
        Text text = new Text();
        
        Button btn = new Button();
        btn.setText("Accendi");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                
                text.setText("Hai premuto l'interruttore " + l.getnClick() + " volte.");
                
                if (l.isAccesa()){
                    btn.setText("Accendi");
                    iv.setImage(lamp_off);
                } else {
                    btn.setText("Spegni");
                    iv.setImage(lamp_on);                
                }
                System.out.println(l.stato());
                if (l.isRotta())
                 btn.setText("Lampadina guasta, sostituire!");                    
                l.click();
            }
        });
        
        VBox root = new VBox();
        root.getChildren().addAll(text,iv, btn);
        root.setAlignment(Pos.CENTER);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Usa prodotti OSRAM professionali");
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
