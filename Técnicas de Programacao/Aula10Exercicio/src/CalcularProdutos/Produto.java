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
public class Produto {
    /*Atributos*/
    private int ID;
    private String nome;
    private String desc;
    private List impostos = new ArrayList();
    private List matPrima = new ArrayList();
    private List margens = new ArrayList();
    private float valorVenda;
    
    /*Construtores*/
    public Produto(int ID, String nome){
        this.ID = ID;
        this.nome = nome;
    }
    
    public Produto(int ID, String nome, String desc,float valorVenda ){
        this.ID = ID;
        this.nome = nome;
        this.desc = desc;
        this.valorVenda = valorVenda;
    }
    
    public Produto(int ID, String nome, String desc,List impostos,List matPrima,List margens,float valorVenda ){
        this.ID = ID;
        this.nome = nome;
        this.desc = desc;
        this.impostos = impostos;
        this.matPrima = matPrima;
        this.margens = margens;
        this.valorVenda = valorVenda;
    }
    
     /*Adicionar Imposto*/
    public void addImposto(Imposto var){
        impostos.add(var);
    }
    
    /*Remover Imposto*/
    public boolean removerImposto(Imposto var){
        return impostos.remove(var);
    }
    
      /*Adicionar Matéria Prima*/
    public void addMateriaPrima(MateriaPrima var){
        impostos.add(var);
    }
    
    /*Remover Matéria Prima*/
    public boolean removerMateriaPrima(MateriaPrima var){
        return impostos.remove(var);
    }
    
     /*Métodos Get*/
    public int getID(){
        return this.ID;
    }
    public String getNome(){
        return this.nome;
    }
    public String getDesc(){
        return this.desc;
    }
    public List getImpostos(){
        return this.impostos;
    }
    public List getMateriaPrima(){
        return this.matPrima;
    }
    public List getMargens(){
        return this.margens;
    }
    
    @Override
    public String toString(){
        return "Produto: " + nome + " ID: "+ ID + " (" + desc + ") " + valorVenda + "R$";
    }
}
