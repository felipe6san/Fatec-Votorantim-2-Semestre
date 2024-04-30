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
public class Controlador {
    public static void main(String[] args) {
        
        //criar impostos
        Imposto icms = new Imposto("ICMS", "Imposto de ICMS", 0.08);
        Imposto confins = new Imposto("COFINS", "Imposto de COFINS", 0.02);
        List <Imposto> impostos = new ArrayList();
        impostos.add(icms);
        impostos.add(confins);
        
        //Criar MateriaPrima
        MateriaPrima madeira = new MateriaPrima("Madeira", "Madeira de Carvalho", 20, impostos);
        MateriaPrima aco = new MateriaPrima("Aco", "Placa de Aco", 10);
        List <MateriaPrima> materiaPrima = new ArrayList();
        materiaPrima.add(aco);
        materiaPrima.add(madeira);
        
        //Criar Margens
        List <Margens> margemLucro = new ArrayList();
        Margens Lucro = new Margens("Lucro","Margens de Lucro",10.0);
        margemLucro.add(Lucro);
       
        //Criar
        Produto Faca = new Produto(1,"Faca","Faca Tramontina",impostos,materiaPrima,margemLucro,10);
        System.out.println("Id: " + Faca.getNome() + Faca.getImpostos() + Faca.getMateriaPrima() + Faca.getMargens());
        
    }
}