package dad.javafx.micv.objects;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class Nivel {

	private IntegerProperty BASICO = new SimpleIntegerProperty();
	private IntegerProperty MEDIO = new SimpleIntegerProperty();
	private IntegerProperty AVANZADO = new SimpleIntegerProperty();
	
	public final IntegerProperty BASICOProperty() {
		return this.BASICO;
	}
	
	public final int getBASICO() {
		return this.BASICOProperty().get();
	}
	
	public final void setBASICO(final int BASICO) {
		this.BASICOProperty().set(BASICO);
	}
	
	public final IntegerProperty MEDIOProperty() {
		return this.MEDIO;
	}
	
	public final int getMEDIO() {
		return this.MEDIOProperty().get();
	}
	
	public final void setMEDIO(final int MEDIO) {
		this.MEDIOProperty().set(MEDIO);
	}
	
	public final IntegerProperty AVANZADOProperty() {
		return this.AVANZADO;
	}
	
	public final int getAVANZADO() {
		return this.AVANZADOProperty().get();
	}
	
	public final void setAVANZADO(final int AVANZADO) {
		this.AVANZADOProperty().set(AVANZADO);
	}
	
	
	
	
}
