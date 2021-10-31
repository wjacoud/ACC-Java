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
public abstract class Animal {
    protected String nome;
    protected int altura;
    protected int peso;
    protected Alimentacao tipoDeAlimentacao;

    public Animal(String nome, int altura, int peso, Alimentacao tipoDeAlimentacao) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
        this.tipoDeAlimentacao = tipoDeAlimentacao;
    }
    
    public abstract String Alimentarse();
    
    public final void Crescer(int idade){
        this.altura += idade;
    }
}
