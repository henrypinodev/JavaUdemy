package POO.Clases;

public class Motor {

    private double cilindrada;
    private TipoMotor tipoMotor;

    //Dos constructores, uno vacio por si requerimos nosotros darle los datos por los setter.
    // Constructor inicializado con los dos atributos por si solo queremos utilizar el get.
    public Motor() {
    }

    public Motor(double cilindrada, TipoMotor tipoMotor) {
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
    }

    public TipoMotor getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(TipoMotor tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }


}
