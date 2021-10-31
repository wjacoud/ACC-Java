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
public final class ContaCorrente extends Conta implements Operacoes {
    private Float limite;

    public ContaCorrente(Float limite, Integer agencia, Integer numero, Cliente cliente, Float saldo) {
        super(agencia, numero, cliente, saldo);
        this.limite = limite;
    }

    @Override
    public boolean sacar(float valor) {
        float valor_disponivel = this.saldo + this.limite;
        if(valor_disponivel >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    @Override
    public boolean depositar(float valor) {
        if (this instanceof ContaCorrente){
            this.saldo += valor;
            return true;
        }
        return false;
    }   
}
