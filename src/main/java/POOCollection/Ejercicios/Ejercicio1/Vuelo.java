package POOCollection.Ejercicios.Ejercicio1;


import java.time.LocalDate;
import java.time.LocalTime;

public class Vuelo {

    private String vuelo, origen, destino;
    private  int pasajeros;
    private LocalDate fecha;
    private LocalTime hora;

    public Vuelo(String nombre, String origen, String destino, int pasajeros, LocalDate fecha, LocalTime hora) {
        this.vuelo = nombre;
        this.origen = origen;
        this.destino = destino;
        this.pasajeros = pasajeros;
        this.fecha = fecha;
        this.hora = hora;
    }

    public String getVuelo() {
        return vuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHora() {
        return hora;
    }


}
