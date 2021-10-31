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
public abstract class Conta {
    protected Integer agencia;
    protected Integer numero;
    protected Cliente cliente;
    protected Float saldo;

    public Conta(Integer agencia, Integer numero, Cliente cliente, Float saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public Integer getAgencia() {
        return agencia;
    }

    public Integer getNumero() {
        return numero;
    }

    public Cliente getCliente() {
        return cliente;
    }
    
    public final Float obterSaldo(){
        return this.saldo;
    }
}
