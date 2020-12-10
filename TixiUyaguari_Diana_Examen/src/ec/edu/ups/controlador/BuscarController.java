package ec.edu.ups.controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * Servlet implementation class BuscarController
 */
@WebServlet("/BuscarController")
public class BuscarController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private PersonaDAO personaDao ;
	private List<Persona>listaPersona;
	private Persona persona;
	
	private OperadoraDAO operadoraDao;
	private List<Operadora>listaOperadora;
	private Operadora operadora ; 
	
	private TipoDAO tipoDao;
	private  List<Tipo>listaTipo;
	private Tipo tipo;
	
	private TelefonoDAO telefonoDao;
	private List<Telefono>listaTelefonos;
	private Telefono telefono;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuscarController() {
    	personaDao = DAOFactory.getFactory().getPersonaDAO();
        telefonoDao = DAOFactory.getFactory().getTelefonoDAO();
        tipoDao = DAOFactory.getFactory().getTipoDAO();
        operadoraDao= DAOFactory.getFactory().getOperadoraDAO();
        
        tipo = new Tipo();
        operadora = new Operadora();
        persona = new Persona();
        telefono = new Telefono();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String url = null;
		String dato= null;
		String opc= null;
		ArrayList<Telefono> listTel = new ArrayList<Telefono>();
		ArrayList<Persona> listPer = new ArrayList<Persona>();
		try {
			dato = request.getParameter("cedula");
			opc= request.getParameter("opcion");
			System.out.println("Su opcion fue :" + opc);
			
			listaTelefonos= telefonoDao.findAll();
			listaPersona = personaDao.findAll();
			
			System.out.println("Lista Persona "+ listaTelefonos.get(0).getPersona().getPer_cedula());
			System.out.println("Lista Persona "+ listaTelefonos.get(1).getPersona().getPer_cedula());
			//System.out.println("Lista Persona "+ listaTelefonos.get(2).getPersona().getPer_cedula());
			
			System.out.println("El tamano de la lista es "+ listaTelefonos.size());
			if (opc.equals("Cedula")) {
				for (int i = 0; i < listaTelefonos.size(); i++) {
					if (listaTelefonos.get(i).getPersona().getPer_cedula().equals(dato)) {
						listTel.add(listaTelefonos.get(i));
					}
				}
				url = "/JSPs/listar.jsp";
				request.setAttribute("listaT",listTel);
			}
			if (opc.equals("Numero")) {
				for (int i = 0; i < listaTelefonos.size(); i++) {
					if (listaTelefonos.get(i).getTel_numero().equals(dato)) {
						listTel.add(listaTelefonos.get(i));
					}
				}
				url = "/JSPs/crear_telefono.jsp";
				request.setAttribute("listaT",listTel);
			}
			
			//url = "/JSPs/listar.jsp";
			//request.setAttribute("listaT",listTel);
			//listaPersona= personaDao.findCedula(ced);
			//listaTelefonos =telefonoDao.findNumero(ced);
			//request.setAttribute("listaP", listaPersona);
			//request.setAttribute("listaT", listaTelefonos);
			
			/*ced = request.getParameter("cedula");
			personaDao.buscarC(ced);
			listaPersona= personaDao.findCedula(ced);
			telefonos= telefonoDao.findAll();
			for(int i=0; i<telefonos.size();i++) {
				for(int j=0; j<listaPersona.size();j++) {
					if(telefonos.get(i).getPersona().getPer_id()==listaPersona.get(j).getPer_id()) {
						listTel.add(telefonos.get(i));
					}
				}
			}
			System.out.println("El tamano de la lista es : "+listTel.size());
			request.setAttribute("tel", listTel);*/
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		getServletContext().getRequestDispatcher(url).forward(request, response);
	    
	}

}
