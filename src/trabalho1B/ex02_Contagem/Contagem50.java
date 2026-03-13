
//*Faça uma classe que leia um número inteiro e imprima os 50 números anteriores e os 50 números posteriores.*//

package trabalho1B.ex02_Contagem;

import java.util.Scanner;

public class Contagem50 {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero para contagem: ");
        int n = scanner.nextInt();

        for (int i = -50; i <= 50; i++ ){

            System.out.print(n+i + ", ");

        }



    }

}
