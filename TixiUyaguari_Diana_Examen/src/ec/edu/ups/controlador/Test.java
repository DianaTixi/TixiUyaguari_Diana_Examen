package ec.edu.ups.controlador;

import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.dao.OperadoraDAO;
import ec.edu.ups.dao.PersonaDAO;
import ec.edu.ups.dao.TelefonoDAO;
import ec.edu.ups.dao.TipoDAO;
import ec.edu.ups.entidades.Operadora;
import ec.edu.ups.entidades.Persona;
import ec.edu.ups.entidades.Telefono;
import ec.edu.ups.entidades.Tipo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Tipo
		TipoDAO tipoDao = DAOFactory.getFactory().getTipoDAO();
		Tipo tipo = new Tipo(0,"Movil");
		tipoDao.create(tipo);
		
		//Operadora
		OperadoraDAO operadoraDao = DAOFactory.getFactory().getOperadoraDAO();
		Operadora operadora = new Operadora(0, "Movistar");
		operadoraDao.create(operadora);
		
		//Persona
		PersonaDAO personaDao = DAOFactory.getFactory().getPersonaDAO();
		Persona persona = new Persona(0, "0302448451","Diana","Tixi","tixidiana2@gmail.com", "diana1");
		personaDao.create(persona);

		//Telefono 
		TelefonoDAO telefonoDao = DAOFactory.getFactory().getTelefonoDAO();
		Telefono telefono = new Telefono(0,"7896541230", operadora ,tipo, persona);
		telefonoDao.create(telefono);
	}

}
