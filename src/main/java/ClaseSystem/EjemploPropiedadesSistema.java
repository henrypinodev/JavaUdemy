package ClaseSystem;

import java.util.Properties;

public class EjemploPropiedadesSistema {
    public static void main(String[] args) {

        String username = System.getProperty("user.name");
        String home = System.getProperty("user.home");
        String workspace = System.getProperty("user.dir");
        String java = System.getProperty("java.version");

        System.out.println("username: "+username);
        System.out.println("Home: "+ home);
        System.out.println("Workspace: "+ workspace);
        System.out.println("Java version:"+ java);

        Properties p = System.getProperties();
        p.list(System.out);






    }
}
