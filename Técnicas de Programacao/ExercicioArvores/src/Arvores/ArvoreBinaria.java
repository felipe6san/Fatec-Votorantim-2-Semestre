/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arvores;

/**
 *
 * @author Alunos
 */
public class ArvoreBinaria {
    private NoDuploArvore raiz;
    
    public ArvoreBinaria(Object info){
        raiz = new NoDuploArvore(info, null, null);
    }
    
    public void AddNoOrdenado(int valor, NoDuploArvore no){
        if(valor < (int)no.getInfo()){
            if(no.getEsquerdaNo() != null){
                no.setEsquerdaNo(new NoDuploArvore(valor, null, null));
            }
           else{
            AddNoOrdenado(valor, no.getEsquerdaNo());
        }
        }
        else{
            if(no.getDireitaNo() != null) {
                no.setDireitaNo(new NoDuploArvore(valor, null, null));
        }   else{
            AddNoOrdenado(valor, no.getDireitaNo());
        }
    }
    
}
