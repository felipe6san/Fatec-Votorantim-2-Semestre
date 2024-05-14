/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Balanceamento;
/**
 *
 * @author Alunos
 */
public class PilhaVetor {
    
    //Atributos da Classe
    int registraTopo;
    String[] vetorPilha;
    
    //Contrutores da Classe
    public PilhaVetor(int tamanho){
        registraTopo = 0;
        vetorPilha = new String[tamanho];
    }
    
    //Métodos da Classe
    public void empilhar(String entrada){
        vetorPilha[registraTopo] = entrada;
        registraTopo ++;
    }
    
    public String desempilhar(){
        registraTopo --;
        return vetorPilha[registraTopo];
    }
    
    public boolean verificaPilhaCheia(){
        if (vetorPilha.length == registraTopo){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean verificaPilhaVazia(){
        if (registraTopo == 0){
            return true;
        }
        else{
            return false;
        }
    }
    
}
