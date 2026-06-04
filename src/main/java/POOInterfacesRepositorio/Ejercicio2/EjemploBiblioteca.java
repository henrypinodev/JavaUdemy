package POOInterfacesRepositorio.Ejercicio2;

public class EjemploBiblioteca {
    public static void main(String[] args) {

        Biblioteca<Novela> novela = new Biblioteca<>();
        Biblioteca<Revista> revista = new Biblioteca<>();
        Biblioteca<Comic> comic = new Biblioteca<>();
        Biblioteca<Enciclopedia> enciclopedia = new Biblioteca<>();

        novela.agregar(new Novela("Mistborn", "Brandon Sanderson", "Ciencia Ficción", 290));
        novela.agregar(new Novela("Frankenstein", "Lulas", "Terror", 160));
        novela.agregar(new Novela("Chupacabras", "Chile30", "Cuentos", 80));


        for(Novela n : novela.getElemento()){
            System.out.println("Titulo: "+n.getTitulo());
            System.out.println("Genero: "+n.getGenero());
            System.out.println("Paginas: "+n.getPaginas());
            System.out.println("Autor: "+n.getAutor());
        }


    }
}
