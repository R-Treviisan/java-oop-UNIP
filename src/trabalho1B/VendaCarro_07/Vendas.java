
// Uma revendedora de carros usados paga a seus funcionários
// vendedores um salário fixo por mês, mais uma comissão também
// fixa para cada carro vendido e mais 5% do valor das vendas por ele efetuadas.
// Faça uma classe que leia o número de carros por ele vendidos,
// o valor total de suas vendas, o salário fixo e o valor que ele recebe por carro vendido.
// Calcule e escreva o salário final do vendedor.


package trabalho1B.VendaCarro_07;

import java.util.Scanner;

public class Vendas {
    public char resp;
    public String funcionario;
    public double salario;
    public int carro;
    public double totalVendas;
    public double totalSalario;
    public double percentVenda;

    public void Entrada(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do vendedor: ");
        funcionario = scanner.nextLine();

        System.out.print("Valor do salario base: ");
        salario = scanner.nextInt();

        do{
            System.out.println("");
            System.out.println("Registrar Venda");

            System.out.print("Qual o valor da venda? ");
            double venda = scanner.nextDouble();
            carro ++;
            totalVendas += venda;

            System.out.println("");
            System.out.print("Registrar nova venda? S/N ");
            resp = scanner.next().toUpperCase().charAt(0);
            System.out.println("");

        }while (resp != 'N');

    }

    public void Calculo(){

        percentVenda = totalVendas * 0.05;
        totalSalario = salario + percentVenda;

    }

    public void Imprimir(){

        System.out.println("O vendedor " + funcionario);
        System.out.println("Vendeu um total de " + carro + " carros");
        System.out.println("No valor total de R$ " + totalVendas);
        System.out.println("Salario Base " + salario);
        System.out.println("Comissão por vendas R$" + percentVenda );
        System.out.println("Valor total a receber R$" + totalSalario);

    }

    static void main(String[] args) {
        Vendas vendas = new Vendas();

        vendas.Entrada();
        vendas.Calculo();
        vendas.Imprimir();

    }


}
