package net.netasystem.main;

import net.netasystem.granga.*;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("ejemplo de productor");
		
		Correr c = new Correr();
		Agricultor agricultor = new Agricultor();	
		Cochinito hugo = new Cochinito();
		
		Thread ag1 = new Thread(agricultor);
		ag1.start();
		
		
		Thread coch2 = new Thread(hugo);
		coch2.start();
		
		
		
		Thread coch3 = new Thread(hugo);
		coch3.start();
		
		
		
		Thread coch4 = new Thread(hugo);
		coch4.start();
		
		

	}

}
