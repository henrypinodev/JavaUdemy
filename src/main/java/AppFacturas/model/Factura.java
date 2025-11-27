package AppFacturas.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {


    private int folio;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private ItemFactura[] items;
    private int indiceItem;
    public static final int MAX_ITEMS = 10;
    private static int ultimoFolio;


    public Factura(String descripcion, Cliente cliente) {
        this.descripcion = descripcion;
        this.cliente = cliente;
        this.items = new ItemFactura[MAX_ITEMS];
        this.folio = ++ultimoFolio;
        this.fecha = new Date();
    }

    public int getFolio() {
        return folio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ItemFactura[] getItems() {
        return items;
    }

// METODO AGREGAR

    public void addItemFactura(ItemFactura item){
        if (indiceItem < MAX_ITEMS){
            this.items[indiceItem++] = item;
        }
    }

    public double calcularTotal () {
        double total = 0.0;
        for(int i = 0; i < indiceItem; i++){
            ItemFactura item = this.items[i];

            total = total + item.calcularImporte();

        }
        return total;
    }

    public String generarDetalle (){
        StringBuilder sb = new StringBuilder("Factura N°:  ");

        sb.append(folio)
                .append("\nCliente: ")
                .append(this.cliente.getNombre())
                .append("\nRUT: ").append(cliente.getRUT())
                .append("\nDescripcion: ")
                .append(this.descripcion)
                .append("\n")
                .append("\n#\tNombre\t$\tCant.\tTotal\n");

        SimpleDateFormat df = new SimpleDateFormat("dd 'de' MMMM, yyyy ");

        sb.append("Fecha de emisión:" )
                .append(df.format(this.fecha))
                .append("\n");

        for (int i = 0; i < indiceItem; i++){
            ItemFactura item = this.items[i];

            sb.append(item.toString());

        }
        sb.append("\nGran total: ")
                .append(calcularTotal());

        return sb.toString();

    }

    @Override
    public String toString() {
        return generarDetalle();
    }
}
