package ec.edu.ups.dao;

import java.util.List;

import ec.edu.ups.entidades.Operadora;
import ec.edu.ups.entidades.Persona;
import ec.edu.ups.entidades.Telefono;
import ec.edu.ups.entidades.Tipo;

public interface GenericDAO <T, ID> {
	public void create(T entity);

    public T read(ID id);

    public void update(T entity);

    public void delete(T entity);

    public void deleteByID(ID id);
    
    public List<T> findAll();

	public T buscarC(String cedula);

	public T buscarT(String tipoN);

	public T buscarO(String nombre);

	public List<Persona> findCedula(String cedula);

	public List<Telefono> findNumero(String numero);

}
