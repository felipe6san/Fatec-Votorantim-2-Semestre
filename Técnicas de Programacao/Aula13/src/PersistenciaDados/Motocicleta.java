/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PersistenciaDados;

import java.io.Serializable;

/**
 *
 * @author Alunos
 */
public class Motocicleta implements Serializable {
    
    /*Atributos*/
    private String marca,modelo;
    private float velocidade;
    
    /*Construtor*/
    public Motocicleta(String marca, String modelo, float velocidade){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = velocidade;
    }
    
    public float alterarVelocidade(float fatorAceleracao){
        velocidade = velocidade * fatorAceleracao;
        return velocidade;
    }
    
    public float parar(){
        velocidade = 0;
        return velocidade;
    }

    public float getVelocidade() {
        return this.velocidade;
    }
}
