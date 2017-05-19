package com.practicas.ede;

import static org.junit.Assert.*;
import junit.framework.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.Test;

public class BinStringTest {

	private BinString binString;
	
	public BinStringTest(){
		// Completar
		binString = new BinString();
	}
	
	@Test
	public void  sumarTest(){
		// Test de la función sumar
		int expected=0;
		assertEquals(expected, binString.sumar(""));
		expected=100;
		assertEquals(expected, binString.sumar("d"));
		expected=292;
		assertEquals(expected, binString.sumar("aba"));
		
	}
	
	@Test
	public void aBinarioTest() {
		// Test de la función aBinario
		String expected="1010";
		assertEquals(expected, binString.aBinario(10));
		expected="1";
		assertEquals(expected, binString.aBinario(1));
		expected="100";
		assertEquals(expected, binString.aBinario(4));

	}
	
	@Test
	public void convertirTest() {
		// Test de la función convertirTest
		String expected="1000001";
		assertEquals(expected, binString.convertir("A"));
		expected="100000100";
		assertEquals(expected, binString.convertir("Aba"));
		
		

	}
}
