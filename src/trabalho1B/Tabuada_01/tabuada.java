
//*Faça uma classe que entre com um número inteiro e imprima sua tabuada.*//

package trabalho1B.Tabuada_01;

import java.util.Scanner;

public class tabuada {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Qual a tabudaquer ver?");
        int n = sc.nextInt();

        for (int i=0; i <= 10; i++){

            System.out.println(n + " X " + i + " = " + n*i);
        }

    }
}
