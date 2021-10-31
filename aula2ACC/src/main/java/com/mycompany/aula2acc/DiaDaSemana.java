/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula2acc;

/**
 *
 * @author wilsonjacoud
 */
public enum DiaDaSemana {
    DOMINGO(1), SEGUNDA(2), TERCA(3), QUARTA(4), QUINTA(5), SEXTA(6), SABADO(7);
    
    private final int valor;
    
    DiaDaSemana(int valor){
        this.valor = valor;
    }
    
    public int getValor(){
        return valor;
    }
}
