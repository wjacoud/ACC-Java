/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula2acc;

/**
 *
 * @author wilsonjacoud
 */
public class Grade {
    private String nome_da_disciplina;
    private int numero_da_sala;
    private int numero_do_predio;
    private String nome_do_professor;
    private int horario_de_inicio;
    private int horario_de_termino;
    private DiaDaSemana dia_da_semana;

    public String getNome_da_disciplina() {
        return nome_da_disciplina;
    }

    public void setNome_da_disciplina(String nome_da_disciplina) {
        this.nome_da_disciplina = nome_da_disciplina;
    }

    public int getNumero_da_sala() {
        return numero_da_sala;
    }

    public void setNumero_da_sala(int numero_da_sala) {
        this.numero_da_sala = numero_da_sala;
    }

    public int getNumero_do_predio() {
        return numero_do_predio;
    }

    public void setNumero_do_predio(int numero_do_predio) {
        this.numero_do_predio = numero_do_predio;
    }

    public String getNome_do_professor() {
        return nome_do_professor;
    }

    public void setNome_do_professor(String nome_do_professor) {
        this.nome_do_professor = nome_do_professor;
    }

    public int getHorario_de_inicio() {
        return horario_de_inicio;
    }

    public void setHorario_de_inicio(int horario_de_inicio) {
        this.horario_de_inicio = horario_de_inicio;
    }

    public int getHorario_de_termino() {
        return horario_de_termino;
    }

    public void setHorario_de_termino(int horario_de_termino) {
        this.horario_de_termino = horario_de_termino;
    }

    public DiaDaSemana getDia_da_semana() {
        return dia_da_semana;
    }

    public void setDia_da_semana(DiaDaSemana dia_da_semana) {
        this.dia_da_semana = dia_da_semana;
    }

    
    
    public void Registrar(String nome_da_disciplina, int numero_da_sala, int numero_do_predio, String nome_do_professor, int horario_de_inicio, int horario_de_termino, DiaDaSemana dia_da_semana){
        this.nome_da_disciplina = nome_da_disciplina;
        this.numero_da_sala = numero_da_sala;
        this.numero_do_predio = numero_do_predio;
        this.nome_do_professor = nome_do_professor;
        this.horario_de_inicio = horario_de_inicio;
        this.horario_de_termino = horario_de_termino;
        this.dia_da_semana = dia_da_semana;
    }
    
    public String exibirDados(){
        StringBuilder sb = new StringBuilder();
        sb.append("Nome da disciplina: ");
        sb.append(this.nome_da_disciplina+"\n");  
        sb.append("Numero da sala: ");
        sb.append(this.numero_da_sala+"\n");
        sb.append("Numero do predio: ");
        sb.append(this.numero_do_predio+"\n");
        sb.append("Nome do Professor: ");
        sb.append(this.nome_do_professor+"\n");
        sb.append("Horario de Inicio: ");
        sb.append(this.horario_de_inicio+"\n");
        sb.append("Horario de Termino: ");
        sb.append(this.horario_de_termino+"\n");
        sb.append("Dia da Semana: ");
        sb.append(this.dia_da_semana.getValor()+"\n");
        return sb.toString();
    }
 
    
}
