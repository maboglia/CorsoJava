package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        //CheckBoxes

        CheckBox box = new CheckBox("Pomodoro");
        CheckBox box2 = new CheckBox("Mozzarella");

        ChoiceBox<String> choiceBox = new ChoiceBox<>();
        choiceBox.getItems().addAll("birra", "aranciata");

        Label lbl = new Label("");

        Button btn = new Button("click");
        btn.setOnAction(e->gestisciOpzioni(choiceBox, box, box2, lbl));

        VBox layout = new VBox();
        layout.setPadding(new Insets(20));
        layout.getChildren().addAll(choiceBox,box, box2,btn, lbl);



        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(layout, 300, 275));
        primaryStage.show();
    }

    private void gestisciOpzioni(ChoiceBox<String> choiceBox,CheckBox box, CheckBox box2, Label lbl) {
        String messaggio = "";
        if (box.isSelected()) messaggio += box.getText()+"\n";
        if (box2.isSelected()) messaggio += box2.getText()+"\n";

        if(!choiceBox.getValue().isEmpty()) messaggio += choiceBox.getValue()+"\n";

        lbl.setText(messaggio);

    }


    public static void main(String[] args) {
        launch(args);
    }
}
