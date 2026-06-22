package POOInterfacesRepositorio.Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Registro<T extends Empleado> {

    private List<T> empleados;
    private final int INDICE_MAXIMO = 3;


    public List<T> getEmpleados() {
        return empleados;
    }

    public Registro() {
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(T t){
        if (empleados.size() >= INDICE_MAXIMO){
            throw new IllegalArgumentException("Se alcalzó el maximo de inserciones"+ " ["+INDICE_MAXIMO+"]");
        }
        empleados.add(t);
    }

    public int cantidad(){
      return empleados.size();
    }

    public void mostrarNombres(){
        for (T e : empleados){
            System.out.println(e.getNombre());
        }
    }


}