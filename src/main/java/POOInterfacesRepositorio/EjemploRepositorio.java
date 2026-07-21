package POOInterfacesRepositorio;

import POOInterfacesRepositorio.modelo.Cliente;
import POOInterfacesRepositorio.reposotorio.*;
import POOInterfacesRepositorio.reposotorio.excepciones.AccesoDatoException;
import POOInterfacesRepositorio.reposotorio.excepciones.LecturaAccesoDatoException;
import POOInterfacesRepositorio.reposotorio.excepciones.RegistroDuplicadoAccesoDatosException;

import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {

        try {
            OrdenablePaginableCrudRepositorio<Cliente> repo = new ClienteListRepositorio();

            repo.insertar(new Cliente("Jose", "martinez"));
            repo.insertar(new Cliente("Esteban", "Gonzalez"));
            repo.insertar(new Cliente("Martina", "Jorquera"));
            repo.insertar(new Cliente("Tomas", "Gonzalez"));

           Cliente andres = new Cliente("JUAN", "TORO");
           repo.insertar(andres);
           repo.insertar(andres);

            List<Cliente> clientes = repo.listar();

            clientes.forEach(System.out::println);

            System.out.println("-----PAGINACION------");

            List<Cliente> paginable = ((PaginableRepositorio) repo).listar(1, 3);
            //SE INCLUYE INDICE 1 PERO EL 3 NO, COMPORTAMIENTO NORMAL.
            paginable.forEach(System.out::println);


            System.out.println("-----ORDENAR-------");

            List<Cliente> clientesOrdenAsc = ((OrdenablePaginableCrudRepositorio) repo).listar("nombre", Direccion.ASC);

            System.out.println("ORDEN ASC");
            for (Cliente c : clientesOrdenAsc) {
                System.out.println(c);
            }

            List<Cliente> clientesOrdenDesc = ((OrdenableRepositorio) repo).listar("nombre", Direccion.DESC);
            System.out.println("ORDEN DESC");
            for (Cliente c : clientesOrdenDesc) {
                System.out.println(c);
            }

            System.out.println("--------EDITAR-------");

            Cliente joseActualizar = new Cliente("jose", "Mena");

            System.out.println("Nombre anterior: " + repo.porId(1));
            joseActualizar.setId(1);
            repo.editar(joseActualizar);
            Cliente jose = repo.porId(1);
            System.out.println("Nombre actual: " + jose);


            System.out.println("------- ELIMINAR --------");

            repo.listar().forEach(System.out::println);


        }catch (LecturaAccesoDatoException ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace(System.out);
        } catch (RegistroDuplicadoAccesoDatosException Re){
            System.out.println(Re.getMessage());
            Re.printStackTrace(System.out);
        } catch (AccesoDatoException e){
            System.out.println(e.getMessage());
            e.printStackTrace(System.out);
        }


    }
}
