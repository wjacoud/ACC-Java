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
public final class ContaPoupanca extends Conta implements Operacoes {
    // implementar quantas interfaces quiser;
    
    private Integer aniversario;
    private Float rendimento;

    public ContaPoupanca(Integer aniversario, Integer agencia, Integer numero, Cliente cliente, Float saldo) {
        super(agencia, numero, cliente, saldo);
        this.aniversario = aniversario;
        this.rendimento = 0.05f;
    }
    
    public void Render(int dia){
        if (dia == this.aniversario){
            this.saldo += this.rendimento;
        }
    }

    @Override
    public boolean sacar(float valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    @Override
    public boolean depositar(float valor) {
        if (this instanceof ContaPoupanca){
            this.saldo += valor;
            return true;
        }
        return false;
    }
}
