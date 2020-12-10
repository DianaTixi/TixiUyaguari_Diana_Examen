package ec.edu.ups.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Operadora
 *
 */
@Entity
@Table(name = "operadora")
public class Operadora implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ope_id;
	private String ope_nombre;
	
	@OneToMany(cascade = CascadeType.ALL , mappedBy = "operadora")
	private Set<Telefono> telefonos = new HashSet<Telefono>();

	public Operadora() {
		super();
	}

	
	public Operadora(int ope_id, String ope_nombre) {
		super();
		this.ope_id = ope_id;
		this.ope_nombre = ope_nombre;
	}


	public int getOpe_id() {
		return ope_id;
	}

	public void setOpe_id(int ope_id) {
		this.ope_id = ope_id;
	}

	public String getOpe_nombre() {
		return ope_nombre;
	}

	public void setOpe_nombre(String ope_nombre) {
		this.ope_nombre = ope_nombre;
	}


	public Set<Telefono> getTelefonos() {
		return telefonos;
	}


	public void setTelefonos(Set<Telefono> telefonos) {
		this.telefonos = telefonos;
	}


	public void addTelefonos(Telefono telefono) {
		this.telefonos.add(telefono);
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ope_id;
		result = prime * result + ((ope_nombre == null) ? 0 : ope_nombre.hashCode());
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
		Operadora other = (Operadora) obj;
		if (ope_id != other.ope_id)
			return false;
		if (ope_nombre == null) {
			if (other.ope_nombre != null)
				return false;
		} else if (!ope_nombre.equals(other.ope_nombre))
			return false;
		if (telefonos == null) {
			if (other.telefonos != null)
				return false;
		} else if (!telefonos.equals(other.telefonos))
			return false;
		return true;
	}
	
   
}
