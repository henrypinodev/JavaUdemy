package POOAbstractas;

import POOAbstractas.Select.Opcion;
import POOAbstractas.validador.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploForm {

    public static void main(String[] args) {

        InputForm username = new InputForm("Username");
        username.addValidador(new RequeridoValidador());
        InputForm password = new InputForm("clave", "password");
        password.addValidador(new RequeridoValidador());
        password.addValidador(new LargoValidador(6,12));
        InputForm email = new InputForm("email", "email");
        email.addValidador(new RequeridoValidador());
        email.addValidador(new EmailValidador());
        InputForm edad = new InputForm("edad", "number");
        edad.addValidador(new NumeroValidador());

        TextAreaForm experiencia = new TextAreaForm("exp",5,9);

        SelectForm lenguaje = new SelectForm("Lenguaje");
        lenguaje.addValidador(new NoNull());
        Opcion java = new Opcion("1","Java");
        lenguaje.add(java)
                .add(new Opcion("2","Python"))
                .add(new Opcion("3", "Javascript"))
                .add(new Opcion("4","Ruby"))
                .add(new Opcion("5","PHP"));

        ElementoForm saludar = new ElementoForm("Saludo") {
            @Override
            public String dibujarHtml() {
                return "<input disabled name='"+this.nombre+"' value=\""+ this.valor+ "\">";
            }
            };



        saludar.setValor("esto es un campo deshabilitado");
        username.setValor("john.doe");
        password.setValor("asdasd");
        email.setValor("john@correus.cl");
        edad.setValor("22");
        experiencia.setValor("más de dos años de experiencia en el area de desarrollo");
        java.setSelected(true);

       List<ElementoForm> elementos = Arrays.asList(username,password,email,edad,experiencia,lenguaje,saludar);
       /*elementos.add(username);
       elementos.add(password);

       elementos.add(email);
       elementos.add(edad);
       elementos.add(experiencia);
       elementos.add(lenguaje);
        */
       for (ElementoForm e: elementos){
           System.out.println(e.dibujarHtml());
           System.out.println("<br>");
       }

       //LAMBDA
       elementos.forEach(e ->{
           if (!e.esValido()){
               e.getErrores().forEach(err -> System.out.println(err));
           }
       });







    }
}
