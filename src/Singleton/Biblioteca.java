package Singleton;

import java.util.ArrayList;

public class Biblioteca {
    private static Biblioteca instancia;
    private ArrayList<Libro> libros;

    // Constructor privado para Singleton
    private Biblioteca() {
        libros = new ArrayList<>();
    }

    public static Biblioteca getInstancia() {
        if (instancia == null) {
            instancia = new Biblioteca();
        }
        return instancia;
    }

    public void agregarLibro(String titulo, String autor, String editora) {
        libros.add(new Libro(titulo, autor, editora)); // usa constructor con parámetros
    }

    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
        } else {
            System.out.println("Lista de libros:");
            for (Libro libro : libros) {
                System.out.println("Título: " + libro.getTitulo() +
                        ", Autor: " + libro.getAutor() +
                        ", Editora: " + libro.getEditora());
            }
        }
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }
}