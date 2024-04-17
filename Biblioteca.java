package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
        public static void main(String[] args) {
            List<Libro> libros = new ArrayList<>();
            libros.add(new Libro("El señor de las moscas", "William Golding", "Novela"));
            libros.add(new Libro("1984", "George Orwell", "Novela"));
            libros.add(new Libro("Fahrenheit 451", "Ray Bradbury", "Novela"));
            libros.add(new Libro("El gran Gatsby", "F. Scott Fitzgerald", "Novela"));
    
            BuscadorLibros buscador = new BuscadorLibros(libros);
            BibliotecaFacade facade = new BibliotecaFacade(buscador);
            List<Libro> librosEncontrados= new ArrayList<>();

            System.out.println("\nBúsqueda por título:");
            librosEncontrados = facade.buscarPorTitulo("Fahrenheit");
            for (Libro libro : librosEncontrados) {
                System.out.println(libro);
            }

            System.out.println("\nBúsqueda por autor:");
            librosEncontrados = facade.buscarPorAutor("Orwell");
            for (Libro libro : librosEncontrados) {
                System.out.println(libro);
            }

            System.out.println("\nBúsqueda por categoría:");
            librosEncontrados = facade.buscarPorCategoria("Novela");
            for (Libro libro : librosEncontrados) {
                System.out.println(libro);
            }
        }
    }
    