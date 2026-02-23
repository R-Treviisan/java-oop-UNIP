package aula04.Exercicio4_2_completo.application;

import aula04.Exercicio4_2_completo.entities.Aluno;

import java.util.Scanner;

public class Program {
    Scanner sc = new Scanner(System.in);
    private Aluno aluno;

    public void cadastroAaluno(){
        System.out.println("---- CADASTRO ALUNO ----");
        System.out.println(" ");

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("RA: ");
        String ra = sc.nextLine();

        System.out.print("Curso: ");
        String curso = sc.nextLine();

        System.out.print("Disciplina: ");
        String disciplina = sc.nextLine();

        aluno = new Aluno(nome, ra, curso, disciplina);
    }

    public void cadastroFaltas(){
        int contador = 1;
        int falta = 0;
        int totalFalta = 0;

        System.out.println("---- TOTAL DE FALTAS ----");
        System.out.println("Digite o tatal de faltas no bimestre ente 0 e 8");

        while (contador <= 4){

            do{
                System.out.print(contador + "º Bimestre: ");
                falta = sc.nextInt();
                totalFalta += falta;

                if(falta <0 || falta > 8){
                    System.out.println("Valor invalido digite novamente ");
                }
            }while (falta < 0 || falta > 8);

            contador++;

        }
        aluno.setTotalFaltas(totalFalta);

    }

    public void imprimirAluno(){
        System.out.println(aluno);

    }

    public static void main(String[] args) {
        Program program = new Program();
        program.cadastroAaluno();
        program.cadastroFaltas();
        program.imprimirAluno();
    }


}
