package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	private static Scene scene;
	
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Song Library");
		primaryStage.setResizable(false);
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("EmailView.fxml"));
			scene = new Scene(root);
			
			primaryStage.setOnCloseRequest(e -> {
		        Platform.exit();
		        System.exit(0);
		    });
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	@FXML
	public void list(ActionEvent e) {
		
	}

	@FXML
	public void save(ActionEvent e) {
		
	}
	@FXML
	public void cancel(ActionEvent e) {
		
	}
	@FXML
	public void open(ActionEvent e) {
		
	}
	@FXML
	public void send(ActionEvent e) {
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
