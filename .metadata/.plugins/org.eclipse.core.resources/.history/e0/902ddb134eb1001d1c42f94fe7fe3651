package Requerimiento2;
/**
 * Clase que encapsula la información de un Jugador. Cada jugador debe tener un dorsal para poder jugar y ademas 
 * depende del tipo o numero de tarjeta estará expulsado o no. 
 *  
 * @author Isaac Calderón López
 * @version1.2
 * @since 20/02/2023
 *
 */
public class Jugador {
	/**
	 * Este atributo indica el numero entero del dorsal del jugador.
	 */
	private int dorsal;
	/**
	 * Este atributo indica el numero entero de tarjetas Amarillas que tiene un jugador.
	 */
	private int numeroTarjetasAmarillas;
	/**
	 * Este atributo indica el numero entero de tarjetas rojas que tiene un jugador.
	 */
	private int numeroTarjetasRojas;

	/*
	 * Constructor con parámetros. 
	 * Los constructores también se pueden comentar, teniendo en cuenta no devuelven nada 
	 * por lo que la etiqueta @Return no habría que ponerla. 
	 * En este caso no los voy a comentar con JavaDoc ya que el ejercicio no lo pedía
	 */
	public Jugador(int dorsal, int numeroTarjetasAmarillas, int numeroTarjetasRojas) {
		super();
		this.dorsal = dorsal;
		this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
		this.numeroTarjetasRojas = numeroTarjetasRojas;
	}

	//Constructor sin parámetros
	public Jugador() {
		super();
	}


	/*
	 * Los getter and setter generalmente no se comentan. Solo en caso de que haga alguna funcionalidad 
	 * diferente a la que tienen por defecto. 
	 */
	public int getDorsal() {
		return dorsal;
	}


	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}


	public int getNumeroTarjetasAmarillas() {
		return numeroTarjetasAmarillas;
	}


	public void setNumeroTarjetasAmarillas(int numeroTarjetasAmarillas) {
		this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
	}


	public int getNumeroTarjetasRojas() {
		return numeroTarjetasRojas;
	}


	public void setNumeroTarjetasRojas(int tarjetasRojas) {
		numeroTarjetasRojas = tarjetasRojas;
	}
	/**
	 * El siguiente método establece el numero de dorsal de un jugador, establece el rango entre el número 1 y 30
	 * 
	 * @param dorsal se le pasa por parámetro el dorsal del jugador, en caso de que el dorsal no se encunentre entre 
	 * 1 y 30 devuelve -1.
	 * 
	 * @author Félix de Pablo.
	 */
	public void ponerDorsal(int dorsal) {
		if(dorsal >= 1 && dorsal <= 30) {
			this.dorsal = dorsal;
		}else {
			this.dorsal = -1;
		}
	}
	/**
	 * El siguiente método devuelve un booleano indicando si el jugador está expulsado o no.
	 * Si el jugador tiene el numeroTarjetasAmarillas igual a 2 es expulsado, si también tiene el numeroTarjetasRojas igual a 1
	 * también será expulsado
	 * @return true si el jugador está expulsado, false si el jugador no ha sido expulsado. 
	 */
	public boolean estaExpulsado() {
		boolean expulsado = false;
		
		if (numeroTarjetasAmarillas==2) {
			
			expulsado = true; 
		} 
		if (numeroTarjetasRojas==1) {
			
			expulsado = true;
			
		}
			return true;
	}

}
