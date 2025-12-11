package POOHerencia.Ejercicio3;

public class EjercicioAlmacen {
    public static void main(String[] args) {


       Vendedor vendedorLasCondes = new Vendedor("Mauricio","Pinilla","Masculino",169301549, "61","Local Las Condes");
       Vendedor vendedorFlorida = new Vendedor("Florencia", "mercedez", "Femenino",191739906,"25","Local La Florida");

        System.out.println(vendedorFlorida);
        System.out.println(vendedorLasCondes);
    }
}
