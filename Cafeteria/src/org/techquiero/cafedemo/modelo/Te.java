package org.techquiero.cafedemo.modelo;

public class Te extends Bebida{
	
	private TipoTe tipoTe;
		
		public enum TipoTe{
			MANZANILLA,
			BERRIES,
			VERDE,
			CHAI 
		}
		
		
	private Tamano tamano;
	public enum Tamano{
		CHICO(22.95),
		MEDIANO(26.50),
		GRANDE(32.95);
		
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
	
	public void setTipoTe(TipoTe tipoTe) {
		this.tipoTe = tipoTe;
	}
	
	// Getters
	public Tamano getTamano() {
		return tamano;
	}
	
	public TipoTe getTipoTe() {
		return tipoTe;
	}
	
	// Constructores
	
	public Te() {}

	public Te(String nombre, Tipo idTipo, TipoTe tipoTe, Tamano tamano, double precio) {
		super(nombre, idTipo);

		this.tipoTe = tipoTe;
		this.tamano = tamano;
		this.tamano.precio = precio;
	}
	
	@Override 
	public String toString () {
		return "Té: " + tipoTe + "\nTamaño: " + tamano + "\nPrecio: $ " + this.tamano.getPrecio();
	}
	
	
}
