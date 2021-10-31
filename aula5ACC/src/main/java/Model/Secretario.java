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
public final class Secretario extends Funcionario {
    private String grauDeEscolaridade;
    
    public Secretario(Integer matricula, String nome, String email, Float salario, Sexo sexo, Integer tempoDeEmpresa, String grauDeEscolaridade){
        super(matricula, nome, email, salario, sexo, tempoDeEmpresa);
        this.grauDeEscolaridade = grauDeEscolaridade;
    }
    
    public Secretario(Integer matricula, String nome, Float salario, Sexo sexo, String grauDeEscolaridade){
        super(matricula, nome, salario, sexo);
        this.grauDeEscolaridade = grauDeEscolaridade;
    }
    
    public Secretario(Integer matricula, String nome, Sexo sexo, String grauDeEscolaridade){
        super(matricula, nome, sexo);
        this.grauDeEscolaridade = grauDeEscolaridade;
    }

    public String getGrauDeEscolaridade() {
        return grauDeEscolaridade;
    }

    public void setGrauDeEscolaridade(String grauDeEscolaridade) {
        this.grauDeEscolaridade = grauDeEscolaridade;
    }
    
    
}
