package OperadoresYDemases;

public class EjemploStringMetodos {
    public static void main(String[] args) {




        String nombre = "Henry";
        System.out.println(nombre);
        System.out.println("nombre.lengh()= "+ nombre.length());
        System.out.println("nombre.toUpperCase())" + nombre.toUpperCase());
        System.out.println("nombre.ToLowerCase())" + nombre.toLowerCase());
        System.out.println("nombre.equals(henry))"+ nombre.equals("henry"));
        System.out.println("nombre.equalsIgnoreCase())" + nombre.equalsIgnoreCase("Henry"));
        System.out.println("nombre.compareTo(Henry))" + nombre.compareTo("Henry")); //investigar mejor el compareTo
        System.out.println("nombre.compareToIgnoreCase(Henry))" + nombre.compareToIgnoreCase("Juan"));
        System.out.println("nombre.charAt(0))" + nombre.charAt(0));
        System.out.println("nombre.charAt(0))" + nombre.charAt(1));
        System.out.println("nombre.charAt(0))" + nombre.charAt(2));
        System.out.println("nombre.charAt(0))" + nombre.charAt(3));
        System.out.println("nombre.charAt(nombre.length()-1))"+  nombre.charAt(nombre.length()-1));
        System.out.println("nombre.substring(2))" + nombre.substring(2));
        System.out.println("nombre.substring(2))" + nombre.substring(2, 4));
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace())"+ trabalenguas.replace("a", "."));
        System.out.println("trabalenguas.indexOf())"+ trabalenguas.indexOf("a"));
        System.out.println("trabalenguas.lastIndexOf(a))"+ trabalenguas.lastIndexOf("a"));
        System.out.println("trabalenguas.contains(y))"+ trabalenguas.contains("y"));
        System.out.println("  trabalenguas    ");
        System.out.println("   trabalenguas         ".trim());

    }
}
