package aula02.exercicio01_completo.application;

import aula02.exercicio01_completo.entities.Pagamento;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---- DADOS DO FUNCIONARIO ----");

        System.out.print("Valor do Salario: ");
        double salarioBruto = sc.nextDouble();

        System.out.print("Adiantamento: ");
        double adiantamento = sc.nextInt();


        while (adiantamento == 0 || adiantamento > salarioBruto){
            System.out.println("O adiantamento não pode ser maior que o salario");
            System.out.print("Digite novamente: ");
            adiantamento = sc.nextDouble();
        }

        Pagamento pagamento = new Pagamento(salarioBruto, adiantamento);

        System.out.println(pagamento);

    }
}
