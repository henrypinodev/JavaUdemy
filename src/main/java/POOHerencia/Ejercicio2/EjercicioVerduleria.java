package POOHerencia.Ejercicio2;

public class EjercicioVerduleria {

    public static void main(String[] args) {

            Producto[] producto = new Producto[8];

        Lacteo yogurt = new Lacteo("Yogurt",200.0,2,30);
        Lacteo leche = new Lacteo("Leche", 900.0,1,60);
        Fruta manzana = new Fruta("Manzana fuji",50.0,15.5,"Roja");
        Fruta mandarina = new Fruta("Mandarina tripode", 150.0,25.5, "Anaranjado");
        Limpieza detergente = new Limpieza("Omo matic", 1250.0,"Aromatizante", 10);
        Limpieza mantequilla = new Limpieza("Mantequilla soprole", 1650.0,"Leche pasteurizada", 1);
        NoPerecible noPerecible1 = new NoPerecible("Fideos", 650.0, 450,550);
        NoPerecible noPerecible2 = new NoPerecible("Porotos", 990.0,1,800);
        producto[0] = yogurt;
        producto[1] = leche;
        producto[2] = manzana;
        producto[3] = mandarina;
        producto[4] = detergente;
        producto[5] = mantequilla;
        producto[6] = noPerecible1;
        producto[7] = noPerecible2;

        for (int i = 0; i < producto.length; i++){
            System.out.println(producto[i]);
        }








    }
}

/* PROPUESTA PROFESOR
* Producto[] productos = new Producto[8];
        productos[0] = new Fruta(1200.00, "roja", "manzana fuji", 2500d);
        productos[1] = new Fruta(1000.00, "verdes", "ubas", 3500d);
        productos[2] = new Limpieza("lavaloza", 1.2, "Quix", 2290);
        productos[3] = new Limpieza("Desinfectante Lavanda", 0.9, "Lysol", 1330);
        productos[4] = new Lacteo(1000, 32, "Leche Sabor Chocolate Semidescremada", 1150);
        productos[5] = new Lacteo(1000, 37, "Yoghurt Batido Sabor Frutilla Bolsa", 1190);
        productos[6] = new NoPerecible(170, 95, "Atún Lomitos en Agua Angelmo", 960);
        productos[7] = new NoPerecible(1000, 3536, "Porotos Hallado Bolsa", 1990);

        for (Producto prod : productos) {
            System.out.println("-------------------------------- " + prod.getClass().getSimpleName() + "---------------------------------");
            System.out.println("Nombre: " + prod.getNombre());
            System.out.println("Precio: " + prod.getPrecio());

            if (prod instanceof Fruta) {
                System.out.println("Peso (gr): " + ((Fruta) prod).getPeso());
                System.out.println("Color: " + ((Fruta) prod).getColor());
            } else if (prod instanceof Limpieza) {
                System.out.println("Componentes: " + ((Limpieza) prod).getComponentes());
                System.out.println("Litros: " + ((Limpieza) prod).getLitros());
            } else if (prod instanceof Lacteo) {
                System.out.println("Cantidad (gr/cc): " + ((Lacteo) prod).getCantidad());
                System.out.println("Proteinas (gr): " + ((Lacteo) prod).getProteinas());
            } else if (prod instanceof NoPerecible) {
                System.out.println("Calorias (kCal): " + ((NoPerecible) prod).getCalorias());
                System.out.println("Contenido neto (gr): " + ((NoPerecible) prod).getContenido());
*
*
* */



