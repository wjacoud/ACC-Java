/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author wilsonjacoud
 */
public class ContaPoupanca extends Conta{
    private int aniversario;
    
    public ContaPoupanca(int agencia, int numero, Cliente cliente, float saldo, int aniversario){
        super(agencia, numero, cliente, saldo);
        this.aniversario = aniversario;
    }

    public int getAniversario() {
        return aniversario;
    }
    
    public void Render(int aniversario, float rendimento){
        if(this.aniversario == aniversario){
            this.saldo += this.saldo * rendimento;
        }
    }
    
}
