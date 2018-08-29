package net.netasystems.carrera.competir;


/**
 * @author NS-394
 *
 */
public class Corredores implements Runnable {
	
	
	private Carrera carrera;
	private boolean corre = true;
	private String name;
	private Equipos equipo;
	
	/**
	 * @param carrera
	 * @param name
	 * @param equipo
	 */
	public Corredores(Carrera carrera, String name, Equipos equipo) {
		this.carrera = carrera;
		this.name = name;
		this.equipo = equipo;
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		while(corre && !carrera.leaveFlag()) {
			boolean aquired = false;
			try {
				Thread.sleep(150);
				if (!carrera.leaveFlag()) {
					aquired = carrera.aquireFlag(this.name);
				}
				
				if(aquired) {
					Thread.sleep(200);
					carrera.releaseFlag();
					this.corre = false;
					equipo.corredorTermina();
				}
				/*if(carrera.leaveFlag() == true) {
					
					
					this.corre = true;
					System.out.println("falto:  " + this.name);
				}*/
				
				
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

	@Override
	public String toString() {
		return "Corredores [carrera=" + carrera + ", corre=" + corre + ", name=" + name + ", equipo=" + equipo + "]";
	}
}
