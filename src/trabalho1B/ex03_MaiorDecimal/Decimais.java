//*Faça uma classe que receba três números com decimais e imprima o maior deles.*//


package trabalho1B.ex03_MaiorDecimal;

import java.util.Scanner;

public class Decimais {

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float num = 0;

        for (int i = 1; i <= 3; i++) {

            System.out.print("Digite um numero: ");
            String valor= scanner.nextLine();

            valor = valor.replace(",", ".");

            float numAux = Float.parseFloat(valor);

            if (i == 1){
                num = numAux;
            }

            if (numAux > num) {
                num = numAux;
            }


        }

        System.out.println("");
        System.out.println("---------------------------------------------");
        System.out.println("O numero maior foi " + num);


    }

}
