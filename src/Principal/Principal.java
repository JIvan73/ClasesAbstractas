package Principal;

import java.util.Scanner;

import Implementacion.LogicaMetodos;
import model.LicInformatica;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declarar variables
		
		String matricula;
		String nombre;
		long cedula;
		String equipoComp;
		String tecgDesar;
		
		
		LicInformatica informatica = null;
		
		Scanner lectura = null;
		
		int menuPrinc, menuInfor, subMenu, indice;
		
		LogicaMetodos imp = new LogicaMetodos();    ///Constructor vacio
		
		do {
			System.out.println("Menu principal");
			System.out.println("1- CRUD INFORMATICA");
			System.out.println("2 -SALIR");
			lectura = new Scanner(System.in);
			menuPrinc = lectura.nextInt();
			
			switch (menuPrinc) {
			case 1:
				do {
					System.out.println("MENU INFORMATICA");
					System.out.println("1-  ALTA");
					System.out.println("2-  MOSTRAR");
					System.out.println("3-  BUSCAR");
					System.out.println("4-  EDITAR");
					System.out.println("5-  ELIMINAR");
					System.out.println("6-  REGRESAR");
					lectura = new Scanner(System.in);
					menuInfor = lectura.nextInt();

////////////////////////////////////////////////////////////////////mENU INFORMATICA				
					
					switch (menuInfor) {
					case 1:
						
						System.out.println("Ingrese matricula");
						lectura = new Scanner(System.in);
						matricula = lectura.nextLine();
						
						System.out.println("Ingrese profesion");
						lectura = new Scanner(System.in);
						nombre = lectura.nextLine();
					
						System.out.println("Ingrese cedula");
						lectura = new Scanner(System.in);
						cedula = lectura.nextLong();
						
						System.out.println("Ingrese mequipo de compu");
						lectura = new Scanner(System.in);
						equipoComp = lectura.nextLine();
						
						System.out.println("Ingrese tecnologias");
						lectura = new Scanner(System.in);
						tecgDesar = lectura.nextLine();
						
						//Obj
						informatica = new LicInformatica(matricula, nombre, cedula, equipoComp, tecgDesar);
						//Guardar
						imp.guardar(informatica);
						System.out.println("Se gurado");
						
						
						break;

					case 2:
						System.out.println(imp.mostrar());
						
						break;
						
					case 3:
						imp.indiceNombre();
						System.out.println("Ingrese el indice a buscar");
						lectura = new Scanner(System.in);
						indice = lectura.nextInt();
						
						///Buscar
						informatica = imp.buscar(indice);
						System.out.println("Se encontro registro " + informatica);
						break;

					case 4:
						
						imp.indiceNombre();
						System.out.println("Ingrese el indice a buscar");
						lectura = new Scanner(System.in);
						indice = lectura.nextInt();
						
						///Buscar
						informatica = imp.buscar(indice);
						System.out.println("Se encontro registro " + informatica.getNombre());
						
						
						////Submenu editar matircula y cedula
						do {
							
							System.out.println("MENU PARA EDITAR");
							System.out.println("1 - MATRICULA");
							System.out.println("2 - CEDULA");
							System.out.println("3 - REGRESAR M INFORMATICA");
							lectura = new Scanner(System.in);
							subMenu = lectura.nextInt();
							
							
							switch (subMenu) {
							case 1:
								System.out.println("Ingresa nueva matricula");
								lectura = new Scanner(System.in);
								matricula = lectura.nextLine();
								
								///Actualiza
								informatica.setMatricula(matricula);
								imp.editar(indice, informatica);
								System.out.println("Editado");
								
								break;

							case 2:
								
								System.out.println("Ingresa nueva cedula");
								lectura = new Scanner(System.in);
								cedula = lectura.nextLong();
								
								///Actualiza
								informatica.setCedula(cedula);
								imp.editar(indice, informatica);
								System.out.println("Editado");
								
								break;
								
							case 3:
								System.out.println("Saliste del SUBMENU");
								break;
							}
						} while (subMenu < 3);
						
						//////////////ROMPE CASE 4
						break;
						
						
					case 5:
						imp.indiceNombre();
						System.out.println("Ingrese el indice a eliminar");
						lectura = new Scanner(System.in);
						indice = lectura.nextInt();
						
						//Eliminar
						imp.eliminar(indice);
						System.out.println("Se elimino");
						
						break;

					case 6:
						System.out.println("SALISTE DEL MENU DE INFORMATICA");
						break;
						
					}
					////Segundo do
				}while(menuInfor < 6);
			
	/////////////////////////////////////////////////////////////////////MENU INFORMATICA ROMPER			
				break;

			case 2:
				System.out.println("SALISTE DEL MENU PRINCIPAL");
				break;
				
			}//////ROMPER CASE DEL MENU PRINCIPAL
			
			/////Primer do FINALIZA EL PRIMER DO
			}while(menuPrinc < 2);
		
		System.out.println("FIN DEL PROGRAMA");
		
	////////////FINAL	
	}

}
