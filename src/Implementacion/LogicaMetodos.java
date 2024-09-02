package Implementacion;

import java.util.ArrayList;
import java.util.List;

import Interface.Metodos;
import model.LicInformatica;

public class LogicaMetodos implements Metodos{
	
	private List<LicInformatica> lista = new ArrayList<LicInformatica>();

	@Override
	public void guardar(LicInformatica informatica) {
		// TODO Auto-generated method stub
		lista.add(informatica);
	}

	@Override
	public List<LicInformatica> mostrar() {
		// TODO Auto-generated method stub
		return lista;
	}

	@Override
	public LicInformatica buscar(int indice) {
		// TODO Auto-generated method stub
		return lista.get(indice);
	}

	@Override
	public void editar(int indice, LicInformatica informatica) {
		// TODO Auto-generated method stub
		lista.set(indice, informatica);
	}

	@Override
	public void eliminar(int indice) {
		// TODO Auto-generated method stub
		lista.remove(indice);
	}
	
	public void indiceNombre() {
		System.out.println("Registros en la lista por indice");
		for(int i=0; i<lista.size(); i++) {
			System.out.printf("\n[%d]" + lista.get(i).getNombre(), i);
		}
	}
	

}

