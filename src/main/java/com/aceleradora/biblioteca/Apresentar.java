package com.aceleradora.biblioteca;

public class Apresentar {
    public static void imprimir(Livro livro1, Livro livro2){
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
