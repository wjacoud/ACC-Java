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
public class Jogo {
    private Jogador player1;
    private Jogador player2;
    private Dificuldade dificuldade_do_jogo;
    
    public String showJogadores(){
        return "Jogador 1: " + this.player1.getNome() + "\nJogador 2: " + this.player2.getNome();
    }

    public Dificuldade getDificuldade() {
        return dificuldade_do_jogo;
    }

    public void setDificuldade(Dificuldade dificuldade_do_jogo) {
        this.dificuldade_do_jogo = dificuldade_do_jogo;
    }
    
    public String dificuldadeDoJogo(){
        switch (this.dificuldade_do_jogo.getValorDificuldade()){
            case 1:
                return "Fácil";
            case 2:
                return "Médio";
            case 3:
                return "Difícil";
            default:
                return null;
                
        }
    }
}
