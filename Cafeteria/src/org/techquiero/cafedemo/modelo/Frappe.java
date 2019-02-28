package org.techquiero.cafedemo.modelo;

public class Frappe extends Bebida{
	
	private TipoFrappe tipoFrappe;
		
		public enum TipoFrappe{
			FRAPUCCINO,
			MOKACCINO,
			CARAMEL
		}
		
		
	private Tamano tamano;
	public enum Tamano{
		CHICO(19.95),
		MEDIANO(22.50),
		GRANDE(28.95);
		
		private double precio;
		
		Tamano(double precio) { 
			this.precio = precio;
	    }
		
		public double getPrecio() {
			return this.precio;
		}
	}

	// Setters

	
	public void setTamano(Tamano tamano) {
		this.tamano = tamano;
	}
	
	public void setTipoFrappe(TipoFrappe tipoFrappe) {
		this.tipoFrappe = tipoFrappe;
	}
	
	// Getters
	public Tamano getTamano() {
		return tamano;
	}
	
	public TipoFrappe getTipoFrappe() {
		return tipoFrappe;
	}
	
	// Constructores
	
	public Frappe() {}

	public Frappe(String nombre, Tipo idTipo, TipoFrappe tipoFrappe, Tamano tamano) {
		super(nombre, idTipo);

		this.tipoFrappe = tipoFrappe;
		this.tamano = tamano;
	}
	
	@Override 
	public String toString () {
		return "Frappé sabor: " + tipoFrappe + "\nTamaño: " + tamano + "\nPrecio: $ " + this.tamano.getPrecio();
	}
	
	
}
