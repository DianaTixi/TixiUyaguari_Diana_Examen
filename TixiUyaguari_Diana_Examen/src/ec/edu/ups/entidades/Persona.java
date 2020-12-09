package ec.edu.ups.entidades;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Persona
 *
 */

@Entity 

public class Persona implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int per_id;
	private String per_cedula;
	private String per_nombre;
	private String per_apellido;
	private String per_direcion;
	private String per_email;
	private String per_contrasena;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "persona")
	private Set<Telefono> telefono = new HashSet<Telefono>();
	
	
	public Persona() {
		super();
	}

	public Persona(int per_id, String per_cedula, String per_nombre, String per_apellido, String per_direcion,
			String per_email, String per_contrasena, Set<Telefono> telefono) {
		super();
		this.per_id = per_id;
		this.per_cedula = per_cedula;
		this.per_nombre = per_nombre;
		this.per_apellido = per_apellido;
		this.per_direcion = per_direcion;
		this.per_email = per_email;
		this.per_contrasena = per_contrasena;
		this.telefono = telefono;
	}



	public int getPer_id() {
		return per_id;
	}


	public void setPer_id(int per_id) {
		this.per_id = per_id;
	}


	public String getPer_cedula() {
		return per_cedula;
	}


	public void setPer_cedula(String per_cedula) {
		this.per_cedula = per_cedula;
	}


	public String getPer_nombre() {
		return per_nombre;
	}


	public void setPer_nombre(String per_nombre) {
		this.per_nombre = per_nombre;
	}


	public String getPer_apellido() {
		return per_apellido;
	}


	public void setPer_apellido(String per_apellido) {
		this.per_apellido = per_apellido;
	}


	public String getPer_direcion() {
		return per_direcion;
	}


	public void setPer_direcion(String per_direcion) {
		this.per_direcion = per_direcion;
	}


	public String getPer_email() {
		return per_email;
	}


	public void setPer_email(String per_email) {
		this.per_email = per_email;
	}


	public String getPer_contrasena() {
		return per_contrasena;
	}


	public void setPer_contrasena(String per_contrasena) {
		this.per_contrasena = per_contrasena;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
   
}
