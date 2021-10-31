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
public final class Lagarto extends Reptil{

    public Lagarto(int espessuraSaEsacama, String nome, int altura, int peso, Alimentacao tipoDeAlimentacao) {
        super(espessuraSaEsacama, nome, altura, peso, tipoDeAlimentacao);
    }  
    
    @Override
    public String Alimentarse() {
        return "O "+this.nome+" é "+this.tipoDeAlimentacao+" e se alimenta de pequenos insetos.";
    }
    
}
