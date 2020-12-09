package ec.edu.ups.entidades;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Tipo
 *
 */
@Entity

public class Tipo implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tip_id;
	private String tip_nombre;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "tipo")
	private Set<Telefono> telefono = new HashSet<Telefono>();

	public Tipo() {
		super();
	}
	

	public Tipo(int tip_id, String tip_nombre, Set<Telefono> telefono) {
		super();
		this.tip_id = tip_id;
		this.tip_nombre = tip_nombre;
		this.telefono = telefono;
	}


	public int getTip_id() {
		return tip_id;
	}

	public void setTip_id(int tip_id) {
		this.tip_id = tip_id;
	}

	public String getTip_nombre() {
		return tip_nombre;
	}

	public void setTip_nombre(String tip_nombre) {
		this.tip_nombre = tip_nombre;
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
