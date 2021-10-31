/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula3acc;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author wilsonjacoud
 */
public class main {
    public static void main(String[] args) {
        Jogo j = new Jogo();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Jogada: ");
        int jogadaPessoa = scan.nextInt();
        j.setDificuldade(Dificuldade.FACIL);
        iniciarRodada(2, j);
    }
    
    private static void iniciarRodada(int jogadaPessoa, Jogo j){
        
        int jogadaComputador = jogadaComputador();
        if((jogadaComputador == 1 && jogadaPessoa == 3) || (jogadaComputador == 2 && jogadaPessoa == 1) || (jogadaComputador == 3 && jogadaPessoa == 2)){
            System.out.println("Computador venceu!!!");
        }
        else{
            String dificuldade = j.dificuldadeDoJogo();
            
            if(dificuldade.equalsIgnoreCase("Médio") || dificuldade.equalsIgnoreCase("Difícil")){
                jogadaComputador = jogadaComputador();
                if((jogadaComputador == 1 && jogadaPessoa == 3) || (jogadaComputador == 2 && jogadaPessoa == 1) || (jogadaComputador == 3 && jogadaPessoa == 2)){
                    System.out.println("Computador venceu!!!");
                }
                else{
                    System.out.println("Jogador venceu!!!");
                }
            }
            System.out.println("Jogador venceu!!!");
        }
        /*
            1 - Pedra
            2 - Papel
            3 - Tesoura
        */
           
    }
    
    private static int jogadaComputador(){
        Random random = new Random();
        return random.nextInt(3) + 1;
    }
}
