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
            System.out.println("-------// Novelas //-----------");
            System.out.println("Titulo: "+n.getTitulo());
            System.out.println("Genero: "+n.getGenero());
            System.out.println("Paginas: "+n.getPaginas());
            System.out.println("Autor: "+n.getAutor());

        }

        revista.agregar(new Revista("Telegrama", "Chile", 9,"Entretenimiento"));
        revista.agregar(new Revista("Magazine koniko", "Japan", 16, "Entretenimiento"));
        revista.agregar(new Revista("Autos chile", "ChileFilms",6,"Carreras"));

        for (Revista r : revista.getElemento()){
            System.out.println("-------// Revistas //-----------");
            System.out.println("Titulo: "+r.getTitulo());
            System.out.println("Autor: "+r.getAutor());
            System.out.println("Numero de edición: "+r.getNumeroEdicion());
            System.out.println("Categoria: "+r.getCategoria());
        }

        comic.agregar(new Comic("Amazing Spiderman", "Marvel", "Stan lee","Heroes"));
        comic.agregar(new Comic("Wolverine","Marvel", "Stan lee", "Hombres X"));
        comic.agregar(new Comic("Hulk", "Hombre verde", "Stam lee", "Hombres X"));

        for (Comic c : comic.getElemento()){
            System.out.println("-------// Comics //-----------");
            System.out.println("Titulo:"+ c.getTitulo());
            System.out.println("Autor"+ c.getAutor());
            System.out.println("Ilustrador: "+c.getIlustrador());
            System.out.println("Universo: "+c.getUniverso());
        }

        enciclopedia.agregar(new Enciclopedia("Atlas mundial","Ercilla", "Mapas del mundo", 2));
        enciclopedia.agregar(new Enciclopedia("Mares del mundo", "Ercilla", "Oceanos",1));
        enciclopedia.agregar(new Enciclopedia("Volcanes", "Ercilla", "Vulcanologia", 3));

        for (Enciclopedia e : enciclopedia.getElemento()){
            System.out.println("-------// Enciclopedias //-----------");
            System.out.println("Titulo: "+ e.getTitulo());
            System.out.println("Autor: "+e.getAutor());
            System.out.println("Tema: "+e.getTema());
            System.out.println("Volumen: "+e.getVolumen());
        }




    }
}
