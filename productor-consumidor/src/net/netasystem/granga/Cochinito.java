package net.netasystem.granga;

public class Cochinito  implements Runnable {
	

	public static void consumeMAiz() {
	
		MAiz maizParaConsumir = Parcela.getMaiz();
		System.out.println("estoy consumiendo" + maizParaConsumir.toString());
				
	}


	@Override
	public void run() {
		
		
			
		while (true) {
			Correr.consumidor();
			consumeMAiz();
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
					
		}
	}
}
