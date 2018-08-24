package net.netasystems.carrera.competir;

import java.util.Random;

public class Corredores implements Runnable {
	
	
private String nombre;
	
	
	public Corredores(String _nombre) {
		nombre = _nombre;
	}
	
	
	public synchronized void run() {
		// TODO Auto-generated method stub

		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(r.nextInt(3));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("El corredor " + nombre + " ha terminado");
		
		
	}

}
