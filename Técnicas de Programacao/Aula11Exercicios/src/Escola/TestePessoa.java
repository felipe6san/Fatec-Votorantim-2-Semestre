package Escola;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

/**
 *
 * @author Alunos
 */
public class TestePessoa {
    
    public static void main(String[] args) {
        Funcionario andre = new Funcionario("Andre", 22, Genero.MASCULINO.toString());
        System.out.println("Nome: " + andre.getNome() + " Genero: " + andre.getGenero());
        
        Aluno aluno1 = new Fundamental("Pedro", 12, Genero.MASCULINO.toString(),8);
        System.out.println("Nome: " + aluno1.getNome() + " Genero: " + aluno1.getGenero() + " Nota: " + aluno1.getNota());
        
        
        Aluno aluno2 = new Colegial("Pedro", 22, Genero.MASCULINO.toString(),10);
        System.out.println("Nome: " + aluno2.getNome() + " Genero: " + aluno2.getGenero() + " Nota: " + aluno2.getNota());
    }
    
}
