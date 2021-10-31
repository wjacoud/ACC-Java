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
public abstract class Funcionario {
    protected Integer matricula;
    protected String nome;
    protected String email;
    protected Float salario;
    protected Sexo sexo;
    protected Integer tempoDeEmpresa;
   
    // Metodos

    protected Funcionario(Integer matricula, String nome, String email, Float salario, Sexo sexo, Integer tempoDeEmpresa) {
        this.matricula = matricula;
        this.nome = nome;
        this.email = email;
        this.salario = salario;
        this.sexo = sexo;
        this.tempoDeEmpresa = tempoDeEmpresa;
    }

    protected Funcionario(Integer matricula, String nome, Float salario, Sexo sexo) {
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
        this.sexo = sexo;
    }

    protected Funcionario(Integer matricula, String nome, Sexo sexo) {
        this.matricula = matricula;
        this.nome = nome;
        this.sexo = sexo;
    }
    
    protected Integer getMatricula() {
        return matricula;
    }

    protected void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    protected String getNome() {
        return nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected String getEmail() {
        return email;
    }

    protected void setEmail(String email) {
        this.email = email;
    }

    protected Float getSalario() {
        return salario;
    }

    protected void setSalario(Float salario) {
        this.salario = salario;
    }

    protected Sexo getSexo() {
        return sexo;
    }

    protected void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Integer getTempoDeEmpresa() {
        return tempoDeEmpresa;
    }

    public void setTempoDeEmpresa(Integer tempoDeEmpresa) {
        this.tempoDeEmpresa = tempoDeEmpresa;
    }
    
}
