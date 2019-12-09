package dad.javafx.micv.main;


import dad.javafx.micv.controllers.RootController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class App extends Application{

	private RootController root;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		this.root = new RootController();
		
		BorderPane root = this.root.getView();
		
		Scene scene = new Scene(root, 800, 600);
		
		primaryStage.setTitle("MiCV");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {

		
		
		launch(args);

	}
	
}
