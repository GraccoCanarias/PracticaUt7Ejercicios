package com.cip.program;

import java.util.Scanner;

public class MainLibro {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int opcion;
		
		
		Libro lib = new Libro();
		
		do {
			// Imprimir Menu
			System.out.println(" ");
			System.out.println("MENU");
			System.out.println("1.- Introduzca Titulo");
			System.out.println("2.- Introduzca Autor");
			System.out.println("3.- Introdusca Ejemplares Totales");
			System.out.println("4.- Ejemplares Prestados");
			System.out.println("5.- Ejemplares Devueltos");
			System.out.println("6.- Informacion del Libro");
			System.out.println("0.- Salir");
			System.out.println("Su Opcion:");
			
			// pedir opcion al usuario
			opcion = sc.nextInt();
			
			//metodo swicht para menu
			switch (opcion){
				case 1: System.out.println("Introduzca Titulo:");
						lib.getTitulo();		
						break;
				case 2: System.out.println("Introduzca Autor");
				        lib.getAutor();
						break;
				case 3: System.out.println("Ejemplar Prestado:");
						lib.getEjemplares();		
						break;				
				case 4: System.out.println("Ejemplar Prestado:");
						lib.prestamo (sc.nextInt());		
						break;		
				case 5: System.out.println("Ejemplar Devueltos:");
						lib.devolucion (sc.nextInt());		
						break;				
				case 6: System.out.println(lib.toString());	
						break;
				case 0 :System.out.println("Hasta Pronto");
				        break;
				default : System.out.println("Por favor, introduzca un valor entre cero y tres");		
			}
						
		} while (opcion!=0);
	
		sc.close();
  
		
		
		
		
		
		
		
		
		
	}

}
