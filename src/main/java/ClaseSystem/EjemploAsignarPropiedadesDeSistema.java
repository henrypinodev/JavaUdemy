package ClaseSystem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class EjemploAsignarPropiedadesDeSistema {
    public static void main(String[] args) {

        try {

            FileInputStream archivo = new FileInputStream("src/main/java/ClaseSystem/config.properties");
            Properties p = new Properties(System.getProperties());
            p.load(archivo);
        }catch (Exception e){
            System.err.println("No se pudo encontrar el archivo"+e);
        }
    }
}
