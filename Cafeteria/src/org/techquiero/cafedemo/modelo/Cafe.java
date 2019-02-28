package org.techquiero.cafedemo.modelo;

public class Cafe extends Bebida{
	
	private TipoCafe tipoCafe;
		
		public enum TipoCafe{
			AMERICANO,
			ESPRESSO,
			CAPUCCINO,
			LATTE
		}
		
	private boolean conLeche;
	
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
	
	public void setConLeche(boolean conLeche) {
		this.conLeche = conLeche;
	}
	
	public void setTamano(Tamano tamano) {
		this.tamano = tamano;
	}
	
	public void setTipoCafe(TipoCafe tipoCafe) {
		this.tipoCafe = tipoCafe;
	}
	
	// Getters
	
	public boolean isConLeche() { // el getter de un booleano es "is" no "get"
		return conLeche;
	}
	
	public Tamano getTamano() {
		return tamano;
	}
	
	public TipoCafe getTipoCafe() {
		return tipoCafe;
	}
	
	// Constructores
	
	public Cafe() {}

	public Cafe(String nombre, Tipo idTipo, TipoCafe tipoCafe, boolean conLeche, Tamano tamano, double precio) {
		super(nombre, idTipo);

		this.tipoCafe = tipoCafe;
		this.conLeche = conLeche;
		this.tamano = tamano;
		this.tamano.precio = precio;
	}
	
	@Override 
	public String toString () {
		return "Café: " + tipoCafe + "\nLeche: " + conLeche + "\nTamaño: " + tamano + "\nPrecio: $ " + this.tamano.getPrecio();
	}
	
	
}
