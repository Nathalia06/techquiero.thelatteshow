package org.techquiero.cafedemo;

import org.techquiero.cafedemo.Pedido;
import org.techquiero.cafedemo.modelo.Bebida;
import org.techquiero.cafedemo.modelo.Cafe;
import org.techquiero.cafedemo.modelo.Te;
import org.techquiero.cafedemo.modelo.Frappe;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double gtotal = 0.00;
		
		Pedido pedido = new Pedido();
		Scanner scanner = new Scanner(System.in);

		System.out.println("_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/");
		System.out.println("_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/\n");
		System.out.println("_/_/_/_/_/  _/                      _/                    _/      _/                      _/_/_/  _/                                      ");
		System.out.println("   _/      _/_/_/      _/_/        _/          _/_/_/  _/_/_/_/_/_/_/_/    _/_/        _/        _/_/_/      _/_/    _/      _/      _/   ");
		System.out.println("  _/      _/    _/  _/_/_/_/      _/        _/    _/    _/      _/      _/_/_/_/        _/_/    _/    _/  _/    _/  _/      _/      _/    ");
		System.out.println(" _/      _/    _/  _/            _/        _/    _/    _/      _/      _/                  _/  _/    _/  _/    _/    _/  _/  _/  _/       ");
		System.out.println("_/      _/    _/    _/_/_/      _/_/_/_/    _/_/_/      _/_/    _/_/    _/_/_/      _/_/_/    _/    _/    _/_/        _/      _/          \n");
		System.out.println("_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/");
		System.out.println("_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/BIENVENIDOS_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/");
		System.out.println("_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/\n");
		
		System.out.println("¿Cuántas bebidas deseas?");
		pedido.setCantidad(scanner.nextInt());
		
		String[] tickt = new String[pedido.getCantidad()];
						
		for(int i=0; i<pedido.getCantidad(); i++) {		
			System.out.println("\n********************\n***** Bebida " + (i+1) + " *****\n********************");
			System.out.println("¿Qué bebida deseas? \n 1 = Café | 2 = Té | 3 = Frappé" );
			int c = scanner.nextInt();
			
			switch(c)
			{
			   case 1 :
				  Cafe cafe = new Cafe();
				  cafe.setTipo(Bebida.Tipo.CAFE);
				  System.out.println("Selecciona el tamaño \n 1 = Chico | 2 = Mediano | 3 = Grande" );
				  int d = scanner.nextInt();
				  switch(d)
					{
					   case 1 :
						   cafe.setTamano(Cafe.Tamano.CHICO);
						   break;
					   case 2 :
						   cafe.setTamano(Cafe.Tamano.MEDIANO);
						   break;
					   case 3 :
						   cafe.setTamano(Cafe.Tamano.GRANDE);
						   break;
					   default :
						   System.out.println("Selecciona un tamaño válido" );
						   
					}
				  System.out.println("Selecciona el tipo de café \n 1 = Americano | 2 = Espresso | 3 = Capuccino | 4 = Latte" );
				  int e = scanner.nextInt();
				  switch(e)
					{
					   case 1 :
						   cafe.setTipoCafe(Cafe.TipoCafe.AMERICANO);
						   break;
					   case 2 :
						   cafe.setTipoCafe(Cafe.TipoCafe.ESPRESSO);
						   break;
					   case 3 :
						   cafe.setTipoCafe(Cafe.TipoCafe.CAPUCCINO);
						   break;
					   case 4 :
						   cafe.setTipoCafe(Cafe.TipoCafe.LATTE);
						   break;
					   default :
						   System.out.println("Selecciona una opción válida" );
						   
					}
				  System.out.println("¿Deseas añadir leche? \n 1 = Sí | 2 = No" );
				  int f = scanner.nextInt();
				  if (f == 1) {
					  cafe.setConLeche(true);
				  }else {
					  cafe.setConLeche(false);
				  }
				  tickt[i] = cafe.toString();
				  System.out.println("Pediste un: " + tickt[i] );
				  gtotal = gtotal + cafe.getTamano().getPrecio(); 
				  System.out.println("Total: " + gtotal );
			      break;
			   
			   case 2 :
				  Te te = new Te();
				  te.setTipo(Bebida.Tipo.TE);
				  System.out.println("Selecciona el tamaño \n 1 = Chico | 2 = Mediano | 3 = Grande" );
				  int g = scanner.nextInt();
				  switch(g)
					{
					   case 1 :
						   te.setTamano(Te.Tamano.CHICO);
						   break;
					   case 2 :
						   te.setTamano(Te.Tamano.MEDIANO);
						   break;
					   case 3 :
						   te.setTamano(Te.Tamano.GRANDE);
						   break;
					   default :
						   System.out.println("Selecciona un tamaño válido" );
						   
					}
				  System.out.println("Selecciona el tipo de te \n 1 = Manzanilla | 2 = Berries | 3 = Verde | 4 = Chai" );
				  int h = scanner.nextInt();
				  switch(h)
					{
					   case 1 :
						   te.setTipoTe(Te.TipoTe.MANZANILLA);
						   break;
					   case 2 :
						   te.setTipoTe(Te.TipoTe.BERRIES);
						   break;
					   case 3 :
						   te.setTipoTe(Te.TipoTe.VERDE);
						   break;
					   case 4 :
						   te.setTipoTe(Te.TipoTe.CHAI);
						   break;
					   default :
						   System.out.println("Selecciona una opción válida" );
						   
					}
				  tickt[i] = te.toString();
				  System.out.println("Pediste un: " + tickt[i] );
				  gtotal = gtotal + te.getTamano().getPrecio(); 
				  System.out.println("Total: " + gtotal );
			      break; 
			      
			   case 3 :
				  Frappe frappe = new Frappe();
				  frappe.setTipo(Bebida.Tipo.FRAPPE);
				  
				  System.out.println("Selecciona el tamaño \n 1 = Chico | 2 = Mediano | 3 = Grande" );
				  int j = scanner.nextInt();
				  switch(j)
					{
					   case 1 :
						   frappe.setTamano(Frappe.Tamano.CHICO);
						   break;
					   case 2 :
						   frappe.setTamano(Frappe.Tamano.MEDIANO);
						   break;
					   case 3 :
						   frappe.setTamano(Frappe.Tamano.GRANDE);
						   break;
					   default :
						   System.out.println("Selecciona un tamaño válido" );
						   
					}
				  System.out.println("Selecciona el sabor de tu Frappe \n 1 = Frapuccino | 2 = Mokaccino | 3 = Caramel" );
				  int k = scanner.nextInt();
				  switch(k)
					{
					   case 1 :
						   frappe.setTipoFrappe(Frappe.TipoFrappe.FRAPUCCINO);
						   break;
					   case 2 :
						   frappe.setTipoFrappe(Frappe.TipoFrappe.MOKACCINO);
						   break;
					   case 3 :
						   frappe.setTipoFrappe(Frappe.TipoFrappe.CARAMEL);
						   break;
					   default :
						   System.out.println("Selecciona una opción válida" );
						   
					}
				  tickt[i] = frappe.toString();
				  System.out.println("Pediste un: " + tickt[i] );
				  gtotal = gtotal + frappe.getTamano().getPrecio(); 
				  System.out.println("Total: " + gtotal );
			      break;
			      
			   default : 
					System.out.println("Tipo no válido" );
					i = i-1;
			}
			

		}
		
		// Bebida pedido = new Bebida("cocacola", 18.24, false, Bebida.Tamano.CHICO); 
		// System.out.println("Bebida:\n" + pedido); // El println por default utiliza el método "toString" pero para imprimirlo en algo que no sea println si lo necesita
		
		System.out.println("¿Cuál es tu nombre?");
		pedido.setNombre(scanner.next());
		
		System.out.println("Muchas gracias " + pedido.getNombre() + " estamos procesando tu pedido \n\n\n\n");
		
		
		System.out.println("\n_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/\n_/_/_/_/_/_/ Nota del Pedido _/_/_/_/_/_/\n_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/\n");
		for(int i=0; i<pedido.getCantidad(); i++) {	
			System.out.println("Bebida" + (i+1) + ": \n" + tickt[i] + "\n");
		}
		System.out.println("\n_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/\n_/_/_/_/ Total de Productos: " + pedido.getCantidad() + " _/_/_/_/");
		System.out.println("\n_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/\n_/_/_/_/_/_/ Total a Pagar _/_/_/_/_/_/");
		System.out.println("_/_/_/_/_/_/_/ $  " + gtotal +"  _/_/_/_/_/_/_/\n_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/\n_/_/_/_/_/ ¡MUCHAS GRACIAS! _/_/_/_/_/\n" );

	}
	
}
