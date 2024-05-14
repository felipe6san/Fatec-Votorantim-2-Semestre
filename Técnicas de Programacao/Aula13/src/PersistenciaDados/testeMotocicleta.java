/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PersistenciaDados;

import java.io.IOException;

/**
 *
 * @author Alunos
 */
public class testeMotocicleta {
    
    public static void main(String[] args) throws IOException{
        Motocicleta motoca = new Motocicleta("Honda","CG 150",100);
        Motocicleta motoca2 = null;
        System.out.println("Velocidade Atual: " + motoca.getVelocidade());
        motoca.alterarVelocidade(1.5f);
        System.out.println("Velocidade Atual: " + motoca.getVelocidade());
        try{
        Serializador.gravar("motoca.dat", motoca);
        } 
        catch(IOException ex){
            System.out.println("Erro Gravar:" + ex.getMessage());
        }
    
        try{
        motoca2 =(Motocicleta) Serializador.ler("motoca.dat");
        }
        catch(Exception ex){
            System.out.println("Erro Ler:" + ex.getMessage());
        }
        System.out.println("Motoca 2: " + motoca2.getVelocidade());
    }
}
