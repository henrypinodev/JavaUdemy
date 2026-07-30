package POOInterfacesRepositorio.reposotorio;

import POOInterfacesRepositorio.modelo.Cliente;
import POOInterfacesRepositorio.modelo.Producto;
import POOInterfacesRepositorio.reposotorio.excepciones.AccesoDatoException;
import POOInterfacesRepositorio.reposotorio.excepciones.EscrituraAccesoDatoException;
import POOInterfacesRepositorio.reposotorio.excepciones.LecturaAccesoDatoException;

import java.util.List;

public class EjemploRepositorioProducto {
    public static void main(String[] args) {

        try {
            OrdenablePaginableCrudRepositorio<Producto> repo = new ProductoListRepositorio();

            repo.insertar(new Producto("producto metal", 8.000));
            repo.insertar(new Producto("Producto agricola", 5.000));
            repo.insertar(new Producto("Producto ganadero", 17.000));
            repo.insertar(new Producto("Producto inmobiliario", 230.000));
            repo.insertar(new Producto("Producto inmobiliario", 230.000));

            List<Producto> productos = repo.listar();

            productos.forEach(System.out::println);

            System.out.println("-----PAGINACION------");

            List<Producto> paginable = ((PaginableRepositorio) repo).listar(1, 3);
            //SE INCLUYE INDICE 1 PERO EL 3 NO, COMPORTAMIENTO NORMAL.
            paginable.forEach(System.out::println);


            System.out.println("-----ORDENAR-------");

            List<Producto> productosOrdenAsc = ((OrdenablePaginableCrudRepositorio) repo).listar("nombre", Direccion.ASC);

            System.out.println("ORDEN ASC");
            for (Producto c : productosOrdenAsc) {
                System.out.println(c);
            }

            List<Producto> productosOrdenDesc = ((OrdenableRepositorio) repo).listar("nombre", Direccion.DESC);
            System.out.println("ORDEN DESC");
            for (Producto c : productosOrdenDesc) {
                System.out.println(c);
            }

            System.out.println("--------EDITAR-------");

            Producto joseActualizar = new Producto("producto ganadero", 70.000);

            System.out.println("Nombre anterior: " + repo.porId(1));
            joseActualizar.setId(1);
            repo.editar(joseActualizar);
            Producto jose = repo.porId(1);
            System.out.println("Nombre actual: " + jose);




            System.out.println("------- ELIMINAR --------");
            repo.eliminar(5);
            repo.listar().forEach(System.out::println);
        }catch (LecturaAccesoDatoException ex) {
            System.out.println("Lectura Catch: " + ex.getMessage());
            ex.printStackTrace(System.out);
        }catch(EscrituraAccesoDatoException e) {
            System.out.println("Escritura Catch: "+ e.getMessage());
            e.printStackTrace(System.out);

        }catch (AccesoDatoException e){
            System.out.println("Generica catch: "+e.getMessage());
            e.printStackTrace(System.out);
        }
    }
}
