package POOInterfacesRepositorio.Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca <T> {

    private List<T> elementos;
    private int indice;
    private final int indiceMaximo = 3;

    public Biblioteca() {
        this.elementos = new ArrayList<>();
    }

    public List<T> getElemento() {
        return elementos;
    }

    protected void agregar (T t){
        if (this.elementos.size() <= indiceMaximo ){
            this.elementos.add(t);
        }else {
            throw new RuntimeException("Error, ha superado el maximo de elementos permitidos");
        }
    }

}
