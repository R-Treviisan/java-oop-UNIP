package aula03.exercicio1_enunciado.application;

import java.util.Scanner;

public class Program {


    private int alu_codigo;
    private String alu_cpf;
    private String alu_rg;
    private String alu_nome;
    private String alu_endereco;
    private int alu_numero;
    private String alu_complemento;
    private String alu_bairro;
    private String alu_cidade;
    private String alu_estado;
    private String alu_telefone;
    private String alu_celular;
    private String alu_email;
    private double alu_salario;
    private boolean alu_masculino;

    public void entradaAluno() {
        Scanner sc = new Scanner(System.in);

        System.out.println("---- CADASTRO DO ALUNO ----");

        System.out.print("Codigo: ");
        alu_codigo = sc.nextInt();
        sc.nextLine();

        System.out.print("CPF: ");
        alu_cpf = sc.nextLine();

        System.out.print("RG: ");
        alu_rg = sc.nextLine();

        System.out.print("Nome: ");
        alu_nome = sc.nextLine();

        System.out.print("Endereço: ");
        alu_endereco = sc.nextLine();

        System.out.print("Numero: ");
        alu_numero = sc.nextInt();
        sc.nextLine();

        System.out.print("Complemento: ");
        alu_complemento = sc.nextLine();

        System.out.print("Bairro: ");
        alu_bairro = sc.nextLine();

        System.out.print("Cidade: ");
        alu_cidade = sc.nextLine();

        System.out.print("Estado: ");
        alu_estado = sc.nextLine();

        System.out.print("Telefone: ");
        alu_telefone = sc.nextLine();

        System.out.print("Celular: ");
        alu_celular = sc.nextLine();

        System.out.print("Email: ");
        alu_email = sc.nextLine();

        System.out.print("Salario: ");
        alu_salario = sc.nextDouble();

        System.out.print("Sexo (M/F): ");
        char sexo = sc.next().toUpperCase().trim().charAt(0);
        alu_masculino = (sexo == 'M');

    }

    public void imprimeAluno() {
        System.out.println("----- DADOS DO ALUNO -----");
        System.out.println("Código: " + alu_codigo);
        System.out.println("CPF: " + alu_cpf);
        System.out.println("RG: " + alu_rg);
        System.out.println("Nome: " + alu_nome);
        System.out.println("Endereço: " + alu_endereco + ", Nº " + alu_numero);
        System.out.println("Complemento: " + alu_complemento);
        System.out.println("Bairro: " + alu_bairro);
        System.out.println("Cidade: " + alu_cidade);
        System.out.println("Estado: " + alu_estado);
        System.out.println("Telefone: " + alu_telefone);
        System.out.println("Celular: " + alu_celular);
        System.out.println("Email: " + alu_email);
        System.out.println("Salário: R$ " + String.format("%.2f", alu_salario));
        System.out.println("Sexo: " + (alu_masculino ? "Masculino" : "Feminino"));
    }

    static void main() {
        Program program = new Program();
        program.entradaAluno();
        program.imprimeAluno();


    }
}
