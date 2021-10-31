/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Collections;
import java.util.LinkedList;

/**
 *
 * @author wilsonjacoud
 */
public class Main {
    public static void main(String[] args) {
//        ColecaoArrayList listaDeInteiros = new ColecaoArrayList();
//        
//        listaDeInteiros.addItem(10);
//        listaDeInteiros.addItem(5);
//        listaDeInteiros.addItem(25);
//        listaDeInteiros.addItem(52);
//        
//        System.out.println(listaDeInteiros);

        ColecaoArrayList listaDeInteiros = new ColecaoArrayList();
        
        listaDeInteiros.addItem(10);
        listaDeInteiros.addItem(5);
        listaDeInteiros.addItem(25);
        listaDeInteiros.addItem(52);
        
        System.out.println(listaDeInteiros);
        
        ColecaoLinkedList link = new ColecaoLinkedList();
        
        link.addItem(20);
        link.addItem(10);
        link.addItem(220);
        link.addItem(524);
        
        System.out.println(link);
        
        LinkedList l = new LinkedList<>();
        
    }
}
