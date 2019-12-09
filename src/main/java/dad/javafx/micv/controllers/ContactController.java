package dad.javafx.micv.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import dad.javafx.micv.objects.Email;
import dad.javafx.micv.objects.Telefono;
import dad.javafx.micv.objects.Web;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;

public class ContactController implements Initializable{

	//FXML
	
	@FXML
        private VBox view;
        
	@FXML
        private TableView<Telefono> tlfTable;
        
        @FXML
        private TableView<Email> emailTable;
        
        @FXML 
        private TableView<Web> webTable;
        
        @FXML
        private Button tlf_addBt;
        
        @FXML
        private Button tlf_removeBt;
        
        @FXML
        private Button email_addBt;
        
        @FXML
        private Button email_removeBt;
        
        @FXML
        private Button web_addBt;
        
        @FXML
        private Button web_removeBt;
	
	//modelo

	public ContactController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/ContactView.fxml"));
		loader.setController(this);
		loader.load();
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}	
	
	public VBox getView() {
		return view;
	}
	
}
