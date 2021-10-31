/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author wilsonjacoud
 */
public interface OperacoesArray {
    boolean addItem(Object obj);
    boolean Vazio();
    Object removeItem(int posicao);
    Object Busca(String referencia);
    Object Retornar(int posicao);
}
