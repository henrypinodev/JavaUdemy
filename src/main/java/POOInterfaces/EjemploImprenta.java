package POOInterfaces;

import POOInterfaces.modelo.Curriculum;
import POOInterfaces.modelo.Hoja;
import POOInterfaces.modelo.Informe;

public class EjemploImprenta {

    public static void main(String[] args) {

        Curriculum cv = new Curriculum("Desarrollador de back end con experiencia en despliegues", "José", "Ingeniero informatico");
        cv.addExperiencia("Trainee en Entel");
        cv.addExperiencia("DBA en USA");
        cv.addExperiencia("Software Engineer en platanus");

        Informe informe = new Informe("Informe sobre microservicios","John due", "Revisor canales ");

        imprimible(cv);
        imprimible(informe);


    }


    public static void imprimible(Hoja imp){
        System.out.println(imp.imprimir());
    }
}

