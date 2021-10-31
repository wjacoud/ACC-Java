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
public final class Aguia extends Ave{
    
    public Aguia(boolean penugemImpermeavel, int alturaDoVoo, String nome, int altura, int peso, Alimentacao tipoDeAlimentacao) {
        super(penugemImpermeavel, alturaDoVoo, nome, altura, peso, tipoDeAlimentacao);
    }

    @Override
    public String Voar() {
        return "A "+this.nome+" voa a uma altura de "+this.alturaDoVoo+" metros.";
    }

    @Override
    public String Alimentarse() {
        return "A "+this.nome+" é "+this.tipoDeAlimentacao+" e se alimenta de pequenos animais.";
    } 
}
