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
public class ArrayGenerico<E> {
    private ArrayList<E> list;
    
    public ArrayGenerico(ArrayList<E> array){
        this.list = array;
    }
    
    public ArrayGenerico(){
        this.list = new ArrayList<>();
    }
    
    public boolean addIten(E element){
        return this.list.add(element);
    }
    
    public void clear(){
        this.list.clear();
    }
    
    public int getNumberOfElements(){
        return this.list.size();
    }
    
    public String showAll(){
        StringBuilder builder = new StringBuilder();
        for (E element : this.list){
            builder.append(element);
        }
        return builder.toString();
    }
}
