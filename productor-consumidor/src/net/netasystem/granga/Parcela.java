package net.netasystem.granga;

import java.util.ArrayDeque;
import java.util.Queue;

public class Parcela {
	
	
	public static int addMaiz = 0;
	private static Queue<MAiz> parcela = new ArrayDeque<>(); // medio de almacenar Maiz
	
	
	public static void addMaiz(MAiz maiz) {
		
		
		parcela.add(maiz);
		
	}
	
	public static MAiz getMaiz() {
		
		return parcela.poll();
		
	}

}
