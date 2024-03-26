/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula03;

/**
 *
 * @author Alunos
 */
public class ListaLigada {
    //Atributos
    No primeiroNo;
    No ultimoNo;
    int tamanhoLista;
    
    public ListaLigada()
    {
        tamanhoLista = 0;
        primeiroNo = ultimoNo = null;
        
    }
    public void add(Object elemento)
    {
      // No aux = new No(elemento, null);
      // primeiroNo = ultimoNo = aux;
       No aux = new No(elemento, null);
       if(primeiroNo == null && ultimoNo == null)
       {
           primeiroNo = ultimoNo = aux;
           tamanhoLista ++;
       }
       else 
       {
           ultimoNo.setProximNo
       }
    }
    public Object get(int indice)
    {
        percorreLista(indice);
        return null;
    }   
    private ListaLigada(int indice)
    {
    }
}
