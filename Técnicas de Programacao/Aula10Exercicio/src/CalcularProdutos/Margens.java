/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CalcularProdutos;

/**
 *
 * @author Alunos
 */
public class Margens {
    /*Atributos*/
    private String nome;
    private String desc;
    private double percentual;
    
    /*Construtor*/    
    public Margens(String nome, String desc,double percentual){
        this.nome = nome;
        this.desc = desc;
        this.percentual = percentual;
    }
    
    /*Métodos Get*/
    public String getNome(){
        return this.nome;
    }
    public String getDesc(){
        return this.desc;
    }
    public double getPercentual(){
        return this.percentual;
    }
    
    /*Métodos Set*/
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setDesc(String desc){
        this.desc = desc;
    }
    public void setPercentual(double valorPercentual){
        this.percentual = valorPercentual;
    }
    
    @Override
    public String toString(){
        return "Margens: " + nome + " (" + desc + ") " + percentual + "%";
    }
}
