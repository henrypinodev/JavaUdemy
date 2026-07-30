package POOInterfacesRepositorio.reposotorio;

import POOInterfacesRepositorio.modelo.Cliente;
import POOInterfacesRepositorio.reposotorio.excepciones.AccesoDatoException;
import POOInterfacesRepositorio.reposotorio.excepciones.EscrituraAccesoDatoException;
import POOInterfacesRepositorio.reposotorio.excepciones.LecturaAccesoDatoException;

import java.util.List;

public interface CrudRepositorio<T> {

    List<T> listar();
    T porId(Integer id) throws AccesoDatoException;
    void insertar(T t) throws AccesoDatoException;
    void editar(T t) throws AccesoDatoException;
    void eliminar(Integer id) throws AccesoDatoException;
}
