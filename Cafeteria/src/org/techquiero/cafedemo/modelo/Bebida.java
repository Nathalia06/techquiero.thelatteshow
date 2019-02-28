package org.techquiero.cafedemo.modelo;

public class Bebida {
	
	private Tipo tipo;
	public enum Tipo{
		CAFE,
		TE,
		FRAPPE
	}
	
	
	
	// Se puede crear un constructor vacío para que en main puedas crear un objeto sin darle contenido de variables
	public Bebida() {} 

	// Este es el constructor, cuando tienes esto ya puedes crear el objeto en el main, si solo tienes este, va a ser obligatorio donde lo creas darle el contenido de las variables
	public Bebida(String nombre, Tipo idTipo) {
		super();
		this.tipo = idTipo;
	}
	
	@Override 
	public String toString () {
		return "Tipo: " + tipo;
	}
	
	/*
	// Si no vas a crear el constructor con datos (sobrecargado), no es necesario crear el vacío
	
	
	// Convertir a String el contenido de las variables
	@Override // Se utiliza para saber que es un método que ya existe y lo estás utilizando aquí, si no se pone el override es como si estuvieras declarando una nueva clase No es indispensable para que funcione pero es necesario mostrarlo
	public String toString () {
		return "Nombre: " + nombre + "\nTipo: " + tipo;
	}
	*/
	
	// Setters
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	
	// Getters	
	public Tipo getTipo() {
		return tipo;
	}

	

}
