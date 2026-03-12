package aula04.Exercicio4_1_enunciado.application;

import java.util.Scanner;

public class Program {
    Scanner sc = new Scanner(System.in);

    private String ra;
    private String nome;
    private String curso;
    private String disciplina;
    private Integer nota1;
    private Integer nota2;
    private Integer nota3;
    private Integer nota4;

    public void cadastroAlunos(){

        System.out.println("---- CADASTRO ALUNOS ----");

        System.out.print("RA: ");
        ra = sc.next();

        System.out.print("NOME: ");
        nome = sc.next();

        System.out.print("CURSO: ");
        curso = sc.next();

        System.out.print("DISCIPLINA: ");
        disciplina = sc.next();

    }

    public void cadastroNotas(){
        int contador = 0;
        int nota = 0;
        int media = 0;

        System.out.println("---- CADASTRO NOTAS ----");

        System.out.println("Digite a nota entre 0 e 10");


        while(contador <= 4){

            do{
                System.out.print(contador + "º Bimestre: ");
                nota= sc.nextInt();
                if(nota < 0 || nota > 10){
                    System.out.println("Valor incorreto, digite novamente");
                }

            }while(nota < 0 || nota > 10);

            if(contador == 1){
                nota1 = nota;
            }else if(contador == 2){
                nota2 = nota;
            }else if(contador == 3){
                nota3 = nota;
            }else{
                nota4 = nota;
            }

            contador++;

        }

    }

    public void  imprimirAlunos(){
        System.out.println("---- DADOS DO ALUNO ----");

        System.out.println("Aluno: " + nome + "(" + ra + ")");
        System.out.println("Curso: " + curso);
        System.out.println("Disciplina: " + disciplina);
        System.out.println("Notas: " + nota1);
        System.out.println("Notas: " + nota2);
        System.out.println("Notas: " + nota3);
        System.out.println("Notas: " + nota4);
        System.out.println("Media: " + (nota1 + nota2 + nota3 + nota4));

    }

    public static void main(String[] args) {

        Program program = new Program();
        program.cadastroAlunos();
        program.cadastroNotas();
        program.imprimirAlunos();



    }


}
