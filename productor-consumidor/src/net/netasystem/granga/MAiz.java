package net.netasystem.granga;

import java.io.Serializable;

public class MAiz implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer cantidad;
	private String descripcion;
	
	
	public MAiz() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MAiz(Integer cantidad, String descripcion) {
		super();
		this.cantidad = cantidad;
		this.descripcion = descripcion;
	}

	
	
	
	
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cantidad == null) ? 0 : cantidad.hashCode());
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MAiz other = (MAiz) obj;
		if (cantidad == null) {
			if (other.cantidad != null)
				return false;
		} else if (!cantidad.equals(other.cantidad))
			return false;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "MAiz [cantidad=" + cantidad + ", descripcion=" + descripcion + "]";
	}
	
	
	
}
