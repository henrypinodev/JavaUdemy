package FlujosDeControl;

import javax.swing.*;

public class SentenciaForArreglo {
    public static void main(String[] args) {

        String[] nombres = {"Andres", "Pepe", "Paco", "Lalo", "Maria"};
        int count = nombres.length;
        for (int i =0; i <= count-1; i++){
            if(nombres[i].toLowerCase().contains("ANDRES".toLowerCase()) || nombres[i].toLowerCase().contains("MARIA".toLowerCase()) ){
                continue;
            }
            System.out.println(nombres[i]);

        }
        String buscar = JOptionPane.showInputDialog("Ingrese un nombre");
        System.out.println(" buscar =" + buscar);

        boolean encontrado = false;
        for (int i = 0; i < count; i ++){
            if (nombres[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
            }
        }
         if(encontrado){
            JOptionPane.showMessageDialog(null, buscar + "fue encontrado");
         }else {
             System.out.println("no existe en el sistema");
         }


    }
}
