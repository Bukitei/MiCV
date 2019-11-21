package dad.javafx.micv.objects;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class TipoTelefono {

	private IntegerProperty DOMICILIO = new SimpleIntegerProperty();
	private IntegerProperty MOVIL = new SimpleIntegerProperty();
	
	public final IntegerProperty DOMICILIOProperty() {
		return this.DOMICILIO;
	}
	
	public final int getDOMICILIO() {
		return this.DOMICILIOProperty().get();
	}
	
	public final void setDOMICILIO(final int DOMICILIO) {
		this.DOMICILIOProperty().set(DOMICILIO);
	}
	
	public final IntegerProperty MOVILProperty() {
		return this.MOVIL;
	}
	
	public final int getMOVIL() {
		return this.MOVILProperty().get();
	}
	
	public final void setMOVIL(final int MOVIL) {
		this.MOVILProperty().set(MOVIL);
	}
	
	
	
	
}
