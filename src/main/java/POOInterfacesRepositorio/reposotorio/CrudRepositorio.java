package POOInterfacesRepositorio.reposotorio;

import POOInterfacesRepositorio.modelo.Cliente;

import java.util.List;

public interface CrudRepositorio<T> {

    List<T> listar();
    T porId(Integer id);
    void insertar(T t);
    void editar(T t);
    void eliminar(Integer id);
}
