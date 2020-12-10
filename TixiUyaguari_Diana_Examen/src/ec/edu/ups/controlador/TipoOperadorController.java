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
import ec.edu.ups.dao.TipoDAO;
import ec.edu.ups.entidades.Operadora;
import ec.edu.ups.entidades.Tipo;

/**
 * Servlet implementation class TipoOperadorController
 */
@WebServlet("/TipoOperadorController")
public class TipoOperadorController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private OperadoraDAO operadoraDao;
	private TipoDAO tipoDao;
	private List<Operadora> listaOpe;
	private List<Tipo> listaTip;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TipoOperadorController() {
        operadoraDao= DAOFactory.getFactory().getOperadoraDAO();
        tipoDao = DAOFactory.getFactory().getTipoDAO();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String url= null;
		try {
			listaOpe = operadoraDao.findAll();
			System.out.println("Tamaño de la Lista: "+listaOpe.size());
			listaTip = tipoDao.findAll();
			System.out.println("Tmanaño de la lista tipo "+ listaTip.size());
			request.setAttribute("operadora", listaOpe);
			request.setAttribute("tipo", listaTip);
			url="/JSPs/agregar_persona.jsp";
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		getServletContext().getRequestDispatcher(url).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
