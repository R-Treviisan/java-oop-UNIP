package aula04.Exercicio4_1_completo.application;

import aula04.Exercicio4_1_completo.entities.Aluno;
import aula04.Exercicio4_1_completo.entities.Notas;

import java.util.Scanner;

public class Program {
    private Aluno aluno;

    Scanner sc = new Scanner(System.in);


    public void cadastroAluno(){

        System.out.println("---- CADASTRO DO ALUNO ----");

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("RA: ");
        String ra = sc.nextLine();

        System.out.print("Curso: ");
        String curso = sc.nextLine();

        System.out.print("Disciplina: ");
        String disciplina = sc.nextLine();

        aluno = new Aluno(ra, nome, curso, disciplina);

    }

    public void cadastroNotas(){
        Notas notas = new Notas();
        int contador = 1;
        int nota = 0;

        System.out.println("---- CADASTRO DE NOTAS ----");
        System.out.println("Digite a nota entre 0 e 10");
        System.out.println(" ");
        while (contador <=4){

            do{
                System.out.print("Nota " + contador + ": ");
                nota = sc.nextInt();

                if(nota < 0 || nota > 10){
                    System.out.println("Nota Inválida, redigite");
                }
            }while (nota < 0 || nota > 10);

            if (contador == 1){
                notas.setNota1(nota);
            } else if (contador == 2) {
                notas.setNota2(nota);
            } else if (contador == 3) {
                notas.setNota3(nota);
            }else{
                notas.setNota4(nota);
            }
            contador++;
            aluno.setNotas(notas);

        }


    }

    public void imprimeAluno(){
        System.out.println(aluno);
    }

    public static void main() {
        Program program = new Program();

        program.cadastroAluno();
        program.cadastroNotas();
        program.imprimeAluno();

    }
}
