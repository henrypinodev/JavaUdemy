package POOInterfaces.modelo;

import java.util.*;

public class Curriculum  extends  Hoja implements Imprimible{

    private Persona persona;
    private String carrera;
    private List<String> experiencia;

    public Curriculum(String contenido, Persona persona, String carrera) {
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        this.experiencia = new ArrayList<>();
    }

    public Curriculum addExperiencia (String exp){
        experiencia.add(exp);

        return this;
    }

    @Override
    public String imprimir() {

        StringBuilder str = new StringBuilder("Nombre: ");
        str.append(persona).append(carrera).append(experiencia);
        for (String exp : experiencia){
            str.append("- ").append(exp).append("\n");

        }
        return str.toString();
    }
}
