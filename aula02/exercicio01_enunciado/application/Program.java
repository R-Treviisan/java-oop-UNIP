package aula02.exercicio01_enunciado.application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---- DADOS DO FUNCIONARIO ----");

        System.out.print("Valor do Salario: ");
        double salarioBruto = sc.nextDouble();

        System.out.print("Adiantamento: ");
        double adiantamento = sc.nextInt();


        while (adiantamento == 0 || adiantamento > salarioBruto) {
            System.out.println("O adiantamento não pode ser maior que o salario");
            System.out.print("Digite novamente: ");
            adiantamento = sc.nextDouble();

        }

        double inss = salarioBruto * 0.11;
        double fgts = salarioBruto * 0.08;
        double salarioLiquido = salarioBruto - inss - adiantamento;

        System.out.println("----- HOLERITE ----");
        System.out.println("Salario Bruto: R$" + String.format("%.2f", salarioBruto));
        System.out.println("Adiantamento: R$" + String.format("%.2f", adiantamento));
        System.out.println("Desconto Inss: R$" + String.format("%.2f", inss));
        System.out.println("Desconto FGTS: R$" + String.format("%.2f", fgts));
        System.out.println("--------------------------------------------\n");
        System.out.println("Salario Liquido: R$" + String.format("%.2f", salarioLiquido));
    }
}
