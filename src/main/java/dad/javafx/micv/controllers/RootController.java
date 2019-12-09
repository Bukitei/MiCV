package dad.javafx.micv.controllers;

import dad.javafx.micv.objects.CV;
import dad.javafx.micv.objects.Personal;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import dad.javafx.micv.utils.JAXBUtils;

public class RootController implements Initializable{

	//FXML
	@FXML
	private BorderPane view;
	
	@FXML
	private MenuItem newCV;
	
	@FXML
	private MenuItem open;
	
	@FXML
	private MenuItem save;
	
	@FXML
	private MenuItem saveAs;
	
	@FXML
	private MenuItem exit;
	
	@FXML
	private MenuItem about;
        
        @FXML
        private TabPane tabRoot;
	
	@FXML
	private Tab personalTab;
	
	@FXML
	private Tab contactTab;
	
	@FXML
	private Tab formationTab;
	
	@FXML
	private Tab experienceTab;
	
	@FXML
	private Tab skillsTab;
	
	//model
	
	private ContactController contact = new ContactController();
        private FormationController formation = new FormationController();
        private PersonalController personal = new PersonalController();
        private SkillsController skills = new SkillsController();
        private ExperienceController experience = new ExperienceController();
        
        private ObjectProperty<CV> cv = new SimpleObjectProperty<CV>();
	
	
	public RootController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/RootView.fxml"));
		loader.setController(this);
		loader.load();
	}
	
	public BorderPane getView() {
		return view;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		personalTab.setContent(personal.getView());
		contactTab.setContent(contact.getView());
                formationTab.setContent(formation.getView());
                skillsTab.setContent(skills.getView());
                experienceTab.setContent(experience.getView());
                
                open.setOnAction(evt -> onOpenAction());
	}

    private void onOpenAction() {
        FileChooser browser = new FileChooser();
		browser.getExtensionFilters().add(new ExtensionFilter("CV", "*.cv"));
		browser.setTitle("Abrir CV");
		browser.setInitialDirectory(new File(System.getProperty("user.dir") + "/files"));
		
		File file = browser.showOpenDialog(getView().getScene().getWindow());
		
		if( file != null ) {
			
			// Ahora podemos empezar a cargar el archivo
			// Usamos el JAXB para leer el XML
			
			try {
				
				CV myCV = JAXBUtils.load(CV.class, file);
				
				// Ahora lo cargamos en nuestro ObjectProperty
				cv.set(myCV);
				loadMainData();
				
			} catch (Exception e) {
				
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
                
    }
    
    private void loadMainData() {
		
		// Cargamos todos los datos
		
		/*Personal personalCV = cv.get().getPersonal();
		personal.setPersonal(personal);
		
		Contacto contacto = cv.get().getContacto();
		contactoController.setContacto(contacto);*/
	}
	
}
