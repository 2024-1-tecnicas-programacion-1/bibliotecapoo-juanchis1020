package com.mycompany.bibliotecapoo;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner Scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("----- Menú -----");
            System.out.println("1. Ingresar un nuevo libro");
            System.out.println("2. Mostrar todos los libros");
            System.out.println("3. Buscar un libro");
            System.out.println("4. Marcar un libro como no leído");
            System.out.println("5. Mostrar libros no leídos");
            opcion = Scanner.nextInt();
            Scanner.nextLine(); // Limpiar el buffer después de nextInt()

            switch (opcion) {
                case 1:
                    ingresarLibro(biblioteca, Scanner);
                    break;
                case 2:
                    biblioteca.mostrarLibros();
                    break;
                case 3:
                    buscarLibro(biblioteca, Scanner);
                    break;
                case 4:
                    marcarLibroNoLeido(biblioteca, Scanner);
                    break;
                case 5:
                    biblioteca.mostrarLibrosNoLeidos();
                    break;
            }
        } while (opcion != 6);

        Scanner.close(); 
    }

    public static void ingresarLibro(Biblioteca biblioteca, Scanner scanner) {
        System.out.println("Ingrese el título del libro:");
        String titulo = scanner.nextLine();
        System.out.println("Ingrese el autor del libro:");
        String autor = scanner.nextLine();
        System.out.println("Ingrese el año de publicación del libro:");
        int anioPublicacion = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Ingrese el género del libro:");
        String genero = scanner.nextLine();

        Libro nuevoLibro = new Libro(titulo, autor, anioPublicacion, genero);
        biblioteca.registrarLibro(nuevoLibro);
        System.out.println("El libro ha sido ingresado correctamente.");
    }

    public static void buscarLibro(Biblioteca biblioteca, Scanner scanner) {
        System.out.println("Ingrese el título, autor o género del libro a buscar:");
        String palabraBusqueda = scanner.nextLine();
        biblioteca.buscarLibro(palabraBusqueda);
    }

    public static void marcarLibroNoLeido(Biblioteca biblioteca, Scanner scanner) {
        System.out.println("Ingrese el título del libro que desea marcar como no leído:");
        String tituloLibro = scanner.nextLine();
        biblioteca.marcarLibroNoLeido(tituloLibro);
    }
}
