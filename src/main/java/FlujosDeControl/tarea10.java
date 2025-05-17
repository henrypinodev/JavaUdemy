package FlujosDeControl;



import javax.swing.*;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class tarea10 {
    public static void main(String[] args) {

        int opcionIndice = 0;
        do {

// los Map (o mapas) los veremos mas adelante en el curso en profundidad
// pero son como un arreglo asociativo, asocia un nombre (o indice) a un valor
// también se les conoce como diccionarios para almacenar datos en base a un nombre.
            Map<String, Integer> opciones = new HashMap();
            opciones.put("Actualizar", 1);
            opciones.put("Eliminar", 2);
            opciones.put("Agregar", 3);
            opciones.put("Listar", 4);
            opciones.put("Salir", 5);

            Object[] opArreglo = opciones.keySet().toArray();

            Object opcion = JOptionPane.showInputDialog(null,
                    "Seleccione un Opción",
                    "Mantenedor de Productos",
                    JOptionPane.INFORMATION_MESSAGE, null, opArreglo, opArreglo[0]);

            if (opcion == null) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar una operación");
            } else {
                opcionIndice = opciones.get(opcion.toString());

                // aca un if o switch para las distintas opciones.

                switch (opcionIndice) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "USUARIOS ACTUALIZADOS");
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "USUARIOS ELIMINADOS");
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "USUARIOS AGREGADOS");
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "usuarios a listar");
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "salir");
                        break;
                }
            }



        }while (opcionIndice != 5) ;


    }




}
