package OperadoresYDemases;

import javax.swing.*;

public class NombreMásLargo {
    public static void main(String[] args) {

        String Persona1 = JOptionPane.showInputDialog("Ingrese el nombre y el apellido");
        String Persona2 = JOptionPane.showInputDialog("Ingrese el nombre y el apellido");
        String Persona3 = JOptionPane.showInputDialog("Ingrese el nombre y el apellido");

        String nombre1 = Persona1.split(" ")[0];
        String nombre2 = Persona2.split(" ")[0];
        String nombre3 = Persona3.split(" ")[0];

        String nombreMáslargo;

        nombreMáslargo = (nombre1.length()> nombre2.length()? nombre1: nombre2);
        nombreMáslargo = (nombreMáslargo.length() > nombre3.length()? nombreMáslargo:nombre3);

       JOptionPane.showMessageDialog(null,"El nombre más largo es" + nombreMáslargo);



    }
}
