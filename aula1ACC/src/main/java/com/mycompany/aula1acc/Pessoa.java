/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula1acc;

/**
 *
 * @author wilsonjacoud
 */
public class Pessoa {
    // Atributos
    public String nome_completo;
    public String email;
    public Float salario = 0.0f;
    public String cidade;
    public String estado;
    
    // Metodos
    public String imprimirEndereco(){
        return this.cidade+" / "+this.estado;
    }
    
    public String imprimirDadosPessoais(){
        return "Nome: "+this.nome_completo+"\nEmail: "+this.email;
    }
    
    public void aumentarSalario(float aumento){
        this.salario += aumento;
    }
    
    public void reduzirSalario(float reducao){
        this.salario -= reducao;
    }
    
    
}
