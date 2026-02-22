package aula04.Exercicio1_enunciado.application;

import java.io.PrintStream;
import java.util.Scanner;

public class Program {
    private String nome;
    private String codigo;
    private Double media;
    private Double nota1;
    private Double nota2;
    private Double nota3;
    private Double nota4;
    Scanner sc = new Scanner(System.in);


    public void cadastroAluno() {
        System.out.println("---- CADASTRO DO ALUNO ----");
        System.out.println("");
        System.out.print("Codigo: ");
        codigo = sc.nextLine();

        System.out.print("Nome: ");
        nome = sc.nextLine();


        nota1 = 0.0;
        nota2 = 0.0;
        nota3 = 0.0;
        nota4 = 0.0;
        media = nota1 + nota2 + nota3 + nota4;
        int i = 1;

        while (i <= 4) {
            System.out.print("Digite a " + i + "° nota: ");
            double nota = sc.nextDouble();
            if (i == 1) {
                nota1 = nota;
            } else if (i == 2) {
                nota2 = nota;
            } else if (i == 3) {
                nota3 = nota;
            } else {
                nota4 = nota;
            }
            i++;
        }
        media = nota1 + nota2 + nota3 + nota4;


    }

    public void imprimeAluno() {

        System.out.println("Aluno: " + nome + " (" + codigo + ") ");
        if (media >= 28) {
            System.out.println("O aluno está APROVADO");
        } else {
            System.out.println("O aluno está REPROVADO");
        }

    }

    public static void main() {
        Program program = new Program();

        program.cadastroAluno();
        program.imprimeAluno();
    }
}
