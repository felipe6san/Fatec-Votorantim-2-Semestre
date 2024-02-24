/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula02;

/**
 *
 * @author Alunos
 */
public class VetoresMatrizes {

   
    public static void main(String[] args) {
         //Exercicio 1
        VetoresMatrizes vM1 = new VetoresMatrizes();
        int[] entrada = new int[]{0, 1, 2, 3, 4, 5, 6, 7};
        int[] saida;
        saida = vM1.inverterVetor(entrada);
        String retorno = "";
        String entradaConcatenada = "";

        for (int i = 0; i < 8; i++) {
            entradaConcatenada += entrada[i];
            retorno += saida[i];
        }
        System.out.println("Vetor Entrada: " + entradaConcatenada);
        System.out.println("Vetor invertido: " + retorno);
                
         //Exercicio 2
        vM1.concatenaVetorEmMatriz(
        new int[]{0,1,2,3,4,5,6,7},
        new int[]{0,1,2,3,4,5,6,7},
        new int[]{0,1,2,3,4,5,6,7}
    );
    }

    public int[] inverterVetor(int[] vetorEntrada) {
        /*Crie um método que inverta a entrada
        e retorne o vetor invertido.
         */
        int[] vetorSaida = new int[8];

        for (int i = 0; i < 8; i++) {
            vetorSaida[7 - i] = vetorEntrada[i];
        }
        return vetorSaida;
    }
    
   
    public int[][] concatenaVetorEmMatriz(int[] vetor1, int[] vetor2, int[] vetor3) {
        /* Recebe 3 vetores de 8 posições e retorna uma matriz de 8x3 posições.*/
        int[][] matrizSaida = new int[8][3];

        for (int i = 0; i < 8; i++) {
            matrizSaida[i][0] = vetor1[i];
            matrizSaida[i][1] = vetor2[i];
            matrizSaida[i][2] = vetor3[i];
        }

        return null;
    }

}
