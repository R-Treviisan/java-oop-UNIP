package trabalho1B.ex05_Idade;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class idade_2_0 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNascimento = null;

        while (dataNascimento == null) {
            System.out.print("Digite sua data de nascimento (dd/MM/yyyy): ");
            String data = sc.nextLine();

            try {
                dataNascimento = LocalDate.parse(data, dtf);
            } catch (DateTimeException e) {
                System.out.println("Formato inválido. Use dd/MM/yyyy");
            }
        }

        LocalDate hoje = LocalDate.now();

        int idadeAno = hoje.getYear() - dataNascimento.getYear();
        int idadeMes = hoje.getMonthValue() - dataNascimento.getMonthValue();
        int idadeDia = hoje.getDayOfMonth() - dataNascimento.getDayOfMonth();

        // Evitar negativos se o dia for menor que 0 ele faz ex: -15 + 30 = 15
        // a ultima linha do if diminui um mes ou ano que peguei emprestado para não ficar negativo
        // isso evita dia e mes negativos

        if (idadeDia < 0) {
            idadeDia += 30;
            idadeMes--;
        }

        if (idadeMes < 0) {
            idadeMes += 12;
            idadeAno--;
        }

        int dias = idadeAno * 365 + idadeMes * 30 + idadeDia;

        System.out.println("Você viveu aproximadamente " + dias + " dias");
    }
}
