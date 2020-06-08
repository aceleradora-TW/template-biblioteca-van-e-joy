package com.aceleradora.biblioteca;

import java.util.List;

public class Livro {
    private String titulo;
    private List<String> autores;

    public Livro(String titulo, List<String> autores) {
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

    public List<String> getAutores() {
        return autores;
    }

    public void setAutores(List<String> autores) {
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
