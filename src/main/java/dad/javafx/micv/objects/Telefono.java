package dad.javafx.micv.objects;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Telefono {

	private StringProperty numero = new SimpleStringProperty();
	private ObjectProperty<TipoTelefono> tipoTeléfono = new SimpleObjectProperty<TipoTelefono>();
	
	public final StringProperty númeroProperty() {
		return this.numero;
	}
	
	public final String getNúmero() {
		return this.númeroProperty().get();
	}
	
	public final void setNúmero(final String número) {
		this.númeroProperty().set(número);
	}
	
	public final ObjectProperty<TipoTelefono> tipoTeléfonoProperty() {
		return this.tipoTeléfono;
	}
	
	public final TipoTelefono getTipoTeléfono() {
		return this.tipoTeléfonoProperty().get();
	}
	
	public final void setTipoTeléfono(final TipoTelefono tipoTeléfono) {
		this.tipoTeléfonoProperty().set(tipoTeléfono);
	}
	
	
	
	
}
