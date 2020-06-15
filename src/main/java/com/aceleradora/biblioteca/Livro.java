package com.aceleradora.biblioteca;


public class Livro {
    private String titulo;
    private Autor autores;

    public Livro(String titulo, Autor autores) {
        this.titulo = titulo;
        this.autores = autores;
    }

    public Livro() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutores() {
        return autores;
    }

    public void setAutores(Autor autores) {
        this.autores = autores;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autores=" + autores +
                '}';
    }
}
