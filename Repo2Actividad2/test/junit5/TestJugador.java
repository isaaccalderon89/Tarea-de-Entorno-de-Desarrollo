package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Requerimiento2.Jugador;

class TestJugador {

	@Test
	public void tieneDorsalIgual() {
		Jugador jugador = new Jugador();
		jugador.setDorsal(15);
		
		int resultadoEsperado = 15;
		int resultadoObtenido = jugador.getDorsal();
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	public void tieneDorsalMayor() {
		Jugador jugador = new Jugador();
		jugador.setDorsal(33);
		
		int resultadoEsperado = 33;
		int resultadoObtenido = jugador.getDorsal();
		assertEquals(resultadoEsperado, resultadoObtenido);
	}

	@Test
	public void tieneDorsalMenor() {
		Jugador jugador = new Jugador();
		jugador.setDorsal(0);
		
		int resultadoEsperado = -1;
		int resultadoObtenido = jugador.getDorsal();
		assertNotEquals(resultadoEsperado, resultadoObtenido);
	}

	 @Test
	 void testEstaExpulsadoConDosAmarillas() {
		Jugador jugador = new Jugador();
	    jugador.setNumeroTarjetasAmarillas(2);
	    jugador.setNumeroTarjetasRojas(0);
	    assertTrue(jugador.estaExpulsado());
	    
	    }

	  @Test
	  void testEstaExpulsadoConUnaRoja() {
	    Jugador jugador = new Jugador();
	    jugador.setNumeroTarjetasAmarillas(1);
	    jugador.setNumeroTarjetasRojas(1);
	    assertTrue(jugador.estaExpulsado());
	    }

}
