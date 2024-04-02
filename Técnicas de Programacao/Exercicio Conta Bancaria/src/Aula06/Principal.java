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
public class Principal {

       public static void main(String[] args) {
        Cliente andre = new Cliente("André","1928371851","Rua da Ampola");
        System.out.println("Nome: " + andre.getNome() + "\n" + "CPF: " + andre.getCPF() + "\n" + "Endereço: " + andre.getEndereço());
        ContaBancaria contaDoAndre = new ContaBancaria(andre,TipoConta.CC,StatusConta.Aberta);
        System.out.println("Tipo da conta: " + contaDoAndre.tipoConta + "\n" + "Status da Conta: " + contaDoAndre.statusConta + "\n" + "Saldo da Conta: " + contaDoAndre.saldoConta);
        contaDoAndre.depositaSaldo(100);
        contaDoAndre.retiraSaldo(50);
        contaDoAndre.cobraTaxa();
        System.out.println(contaDoAndre.extratoConta());
       }
    
}
