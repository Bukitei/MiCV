package dad.javafx.micv.controllers;

import dad.javafx.micv.objects.Personal;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.beans.property.ListProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class PersonalController implements Initializable{

	//FXML
	
	@FXML
	private GridPane view;
	
	@FXML
	private TextField dni;
	
	@FXML
	private TextField name;
	
	@FXML
	private TextField lastName;
	
	@FXML
	private DatePicker bornDate;
	
	@FXML
	private TextArea direction;
	
	@FXML
	private TextField postalCode;
	
	@FXML
	private TextField location;
	
	@FXML
	private ComboBox<String> country;
	
	@FXML
	private ListView<String> nacionality;
	
	@FXML
	private Button addBt;
	
	@FXML
	private Button removeBt;
	
	//modelo
        
        private ObjectProperty<Personal> personal = new SimpleObjectProperty<Personal>();
	
	
	private ListProperty<String> paisesList = new SimpleListProperty<>(FXCollections.observableArrayList(new ArrayList<>()));
	
	
	private ArrayList<String> nacionalidadesList = new ArrayList<>();

	public PersonalController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/PersonalView.fxml"));
		loader.setController(this);
		loader.load();
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}	
	
	public GridPane getView() {
		return view;
	}
        
        
	
}
