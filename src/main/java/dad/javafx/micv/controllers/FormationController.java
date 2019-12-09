package dad.javafx.micv.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import dad.javafx.micv.objects.Titulo;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.layout.HBox;

public class FormationController implements Initializable{

	//FXML
	
	@FXML
	private HBox view;
	
	@FXML
	private TableView<Titulo> formationTbl;
        
        @FXML
        private Button addBt;
        
        @FXML
        private Button removeBt;
	
	//modelo

	public FormationController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/FormationView.fxml"));
		loader.setController(this);
		loader.load();
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}	
	
	public HBox getView() {
		return view;
	}
	
}
