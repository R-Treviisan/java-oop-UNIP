//*Faça uma classe que leia a idade de uma pessoa em ano,
// meses e dias e imprima a idade em dias.
// Considerar ano com 365 dias e mês com 30 dias.*\\


package trabalho1B.ex05_Idade;

import java.util.Scanner;

public class Idade {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua data de nascimento: ");
        String dataNascimento = scanner.nextLine();

        String[] partes = dataNascimento.split("/");

        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int ano = Integer.parseInt(partes[2]);


        int viveuAno = 365 * ano;
        int viveuMes = 30 * mes;
        int viveuTotal = viveuMes + viveuAno + dia;

        System.out.println("Você " + viveuTotal + " Dias");


    }

}
