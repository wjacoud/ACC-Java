/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.my.aula10acc;

/**
 *
 * @author wilsonjacoud
 */
public abstract class Uteis {
    public static <E> String printArray(E[] input){
        StringBuilder builder = new StringBuilder();
        for(E element : input){
            builder.append(element);
            builder.append(" - ");
        }
        return  builder.toString();
    }
}
