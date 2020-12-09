package ec.edu.ups.jpa;

import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.dao.OperadoraDAO;
import ec.edu.ups.dao.PersonaDAO;
import ec.edu.ups.dao.TelefonoDAO;
import ec.edu.ups.dao.TipoDAO;

public class JPADAOFactory extends DAOFactory {

	@Override
	public PersonaDAO getPersonaDAO() {
		// TODO Auto-generated method stub
		return new JPAPersonaDAO();
	}

	@Override
	public OperadoraDAO getOperadoraDAO() {
		// TODO Auto-generated method stub
		return new JPAOperadoraDAO();
	}

	@Override
	public TipoDAO getTipoDAO() {
		// TODO Auto-generated method stub
		return new JPATipoDAO();
	}

	@Override
	public TelefonoDAO getTelefonoDAO() {
		// TODO Auto-generated method stub
		return new JPATelefonoDAO();
	}

}
