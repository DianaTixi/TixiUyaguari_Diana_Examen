package ec.edu.ups.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.dao.OperadoraDAO;
import ec.edu.ups.dao.PersonaDAO;
import ec.edu.ups.dao.TelefonoDAO;
import ec.edu.ups.dao.TipoDAO;
import ec.edu.ups.entidades.Operadora;
import ec.edu.ups.entidades.Persona;
import ec.edu.ups.entidades.Telefono;
import ec.edu.ups.entidades.Tipo;

/**
 * Servlet implementation class CrearPersonaController
 */
@WebServlet("/CrearPersonaController")
public class CrearPersonaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PersonaDAO personaDao ;
	private Persona persona;
	
	private OperadoraDAO operadoraDao;
	private Operadora operadora;
	
	private TipoDAO tipoDao;
	private Tipo tipo;
	
	private TelefonoDAO telefonoDao;
	private Telefono telefono;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrearPersonaController() {
        personaDao = DAOFactory.getFactory().getPersonaDAO();
        telefonoDao = DAOFactory.getFactory().getTelefonoDAO();
        tipoDao = DAOFactory.getFactory().getTipoDAO();
        operadoraDao= DAOFactory.getFactory().getOperadoraDAO();
        persona = new Persona();
        tipo = new Tipo();
        operadora = new Operadora();
        telefono = new Telefono();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse 
			response) throws ServletException, IOException {
		String url =null;
		int per_id= 0;
		int tel_id=0;
		int tel_id2=0;
		try {
			persona.setPer_id(per_id);
			persona.setPer_cedula(request.getParameter("cedula"));
			persona.setPer_nombre(request.getParameter("nombre"));
			persona.setPer_apellido(request.getParameter("apellido"));
			persona.setPer_email(request.getParameter("email"));
			persona.setPer_contrasena(request.getParameter("pass"));
			
			String oper= request.getParameter("operadora");
			String tip = request.getParameter("tipo");
			System.out.println("Operadora : "+oper + " Tipo: "+ tip);
			
			personaDao.create(persona);
			
			//Buscar Persona para agregar
			Persona persona2= personaDao.buscarC(request.getParameter("cedula"));
			System.out.println("Persona = " +persona.getPer_id() + " "+ persona.getPer_nombre());
			
			//Buscar Tipo
			tipo = tipoDao.buscarT(tip);
			System.out.println("Tipo "+ tipo.getTip_id()+ " "+tipo.getTip_nombre());
			
			//Buscar Operadora
			operadora = operadoraDao.buscarO(oper);
			System.out.println("Operadora "+operadora.getOpe_id() +" "+ operadora.getOpe_nombre());
			
			//Crear Telefono1
			
			telefono.setTel_id(0);
			telefono.setTel_numero(request.getParameter("numero"));
			telefono.setOperadora(operadora);
			telefono.setTipo(tipo);
			telefono.setPersona(persona2);
			telefonoDao.create(telefono);
			//telefono.setPersona(persona);
			//telefono.setOperadora(operadora);
			
			String oper2= request.getParameter("operadora2");
			String tip2 = request.getParameter("tipo2");
			System.out.println("Operadora : "+oper2 + " Tipo: "+ tip2);
			
			
			//Buscar Tipo
			tipo = tipoDao.buscarT(tip2);
			System.out.println("Tipo "+ tipo.getTip_id()+ " "+tipo.getTip_nombre());
			
			//Buscar Operadora
			operadora = operadoraDao.buscarO(oper2);
			System.out.println("Operadora "+operadora.getOpe_id() +" "+ operadora.getOpe_nombre());
			
			//Crear Telefono1
			Telefono telefono2 = new Telefono ();
			telefono2.setTel_id(0);
			telefono2.setTel_numero(request.getParameter("numero2"));
			telefono2.setOperadora(operadora);
			telefono2.setTipo(tipo);
			telefono2.setPersona(persona2);
			telefonoDao.create(telefono2);
			//telefono.setPersona(persona);
			//telefono.setOperadora(operadora);
			
			url = "/index.html";
		} catch (Exception e) {
			e.printStackTrace();
		}
		getServletContext().getRequestDispatcher(url).forward(request, response);
	    
	}

}
