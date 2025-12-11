package POOHerencia;

public final class AlumnoInternacional extends Alumno {

    private String pais;
    private double notasIdiomas;


    public AlumnoInternacional() {
        System.out.println("Inicializando constructor alumno internacional");
    }

    public AlumnoInternacional(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public AlumnoInternacional(String nombre, String apellido, int edad, String institucion, String pais) {
        super(nombre, apellido, edad, institucion);
        this.pais = pais;
    }

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
    public String saludar() {
        return super.saludar()+ "soy alumno internacional: "+ getNombre()+ "del pais: "+getPais();
    }

    @Override
    public double calcularPromedio() {
        //System.out.println("Calcular promedio  : "+ AlumnoInternacional.class.getCanonicalName());
        return ((super.calcularPromedio()*3)+notasIdiomas)/4;
    }
}
