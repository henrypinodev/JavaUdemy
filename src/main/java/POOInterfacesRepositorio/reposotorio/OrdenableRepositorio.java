package POOInterfacesRepositorio.reposotorio;

import POOInterfacesRepositorio.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio<T> {

    List<T> listar(String campo, Direccion dir);
}
