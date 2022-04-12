package com.trabajo1.componentes;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class Implementacion implements Dependencia {

	@Override
	public void salida_mensaje(String mensaje) {
		System.out.println("La respuesta es: ");
		System.out.println(mensaje);
		
	}

	@Override
	public int leer_teclado() {
		
		System.out.println("ingrese un valor: ");
		Scanner leer = new Scanner(System.in);
	
		return leer.nextInt();
	}

	@Override
	public String suma(int a, int b) {
		
		int suma= a+b;
		return String.valueOf(suma);
	}

	@Override
	public String resta(int a, int b) {
		int resta= a-b;
		return String.valueOf(resta);
	}

	@Override
	public String multiplica(int a, int b) {
		int mulplica= a*b;
		return String.valueOf(mulplica);
	}

	@Override
	public String divide(int a, int b) {
		int divide= a/b;
		return String.valueOf(divide);
	}

	@Override
	public String mayor(int a, int b) {
		
		if (a > b) {
			
			return("A es mayor que B");
		} else if (b > a) {
			
			return("B es mayor que A");
			
		}
		return null;
	}

	@Override
	public ArrayList<String> tabla(int tabladel) {
		
		ArrayList<String> lista = new ArrayList<String>();
		
		for(int i=0; i<10; i++) {
			
			lista.add(String.valueOf(i*tabladel));
			
		}
	
		return null;
	}

	
	

}
