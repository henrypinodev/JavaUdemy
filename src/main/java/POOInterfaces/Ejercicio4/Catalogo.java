package POOInterfaces.Ejercicio4;

public class Catalogo {

    public static void main(String[] args) {

        IVehiculo[] vehiculos = new Vehiculo[3];
        IMotorizado[] motorizados = new Motorizado[2];

        vehiculos[0] = new Bus(6000000, 42, "TurBus");
        vehiculos[1] = new Minibus(3000000, 32, "Sextur", tipoServicio.MUNICIPAL);
        vehiculos[2] = new Minibus(290000, 32, "Machali Bus", tipoServicio.TURISMO);

        motorizados[0] = new Auto("Diesel", 2000000, "Mitsubishi", "CX3");
        motorizados[1] = new Moto("Bencina", 10000, "600cc");

        System.out.println("=== VEHICULOS ===");

        for (IVehiculo v : vehiculos) {

            System.out.println("------------------------");
            System.out.println("Tipo: " + v.getClass().getSimpleName());
            System.out.println("Precio base: " + v.obtenerPrecioBase());
            System.out.println("Precio final: " + v.precioFinal());

            if (v instanceof ITransportePasajeros) {
                ITransportePasajeros t = (ITransportePasajeros) v;
                System.out.println("Empresa: " + t.nombreEmpresa());
                System.out.println("Capacidad: " + t.capacidadPasajeros());
            }

            if (v instanceof Minibus) {
                Minibus m = (Minibus) v;
                System.out.println("Tipo servicio: " + m.getTiposervicio());
            }
        }

        System.out.println("\n=== MOTORIZADOS ===");

        for (IMotorizado m : motorizados) {

            System.out.println("------------------------");
            System.out.println(m.obtenertipoMotor());

            // Si además es Vehiculo (porque ahora tienen precio)
            if (m instanceof Vehiculo) {
                Vehiculo v = (Vehiculo) m;
                System.out.println("Precio base: " + v.getPrecioBase());
            }

            // Si es Auto
            if (m instanceof Auto) {
                Auto a = (Auto) m;
                System.out.println("Marca: " + a.getMarca());
                System.out.println("Modelo: " + a.getModelo());
            }

            // Si es Moto
            if (m instanceof Moto) {
                Moto mo = (Moto) m;
                System.out.println("Cilindrada: " + mo.getCilindrada());
            }
        }



    }
}
