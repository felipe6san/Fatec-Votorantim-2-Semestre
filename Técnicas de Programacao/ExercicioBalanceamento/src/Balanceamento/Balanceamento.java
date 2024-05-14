/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Balanceamento;

/**
 *
 * @author Alunos
 */
public class Balanceamento {
    
    public static void main(String[] args){
        String vetor[] = new String[] {"(",")"};
        System.out.println(validaBalanceamento(vetor));  
        
        String vetor2[] = new String[] {"(",")"};
        System.out.println(validaBalanceamento(vetor2));   
    }

    public static boolean validaBalanceamento(String[] vetor){
        
        PilhaVetor pilhaAux = new PilhaVetor(10); 
        
        for(int i = 0; i < vetor.length; i++){
            if (vetor[i] == "{" || vetor[i] == "(" || vetor[i] == "["){
                if (vetor[i] == "{")
                    pilhaAux.empilhar("}");
                else if (vetor[i] == "(")
                    pilhaAux.empilhar(")");
                else if (vetor[i] == "[")
                    pilhaAux.empilhar("]");
                }
            if(vetor[i] == "}" || vetor[i] == ")" || vetor[i] == "]"){
            if (pilhaAux.verificaPilhaVazia())
                return false;
            else if(vetor[i] != pilhaAux.desempilhar())
                return false;
            }
        }
        if(pilhaAux.verificaPilhaVazia()){
            return true;
        }
        else {
            return false;
        }
    }
    
}
