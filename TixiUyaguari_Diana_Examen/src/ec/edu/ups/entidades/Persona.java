package ec.edu.ups.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Persona
 *
 */

@Entity 
@Table(name = "persona")

public class Persona implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int per_id;
	@Column(nullable = false)
	private String per_cedula;
	@Column(nullable = false)
	private String per_nombre;
	@Column(nullable = false)
	private String per_apellido;
	@Column(nullable = false)
	private String per_email;
	@Column(nullable = false)
	private String per_contrasena;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "persona")
	private ArrayList<Telefono> telefonos = new ArrayList<Telefono>();
	
	
	public Persona() {
		super();
	}

	public Persona(int per_id, String per_cedula, String per_nombre, String per_apellido,
			String per_email, String per_contrasena) {
		super();
		this.per_id = per_id;
		this.per_cedula = per_cedula;
		this.per_nombre = per_nombre;
		this.per_apellido = per_apellido;
		this.per_email = per_email;
		this.per_contrasena = per_contrasena;
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
	public ArrayList<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(ArrayList<Telefono> telefonos) {
		this.telefonos = telefonos;
	}
	
	public void addTelefonos(Telefono telefono) {
		this.telefonos.add(telefono);
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
   
}
