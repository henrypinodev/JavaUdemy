package POOInterfacesRepositorio.reposotorio;

import POOInterfacesRepositorio.modelo.Cliente;

import java.util.List;

public interface CrudRepositorio {

    List<Cliente> listar();
    Cliente porId(Integer id);
    void insertar(Cliente cliente);
    void editar(Cliente cliente);
    void eliminar(Integer id);
}
