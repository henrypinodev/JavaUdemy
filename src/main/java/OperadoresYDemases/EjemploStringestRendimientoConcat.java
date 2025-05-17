package OperadoresYDemases;

public class EjemploStringestRendimientoConcat {
    public static void main(String[] args) {


        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);
        long inicio = System.currentTimeMillis();

        for(int i = 0; i < 10000; i++){
            //c = c.concat(a).concat(b).concat("\n"); // 2 MS // con 1000 iteraciones 6 MS // con 10.000 iteraciones demora 231 ms
           //c+=a+b+"\n"; // 7 ms  // 1000 iteraciones demora 9 ms // con 10000 iteraciones demora 271 ms
            sb.append(a).append(b).append("\n");  // 0 ms  // 1000 iteraciones demora 0 ms // con 10000 demora 1 ms
        }


        long fin = System.currentTimeMillis();
        System.out.println("el tiempo es "+ (fin-inicio));
        System.out.println("c = "+ c);
        System.out.println("sb = "+ sb.toString());

    }
}
