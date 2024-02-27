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
public class Pessoa {

    //Atributos da classe
    String nome;
    int qntFilho, qntIrmaos;
    String[] nomeFilhos = new String[20];
    private String cpf;
    
    /*Método construtor*/
    public Pessoa(String nome){
        this.nome = nome;
    }
    public Pessoa(String nome,String cpf){
        this(nome);
        this.cpf = cpf;
    }
    
    /*Métodos Setter*/
    public void setCpf(String cpf){
        if(this.cpf == null)
            this.cpf = cpf;
    }
    public String getCpf(){
        return this.cpf;
    }
    

    /*Método apresentar, responde com o Nome
    concatenado com a quantidade de Filhos e Irmãos.
     */
    public String Apresentar() {
        return "O " + nome + " possui " + qntFilho + " filhos" + " e " + qntIrmaos + " irmãos!";
    }

    public String ApresentarFilhos() {
        String resposta = "Meus Filhos são ";
        int qntFilhoAux = 0;

        for (int i = 0; i < 20; i++) {

            if (nomeFilhos[i] != null) {
                qntFilhoAux++;
                resposta += nomeFilhos[i] + ", ";
            }

        }
        if (qntFilhoAux > 0) {
            return resposta + "Quantidade de Filhos: " + qntFilhoAux;
        } else {
            return "Não tem Filhos!";
        }
    }
}
