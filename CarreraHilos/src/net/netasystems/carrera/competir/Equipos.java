package net.netasystems.carrera.competir;

import java.util.ArrayList;
import java.util.List;

/**
 * @author NS-394
 *
 */
public class Equipos implements Runnable {
	
	
	private List<Corredores> corredores;
	private String name;
	private Carrera carrera;
	private int pendientes = 10;
	
	/**
	 * @param carrera
	 * @param name
	 */
	public Equipos(Carrera carrera, String name){
		this.name = name;
		this.carrera = carrera;
		corredores = new ArrayList<>();
		for(int i = 0; i<pendientes; i++) {
			Corredores c = new Corredores(carrera, this.name +"_Corredor:"+ i, this);
			corredores.add(c);
		}
	}
	
	
	public void corredorTermina() {
		this.pendientes--;
		if(pendientes == 0) {
			carrera.fFlagFinish(true);
			System.out.println("El equipo: "+this.name + " ha terminado!!!!");
			
		}
		
	}
	

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		System.out.println("Equipo: "+ this.name + " ha iniciado!!!");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(Corredores c : corredores) {
			Thread t = new Thread(c);
			t.start();
		}
		
		
	}

	@Override
	public String toString() {
		return "Equipos [corredores=" + corredores + ", name=" + name + ", carrera=" + carrera + ", pendientes="
				+ pendientes + "]";
	}
	
	
	
	

}
