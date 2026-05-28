package POOInterfacesRepositorio.genericClass;



public class EjemploGenericos {

    public static void main(String[] args) {

        Camion<Animal> transporteCaballos = new Camion<>(5);
        transporteCaballos.add(new Animal("Peregrino", "Caballo"));
        transporteCaballos.add(new Animal("Salvaje", "Caballo"));
        transporteCaballos.add(new Animal("Tunquen", "Caballo"));
        transporteCaballos.add(new Animal("Topocalma", "Caballo"));
        transporteCaballos.add(new Animal("Loncoche", "Caballo"));

        imprimirCamion(transporteCaballos);

        Camion<Maquinaria> transMaquinas = new Camion<>(3);
        transMaquinas.add(new Maquinaria("Bulldozer"));
        transMaquinas.add(new Maquinaria("Grua horquilla"));
        transMaquinas.add(new Maquinaria("Perforadora"));

        imprimirCamion(transMaquinas);

        Camion<Automovil> transAutomovil = new Camion<>(2);
        transAutomovil.add(new Automovil("Mitsubishi"));
        transAutomovil.add(new Automovil("Honda"));

        imprimirCamion(transAutomovil);

    }

    public static <T> void imprimirCamion(Camion<T> camion ){
        for (T a: camion){

            if (a instanceof Animal){
                System.out.println("Nombre: "+ (((Animal)a).getNombre()));
                System.out.println(" Tipo: "+ (((Animal)a).getTipo()));
            }
            else if (a instanceof Maquinaria){
                System.out.println("Tipo: "+ (((Maquinaria)a).getTipo()));
            }
            else if (a instanceof Automovil){
               {
                   System.out.println("Marca: "+ (((Automovil)a).getMarca()));
               }

            }

        }
    }
}
