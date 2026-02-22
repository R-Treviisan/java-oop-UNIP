package aula04.Exercicio3_enunciado.application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual mutiplicação? ");
        int n = sc.nextInt();

        int contador = 0;

        while (contador <=10){
            System.out.println(n + " X " + contador + " = " + n * contador);
            contador++;
        }

    }
}
