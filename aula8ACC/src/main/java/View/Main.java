/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.StringController;

/**
 *
 * @author wilsonjacoud
 */
public class Main {
    public static void main(String[] args) {
        String nome = "  \n Wilson Hermes Jacoud     \n ";
//        nome = nome + "Hermes";
//        
//        System.out.println(nome);
//        
//        System.out.println("");
//        
//        StringBuilder strb = new StringBuilder("Junior");
//        strb.append(nome);
//        System.out.println(strb.toString());

//        char caractere = StringController.retornarChar(nome, 2);
//        
//        System.out.println("O carac é: " + caractere);

        int largura = nome.length();
        
        for (int i = 0; i < largura; i++){
            char caractere = StringController.retornarChar(nome, i);
        
            System.out.println("O carac é: " + caractere);
        }
        
        System.out.println(nome.strip());
        System.out.println(nome.trim());
        System.out.println(nome.replaceAll(" ", ""));
    }
}
