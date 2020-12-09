package ec.edu.ups.jpa;

import ec.edu.ups.dao.TipoDAO;
import ec.edu.ups.entidades.Tipo;

public class JPATipoDAO extends JPAGenericDAO<Tipo, Integer> implements TipoDAO{

	public JPATipoDAO() {
		super(Tipo.class);
		// TODO Auto-generated constructor stub
	}

}
