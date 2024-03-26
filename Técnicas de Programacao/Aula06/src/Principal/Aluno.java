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
public class Aluno extends Pessoa{
    
    private Float notas[];

    public Aluno(String nome,Float notas[]) {
        super(nome);
        this.notas = notas;
    }
    
    public Float[] getNotas()
    {
        return notas;
    }
    public Float[] setNotas()
    {
        this.notas = notas;
        return notas;
    }
        
}
