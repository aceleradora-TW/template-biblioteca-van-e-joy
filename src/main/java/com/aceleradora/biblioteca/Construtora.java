package com.aceleradora.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Construtora {

    public static void construtora(){
        List<Livro> livro = new ArrayList<>();

        List<String> autor1 = new ArrayList<>();
        autor1.add("Barbara Liskov");
        Livro livro1 = new Livro("Program development in Java", autor1);

        List<String> autor2 = new ArrayList<>();
        autor2.add("Elisabeth Freeman");
        autor2.add("Kathy Sierra");
        Livro livro2 = new Livro("Use a Cabeça: Padrões de projeto", autor2);

        livro.add(livro1);
        livro.add(livro2);

        System.out.println();
        System.out.println("Bem vinda(o) à biblioteca, onde você encontra os melhores livros de Porto Alegre");
        System.out.println();
        System.out.println("Nossos livros disponíveis para alugar são: ");
        System.out.println();
        System.out.println("Livro 1");
        System.out.println("Título : " + livro1.getTitulo());
        System.out.println("Autoria: " + livro1.getAutores());
        System.out.println();
        System.out.println("Livro 2");
        System.out.println("Título : " + livro2.getTitulo());
        System.out.println("Autoria: " + livro2.getAutores());

        }

}
