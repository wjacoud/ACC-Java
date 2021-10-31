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
public enum Nivel {
    FACIL(1), MEDIO(2), DIFICIL(3);
    
    private int nivel;
    
    Nivel(int valor){
        this.nivel = valor; 
    }
    
    public int getNivel(){
        return nivel;
    }
}
