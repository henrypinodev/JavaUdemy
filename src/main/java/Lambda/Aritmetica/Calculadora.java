package Lambda.Aritmetica;

import java.util.function.BiFunction;

public class Calculadora {

    public double calculadora(double a, double b, Aritmetica lambda){

        return lambda.operacion(a,b);
    }

    public double operacionBiFuncion (double a, double b, BiFunction<Double, Double, Double> lambda){
        return lambda.apply(a,b);
    }
}
