package aula04.Exercicio2_enunciado.application;

import java.util.Scanner;

public class Program {
    private String nome;
    private String codigo;
    private Float nota1;
    private Float nota2;
    private Float nota3;
    private Float nota4;
    private Integer media;
    Scanner sc = new Scanner(System.in);

    public void cadastroAluno() {
        System.out.println("---- CADASTRO DE ALUNO ----");

        System.out.print("codigo: ");
        codigo = sc.nextLine();

        System.out.print("Nome: ");
        nome = sc.nextLine();

    }

    public void cadastroNotas() {
        System.out.println("---- CADASTRO NOTAS ----");

        int contador = 1;

        while (contador <= 4) {
            System.out.print("Digite a " + contador + "° nota: ");
            float nota = sc.nextFloat();
            if (nota <= 5) {
                if (contador == 1) {
                    nota1 = nota;
                    contador++;
                } else if (contador == 2) {
                    nota2 = nota;
                    contador++;
                } else if (contador == 3) {
                    nota3 = nota;
                    contador++;
                } else {
                    nota4 = nota;
                    contador++;
                }

            } else {
                System.out.println("Digite a nota entre 0 e 5:");

            }
        }

        media = Math.round((nota1 + nota2 + nota3 + nota4) / 4);


    }

    public void imprimeAluno() {

        switch (media) {

            case 0:
                System.out.println("---- DADOS DO ALUNO ----");

                System.out.println("Aluno: " + nome + " (" + codigo + ") ");
                System.out.println("Nota: " + media + "  – Péssimo");
                break;

            case 1:
                System.out.println("---- DADOS DO ALUNO ----");

                System.out.println("Aluno: " + nome + " (" + codigo + ") ");
                System.out.println("Nota: " + media + "   – Ruim");
                break;

            case 2:
                System.out.println("---- DADOS DO ALUNO ----");

                System.out.println("Aluno: " + nome + " (" + codigo + ") ");
                System.out.println("Nota: " + media + "  – Regular");
                break;

            case 3:
                System.out.println("---- DADOS DO ALUNO ----");

                System.out.println("Aluno: " + nome + " (" + codigo + ") ");
                System.out.println("Nota: " + media + "  – Bom");
                break;

            case 4:
                System.out.println("---- DADOS DO ALUNO ----");

                System.out.println("Aluno: " + nome + " (" + codigo + ") ");
                System.out.println("Nota: " + media + "  – Ótimo");
                break;

            case 5:
                System.out.println("---- DADOS DO ALUNO ----");

                System.out.println("Aluno: " + nome + " (" + codigo + ") ");
                System.out.println("Nota: " + media + "  – Excelente");
                break;
        }


    }

    public static void main(String[] args) {
        Program program = new Program();

        program.cadastroAluno();
        program.cadastroNotas();
        program.imprimeAluno();


    }
}


