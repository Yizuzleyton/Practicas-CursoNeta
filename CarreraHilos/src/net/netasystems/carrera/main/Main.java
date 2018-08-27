package net.netasystems.carrera.main;

import net.netasystems.carrera.competir.*;

public class Main {

	public static void main(String[] args) {
		System.out.println("Carrera de Netasystems!!!!");
		Carrera carrera = new Carrera();
		Equipos eqAzul = new Equipos(carrera, "Azul");
		Equipos eqAmarillo = new Equipos(carrera, "Amarillo");
		Thread teqAz = new Thread(eqAzul);
		Thread teqAm = new Thread(eqAmarillo);
		teqAm.start();
		teqAz.start();
		
		
	}
}
