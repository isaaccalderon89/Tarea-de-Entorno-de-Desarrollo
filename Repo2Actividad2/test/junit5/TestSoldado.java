package junit5;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import Requerimiento1.Soldado;

class TestSoldado {
	
	@Test
	public void testPuedeDispararPositivo() {
		Soldado soldado = new Soldado();
		soldado.setNumeroBalas(30);
		
		boolean resultadoEsperado = true;
		boolean resultado = soldado.puedeDisparar();
		
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	public void testPuedeDispararIgual() {
		Soldado soldado = new Soldado();
		soldado.setNumeroBalas(0);
		
		boolean resultadoEsperado = false;
		boolean resultado = soldado.puedeDisparar();
		
		assertFalse(resultado);
	}
	
	@Test
	public void testPuedeDispararNegativo() {
		Soldado soldado = new Soldado();
		soldado.setNumeroBalas(-1);
		
		boolean resultadoEsperado = false;
		boolean resultado = soldado.puedeDisparar();
		
		assertFalse(resultado);
	}
	
	@Test
	public void testDispararTrue() {
		
		Soldado soldado = new Soldado();
		soldado.setEstasMuerto(true);
		
		boolean resultadoEsperado = true;
		boolean resultado = soldado.isEstasMuerto();
		
		assertTrue(resultado);
	}
	
	@Test
	public void testDispararFalse() {
		
		Soldado soldado = new Soldado();
		soldado.setEstasMuerto(false);
		
		boolean resultadoEsperado = false;
		boolean resultado = soldado.isEstasMuerto();
		
		assertFalse(resultado);
	}
	


}
