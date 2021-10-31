/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author wilsonjacoud
 */
import Model.ContaPoupanca;

/**
 *
 * @author wilsonjacoud
 */
public class ContaPoupancaController {
    public static ContaPoupanca sacar(ContaPoupanca destino, float valor){
        destino.sacar(valor);
        return destino;
    }
    public static ContaPoupanca depositar(ContaPoupanca destino, float valor){
        destino.depositar(valor);
        return destino;
    }
}
