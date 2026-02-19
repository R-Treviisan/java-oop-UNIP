package aula03.execicio2_completo.application;

import aula03.execicio2_completo.entities.Funcionario;
import aula03.execicio2_completo.entities.Holerite;

import java.util.Scanner;

public class Program {
    private String codigo;
    private String nome;
    private String pai;
    private String mae;
    private String telefone;
    private Double salarioBase;
    private int dependentes;
    public Funcionario funcionario;
    public Holerite holerite;

    Scanner sc = new Scanner(System.in);

    public void cadastroFuncionario(){

        System.out.println("---- CADASTRO DO FUNCIONARIO ----");
        System.out.println("");
        System.out.print("Codigo: ");
        codigo = sc.nextLine();

        System.out.print("Nome: ");
        nome = sc.nextLine();

        System.out.print("Pai: ");
        pai = sc.nextLine();

        System.out.print("Mae: ");
        mae = sc.nextLine();

        System.out.print("Telefone: ");
        telefone = sc.nextLine();

        funcionario = new Funcionario(codigo, nome, pai, mae, telefone);

        System.out.println(" ");
        System.out.println("---- CADASTRO DO HOLERITE ----");
        System.out.println(" ");
        System.out.print("Salario Base: ");
        salarioBase = sc.nextDouble();

        System.out.print("Dependentes: ");
        dependentes = sc.nextInt();

        holerite = new Holerite(salarioBase, dependentes);
        funcionario.setHolerite(holerite);
        

    }

    public void imprimeFuncionario(){
        System.out.println(funcionario);
    }

    public static void main() {
        Program program = new Program();
        program.cadastroFuncionario();
        program.imprimeFuncionario();
    }



}
