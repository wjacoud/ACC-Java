/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula3acc;

/**
 *
 * @author wilsonjacoud
 */
public enum Dificuldade {
    FACIL(1), MEDIO(2), DIFICIL(3);
    
    private int valorDificuldade;
    
    Dificuldade(int valor){
        valorDificuldade = valor;
    }
    
    public int getValorDificuldade(){
        return valorDificuldade;
    }
}
