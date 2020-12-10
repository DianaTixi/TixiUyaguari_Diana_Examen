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
	private Set<Telefono> telefonos = new HashSet<Telefono>();
	
	
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
	
	
	//public void addTelefonos(Telefono telefono) {
		//this.telefonos.add(telefono);
	//}


	public Set<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(Set<Telefono> telefonos) {
		this.telefonos = telefonos;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((per_apellido == null) ? 0 : per_apellido.hashCode());
		result = prime * result + ((per_cedula == null) ? 0 : per_cedula.hashCode());
		result = prime * result + ((per_contrasena == null) ? 0 : per_contrasena.hashCode());
		result = prime * result + ((per_email == null) ? 0 : per_email.hashCode());
		result = prime * result + per_id;
		result = prime * result + ((per_nombre == null) ? 0 : per_nombre.hashCode());
		result = prime * result + ((telefonos == null) ? 0 : telefonos.hashCode());
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
		Persona other = (Persona) obj;
		if (per_apellido == null) {
			if (other.per_apellido != null)
				return false;
		} else if (!per_apellido.equals(other.per_apellido))
			return false;
		if (per_cedula == null) {
			if (other.per_cedula != null)
				return false;
		} else if (!per_cedula.equals(other.per_cedula))
			return false;
		if (per_contrasena == null) {
			if (other.per_contrasena != null)
				return false;
		} else if (!per_contrasena.equals(other.per_contrasena))
			return false;
		if (per_email == null) {
			if (other.per_email != null)
				return false;
		} else if (!per_email.equals(other.per_email))
			return false;
		if (per_id != other.per_id)
			return false;
		if (per_nombre == null) {
			if (other.per_nombre != null)
				return false;
		} else if (!per_nombre.equals(other.per_nombre))
			return false;
		if (telefonos == null) {
			if (other.telefonos != null)
				return false;
		} else if (!telefonos.equals(other.telefonos))
			return false;
		return true;
	}

	
	
	
   
}
