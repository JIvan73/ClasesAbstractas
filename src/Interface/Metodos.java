package Interface;

import java.util.List;

import model.LicInformatica;

public interface Metodos {
	
	public void guardar (LicInformatica informatica);
	
	public List<LicInformatica> mostrar();
	
	public LicInformatica buscar(int indice);
	
	public void editar(int indice, LicInformatica informatica);
	
	public void eliminar(int indice);

}
