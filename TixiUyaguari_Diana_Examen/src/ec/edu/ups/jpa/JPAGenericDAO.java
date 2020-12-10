package ec.edu.ups.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import ec.edu.ups.dao.GenericDAO;
import ec.edu.ups.entidades.Operadora;
import ec.edu.ups.entidades.Persona;
import ec.edu.ups.entidades.Telefono;
import ec.edu.ups.entidades.Tipo;

public class JPAGenericDAO<T, ID> implements GenericDAO<T, ID> {
	private Class<T> persistentClass;
    protected EntityManager em;

    public JPAGenericDAO(Class<T> persistentClass) {
    this.persistentClass = persistentClass;
    this.em = Persistence.createEntityManagerFactory("TixiUyaguari_Diana_Examen").createEntityManager();
    }
	@Override
	public void create(T entity) {
		em.getTransaction().begin();
		try {
		    em.persist(entity);
		    em.getTransaction().commit();
		} catch (Exception e) {
		    System.out.println(">>>> ERROR:JPAGenericDAO:create " + e);
		    if (em.getTransaction().isActive())
			em.getTransaction().rollback();
		    e.printStackTrace();
		}
	}

	@Override
	public T read(ID id) {
		return em.find(persistentClass, id);
	}

	@Override
	public void update(T entity) {
		em.getTransaction().begin();
		try {
		    em.merge(entity);
		    em.getTransaction().commit();
		} catch (Exception e) {
		    System.out.println(">>>> ERROR:JPAGenericDAO:update " + e);
		    if (em.getTransaction().isActive())
			em.getTransaction().rollback();
		}	
	}

	@Override
	public void delete(T entity) {
		em.getTransaction().begin();
		try {
		    em.remove(entity);
		    em.getTransaction().commit();
		} catch (Exception e) {
		    System.out.println(">>>> ERROR:JPAGenericDAO:delete " + e);
		    if (em.getTransaction().isActive())
			em.getTransaction().rollback();
		}
	}

	@Override
	public void deleteByID(ID id) {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
    @Override
    public List<T> findAll() {
	em.getTransaction().begin();
	List<T> lista = null;
	try {
	    javax.persistence.criteria.CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
	    cq.select(cq.from(persistentClass));
	    lista = em.createQuery(cq).getResultList();
	    em.getTransaction().commit();
	} catch (Exception e) {
	    e.printStackTrace();
	}
	return lista;

    }
	
	@Override
	public T buscarC(String cedula) {
		String jpql1 = "Select p FROM Persona p WHERE p.per_cedula= '"+cedula+ "'";
		Query query = em.createQuery(jpql1);
		Persona persona = (Persona)query.getSingleResult();
		return (T) persona ;		
	}
	
	
	@Override
	public T buscarT(String nombre) {
		String jpql1 = "Select t FROM Tipo t WHERE t.tip_nombre= '"+nombre+ "'";
		Query query = em.createQuery(jpql1);
		Tipo tipo = (Tipo)query.getSingleResult();
		return (T) tipo ;		
	}
	
	@Override
	public T buscarO(String nombre) {
		Operadora operadora = new Operadora();
		String jpql1 = "Select o FROM Operadora o WHERE o.ope_nombre= '"+nombre+ "'";
		Query query = em.createQuery(jpql1);
		operadora = (Operadora)query.getSingleResult();
		return (T) operadora ;		
	}
	
	@Override
	public List<Persona> findCedula(String cedula) {
		String jpql1 = "Select p FROM Persona p WHERE p.per_cedula= '"+cedula+ "'";
		List<Persona> persona = em.createQuery(jpql1).getResultList();
		return persona ;
	}
	
	@Override
	public List<Telefono> findNumero(String numero) {
		String jpql1 = "Select tel FROM Telefono tel WHERE tel.tel_numero= '"+numero+ "'";
		List<Telefono> telefonos = em.createQuery(jpql1).getResultList();
		return telefonos ;
	}
		
}
