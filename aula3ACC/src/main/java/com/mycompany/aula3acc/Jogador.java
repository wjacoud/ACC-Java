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
public class Jogador {
    private String nome;
    private Integer pontuacao = 0;
    
    public void Pontuar(){
        this.pontuacao++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Integer getPontuacao(){
        return this.pontuacao;
    }
}
