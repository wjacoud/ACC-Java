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
public abstract class Ave extends Animal {
    protected boolean penugemImpermeavel;
    protected int alturaDoVoo;

    public Ave(boolean penugemImpermeavel, int alturaDoVoo, String nome, int altura, int peso, Alimentacao tipoDeAlimentacao) {
        super(nome, altura, peso, tipoDeAlimentacao);
        this.penugemImpermeavel = penugemImpermeavel;
        this.alturaDoVoo = alturaDoVoo;
    }
    
    public abstract String Voar();
}
