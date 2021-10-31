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
public final class Limpeza extends Funcionario{
    private Limpeza supervisor;

    public Limpeza(Limpeza supervisor, Integer matricula, String nome, String email, Float salario, Sexo sexo, Integer tempoDeEmpresa) {
        super(matricula, nome, email, salario, sexo, tempoDeEmpresa);
        this.supervisor = supervisor;
    }

    public Limpeza(Limpeza supervisor, Integer matricula, String nome, Float salario, Sexo sexo) {
        super(matricula, nome, salario, sexo);
        this.supervisor = supervisor;
    }

    public Limpeza(Limpeza supervisor, Integer matricula, String nome, Sexo sexo) {
        super(matricula, nome, sexo);
        this.supervisor = supervisor;
    }       

    public String getSupervisor() {
        StringBuilder sb = new StringBuilder();
        sb.append("-------- Supervisor ---------\n");
        if (this.supervisor.sexo == Sexo.Masculino){
            sb.append("Sr. ");
        }else{
            sb.append("Sra. ");
        }
        sb.append("Nome do Supervisor: ");
        sb.append(this.supervisor.nome);
        sb.append("\n");
        sb.append("Tempo de Empresa: ");
        sb.append(this.supervisor.tempoDeEmpresa);
        sb.append("\n");
        sb.append("-----------------------------\n");
        return sb.toString();
    }

}
