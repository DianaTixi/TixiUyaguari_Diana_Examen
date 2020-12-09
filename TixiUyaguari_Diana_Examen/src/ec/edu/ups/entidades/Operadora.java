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
	private ArrayList<Telefono>telefonos = new ArrayList<Telefono>();

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
