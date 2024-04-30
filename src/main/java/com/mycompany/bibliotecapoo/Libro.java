package com.mycompany.bibliotecapoo;

public class Libro {
private String titulo;
    private String autor;
    private int anioPublicacion;
    private String genero;
    private boolean leido;

    public Libro(String titulo, String autor, int anioPublicacion, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.genero = genero;
        this.leido = false;
    }

    public String mostrarInformacion() {
        return titulo + " " + autor + " " + anioPublicacion + " " + genero;
    }

    public void marcarLeido() {
        leido = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public boolean isLeido() {
        return leido;
    }
}