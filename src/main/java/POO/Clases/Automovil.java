package POO.Clases;

public class Automovil {

    // Atributo statico, que el valor de colorPatente es compartido por la clase, no por objeto
    // el contenido del atributo colorPatente es compartido por todas las instancias creadas
    private static Color colorPatente = Color.NARANJO;
    private int id;
    private String fabricante;
    private String modelo;
    private Color color = Color.GRIS ;
    private double cilindrada;
    private boolean automalo;
    private Integer autoInteger;
    private Boolean automaloBooleanObjeto;
    private int autoint;
    private Double cilindradaDouble;
    private int capacidadEstanque = 40;
    private static int ultimoId;
    private TipoAutomovil tipo;


    public static final Integer VELOCIDAD_MAX_CARRETERA = 120;
    public static final int VELOCIDAD_MAX_CIUDAD = 60;

    public static final String COLOR_ROJO = "Rojo";
    public static final String COLOR_AMARILLO = "Amarillo";
    public static final String COLOR_AZUL = "Azul";
    public static final String COLOR_BLANCO = "Blanco";
    public static final String COLOR_GRIS = "Gris";

    // CONSTRUCTOR
    public Automovil(){
        this.id = ++ ultimoId;
    }


    public Automovil(String fabricante, String modelo){
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    // Constructor Fabricante, modelo es llamado aqui en el this(fabricante, modelo) mejora de codigo
    public Automovil(String fabricante, String modelo, Color color) {
        this(fabricante,modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, Color color, double cilindrada) {
        this(fabricante,modelo,color);
        this.cilindrada = cilindrada;
    }

    public Automovil(String fabricante, String modelo, Color color, double cilindrada, boolean automalo, Integer autoInteger, Boolean automaloBooleanObjeto, int autoint, Double cilindradaDouble, int capacidadEstanque) {
        this(fabricante,modelo,color,cilindrada);
        this.automalo = automalo;
        this.autoInteger = autoInteger;
        this.automaloBooleanObjeto = automaloBooleanObjeto;
        this.autoint = autoint;
        this.cilindradaDouble = cilindradaDouble;
        this.capacidadEstanque = capacidadEstanque;
    }

    // FIN CONSTRUCTOR

    //Getter


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

    public void setColor(Color color){
        this.color = color;
    }
    public Color getColor (){
        return color;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public void setAutomalo(boolean automalo) {
        this.automalo = automalo;
    }

    public void setAutoInteger(Integer autoInteger) {
        this.autoInteger = autoInteger;
    }

    public void setAutomaloBooleanObjeto(Boolean automaloBooleanObjeto) {
        this.automaloBooleanObjeto = automaloBooleanObjeto;
    }

    public void setAutoint(int autoint) {
        this.autoint = autoint;
    }

    public void setCilindradaDouble(Double cilindradaDouble) {
        this.cilindradaDouble = cilindradaDouble;
    }

    public void setCapacidadEstanque(int capacidadEstanque) {
        this.capacidadEstanque = capacidadEstanque;
    }

    public String getFabricante() {
        return this.fabricante;
    }

    public String getModelo() {
        return modelo;
    }



    public double getCilindrada() {
        return cilindrada;
    }

    public boolean isAutomalo() {
        return automalo;
    }

    public Integer getAutoInteger() {
        return autoInteger;
    }

    public Boolean getAutomaloBooleanObjeto() {
        return automaloBooleanObjeto;
    }

    public int getAutoint() {
        return autoint;
    }

    public Double getCilindradaDouble() {
        return cilindradaDouble;
    }

    public int getCapacidadEstanque() {
        return capacidadEstanque;
    }
   // Getter del tipo del enum
    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    // METODO DE LA CLASE
    public String verDetalle() {
        StringBuilder sb = new StringBuilder();
        //String modelo = "otro";  //debo usar siempre el this si me refiero al atributo de la clase, si requiero referirme al del metodo, lo uso sin this
        //no acomplar al systemsoutprint, sino que debe quedar desacoplado para que los datos puedan ser impresos en cualquier lugar, no solo a consola.
        sb.append("auto.fabricante: " + this.fabricante);
        sb.append("\nuto.Integer: " + this.autoInteger);
        sb.append("\nauto.colorPatente: " + colorPatente );
        sb.append("\nauto.malo(boolean): " + this.automalo);
        sb.append("\nauto.maloBooleanObjeto(Boolean): " + this.automalo);
        sb.append("\nauto.int: " + this.autoint);
        sb.append("\nauto.double(primitivo) " + this.cilindrada);
        sb.append("\nauto.tipo"+ this.getTipo().getDescripcion());
        sb.append("\nauto.Double(Wrapper objeto) " + this.cilindradaDouble);
        sb.append("\nauto.id "+ this.id);

        return sb.toString();

    }

    public String acelerar(int rpm){
        StringBuilder sb = new StringBuilder();
        sb.append("El auto:"+ fabricante);
        sb.append("\nAcelerando a: "+ rpm);

        return sb.toString();
    }

    public String frenar(){
        StringBuilder sb = new StringBuilder();
        sb.append(fabricante+ " " + modelo+ " Frenando ");
        return sb.toString();
    }

    public String acelerarFrenar(int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();

        return acelerar + "\n" + frenar;

    }

    public float calcularConsumo (int km, float porcentajeBencina ){
        return km/(capacidadEstanque* porcentajeBencina);

    }

    public float calcularConsumo (int km, int porcentajeBencina ){
        return km/(capacidadEstanque*(porcentajeBencina/100f));

    }
    //setter estatico, me permite cambiar el valor de la variable estatica de la clase automovil
    public static void setColorPatente(Color colorPatente){
        Automovil.colorPatente = colorPatente;
    }

    public static Color getColorPatente(){
        return colorPatente;
    }

    // SOBREESCRITURA DE METODOS, ME PERMITE COMPARAR CONTENIDO DE FABRICANTE Y MODELO CON EQUALS, SIN ESTO ME COMPARA EL OBJETO EN MEMORIA DONDE HACE REFERENCIA.
    @Override
    public boolean equals(Object obj) {
        // si this es igual a un objeto, me salto el segundo if, así no comparo el segundo if
        if (this == obj){
            return true;
        }
        // comparo si el objeto obj no es del tipo Automovil, false
        if (!(obj instanceof Automovil)){
            return false;
        }
        // valido si fabricante y modelo no sea null, luego copmparo
        Automovil a = (Automovil) obj;
        return (this.fabricante != null && this.modelo != null &&
                this.fabricante.equals(a.getFabricante()) && this.modelo.equals(a.getModelo()) );
    }

    // SOBREESCRITURA de metodo toString para en vez de mostrar el valor en memoria, me retorna el contenido del objeto
    @Override
    public String toString() {
        return "Automovil{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", cilindrada=" + cilindrada +
                ", automalo=" + automalo +
                ", autoInteger=" + autoInteger +
                ", automaloBooleanObjeto=" + automaloBooleanObjeto +
                ", autoint=" + autoint +
                ", cilindradaDouble=" + cilindradaDouble +
                ", capacidadEstanque=" + capacidadEstanque +
                ", id="+ id +
                '}';
    }
}
