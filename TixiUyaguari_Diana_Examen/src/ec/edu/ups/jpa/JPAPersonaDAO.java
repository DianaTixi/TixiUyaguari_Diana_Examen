package ec.edu.ups.jpa;

import ec.edu.ups.dao.PersonaDAO;
import ec.edu.ups.entidades.Persona;

public class JPAPersonaDAO extends JPAGenericDAO<Persona, Integer> implements PersonaDAO{

	public JPAPersonaDAO() {
		super(Persona.class);
		// TODO Auto-generated constructor stub
	}

}
