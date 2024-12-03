package application;
	
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage stage) {
		try {
			//Stage stage = new Stage();
			Group root = new Group();
			Scene scene = new Scene(root, Color.YELLOW);

			//metti l'icona nella cartella img prima di eseguire!!!!!!!
			String iconImg = "file:img/java.png";
			Image icon = new Image(iconImg);
			stage.getIcons().add(icon);
			stage.setTitle("Finestra di esempio Hello JavaFX");
			stage.setWidth(420);
			stage.setHeight(420);
			stage.setResizable(false);
			//stage.setX(50);
			//stage.setY(50);

			stage.setFullScreen(true);
			stage.setFullScreenExitHint("PER USCIRE PREMI q");
			stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));

			stage.setScene(scene);
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	} 
	
	public static void main(String[] args) {
		launch(args);
	}
}
