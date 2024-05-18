/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arvores;
 
/**
 *
 * @author feh
 */
public class ArvoreBinaria {
    //Atributos
    private NoDuploArvore raiz;
    public ArvoreBinaria(Object info) {
        raiz = new NoDuploArvore(info, null, null);
    }
    public int buscar(int valor) {
        return buscar(valor, raiz, 0);
    }
    private int buscar(int valor, NoDuploArvore no, int profundidade) {
        int resposta = -1;
        if((int)no.getInfo() == valor) {
            return profundidade;
        }
        else {
            //verifica se o nó da esquerda ou da direita não é nulo
            //se nao for nulo busca nesses nós
            if(valor < (int)no.getInfo() && no.getEsquerdaNo() != null) {
                resposta = buscar(valor, no.getEsquerdaNo(), profundidade++);
            }
            else if(no.getDireitaNo() != null) {
                resposta = buscar(valor, no.getDireitaNo(), profundidade++);
            }
            return resposta;
        }
    }
    public void addNoOrdenado(int valor) {
        addNoOrdenado(valor, raiz);
    }
    private void addNoOrdenado(int valor, NoDuploArvore no) {
        //se valor for menor que o valor do nó adiciona a esquerda
        //se nao adiciona a direita
        if (valor < (int)raiz.getInfo()) {
            if(no.getEsquerdaNo() == null) {
                no.setEsquerdaNo(new NoDuploArvore(valor, null, null));
            } else {
                addNoOrdenado(valor, no.getEsquerdaNo());
            }
        } 
        else {
            if(no.getDireitaNo() == null) {
                no.setDireitaNo(new NoDuploArvore(valor, null, null));
            } else {
                addNoOrdenado(valor, no.getDireitaNo());
            }
        }
    }
    
    public void imprimirPreOrdem() {
        imprimirPreOrdem(raiz);
    }
    
    private void imprimirPreOrdem(NoDuploArvore no) {
        System.out.println("No: " + no.getInfo());
        if(no.getEsquerdaNo() != null)
            imprimirPreOrdem(no.getEsquerdaNo());
        if(no.getDireitaNo() != null)
            imprimirPreOrdem(no.getDireitaNo());
    }
    
    public void imprimirEmOrdem() {
        imprimirEmOrdem(raiz);
    }
    
    private void imprimirEmOrdem(NoDuploArvore no) {
    
        if(no.getEsquerdaNo() != null)
            imprimirEmOrdem(no.getEsquerdaNo());
        System.out.println("No: " + no.getInfo());
        if(no.getDireitaNo() != null)
            imprimirEmOrdem(no.getDireitaNo());
    } 
    
    
    public void imprimirPosOrdem() {
        imprimirPosOrdem(raiz);
    }
    
    private void imprimirPosOrdem(NoDuploArvore no) {
        
        if(no.getEsquerdaNo() != null)
            imprimirPosOrdem(no.getEsquerdaNo());
        
        if(no.getDireitaNo() != null)
            imprimirPosOrdem(no.getDireitaNo());
        System.out.println("No: " + no.getInfo());
    }
}