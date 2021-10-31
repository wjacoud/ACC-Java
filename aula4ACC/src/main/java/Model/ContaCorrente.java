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
public class ContaCorrente extends Conta{
    private float limite;
    
    public ContaCorrente(int agencia, int numero, Cliente cliente, float saldo, float limite){
        super(agencia, numero, cliente, saldo);
        this.limite = limite;
    }

    public float getLimite() {
        return limite;
    }
    
    @Override
    public boolean Sacar(float valor){
        float valorDisponivel = this.saldo + this.limite;
        if(valor > 0 && valorDisponivel >= valor){
            this.saldo -= valor;
            return true;
        }
        return false;
    }
    
    @Override
    public Conta Transferir(Conta contaDestino, float valor){
        if (this.Sacar(valor)){
            contaDestino.Depositar(valor);
            return contaDestino;
        }
        return contaDestino;
    }
    
}
