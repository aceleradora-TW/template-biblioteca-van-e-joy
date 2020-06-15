package com.aceleradora.biblioteca;

import java.util.List;


public class Apresentar {
    /*
    * Imprime na tela o resultado da lista
    * */
    public static void imprimir(List<Livro> livros){
        System.out.println("___________________________________________________________________________________");
        System.out.println(" Bem vinda(o) à biblioteca, onde você encontra os melhores livros de Porto Alegre  ");
        System.out.println("___________________________________________________________________________________");
        System.out.println();
        System.out.println("Nossos livros disponíveis para alugar são: ");
        System.out.println();
        livros.forEach(livro->{
            System.out.println("Título : " +livro.getTitulo());
            System.out.println("Autoria: " + livro.getAutores().nome);
            System.out.println();
        });
    }
}
