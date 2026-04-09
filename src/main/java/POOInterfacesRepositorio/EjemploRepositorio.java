package POOInterfacesRepositorio;

import POOInterfacesRepositorio.modelo.Cliente;
import POOInterfacesRepositorio.reposotorio.*;

import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {


        CrudRepositorio repo = new ClienteListRepositorio();

        repo.insertar(new Cliente("Jose","martinez"));
        repo.insertar(new Cliente("Esteban", "Gonzalez"));
        repo.insertar(new Cliente("Martina","Jorquera"));
        repo.insertar(new Cliente("Tomas", "Gonzalez"));

        List<Cliente> clientes = repo.listar();

        clientes.forEach(System.out::println);

        System.out.println("-----PAGINACION------");

        List<Cliente> paginable = ((PaginableRepositorio)repo).listar(1, 3);
        //SE INCLUYE INDICE 1 PERO EL 3 NO, COMPORTAMIENTO NORMAL.
        paginable.forEach(System.out::println);


        System.out.println("-----ORDENAR-------");

        List<Cliente> clientesOrdenAsc = ((OrdenableRepositorio)repo).listar("nombre", Direccion.ASC);

        System.out.println("ORDEN ASC");
        for (Cliente c: clientesOrdenAsc){
            System.out.println(c);
        }

        List<Cliente> clientesOrdenDesc = ((OrdenableRepositorio)repo).listar("nombre", Direccion.DESC);
        System.out.println("ORDEN DESC");
        for (Cliente c: clientesOrdenDesc) {
            System.out.println(c);
        }

        System.out.println("--------EDITAR-------");

        Cliente joseActualizar = new Cliente("jose", "Mena");

        System.out.println("Nombre anterior: "+ repo.porId(1) );
        joseActualizar.setId(1);
        repo.editar(joseActualizar);
        Cliente jose = repo.porId(1);
        System.out.println("Nombre actual: "+ jose);


        System.out.println("------- ELIMINAR --------");
        repo.eliminar(5 );
        repo.listar().forEach(System.out::println);








    }
}
