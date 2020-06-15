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
        Autor autor1 =new Autor("Barbara Liskov");
        Autor autor2 =new Autor("Elisabeth Freeman , Kathy Sierra");
        Livro livro1 = new Livro("Program development in Java", autor1);
        Livro livro2 = new Livro("Use a Cabeça: Padrões de projeto", autor2);

        livros.add(livro1);
        livros.add(livro2);

        Apresentar.imprimir(livros);

        }

}
