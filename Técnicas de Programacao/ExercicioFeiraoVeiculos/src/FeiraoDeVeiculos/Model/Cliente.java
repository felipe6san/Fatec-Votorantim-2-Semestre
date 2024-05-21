/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FeiraoDeVeiculos.Model;

/**
 *
 * @author Alunos
 */
public class Cliente extends Pessoa{
    float valorMax,valorMin;
    TipoVeiculo tipoVeiculo;
    
    public Cliente(String nome, String telefone, String cpf, float valorMax, float valorMin, TipoVeiculo tipoVeiculo) {
        super(nome, telefone, cpf);
        this.valorMax = valorMax;
        this.valorMin = valorMin;
        this.tipoVeiculo = tipoVeiculo;
        
    }
    
}
