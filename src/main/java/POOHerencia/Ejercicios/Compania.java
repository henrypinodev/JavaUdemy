package POOHerencia.Ejercicios;

/*
 Una compañía maneja empleados y clientes, entre los empleados hay gerentes que manejan presupuesto para su área (modificable) y a todos
 los empleados se les puede aumentar el sueldo, se pide una jerarquía de clase de los tipos de persona mencionados, tomando como base la figura del diagrama UML de clases.

Para todas las clases de la jerarquía tenga en cuenta los métodos getter, un constructor y el toString() con sobre-escritura, para Gerente además el método setter de presupuesto.

También incluir una clase main con algún ejemplo de un Gerente e imprimir todos sus datos (y heredados) vía toString().
*/
public class Compania {
    public static void main(String[] args) {

    Empleado empleado1 = new Empleado("Empleado Marcelo","Pino", "556","Chile",200.000,1);
    Cliente cliente1 = new Cliente("Cliente Pedro", "pascal", "11441","calle baviera");
    Gerente gerente1 = new Gerente("Gerente jose", "ffs", "11111", "Chile", 700.000,2);

    gerente1.setPresupuesto(400.000);


        System.out.println(empleado1.toString());
        System.out.println(cliente1.toString());
        System.out.println(gerente1.toString()+"\tY su presupuesto para gastos es: "+gerente1.getPresupuesto());
        System.out.println("---AUMENTO DE REMUNERACIÓN----");
        empleado1.aumentarremuneracion(15);
        gerente1.aumentarremuneracion(50);
        System.out.println(empleado1.toString());
        System.out.println(gerente1.toString());



    }
}
