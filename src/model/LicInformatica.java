package model;

////Esta es clase hijo o subclase
/// extends es de herencia
public class LicInformatica extends Profesionistas{
	String equipoComp;
	String tecgDesar;
	
	
	public LicInformatica() {
	}

	///Al agregar este constructos seleccionar los atributos de la super clase
	public LicInformatica(String matricula, String nombre, long cedula, String equipoComp, String tecgDesar) {
		super(matricula, nombre, cedula);
		this.equipoComp = equipoComp;
		this.tecgDesar = tecgDesar;
	}

	
////Al momento de guadrar se va a selecccionar eñ to string atributos de la super clase y subirlos
	@Override
	public String toString() {
		return "LicInformatica [matricula=" + matricula + ", nombre=" + nombre + ", cedula=" + cedula + ", equipoComp="
				+ equipoComp + ", tecgDesar=" + tecgDesar + "]\n";
	}

	public String getEquipoComp() {
		return equipoComp;
	}

	public void setEquipoComp(String equipoComp) {
		this.equipoComp = equipoComp;
	}

	public String getTecgDesar() {
		return tecgDesar;
	}

	public void setTecgDesar(String tecgDesar) {
		this.tecgDesar = tecgDesar;
	}
	

	
	
	

}
