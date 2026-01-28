package POOInterfaces.modelo;

import java.util.ArrayList;
import java.util.List;

public class Libro implements Imprimible  {



   private  List<Imprimible> paginas;
   private String tituloLibro;
   private Tipos tipos;
   private Persona autor;

   public Libro(Persona autor, String tituloLibro, Tipos tipos) {
      this.autor = autor;
      this.tituloLibro = tituloLibro;
      this.paginas  = new ArrayList<>();

   }

   public Libro addPaginas(Imprimible pagina){
      paginas.add(pagina);

      return this;
   }

   public String imprimir(){
      StringBuilder sb = new StringBuilder("Titulo");
      sb.append(this.tituloLibro)
              .append("\n").append(this.autor.getNombre()).append("\n").append(tipos).append('\n');
      for (Imprimible pag: this.paginas){
         sb.append(pag.imprimir());
      }
      return sb.toString();
   }




}
