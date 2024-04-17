package co.edu.uniquindio.poo;
import java.util.List;

public class BibliotecaFacade {
    private BuscadorLibros buscador;


    public BibliotecaFacade(BuscadorLibros buscador) {
        this.buscador = buscador;
    }

    public List<Libro> buscarPorTitulo(String titulo) {
        return buscador.buscarPorTitulo(titulo);
    }

    public List<Libro> buscarPorAutor(String autor) {
        return buscador.buscarPorAutor(autor);
    }

    public List<Libro> buscarPorCategoria(String categoria) {
        return buscador.buscarPorCategoria(categoria);
    }

    public BibliotecaFacade(List<Libro>libros){
        buscador= new BuscadorLibros(libros);
    }
}

