/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 package PilhaVetor;
/**
 *
 * @author Alunos
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PilhaVetor pilhaA = new PilhaVetor(8);
        pilhaA.empilhar("A");
        pilhaA.empilhar("B");
        pilhaA.empilhar("C");
        pilhaA.empilhar("D");
        pilhaA.empilhar("E");
        pilhaA.empilhar("F");
        pilhaA.empilhar("G");
        pilhaA.empilhar("H");
        System.out.println("Pilha Cheia " + pilhaA.verificaPilhaCheia());
        System.out.println("Desempilhar: " + pilhaA.desempilhar());
        System.out.println("Desempilhar: " + pilhaA.desempilhar());
        System.out.println("Desempilhar: " + pilhaA.desempilhar());
        System.out.println("Desempilhar: " + pilhaA.desempilhar());
        System.out.println("Pilha Cheia " + pilhaA.verificaPilhaCheia());
        System.out.println("Desempilhar: " + pilhaA.desempilhar());
        System.out.println("Desempilhar: " + pilhaA.desempilhar());
        System.out.println("Pilha Vazia " + pilhaA.verificaPilhaVazia());
        System.out.println("Desempilhar: " + pilhaA.desempilhar());
        System.out.println("Desempilhar: " + pilhaA.desempilhar());
        System.out.println("Pilha Vazia " + pilhaA.verificaPilhaVazia());
    }
    
}
