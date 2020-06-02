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
public class Tarjeta implements Serializable {


	private static final long serialVersionUID = 1L;
	@Id
	
	private String numerotarjeta;
	private  String nombre;
	private  String fechacaducidad;
	private  String cvv;
	private static Tarjeta instance;	
	
	public Tarjeta(String numerotarjeta, String nombre, String fechacaducidad, String cvv) {
		super();
		this.numerotarjeta = numerotarjeta;
		this.nombre = nombre;
		this.fechacaducidad = fechacaducidad;
		this.cvv = cvv;
	}

	public static Tarjeta getInstance() {
		if (instance == null)
			instance = new Tarjeta();
		return instance;
	
	

}

	public Tarjeta() {
		super();
	}

	public String getNumerotarjeta() {
		return numerotarjeta;
	}

	public void setNumerotarjeta(String numerotarjeta) {
		this.numerotarjeta = numerotarjeta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechacaducidad() {
		return fechacaducidad;
	}

	public void setFechacaducidad(String fechacaducidad) {
		this.fechacaducidad = fechacaducidad;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public static void setInstance(Tarjeta instance) {
		Tarjeta.instance = instance;
	}
}
