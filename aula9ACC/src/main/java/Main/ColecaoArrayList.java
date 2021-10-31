/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.ArrayList;

/**
 *
 * @author wilsonjacoud
 */
public class ColecaoArrayList implements OperacoesArray{
    private ArrayList<Integer> lista;
    
    public ColecaoArrayList(ArrayList array){
        lista = array;
    }
    
    public ColecaoArrayList(){
        this.lista = new ArrayList<>();
    }

    @Override
    public boolean addItem(Object obj) {
        if (obj != null){
            return lista.add((Integer) obj);
        }
        return false;
    }

    @Override
    public Object removeItem(int posicao) {
        if (posicao >= 0){
            return lista.remove(posicao);
        }
        return false;
    }

    @Override
    public boolean Vazio() {
        return lista.isEmpty();
    }

    @Override
    public Object Busca(String referencia) {
        Integer busca = Integer.parseInt(referencia);
        for (Integer el: this.lista){
            if (el.equals(busca)){
                return el;
            }
        }
        return null;
    }

    @Override
    public Object Retornar(int posicao) {
        return lista.get(posicao);
    }
    
    
}
