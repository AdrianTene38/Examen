package ec.edu.ups.entidades;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * Entity implementation class for Entity: Persona
 *
 */

@Entity
public class Comida implements Serializable {


	public Comida(String codigo, String nombre, String precio) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public Comida() {
		super();
	}
	private static final long serialVersionUID = 1L;
	@Id
	private String codigo ;
	private String nombre;
	private String precio;
	private static Comida instance;
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public static Comida getInstance() {
		if (instance == null)
			instance = new Comida();
		return instance;
	}
	public static void setInstance(Comida instance) {
		Comida.instance = instance;
	}
	@Override
	public String toString() {
		return "Comida [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + "]";
	}

}
