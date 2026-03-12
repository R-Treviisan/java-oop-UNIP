//*Faça uma classe que leia o nome do município, o total de eleitores,
// o número de votos em branco, o número de votos nulos e o número de votos válidos.
// Calcular e imprimir de acordo com a tabela abaixo:


package trabalho1B.Municipio_06;

import java.util.Scanner;

public class Municipios {
    String municipio;
    double eleitores;
    double votoBranco;
    double resultBranco;
    double votoNulo;
    double resultNulo;
    double votoValido;


    public void Entrada(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Municipio: ");
        municipio = scanner.nextLine();

        System.out.print("Eleitores: ");
        eleitores = scanner.nextDouble();

        System.out.print("Votos em Branco: ");
        votoBranco = scanner.nextDouble();

        System.out.print("Votos Nulos: ");
        votoNulo = scanner.nextDouble();

    }

    public void Calculo(){
         resultBranco = (votoBranco * 100) / eleitores ;
         resultNulo = (votoNulo * 100) / eleitores;
         votoValido = eleitores - votoBranco - votoNulo;

    }

    public void Imprimir(){
        System.out.println("\nRESULTADO DA VOTAÇÃO");
        System.out.println("------------------------------------");

        System.out.println("| Municipio: | " + municipio + "  |" + "Porcentagem |");
        System.out.println("|------------|--------|------------|");
        System.out.println("| Eleitores: | " + eleitores + " |    100%    |");
        System.out.println("|------------|--------|------------|");
        System.out.println("| Brancos:   | " + votoBranco + "  |    " + resultBranco + "%   |");
        System.out.println("|------------|--------|------------|");
        System.out.println("| Nulos:     | " + votoNulo + "  |    " + resultNulo +"%   |");
        System.out.println("|------------|--------|------------|");
        System.out.println("| Validos:   | "  + votoValido + "  |    100%    |");
        System.out.println("------------------------------------");

    }

    static void main(String[] args) {
        Municipios municipios = new Municipios();

        municipios.Entrada();
        municipios.Calculo();
        municipios.Imprimir();


    }

}
