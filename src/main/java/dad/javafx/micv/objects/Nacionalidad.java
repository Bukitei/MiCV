package dad.javafx.micv.objects;

import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.ObservableList;

public class Nacionalidad {

	private ListProperty<String> denominacion = new SimpleListProperty<String>();

	public final ListProperty<String> denominacionProperty() {
		return this.denominacion;
	}
	

	public final ObservableList<String> getDenominacion() {
		return this.denominacionProperty().get();
	}
	

	public final void setDenominacion(final ObservableList<String> denominacion) {
		this.denominacionProperty().set(denominacion);
	}

}
