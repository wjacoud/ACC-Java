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
public final class Cachorro extends Mamifero{
    protected String nomeDoDono;

    public Cachorro(String nomeDoDono, int espessuraDoPelo, String nome, int altura, int peso, Alimentacao tipoDeAlimentacao) {
        super(espessuraDoPelo, nome, altura, peso, tipoDeAlimentacao);
        this.nomeDoDono = nomeDoDono;
    }

    @Override
    public String Alimentarse() {
        return "O "+this.nome+" é "+this.tipoDeAlimentacao+" e se alimenta de todos os tipos de alimentos.";
    }
}
