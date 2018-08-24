package net.netasystems.carrera.competir;

import java.util.List;

public class Carrera {
	
	private String nombreEquipo;
	private List<String> nombreCorredor;
	
	public Carrera() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Carrera(String nombreEquipo, List<String> nombreCorredor) {
		super();
		this.nombreEquipo = nombreEquipo;
		this.nombreCorredor = nombreCorredor;
	}
	public String getNombreEquipo() {
		return nombreEquipo;
	}
	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}
	public List<String> getNombreCorredor() {
		return nombreCorredor;
	}
	public void setNombreCorredor(List<String> nombreCorredor) {
		this.nombreCorredor = nombreCorredor;
	}

}
