package POO.Clases;

public enum TipoAutomovil {
    SEDAN("Sedan","Auto normal",4),
    STATION_WAGON("Station wagon","Auto grande",4),
    HASHBACK("Hasback","Auto compacto",4),
    PICK_UP("Pickup","Camioneta",2),
    COUPE("Coupe","Auto pequeño",2),
    CONVERTIBLE("Convertible","auto deportivo",2),
    FURGON("Furgón", "Auto grande",6);


    private final String nombre;
    private final int numeroPuertas;
    private final String descripcion;

    TipoAutomovil(String nombre,String descripcion, int numeroPuertas) {
        this.nombre = nombre;
        this.numeroPuertas = numeroPuertas;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public String getDescripcion() {
        return descripcion;
    }


}
