package aula03.exercicio2_enunciado.application;

import java.util.Scanner;

public class Program {
    private String codigo;
    private String nome;
    private String pai;
    private String mae;
    private String telefone;
    private Double salarioBase;
    private Double inss;
    private Double irrf;
    private Double fgts;
    private int dependentes;
    private Double valorAssistencia;
    private Double valeTransporte;
    private Double salarioLiquido;
    private Double calcularDependentes;

    Scanner sc = new Scanner(System.in);

    public void cadastroFuncionario() {

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
    }

    public void cadastroHolerite() {


        System.out.println(" ");
        System.out.println("---- CADASTRO DO HOLERITE ----");
        System.out.println(" ");
        System.out.print("Salario Base: ");
        salarioBase = sc.nextDouble();

        System.out.print("Dependentes: ");
        dependentes = sc.nextInt();


        // INSS
        if (salarioBase <= 1621) {
            inss = salarioBase * 0.075;
        } else if (salarioBase <= 2902) {
            inss = salarioBase * 0.09;
        } else if (salarioBase <= 4354) {
            inss = salarioBase * 0.12;
        } else {
            inss = 4355 * 0.14;
        }

        // IRRF
        if (salarioBase <= 2428) {
            System.out.println("Isento");
        } else if (salarioBase <= 2826) {
            irrf = salarioBase * 0.075;
        } else if (salarioBase <= 3751) {
            irrf = salarioBase * 0.15;
        } else if (salarioBase <= 4664) {
            irrf = salarioBase * 0.225;
        } else {
            irrf = 4665 * 0.275;
        }

        // Valor dependentes
        final double valorDependente = 189.59;
        calcularDependentes = dependentes * valorDependente;

        // Valor Assistencia
        valorAssistencia = salarioBase * 0.05;

        // Vale transporte
        valeTransporte = salarioBase * 0.06;

        // Salario Liquido
        salarioLiquido = (salarioBase - irrf - inss - valeTransporte - valorAssistencia) + dependentes;


    }


    public void imprimeFuncionario() {

        System.out.print("\n");
        System.out.print("---- DADOS DO FUNCIONARIO ----\n");
        System.out.print("\n");
        System.out.print("Funcionario: " + "(" + codigo + ") " + nome + "\n");
        System.out.print("Pai: " + pai + "\n");
        System.out.print("Mãe: " + mae + "\n");
        System.out.print("Telefone: " + telefone + "\n");
        System.out.print("\n");
        System.out.print("---- HOLERITE ----\n");
        System.out.print("Salario Base " + String.format("%.2f", salarioBase) + "\n");
        System.out.print("Dependentes quantidade: " + dependentes + "\n");
        System.out.print("Salario Familia: " + String.format("%.2f", calcularDependentes , "\n"));
        System.out.print("Deposisto FGTS: " + fgts + "\n");
        System.out.print("\n");
        System.out.print("---- DESCONTOS ----\n");
        System.out.print("Desconto Trasporte: " + valeTransporte + "\n");
        System.out.print("Desconto Assistência: " + valorAssistencia + "\n");
        System.out.print("Desconto INSS: " + inss + "\n");
        System.out.print("Desconto IRRF" + irrf + "\n");
        System.out.print("Salario Liquido: " + salarioLiquido + "\n");

    }

    public static void main() {
        Program program = new Program();
        program.cadastroFuncionario();
        program.cadastroHolerite();
        program.imprimeFuncionario();
    }
}





