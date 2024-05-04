package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import model.Lampadina;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;


public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		Lampadina l = new Lampadina(5);
		
		ImageView iv = new ImageView();
		Image lamp_on = new Image("img/lamp_on.jpg");
		Image lamp_off = new Image("img/lamp_off.jpg");
		
		iv.setImage(lamp_off);
		iv.setFitWidth(140);
		iv.setFitHeight(200);

		Button btn = new Button();
		btn.setText("accendi");
		
		btn.setOnAction(e -> {
			
			if (l.isRotta()) {
				System.out.println("guasto, sostituire");
			}
			
			if (l.isAccesa()) {
				btn.setText("accendi");
				iv.setImage(lamp_off);
			} else {
				btn.setText("spegni");
				iv.setImage(lamp_on);
			}
			
			l.click();
			
		});
		
		try {
			BorderPane root = new BorderPane();
			VBox vb = new VBox();
			vb.getChildren().add(iv);
			//vb.getChildren().add(btn);
			
			root.setLeft(btn);
			root.setCenter(vb);
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
