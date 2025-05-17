package FlujosDeControl;



public class ejer4 {
    public static void main(String[] args) {
  int i;
  int j;

        for( i = 2; i <=100; i++){
        boolean esprimo = true;
           for(j = 2; j <i; j++){
              if (i % j == 0){
                  /* Aqui compruebo si existe algun residuo en 0 distinto a 1 y a n-1, si existe es porque existen más de 2 divisores
                   caracteristicos de un primo que es divisible en modulo 0 solo por 1 y por si mismo */
                  System.out.println(i + "no es primo");
                  esprimo = false;
              }

           }
           if (esprimo){
               System.out.println("es primo"+ i);
           }

                }
            }
        }



