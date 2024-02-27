/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Alunos
 */
public class Aula1Pessoa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Pessoa pai;
        pai = new Pessoa("Rodrigo","1237642");    
        pai.qntFilho = 2;
        pai.nomeFilhos[0]="Maria";
        pai.nomeFilhos[1]="João";
        System.out.println(pai.Apresentar());
        System.out.println("CPF Pai: " + pai.getCpf());
        pai.setCpf("344443");
        System.out.println("CPF Pai: " + pai.getCpf());
        System.out.println(pai.ApresentarFilhos());

        Pessoa mae;
        mae = new Pessoa("Maria","6666666");
        mae.qntFilho = 2;
        mae.qntIrmaos = 4;
        System.out.println(mae.Apresentar());
        mae.nomeFilhos[0]="Maria";
        mae.nomeFilhos[1]="João";
        System.out.println(mae.ApresentarFilhos());
    }
   
}
