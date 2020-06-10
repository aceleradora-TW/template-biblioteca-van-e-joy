package com.aceleradora.biblioteca;

import java.util.List;

public class Apresentar {
    /*
    * Imprime na tela o resultado da lista
    * */
    public static void imprimir(List livros){
        System.out.println("___________________________________________________________________________________");
        System.out.println(" Bem vinda(o) à biblioteca, onde você encontra os melhores livros de Porto Alegre  ");
        System.out.println("___________________________________________________________________________________");
        System.out.println();
        System.out.println("Nossos livros disponíveis para alugar são: ");
        System.out.println();
        for (int i =0; i < livros.size(); i++) {
            Livro livro=(Livro)livros.get(i);
            System.out.println("Livro "+(i+1));
            System.out.println("Título : " +livro.getTitulo());
            System.out.println("Autoria: "+livro.getAutores());
            System.out.println();
        }

    }
}
