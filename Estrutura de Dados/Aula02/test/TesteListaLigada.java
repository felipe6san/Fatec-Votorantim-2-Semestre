/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import Aula03.*;
/**
 *
 * @author Alunos
 */

public class TesteListaLigada {
    @Test
    public void testeCriacaodeNos(){
        Object info = "Rodrigo";
        No proximoNo = null;
        No primeiroNo = new No(info, proximoNo);
        assertEquals("Rodrigo",primeiroNo.getInfo());
    }
    @Test
    public void testaCriacaoLista()
    {
        ListaLigada minhaLista = new ListaLigada();
        minhaLista.add("Rodrigo");
        minhaLista.add("Ronaldo");
    }
}