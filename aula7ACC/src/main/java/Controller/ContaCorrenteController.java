/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ContaCorrente;

/**
 *
 * @author wilsonjacoud
 */
public class ContaCorrenteController {
    public static ContaCorrente sacar(ContaCorrente destino, float valor){
        destino.sacar(valor);
        return destino;
    }
    public static ContaCorrente depositar(ContaCorrente destino, float valor){
        destino.depositar(valor);
        return destino;
    }
}
