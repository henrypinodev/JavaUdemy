package POOHerencia;

public class AlumnoInternacional extends Alumno {

    private String pais;
    private double notasIdiomas;




    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getNotasIdiomas() {
        return notasIdiomas;
    }

    public void setNotasIdiomas(double notasIdiomas) {
        this.notasIdiomas = notasIdiomas;
    }

    @Override
    public String toString() {
        return "Pais: "+pais+
                "Notas idiomas: "+notasIdiomas;
    }
}
