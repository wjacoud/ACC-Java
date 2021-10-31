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
public abstract class Mamifero extends Animal {
    protected int espessuraDoPelo;

    public Mamifero(int espessuraDoPelo, String nome, int altura, int peso, Alimentacao tipoDeAlimentacao) {
        super(nome, altura, peso, tipoDeAlimentacao);
        this.espessuraDoPelo = espessuraDoPelo;
    }  
}
