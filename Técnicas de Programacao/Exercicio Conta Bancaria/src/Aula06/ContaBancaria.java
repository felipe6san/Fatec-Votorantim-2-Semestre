
package Aula06;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alunos
 */
public class ContaBancaria {
    //Atributos//
    float saldoConta;
    Cliente cliente;
    TipoConta tipoConta;
    StatusConta statusConta;
    String extrato = "";
    
    //Construtor//
    public ContaBancaria(Cliente cliente,TipoConta tipoConta,StatusConta statusConta){
        this.cliente = cliente;
        this.tipoConta = tipoConta;
        this.statusConta = statusConta;
        this.saldoConta = 0;
    }
    
    //Métodos Getter//
    public float getSaldo()
    {
        return saldoConta;
    }
    
    //Funcionalidades//
    public String depositaSaldo(float dinheiro){
        saldoConta += dinheiro;
        extrato += "Valor Depositado: " + saldoConta + "\n";
        return "Novo Saldo: " + saldoConta;
    }
    public String retiraSaldo(float dinheiro){
        saldoConta -= dinheiro;
        extrato += "Valor Retirado: " + saldoConta + "\n";
        return "Novo Saldo: " + saldoConta;
    }
    public String cobraTaxa(){
        if (tipoConta == TipoConta.CC){
            saldoConta -= 19.99;
            extrato += "Taxa Cobrada: " + 19.99 + "\n";
        }
        if (tipoConta == TipoConta.CP){
            saldoConta -= 9.99;
            extrato += "Taxa Cobrada: " + 9.99 + "\n";
        }
        return "Novo Saldo: " + saldoConta;
    }
    public String verificaSaldo(){
        return "Saldo: " + saldoConta;
    }
    
    public String extratoConta(){
        return "Extrato: \n" +  extrato +"Saldo da Conta: " + saldoConta;
    }
}
    
    


