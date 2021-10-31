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
public final class Pesquisador extends Funcionario {
    private String areaDeAtuacao;

    public Pesquisador(String areaDeAtuacao, Integer matricula, String nome, String email, Float salario, Sexo sexo, Integer tempoDeEmpresa) {
        super(matricula, nome, email, salario, sexo, tempoDeEmpresa);
        this.areaDeAtuacao = areaDeAtuacao;
    }

    public Pesquisador(String areaDeAtuacao, Integer matricula, String nome, Float salario, Sexo sexo) {
        super(matricula, nome, salario, sexo);
        this.areaDeAtuacao = areaDeAtuacao;
    }

    public Pesquisador(String areaDeAtuacao, Integer matricula, String nome, Sexo sexo) {
        super(matricula, nome, sexo);
        this.areaDeAtuacao = areaDeAtuacao;
    }
    
    

    public String getAreaDeAtuacao() {
        return areaDeAtuacao;
    }

    public void setAreaDeAtuacao(String areaDeAtuacao) {
        this.areaDeAtuacao = areaDeAtuacao;
    }
}
