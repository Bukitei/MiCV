package dad.javafx.micv.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Tab;
import javafx.scene.layout.VBox;

public class RootController implements Initializable{

	//FXML
	@FXML
	private VBox view;
	
	@FXML
	private MenuItem newCV;
	
	@FXML
	private MenuItem open;
	
	@FXML
	private MenuItem save;
	
	@FXML
	private MenuItem exit;
	
	@FXML
	private Tab personal;
	
	@FXML
	private Tab contact;
	
	@FXML
	private Tab formation;
	
	@FXML
	private Tab experience;
	
	@FXML
	private Tab skills;
	
	
	
	public RootController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/MainView.fxml"));
		loader.setController(this);
		loader.load();
	}
	
	public VBox getView() {
		return view;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
	}
	
}
