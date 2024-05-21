/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FeiraoDeVeiculos.Controler;

import FeiraoDeVeiculos.Model.Cliente;
import FeiraoDeVeiculos.Model.Veiculos;
import FeiraoDeVeiculos.Model.Pessoa;
import FeiraoDeVeiculos.Model.TipoVeiculo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Alunos
 */
public class Controlador implements Serializable {
    private List<Veiculos> listaVeiculos;
    private List<Pessoa> listaPessoa;
    
    public Controlador(){
        listaPessoa = new ArrayList<Pessoa>();
        listaVeiculos = new ArrayList<Veiculos>();
    }
    
    public void CadastrarPessoa(String nome, String telefone, String cpf, float valorMax, float valorMin, TipoVeiculo tipoVeiculo){
        listaPessoa.add(new Cliente(nome, telefone, cpf, valorMax, valorMin, tipoVeiculo));
    }


    
}
