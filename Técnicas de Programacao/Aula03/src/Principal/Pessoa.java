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
public class Pessoa {
    //Atributos da Classe//
    private String nome;
    private String cpf;
    private String genero;
    private String telefone;
    private Pessoa mae;
    private Pessoa pai;
    private int numFilhos = 0;
    private Pessoa[] listaFilhos = new Pessoa[10];
    //********************//
    
    public Pessoa(String nome){
        this.nome = nome;
    }
    public Pessoa(String nome, Pessoa mae){
        //this.nome = nome;
        this(nome);
        this.mae = mae;
    }
    
        public Pessoa(String nome, Pessoa mae, Pessoa pai){
        //this.nome = nome;
        this(nome,mae);
        this.pai = pai;
    }
    //Métodos de acesso aos atributos//
        
    //***Método Getter***//
    public String getNome(){
        return this.nome;
    }    
    public String getCpf(){
        return this.cpf;
    }
    public String getGenero(){
        return this.genero;
    }
    public String getTelefone(){
        return this.telefone;
    }
    public Pessoa getNomeMae(){
        return this.mae;
    }
    public Pessoa getNomePai(){
        return this.pai;
    }
    public Pessoa[] getListaFilhos(){
        return this.listaFilhos;
    }
    //***Método Setter***//
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public void setNomeMae(Pessoa mae){
        this.mae = mae;
    }
    public void setNomePai(Pessoa pai){
        this.pai = pai;
    }
    public void addFilho(Pessoa filho){
        this.listaFilhos[numFilhos] = filho;
        numFilhos++;
    }
    public String retornaListaFilhos(){
        String resposta = "Meus Filhos são: ";
        for (int i = 0; i < numFilhos; i++){
            resposta += listaFilhos[i].getNome() + ", ";
        }
        
        if (numFilhos == 0){
            resposta = "Não Possui Filhos!";
        }
        return resposta;
    }
}
