package net.netasystem.granga;

import java.util.Random;

public class Agricultor implements Runnable {
	
	private static Random ram = new Random();
	

	static void siembraOcosecha() {
		
			
			Parcela.addMaiz(new MAiz (getCantidadRandom(), getMAizDescripcion()));	
	
		
		
	}
	
	public static  int getCantidadRandom() {
		
			
			return(int) ram.nextInt(100);
			
		
		
	}
	
	public static  String getMAizDescripcion() {
		
		String tipoMaiz[] = {"transgenero","normal","organico","blanco", "negro"};
		int index = (int) ram.nextInt(100)+10;
				
		return tipoMaiz[index];
	}



	@Override
	public void run() {
		
			while(true) {
				Correr.productor();
				siembraOcosecha();
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					System.out.println("hola");
				}
			}
	}
}
