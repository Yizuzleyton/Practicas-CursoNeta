package net.netasystem.granga;

public class Correr  {
	
	private static Object lock = new Object();
	static boolean disponible = false;
	
	
	
	public static void productor(){
		synchronized(lock) {
			
			if(disponible != false) {	
				
				lock.notifyAll();
				
			}
			try {
				lock.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
		
		
	}
	
	public static void consumidor() {
		synchronized(lock) {
			if(disponible == false ) {
				
				try {
					lock.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
				
		}
		
	}


}
