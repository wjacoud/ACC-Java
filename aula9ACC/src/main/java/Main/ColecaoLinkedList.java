/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.LinkedList;

/**
 *
 * @author wilsonjacoud
 */
public class ColecaoLinkedList implements OperacoesArray, OperacoesFila{
    private LinkedList<String> lista;
    
    public ColecaoLinkedList() {
        this.lista = new LinkedList();
    }

    @Override
    public boolean addItem(Object obj) {
        if (obj != null){
            return lista.add((String) obj);
        }
        return false;
    }

    @Override
    public boolean Vazio() {
        return lista.isEmpty();
    }

    @Override
    public Object removeItem(int posicao) {
        if (lista.size() > 0){
            return lista.remove();
        }
        return null;
    }

    @Override
    public Object Busca(String referencia) {Integer busca = Integer.parseInt(referencia);
        for (String el: this.lista){
            if (el.equalsIgnoreCase(referencia)){
                return el;
            }
        }
        return null;
    }

    @Override
    public Object Retornar(int posicao) {
        return lista.get(posicao);
    }

    @Override
    public void addItemInicio(Object item) {
        if (item != null){
            lista.addFirst((String) item);
        }
    }

    @Override
    public void addItemFim(Object item) {
        if (item != null){
            lista.addLast((String) item);
        }
    }

    @Override
    public Object removerItemInicio() {
        return lista.pollFirst();
    }

    @Override
    public Object removerItemFim() {
        return lista.pollLast();
    }

    @Override
    public Object buscaInicio() {
       return lista.getFirst();
    }

    @Override
    public Object buscaFim() {
       return lista.getLast();
    }
    
    
}
