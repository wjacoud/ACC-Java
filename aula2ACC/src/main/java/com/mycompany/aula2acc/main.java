package com.mycompany.aula2acc;

import java.util.Scanner;
/**
 *
 * @author wilsonjacoud
 */
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Grade g1 = new Grade();
       
        System.out.println("Nome da Disciplina: ");
        String nome_da_disciplina = input.nextLine();
        System.out.println("Nome do Professor: ");
        String nome_do_professor = input.nextLine();
        System.out.println("Dia da Semana: ");
        String dia_da_semana = input.nextLine();
        System.out.println("Numero da sala: ");
        int numero_da_sala = input.nextInt();
        System.out.println("Numero do predio: ");
        int numero_do_predio = input.nextInt();
        System.out.println("Horario de Inicio: ");
        int horario_de_inicio = input.nextInt();
        System.out.println("Horario de Termino: ");
        int horario_de_termino = input.nextInt();
        
        g1.Registrar(nome_da_disciplina, numero_da_sala, numero_do_predio, nome_do_professor, horario_de_inicio, horario_de_termino,DiaDaSemana.SABADO);
//        

//        g1.getNome_da_disciplina();
//        String grade = g1.exibirDados();
//        System.out.println(grade);
//        
//        //Pode imprimir direto do obj


        System.out.println(g1.exibirDados());
    }
}
