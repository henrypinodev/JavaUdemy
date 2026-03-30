package POOInterfaces.Ejercicio4;

public class Minibus extends Bus {

    public tipoServicio tiposervicio;


    public Minibus(int precioBase, int capacidadPasjeros, String empresa, tipoServicio tiposervicio) {
        super(precioBase,capacidadPasjeros, empresa);
        this.tiposervicio =  tiposervicio;

    }

    public tipoServicio getTiposervicio() {
        return tiposervicio;
    }

    @Override
    public double precioFinal() {
        return precioBase*0.20;
    }
}
