package ec.edu.ups.entidades;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Operadora
 *
 */
@Entity

public class Operadora implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ope_id;
	private String ope_nombre;
	
	@OneToMany(cascade = CascadeType.ALL , mappedBy = "operadora")
	private Set<Telefono>telefono = new HashSet<Telefono>();

	public Operadora() {
		super();
	}

	
	public Operadora(int ope_id, String ope_nombre, Set<Telefono> telefono) {
		super();
		this.ope_id = ope_id;
		this.ope_nombre = ope_nombre;
		this.telefono = telefono;
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

	public Set<Telefono> getTelefono() {
		return telefono;
	}

	public void setTelefono(Set<Telefono> telefono) {
		this.telefono = telefono;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
   
}
