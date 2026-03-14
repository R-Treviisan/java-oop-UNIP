//*Faça uma classe que leia a idade de uma pessoa em ano,
// meses e dias e imprima a idade em dias.
// Considerar ano com 365 dias e mês com 30 dias.*\\


package trabalho1B.ex05_Idade;

import java.time.LocalDate;
import java.util.Scanner;

public class Idade {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua data de nascimento: dd/MM/yyyy: ");
        String dataNascimento = scanner.nextLine();

        // se a data for digitada 210787
        if (dataNascimento.length() == 6) {
            dataNascimento = dataNascimento.substring(0, 2) + "/"
                    + dataNascimento.substring(2, 4) + "/19"
                    + dataNascimento.substring(4, 6);

            // se a data for digitada 21/07/87
        } else if (dataNascimento.length() == 8 && dataNascimento.contains("/")) {
            dataNascimento = dataNascimento.substring(0, 6) + "19"
                    + dataNascimento.substring(6, 8);
        }
        // se a data for digitada 21071987
        else if (dataNascimento.length() == 8 && !dataNascimento.contains("/")) {
            dataNascimento = dataNascimento.substring(0, 2) + "/"
                    + dataNascimento.substring(2, 4) + "/"
                    + dataNascimento.substring(4, 8);
        }


        String[] partes = dataNascimento.split("/");

        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int ano = Integer.parseInt(partes[2]);

        LocalDate agora = LocalDate.now();
        int idadeDia = agora.getDayOfMonth() - dia;
        int idadeMes = agora.getMonthValue() - mes;
        int idadeAno = agora.getYear() - ano;


        int viveuAno = 365 * idadeAno;
        int viveuMes = 30 * idadeMes;
        int viveuTotal = viveuMes + viveuAno + idadeDia;

        System.out.println("Você " + viveuTotal + " Dias");


    }

}
