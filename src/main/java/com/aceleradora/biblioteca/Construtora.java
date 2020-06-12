package com.aceleradora.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Construtora {

    public static void construtora(){
        /*
        * Instancia os objetos e adiciona na  lista
        *
        * */
        List<Livro> livros = new ArrayList<>();
        List<String> autor1 = new ArrayList<>();
        autor1.add("Barbara Liskov");
        Livro livro1 = new Livro("Program development in Java", autor1);

        List<String> autor2 = new ArrayList<>();
        autor2.add("Elisabeth Freeman");
        autor2.add("Kathy Sierra");
        Livro livro2 = new Livro("Use a Cabeça: Padrões de projeto", autor2);

        livros.add(livro1);
        livros.add(livro2);

        Apresentar.imprimir(livros);

        }

}
