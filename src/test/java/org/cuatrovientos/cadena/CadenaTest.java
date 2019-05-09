package org.cuatrovientos.cadena;

import static org.junit.Assert.*;

import org.junit.Test;

public class CadenaTest {

	Cadena cade = new Cadena();
	@Test
	public void testLongitud() {
		int expected = 4;
		int actual = cade.longitud("hola");
		assertEquals(expected, actual);
	}

	@Test
	public void testVocales() {
		int expected = 2;
		int actual = cade.vocales("hola");
		assertEquals(expected, actual);
	}

	@Test
	public void testInvertir() {
		String expected = "aloh";
		String actual = cade.invertir("hola");
		assertEquals(expected, actual);
	}

	@Test
	public void testContarLetra() {
		int expected = 1;
		int actual = cade.contarLetra("hola",'a');
		assertEquals(expected, actual);
	}

}
