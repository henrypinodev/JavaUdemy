package POO.Clases;

public class Automovil2 {

    private int id;
    private String fabricante;
    private String modelo;
    private Color color = Color.GRIS;
    private Motor motor;
    private Estanque estanque;
    private Persona conductor;
    private Rueda[] ruedas;
    private TipoAutomovil tipo;
    private static int ultimoId;


    // CONSTRUCTORES
    public Automovil2() {
        this.id = ++ultimoId;
    }

    public Automovil2(String fabricante, String modelo) {
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    // Constructor Fabricante, modelo es llamado aqui en el this(fabricante, modelo) mejora de codigo
    public Automovil2(String fabricante, String modelo, Color color) {
        this(fabricante, modelo);
        this.color = color;
    }

    public Automovil2(String fabricante, String modelo, Color color, Motor motor) {
        this(fabricante, modelo, color);
        this.motor = motor;
    }

    public Automovil2(String fabricante, String modelo, Color color, Motor motor, Estanque estanque) {
        this(fabricante, modelo, color, motor);
        this.estanque = estanque;

    }

    public Automovil2(String fabricante, String modelo, Color color, Motor motor, Estanque estanque, Persona conductor, Rueda[] ruedas) {
        this(fabricante,modelo,color,motor,estanque);
        this.conductor = conductor;
        this.ruedas = ruedas;
    }

    // FIN CONSTRUCTOR

    // GETTER AND SETTER


    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Estanque getEstanque() {
        return estanque;
    }

    public void setEstanque(Estanque estanque) {
        this.estanque = estanque;
    }

    public int getId() {
        return id;

    }

    public void setId(int id) {
        this.id = id;

    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public String getFabricante() {
        return this.fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    // Getter y setter del tipo enum TipoAutomovil

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public String verDetalle() {
        StringBuilder sb = new StringBuilder();

        //String modelo = "otro";  //debo usar siempre el this si me refiero al atributo de la clase, si requiero referirme al del metodo, lo uso sin this
        //no acomplar al systemsoutprint, sino que debe quedar desacoplado para que los datos puedan ser impresos en cualquier lugar, no solo a consola.
        sb.append("\nauto.id " + this.id);
        sb.append("\nauto.fabricante: " + this.fabricante);
        sb.append("\nauto.modelo: " + this.modelo);
        sb.append("\nauto.tipo = " + this.getTipo().getDescripcion());
        sb.append("\nauto.color " + this.color);
        sb.append("\nauto.cilindrada: " + this.motor.getCilindrada());

        return sb.toString();


    }
}
