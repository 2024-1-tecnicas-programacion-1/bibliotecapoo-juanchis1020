package com.mycompany.bibliotecapoo;

import java.util.LinkedList;

public class Biblioteca {

    private LinkedList<Libro> libros;

    public Biblioteca() {
        this.libros = new LinkedList<>();
    }

    public void registrarLibro(Libro libroNuevo) {
        libros.add(libroNuevo);
    }

    public void buscarLibro(String palabraBusqueda) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(palabraBusqueda) || libro.getAutor().equalsIgnoreCase(palabraBusqueda) || libro.getGenero().equalsIgnoreCase(palabraBusqueda)) {
                System.out.println(libro.mostrarInformacion());
            }
        }
    }

    public void mostrarLibros() {
        for (Libro libro : libros) {
            System.out.println(libro.mostrarInformacion());
        }
    }

    public void mostrarLibrosNoLeidos() {
        boolean hayLibrosNoLeidos = false;
        for (Libro libro : libros) {
            if (!libro.isLeido()) {
                if (!hayLibrosNoLeidos) {
                    System.out.println("Libros no leídos en la biblioteca:");
                    hayLibrosNoLeidos = true;
                }
                System.out.println(libro.mostrarInformacion());
            }
        }
    }

    public void marcarLibroNoLeido(String tituloLibro) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(tituloLibro)) {
                libro.marcarLeido();
                return;
            }
        }
    }
}
