package ValorYReferencia;
class Persona{
    private String nombre;
    public void modificarNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }
    public String leerNombre() {
        return this.nombre;
    }


        }


public class PasarPorReferencia2 {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.modificarNombre("juan");
        System.out.println(persona.leerNombre());

        System.out.println("iniciamos el metodo main");
        System.out.println("Persona: "+ persona);
        System.out.println("Antes de llamar al metodo test");
        test(persona);
        System.out.println("despues de llamar al metodo test");

        System.out.println("Finaliza el metodo main");
    }

    public static void test(Persona persona){
        System.out.println("iniciamos el metodo test: ");
        persona.modificarNombre("pedro");

        System.out.println("iniciamos otra vez i: "+persona.leerNombre());

    }
}
