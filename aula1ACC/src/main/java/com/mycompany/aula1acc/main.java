/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula1acc;

/**
 *
 * @author wilsonjacoud
 */
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        
        // TipoDoObjeto Nome = new Construtor;
        Scanner keyb = new Scanner(System.in);
        
//        System.out.println("Nome:");
//        
//        String nome = keyb.nextLine();
//        
//        System.out.println("Idade:");
//        
//        // Objeto Integer com metodos
//        Integer idade = keyb.nextInt();
//        
//        System.out.println(nome + " tem " + idade + " anos");
//        
//        System.out.println("Hello, World!");
//        System.out.print("OOOoeeeeeee");
//        System.out.printf("\nOla, %s!!!", nome);
//        
//        // Objeto Float com metodos
//        Float flutuante = 20.0f;
//        float flutuante2 = 20.0f;
//        Double dobou = 20.0;
//        double dobou2 = 20.0;
//        
//        //Inteiros
//        Byte baite = 10;
//        byte baite2 = 10;
//        Short curto = 20;
//        short curto2 = 20;
//        Integer inteiro = 30;
//        int inteiro2 = 20;
//        Long longo = 20L;
//        long longo2 = 20L;
//        
//        //Booleano
//        Boolean boleano = true;
//        boolean boleano2 = false;
//        //String
//        Character caracter = 'A';
//        char caracter2 = 'A';
//        String texto = "Qualque coisa geral!";
//        
//        // Especial
//        
//       String nula = null;
//        
//        //final p declarar constantes
//        
//        final int LENGTH = 50;
//        
//        System.out.println(LENGTH);
//        
//        int[] numeros = {2,4,6,8,5,9};
////        for(int i = 0; i < numeros.length; i++){
////            System.out.println(numeros[i]);
////        }
//
//        for(int numero : numeros){
//            System.out.println(numero);
//        }
        Pessoa p = new Pessoa();
    
        System.out.println("Nome Completo: ");
        p.nome_completo = keyb.nextLine();
        System.out.println("Email: ");
        p.email = keyb.nextLine();
        System.out.println("Cidade: ");
        p.cidade = keyb.nextLine();
        System.out.println("Estado: ");
        p.estado = keyb.nextLine();
        
        System.out.printf("Salario do %s: ", p.nome_completo);
        p.aumentarSalario(keyb.nextFloat());
        
        System.out.printf("O salario de %s e $ %.2f\n", p.nome_completo, p.salario);
    }
}
