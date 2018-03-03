package com.cip.program;

public class Libro {

		// Atributos
		private String titulo;
		private String autor;
		private int    ejemplares;
		private int    prestados;
		
		
	    // set y geting
		public String getTitulo() {
			return titulo;
		}
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		public String getAutor() {
			return autor;
		}
		public void setAutor(String autor) {
			this.autor = autor;
		}
		public int getEjemplares() {
			return ejemplares;
		}
		public void setEjemplares(int ejemplares) {
			this.ejemplares = ejemplares;
		}
		public int getPrestados() {
			return prestados;
		}
		public void setPrestados(int prestados) {
			this.prestados = prestados;
		}
		
		// Constructores
		public Libro() {
		// llamando al 2º constructor
		this("", "",0,0);	
		}
					
		public Libro (String titulo, String autor, int ejemplares, int prestados) {
						
		this.titulo = titulo; 
		this.autor = autor;
		this.ejemplares = ejemplares;
	    this.prestados = prestados;
		}
		
		
		//toString
		
		public String toString() {
			return "Titulo:" + titulo + ", Autor:" + autor + ", Ejemplares: " + ejemplares + ", Prestados: " + prestados;
		}	
	
		
		
		//Metodos aparte
		
		public void prestamo(int retirado) {
			if (retirado > 0)
				this.prestados -= retirado;
		    else
				prestados = 0;
		}
		
		public void  devolucion(int regreso) {
			
			if(prestados>regreso) 
				this.prestados += regreso;
					
		}
					
		public int prestados() {
			return prestados;
			
		}
		
	
}
