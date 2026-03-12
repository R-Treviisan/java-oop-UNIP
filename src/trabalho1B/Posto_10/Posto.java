// Um posto está vendendo combustíveis com a seguinte tabela de descontos:
// até 20 litros, desconto de 3% no Etanol, desconto de 5% acima de 20 litros,
// desconto de 4% por litro Gasolina abaixo de 20 litros,
// desconto de 6% acima de 20 litros.
// Faça uma classe que leia o número de litros vendidos e o tipo de combustível
// (codificado da seguinte forma: E-etanol, G-gasolina),
// calcule e imprima o valor a ser pago pelo cliente,
// sabendo-se que o preço do litro da gasolina é R$ 5,35
// e o preço do litro do etanol é R$ 3,79.


package trabalho1B.Posto_10;

import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class Posto {
    public int combustivel;
    public String tipo;
    public int litro;
    public double valorUni;
    public double valor;
    public double desconto;
    public double valorTotal;
    public double totalPagar;

    public void Entrada() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o Combustivel");
        System.out.println(" ");
        System.out.print(" 1 - Gasolina \n"
                + " 2 - Etanol \n");

        System.out.print("Opção: ");
        combustivel = scanner.nextInt();

        System.out.println("");
        System.out.print("Litros: ");
        litro = scanner.nextInt();

    }

    public void Calculo() {

        switch (combustivel) {
            case 1:
                valorUni = 5.35;
                tipo = "Gasolina";
                valorTotal = litro * valorUni ;
                if (litro <= 20) {
                    desconto = valorTotal * 0.04;
                    totalPagar = valorTotal - desconto;
                } else {
                    desconto = valorTotal * 0.06;
                    totalPagar = valorTotal - desconto;
                }
                break;

            case 2:
                tipo = "Etanol";
                valorUni = 3.79;
                valorTotal = litro * valorUni ;

                if (litro <= 20) {
                    desconto = valorTotal * 0.03;
                    totalPagar = valorTotal - desconto;
                } else {
                    desconto = valorTotal * 0.05;
                    totalPagar = valorTotal - desconto;
                }
                break;

        }

    }

    public void Imprimir() {
        System.out.println("|------------------------------------------------------------------|");
        System.out.println("               Combustivel ---- " + tipo + "           ");
        System.out.println("|------------------------------------------------------------------|");
        System.out.println("| Valor uni | Quantidade | Valor Total | Desconto | Total a Pagar |");
        System.out.println("|-----------|------------|-------------|----------|-----------------|");
        System.out.println("|   " + valorUni  + "    |     " + litro + "     |    " + String.format("%.2f", valorTotal)
                + "    |    " + String.format("%.2f" , desconto) + "  |     "
                + String.format("%.2f", totalPagar) + "     |");
        System.out.println("|------------------------------------------------------------------|");

    }

    static void main(String[] args) {
        Posto posto = new Posto();

        posto.Entrada();
        posto.Calculo();
        posto.Imprimir();

    }

}
