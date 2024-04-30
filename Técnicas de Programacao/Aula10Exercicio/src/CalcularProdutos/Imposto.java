/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CalcularProdutos;

/**
 *
 * @author Alunos
 */
public class Imposto {
    /*Atributos*/
    private String nome;
    private String desc;
    private double valorPercentual;
    
    /*Construtor*/
    public Imposto(String nome, String desc, double valorPercentual){
        this.nome = nome;
        this.desc = desc;
        this.valorPercentual = valorPercentual;
    }
    
    /*Métodos Get*/
    public String getNome(){
        return this.nome;
    }
    public String getDesc(){
        return this.desc;
    }
    public double getValorPercentual(){
        return this.valorPercentual;
    }
    
    /*Métodos Set*/
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setDesc(String desc){
        this.desc = desc;
    }
    public void setValorPercentual(double valorPercentual){
        this.valorPercentual = valorPercentual;
    }
    
    @Override
    public String toString(){
        return "Imposto: " + nome + " (" + desc + ") " + valorPercentual * 100 + "%";
    }
    
}
