package net.netasystems.carrera.competir;


/**
 * @author NS-394
 *
 */
public class Carrera {
	
private boolean flagTaken = false;
private boolean flagFinish = false;


	
	/**
	 * @param threadName
	 * @return
	 */
	public synchronized boolean aquireFlag(String threadName) {
		if(flagTaken) {
			return false;
		}
		System.out.println("Flag has been aquired by: "+threadName);
		flagTaken = true;
		return true;
	}
	
	public void releaseFlag() {
		flagTaken = false;
	}
	
	public synchronized boolean leaveFlag() {
		return flagFinish;
	}
	
	public void fFlagFinish(boolean flagFinish) {
		this.flagFinish = flagFinish;
	}
	
	@Override
	public String toString() {
		return "Carrera [flagTaken=" + flagTaken + "]";
	}
	

}
