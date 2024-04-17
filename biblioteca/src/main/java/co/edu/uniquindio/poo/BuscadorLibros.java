package co.edu.uniquindio.poo;
import java.util.ArrayList;
import java.util.List;

public class BuscadorLibros {
    private List<Libro> libros;

    public BuscadorLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public List<Libro> buscarPorTitulo(String titulo) {
        List<Libro> librosEncontrados = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getTitulo().toLowerCase().contains(titulo.toLowerCase())) {
                librosEncontrados.add(libro);
            }
        }
        return librosEncontrados;
    }
    
    public List<Libro> buscarPorAutor(String autor) {
        List<Libro> librosEncontrados = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getAutor().toLowerCase().contains(autor.toLowerCase())) {
                librosEncontrados.add(libro);
            }
        }
        return librosEncontrados;
    }

    public List<Libro> buscarPorCategoria(String categoria) {
        List<Libro> librosEncontrados = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getCategoria().toLowerCase().contains(categoria.toLowerCase())) {
                librosEncontrados.add(libro);
            }
        }
        return librosEncontrados;
    }
}
