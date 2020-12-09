package ec.edu.ups.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Tipo
 *
 */
@Entity
@Table(name = "tipo")
public class Tipo implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tip_id;
	@Column(nullable = false)
	private String tip_nombre;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "tipo")
	private ArrayList<Telefono> telefonos = new ArrayList<Telefono>();

	public Tipo() {
		super();
	}
	

	public Tipo(int tip_id, String tip_nombre) {
		super();
		this.tip_id = tip_id;
		this.tip_nombre = tip_nombre;
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
