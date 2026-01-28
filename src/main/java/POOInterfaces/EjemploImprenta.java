package POOInterfaces;

import POOInterfaces.modelo.*;


import static POOInterfaces.modelo.Imprimible.imp;

public class EjemploImprenta {

    public static void main(String[] args) {

        Curriculum cv = new Curriculum("Desarrollador de back end con experiencia en despliegues", new Persona("pablito","pablaza"), "Ingeniero informatico");
        cv.addExperiencia("Trainee en Entel")
                .addExperiencia("DBA en USA")
                .addExperiencia("Software Engineer en platanus");

        Informe informe = new Informe("Informe sobre microservicios",new Persona("jorge","Gonzalez"), "Revisor canales ");



       Libro libro = new Libro(new Persona("Marcela","vacarezza"),"Las Iliadas", Tipos.CIENCIA_FICCION);
       libro.addPaginas(new Pagina("Patron singleton"))
               .addPaginas(new Pagina("Observador"))
               .addPaginas(new Pagina("Fabrica de objetos"));

        imp(cv);
        imp(informe);
        imp(libro);

        System.out.println(Imprimible.TEXTO_DE_DEFECTO);









    }

    }
}

