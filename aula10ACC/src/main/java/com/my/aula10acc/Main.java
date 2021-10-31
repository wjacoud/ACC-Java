/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.my.aula10acc;

import java.util.ArrayList;

/**
 *
 * @author wilsonjacoud
 */
public class Main {
    public static void main(String[] args) {
//        Integer[] integers = {3,7,8,21,54,6,86};
//        Double[] doubles = {2.32,65.234,1.0,54.888,87.110997283};
//        String[] strings = {"Wilson","A","B"};
//        
//        String printIntegers = Uteis.printArray(integers);
//        String printDoubles = Uteis.printArray(doubles);
//        String printStrings = Uteis.printArray(strings);
//        
//        System.out.println(printIntegers);
//        System.out.println(printDoubles);
//        System.out.println(printStrings);

        ArrayList<Double> arrayDouble = new ArrayList<>();
        
        arrayDouble.add(12223.44);

        ArrayGenerico<Integer> i = new ArrayGenerico<>();
        ArrayGenerico<String> s = new ArrayGenerico<>();
        ArrayGenerico<Double> d = new ArrayGenerico<>(arrayDouble);
        
        i.addIten(Integer.SIZE);
        s.addIten("Wilson");
        d.addIten(23.43);
        
        String dataInteger = i.showAll();
        String dataDouble = s.showAll();
        String dataString = d.showAll();
        
        System.out.println(dataInteger);
        System.out.println(dataString);
        System.out.println(dataDouble);
    }
}
