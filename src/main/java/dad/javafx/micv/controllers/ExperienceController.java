package dad.javafx.micv.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import dad.javafx.micv.objects.Experiencia;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.layout.HBox;

public class ExperienceController implements Initializable{

	//FXML
	
        @FXML
        private HBox view;
        
        @FXML
        private TableView<Experiencia> experienceTbl;
        
        @FXML
        private Button addBt;
        
        @FXML
        private Button removeBt;  
	
	//modelo

	public ExperienceController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/ExperienceView.fxml"));
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
