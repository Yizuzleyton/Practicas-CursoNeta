package net.netasystems.carrera.main;

import net.netasystems.carrera.competir.*;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		String[] corredores = { "1","2","3","4","5","6","7","8","9","10" };
		String[] corredore = { "blanco", "azul","verde","rojo","amarillo" };


		for (Object o : corredore) {
			System.out.println(o);
			System.out.println("--------------------");
		
			
				
				Thread t1 = new Thread(new Corredores(corredores[0]));
				t1.start();
				Thread t2 = new Thread(new Corredores(corredores[1]));
				t2.start();
				Thread t3 = new Thread(new Corredores(corredores[2]));
				t3.start();
				Thread t4 = new Thread(new Corredores(corredores[3]));
				t4.start();
				Thread t5 = new Thread(new Corredores(corredores[4]));
				t5.start();
				Thread t6 = new Thread(new Corredores(corredores[5]));
				t6.start();
				Thread t7 = new Thread(new Corredores(corredores[6]));
				t7.start();
				Thread t8 = new Thread(new Corredores(corredores[7]));
				t8.start();
				Thread t9 = new Thread(new Corredores(corredores[8]));
				t9.start();
				Thread t10 = new Thread(new Corredores(corredores[9]));
				t10.start();
				
				Thread.sleep(3000);

			
			System.out.println("---------------------");
		}
			
	
	}
}
