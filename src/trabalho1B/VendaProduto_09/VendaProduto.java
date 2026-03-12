//Faça uma classe para ler: a descrição do produto (nome),
// a quantidade adquirida e o preço unitário. Calcular e escrever o total
// (total = quantidade adquirida * preço unitário), o desconto e o total a pagar
// (total a pagar = total - desconto), sabendo-se que:
// Se quantidade <= 5 o desconto será de 2%
// Se quantidade > 5 e quantidade <=10 o desconto será de 3%
// Se quantidade > 10 o desconto será de 5%


package trabalho1B.VendaProduto_09;

import java.util.Scanner;

public class VendaProduto {
    public String produto;
    public int qtdProduto;
    public double valor;
    public double valorTotal;
    public double desconto;
    public double totalPagar;

    public void Entrada() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("REGISTRAR VENDA");
        System.out.println(" ");

        System.out.print("Produto: ");
        produto = scanner.nextLine();

        System.out.print("Quantidade: ");
        qtdProduto = scanner.nextInt();

        System.out.print("Valor: ");
        valor = scanner.nextDouble();

    }

    public void Calculo() {

        valorTotal = valor * qtdProduto;

        if (qtdProduto <= 5) {
            desconto = valorTotal * 0.02;
            totalPagar = valorTotal - desconto;
        } else if (qtdProduto <= 10) {
            desconto = valorTotal * 0.03;
            totalPagar = valorTotal - desconto;
        } else {
            desconto = valorTotal * 0.05;
            totalPagar = valorTotal - desconto;
        }


    }

    public void Imprimir(){
        System.out.println("|-----------------------------------------------------|");
        System.out.println("|           Produto               " + produto + "           |");
        System.out.println("|-----------------------------------------------------|");
        System.out.println("| Quantidade | Valor Total | Desconto | Total a Pagar |");
        System.out.println("|------------|-------------|----------|---------------|");
        System.out.println("|      " + qtdProduto + "     |    " + valorTotal + "   |   "
                + desconto + "  |     " + totalPagar + "    |" );
        System.out.println("|-----------------------------------------------------|");
    }

    static void main(String[] args) {
        VendaProduto vendaProduto = new VendaProduto();

        vendaProduto.Entrada();
        vendaProduto.Calculo();
        vendaProduto.Imprimir();


    }


}
