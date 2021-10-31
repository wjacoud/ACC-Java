/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Cliente;
import Model.ContaCorrente;

/**
 *
 * @author wilsonjacoud
 */
public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(100f, 1234, 55555, new Cliente("Wilson", "22222222"), 200f);
        cc.sacar(250f);
        System.out.println("Saldo: " + cc.obterSaldo());
        cc.depositar(1250f);
        System.out.println("Saldo: " + cc.obterSaldo());
    }
}
