// Uma empresa quer verificar se um empregado está qualificado para a
// aposentadoria ou não. Para estar em condições, um dos seguintes
// requisitos deve ser satisfeito:
// Ter no mínimo 65 anos de idade e ser do sexo masculino.
// Ter no mínimo 60 anos de idade e ser do sexo feminino.
// Ter trabalhado no mínimo 30 anos para homens.
// Ter trabalhado no mínimo 25 anos para mulher.
//Com base nas informações acima, faça uma classe que leia: o número do empregado (código),
// o ano de seu nascimento e o ano de seu ingresso na empresa. O programa deverá escrever a
// idade e o tempo de trabalho do empregado e a mensagem 'Requerer aposentadoria' ou
// 'Não requerer aposentadoria'.


package trabalho1B.ex08_Aposentadoria;

import java.time.LocalDate;
import java.util.Scanner;

public class Aposentadoria {

    public String codigo;
    public char sexo;
    public String dataTrabalho;
    public String dataNascimento;
    public int idade;
    public int tempoTrabalho;

    public void Entrada() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Código do funcionario: ");
        codigo = scanner.nextLine();

        System.out.print("Sexo do funcionario: M/F ");
        sexo = scanner.next().toUpperCase().charAt(0);
        scanner.nextLine();

        System.out.print("Data de Nascimento, dd/mm/aaaa: ");
        dataNascimento = scanner.nextLine();

        System.out.print("Data do primeiro registro, dd/mm/aaaa: ");
        dataTrabalho = scanner.nextLine();




    }

    public  void Calculo() {
        String[] partesDataNascimento = dataNascimento.split("/");
        String[] partesDataTrabalho = dataTrabalho.split("/");

        int diaNascimento = Integer.parseInt(partesDataNascimento[0]);
        int mesNascimento = Integer.parseInt(partesDataNascimento[1]);
        int anoNascimento = Integer.parseInt(partesDataNascimento[2]);

        LocalDate hoje = LocalDate.now();
        int anoTotal = hoje.getYear();

        idade = anoTotal - anoNascimento;

        int diaTrabalho = Integer.parseInt(partesDataTrabalho[0]);
        int mesTrabalho = Integer.parseInt(partesDataTrabalho[1]);
        int anoTrabalho = Integer.parseInt(partesDataTrabalho[2]);

        tempoTrabalho = anoTotal - anoTrabalho;

    }

    public void Imprimir(){
        if(sexo == 'M' && idade >= 65 && tempoTrabalho >= 30) {
            System.out.println("Funcionario: " + codigo);
            System.out.println("Idade: " + idade + "anos");
            System.out.println("Tempo de serviço: " + tempoTrabalho + "anos");
            System.out.println("Requerer aposentadoria");

        }else if(sexo == 'F' && idade >= 60 && tempoTrabalho >= 25){
            System.out.println("Funcionario: " + codigo);
            System.out.println("Idade: " + idade + "anos");
            System.out.println("Tempo de serviço: " + tempoTrabalho + "anos");
            System.out.println("Requerer aposentadoria");

        }else{
            System.out.println("Funcionario: " + codigo);
            System.out.println("Idade: " + idade + "anos");
            System.out.println("Tempo de serviço: " + tempoTrabalho + "anos");
            System.out.println("Não requerer aposentadoria");
        }

    }

    static void main(String[] args) {

        Aposentadoria aposentadoria = new Aposentadoria();

        aposentadoria.Entrada();
        aposentadoria.Calculo();
        aposentadoria.Imprimir();

    }

}
