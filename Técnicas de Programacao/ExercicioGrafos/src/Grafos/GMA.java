/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafos;

/**
 *
 * @author Alunos
 */
public class GMA {
    //Atributos
    private Integer matriz[][];
    private Object listaVertices[];
    private boolean grafoDirecional;
    private int indexVertice;
    
    //Contrutor
    public GMA(int qtdVertices, boolean grafoDirecional){
        matriz = new Integer[qtdVertices][qtdVertices];
        listaVertices = new Object[qtdVertices];
        this.grafoDirecional = grafoDirecional;
        indexVertice = 0;
    }
    
    //Métodos
    public void adicionarVertices(Object vertice){
        if(indexVertice < listaVertices.length){
            listaVertices[indexVertice] = vertice;
            indexVertice ++;
        }
        else
            System.out.println("Tamanho mãximo atingido");
    }
    
    public void removerVertices(Object vertice){
        int iVertice = buscaVertice(vertice);
        if(iVertice !=1){
            listaVertices[iVertice] = null;  
            for(int iDestino=0; iDestino < matriz.length; iDestino++){ 
                matriz[iVertice][iDestino] = null;
                matriz[iDestino][iVertice] = null;   
            }
        }
    }
    
    public void adicionarAresta(Object origem, Object destino){
        adicionarAresta(origem, destino, 0);
    //Atribui valor zero ao peso
    }
    
    public void adicionarAresta(Object origem, Object destino,int peso){ 
        int iOrigem,iDestino;
        iOrigem = buscaVertice(origem);
        iDestino = buscaVertice(destino);
        
        if(grafoDirecional){
            matriz[iOrigem][iDestino] = peso;
            matriz[iDestino][iOrigem] = peso;
        }
        else{
            matriz[iOrigem][iDestino] = peso;
        }
    }
    
    public int buscaVertice(Object vertice){
        int index = 0;
        for(Object aux:listaVertices){
            if(aux.equals(vertice))
                return index;
            index ++;
        }
        return -1;
    
    }
    
    public void imprimirMatrizAdj(){
    /*Imprime a matriz de adjacencias utilizando sout
    | Vertice |        |        |        |
    |    0    |        |        |        | 
    |    1    |        |        |        | 
    |    2    |        |        |        | 
    */
    }
    
}
