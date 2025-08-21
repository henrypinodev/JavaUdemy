package Matrices;

public class EjemploMatricesSimetricas {
    public static void main(String[] args) {
        boolean simetrica = true;
        int[][] matriz = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}

        };

        int i, j;
        i = 0;

        /**
        while (i < matriz.length && simetrica == true) {
            j = 0;
            while (j < i && simetrica == true){
                if (matriz[i][j] != matriz[j][i]){
                    simetrica = false;
                }
                j++;
            }
            i++;

        }
         **/

        salir: while (i < matriz.length) {
            j = 0;
            while (j < i && simetrica == true){
                if (matriz[i][j] != matriz[j][i]){
                    simetrica = false;
                    break salir;
                }
                j++;
            }
            i++;

        }
        if (simetrica){
            System.out.println("LA MATRIZ ES SIMETRICA");
        }else {
            System.out.println("la matriz no es simetrica");
        }




    }
}
