package com.trabajo1.componentes;

import java.util.ArrayList;

public interface Dependencia {
	void salida_mensaje(String mensaje);
	int leer_teclado();
	String suma(int a, int b);
	String resta(int a, int b);
	String multiplica(int a, int b);
	String divide(int a, int b);
	String mayor(int a, int b);
	ArrayList<String> tabla(int tabladel);
	
	

}
