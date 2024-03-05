/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

/**
 *
 * @author Alunos
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa maeDoJoao = new Pessoa ("Maria");
        Pessoa paiDoJoao = new Pessoa ("Thiago");
        Pessoa Joao = new Pessoa("João",maeDoJoao,paiDoJoao);
        System.out.println("Nome: " + Joao.getNome());
        Joao.addFilho(new Pessoa("Felipe"));
        maeDoJoao.addFilho(Joao);
        System.out.println("Nome do filho do João: " + Joao.getListaFilhos()[0].getNome());
        System.out.println("Mãe do João: " + Joao.getNomeMae().getNome());
        System.out.println(maeDoJoao.retornaListaFilhos());
    }
    
}
