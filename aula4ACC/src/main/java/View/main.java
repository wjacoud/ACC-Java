/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Cliente;
import Model.ContaCorrente;
import Controller.ContaCorrenteController;
/**
 *
 * @author wilsonjacoud
 */
public class main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Wilson", "9999-9999");
        ContaCorrente conta1 = new ContaCorrente(1234, 555555, cliente, 200, 100);
        boolean sacar = ContaCorrenteController.Sacar(conta1, 100);
        if(sacar){
            System.out.println("Saque efetuado com sucesso!\nSaldo: $ " + conta1.getSaldo());
        }
        else{
            System.out.println("Não foi posivel efetuar o saque\nSaldo: $ " + conta1.getSaldo());
        }
    }
}
