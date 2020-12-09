package ec.edu.ups.entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Telefono
 *
 */
@Entity

public class Telefono implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tel_id;
	private String tel_numero;
	
	@ManyToOne
	@JoinColumn(name = "ope_id")
	private Operadora operadora;
	
	@ManyToOne
	@JoinColumn(name = "tip_id")
	private Tipo tipo;
	
	@ManyToOne
	@JoinColumn(name = "per_id")
	private Persona persona;

	public Telefono() {
		super();
	}
	

	public Telefono(int tel_id, String tel_numero, Operadora operadora, Tipo tipo, Persona persona) {
		super();
		this.tel_id = tel_id;
		this.tel_numero = tel_numero;
		this.operadora = operadora;
		this.tipo = tipo;
		this.persona = persona;
	}


	public int getTel_id() {
		return tel_id;
	}

	public void setTel_id(int tel_id) {
		this.tel_id = tel_id;
	}

	public String getTel_numero() {
		return tel_numero;
	}

	public void setTel_numero(String tel_numero) {
		this.tel_numero = tel_numero;
	}

	public Operadora getOperadora() {
		return operadora;
	}

	public void setOperadora(Operadora operadora) {
		this.operadora = operadora;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
   
}
