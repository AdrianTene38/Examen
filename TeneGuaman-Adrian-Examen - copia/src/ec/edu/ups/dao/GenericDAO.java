package ec.edu.ups.dao;

import java.util.List;
import ec.edu.ups.entidades.Pedido;
import ec.edu.ups.entidades.Tarjeta;
import ec.edu.ups.entidades.Comida;
public interface GenericDAO<T, ID> {
	public void create(T entity);
	public T read(ID id);
	public void update(T entity);
	public void delete(T entity);
	public void deleteByID(ID id);
	public List<T> findAll();
	public String logueo(String correo, String contra);
	public List<T> find1(String cedula);
	public List<T> BuscarId(ID id);
	public List<T> BuscarCedula(String cedula);
	public List<T> BuscarCorreo(String correo);
	public List<T> BuscarCedulaP(String cedula);
	public List<T> BuscarCorreoP(String correo);
}
