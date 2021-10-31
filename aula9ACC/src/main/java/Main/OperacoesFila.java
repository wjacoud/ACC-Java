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
public interface OperacoesFila {
    public void addItemInicio(Object item);
    public void addItemFim(Object item);
    public Object removerItemInicio();
    public Object removerItemFim();
    public Object buscaInicio();
    public Object buscaFim();
}
