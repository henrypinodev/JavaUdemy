package POOExcepciones;

public class Calculadora {

    public double dividir (int numerador, int divisor) throws DivisionporCeroException {
        if (divisor == 0){
            throw new DivisionporCeroException("No se puede dividir por 0");
        }
        return numerador/(double)divisor;
    }

    public double dividir (String numerador, String divisor) throws DivisionporCeroException, FormatoNumeroExcepcion{
        try {
            int num = Integer.parseInt(numerador);
            int div = Integer.parseInt(divisor);
            return this.dividir(num,div);
        }catch (NumberFormatException nfe){
            throw new FormatoNumeroExcepcion("Debe ingresar un numero en el numerador y divisor");
        }

    }


}
