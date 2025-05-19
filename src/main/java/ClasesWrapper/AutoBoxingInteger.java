package ClasesWrapper;

public class AutoBoxingInteger {
    public static void main(String[] args) {

        Integer[] enteros = {1,2,3,4,5,6,7,8,9,10};
        int cont = 0;
        int suma = 0;
        int resta = 0;
        // --------------------AUTOBOXING--------------
        for(Integer i: enteros){
            if (i.intValue() % 2 == 0){
                System.out.println("par: "+i);
                cont++;
                suma = suma + i.intValue();
                //suma += i.intValue(); lo mismo
            }else{
                System.out.println("Impar: "+i);
                resta++;
            }
        }

        System.out.println("el numero total de numeros pares es: "+ cont);
        System.out.println("valor de suma: "+suma);

//---------------- UNBOXING --------------
        for(Integer i: enteros){
            if (i % 2 == 0){
                System.out.println("par: "+i);
                cont++;
                suma = suma + i;
                //suma += i.intValue(); lo mismo
            }else{
                System.out.println("Impar: "+i);
                resta++;
            }
        }


    }
}
