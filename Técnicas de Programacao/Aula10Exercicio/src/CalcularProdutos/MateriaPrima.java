/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CalcularProdutos;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Alunos
 */
public class MateriaPrima {
    /*Atributos*/
    private String nome;
    private String desc;
    private float valorCompra;
    List impostosMatPrima;

    /*Construtor*/
    public MateriaPrima(String nome, String desc, float valorCompra){
        this.nome = nome;
        this.desc = desc;
        this.valorCompra = valorCompra;
    }
    
    public MateriaPrima(String nome, String desc, float valorCompra,List impostosMatPrima){
        this.nome = nome;
        this.desc = desc;
        this.valorCompra = valorCompra;
        this.impostosMatPrima = new ArrayList();
    }
    
    /*Adicionar Imposto*/
    public void addImposto(Imposto var){
        impostosMatPrima.add(var);
    }
    
    /*Remover Imposto*/
    public boolean removerImposto(Imposto var){
        return impostosMatPrima.remove(var);
    }
    
    /*Métodos Get*/
    public String getNome(){
        return this.nome;
    }
    public String getDesc(){
        return this.desc;
    }
    public double getValorCompra(){
        return this.valorCompra;
    }
    public List getImpostos(){
        return this.impostosMatPrima;
    }
    
    /*Métodos Set*/
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setDesc(String desc){
        this.desc = desc;
    }
    public void setValorCompra(float valorCompra){
        this.valorCompra = valorCompra;
    }
    
    @Override
    public String toString(){
        return "Materia Prima: " + nome + " (" + desc + ") " + valorCompra + "R$";
    }
}
