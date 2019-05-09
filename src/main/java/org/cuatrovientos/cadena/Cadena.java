package org.cuatrovientos.cadena;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Cadena {
	
	int longitud;
	int vocales;
	String invertir;
	int contarLetra;
	
	public int longitud(String cadena) {
		return cadena.length();
	}
	
	public int vocales(String cadena) {
		int Contador = 0;	
		for (int i = 0; i < cadena.length(); i++) {
			if(Character.isLowerCase(cadena.charAt(i))){
				if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' || cadena.charAt(i) == 'i' || cadena.charAt(i) == 'o' || cadena.charAt(i) == 'u'){
					Contador ++;	
			}
			}
		}
		return Contador;
	}
	
	public String invertir(String cadena) {
		String invertida="";
		for (int i = cadena.length() - 1; i >= 0; i--) {
			invertida += cadena.charAt(i);
		}
		//OTRA OPCION******
		//invertida = new StringBuilder(cadena).reverse().toString();
		
		//*OTRAA***
		/*List<String> listaCadena = Arrays.asList(cadena);
		Collections.reverse(listaCadena);
		invertida = listaCadena.toString();*/
			
		return invertida;
		
	}
	
	public int contarLetra(String cadena, char caracter) {
		int contador=0;
		int posicion=0;
		posicion = cadena.indexOf(caracter);
		while (posicion != -1) {
				contador ++;
				posicion = cadena.indexOf(caracter,posicion + 1);
			}
		return contador;
	}
	
}
