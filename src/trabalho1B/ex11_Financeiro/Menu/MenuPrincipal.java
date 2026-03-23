package trabalho1B.ex11_Financeiro.Menu;


import trabalho1B.ex11_Financeiro.entities.*;

import java.awt.*;
import java.util.Scanner;

public class MenuPrincipal {
    Scanner leia = new Scanner(System.in);
    private Cliente cliente;
    private Fornecedor fornecedor;
    private Funcionario funcionario;
    private Receber receber;
    private Pagar pagar;

    public MenuPrincipal() {
        cliente = new Cliente();
        fornecedor = new Fornecedor();
        funcionario = new Funcionario();
        receber = new Receber();
        pagar = new Pagar();
    }


    public void menu() {

        int opcao;

        do {
            System.out.println("--------MENU PRINCIPAL--------");
            System.out.println("1 - Funcionários\n" +
                    "2 - Clientes\n" +
                    "3 - Fornecedores\n" +
                    "4 - Receber\n" +
                    "5 - Pagar\n" +
                    "6 - Caixa\n" +
                    "7 - Sair");

            System.out.print("Opção: ");
            opcao = leia.nextInt();
            System.out.println("");

            switch (opcao) {
                case 1:
                    subMenuFuncionario();
                    break;

                case 2:
                    subMenuCliente();
                    break;

                case 3:
                    subMenuFornecedor();
                    break;

                case 4:
                    subMenuReceber();
                    break;

                case 5:
                    subMenuPagar();
                    break;

                case 6:
                    subMenuCaixa();
                    break;

                case 7:
                    System.exit(0);

            }
        } while (opcao != 7);
    }

    public void subMenuFuncionario() {
        String opcao;
        do {
            System.out.println("");
            System.out.println("a. Incluir\n" +
                    "b. Alterar\n" +
                    "c. Consultar\n" +
                    "d. Excluir\n" +
                    "e. Voltar");
            System.out.print("Opção: ");
            opcao = leia.next().toLowerCase();

            switch (opcao) {
                case "a":
                    funcionario.entrar();
                    break;

                case "b":
                    funcionario.alterarFuncionario();
                    break;

                case "c":
                    funcionario.imprimir();
                    break;

                case "d":
                    funcionario = new Funcionario();
                    System.out.println("Funcionario deletado ");
                    break;

                case "e":
                    menu();
                    break;

                default:
                    System.out.println("Opção invalida");
            }

        } while (opcao != "e");


    }

    public void subMenuCliente() {
        String opcao;
        do {
            System.out.println("");
            System.out.println("a. Incluir\n" +
                    "b. Alterar\n" +
                    "c. Consultar\n" +
                    "d. Excluir\n" +
                    "e. Voltar");
            System.out.print("Opção: ");
            opcao = leia.next().toLowerCase();

            switch (opcao) {
                case "a":
                    cliente.entrar();
                    break;

                case "b":
                    cliente.alterarCliente();
                    break;

                case "c":
                    cliente.imprimir();
                    break;

                case "d":
                    cliente = new Cliente();
                    System.out.println("Cliente deletado ");
                    break;

                case "e":
                    menu();
                    break;

                default:
                    System.out.println("Opção invalida");
            }

        } while (opcao != "e");

    }

    public void subMenuFornecedor() {
        String opcao;
        do {
            System.out.println("");
            System.out.println("a. Incluir\n" +
                    "b. Alterar\n" +
                    "c. Consultar\n" +
                    "d. Excluir\n" +
                    "e. Voltar");
            System.out.print("Opção: ");
            opcao = leia.next().toLowerCase();

            switch (opcao) {
                case "a":
                    fornecedor.entrar();
                    break;

                case "b":
                    fornecedor.alterarFornecedor();
                    break;

                case "c":
                    fornecedor.imprimir();
                    break;

                case "d":
                    fornecedor = new Fornecedor();
                    System.out.println("Fornecedor deletado ");
                    break;

                case "e":
                    menu();
                    break;

                default:
                    System.out.println("Opção invalida");
            }

        } while (opcao != "e");


    }

    public void subMenuReceber() {
        String opcao;
        do {
            System.out.println("");
            System.out.println("a. Incluir\n" +
                    "b. Alterar\n" +
                    "c. Consultar\n" +
                    "d. Excluir\n" +
                    "e. Voltar");
            System.out.print("Opção: ");
            opcao = leia.next().toLowerCase();

            switch (opcao) {
                case "a":
                    receber.entrar();
                    break;

                case "b":
                    receber.alterarReceber();
                    break;

                case "c":
                    receber.imprimir();
                    break;

                case "d":
                    receber = new Receber();
                    System.out.println("Receber deletado ");
                    break;

                case "e":
                    menu();
                    break;

                default:
                    System.out.println("Opção invalida");
            }

        } while (opcao != "e");
    }

    public void subMenuPagar() {

        String opcao;
        do {
            System.out.println("");
            System.out.println("a. Incluir\n" +
                    "b. Alterar\n" +
                    "c. Consultar\n" +
                    "d. Excluir\n" +
                    "e. Voltar");
            System.out.print("Opção: ");
            opcao = leia.next().toLowerCase();

            switch (opcao) {
                case "a":
                    pagar.entrar();
                    break;

                case "b":
                    pagar.alterarPagar();
                    break;

                case "c":
                    pagar.imprimir();
                    break;

                case "d":
                    pagar = new Pagar();
                    System.out.println("Pagar deletado ");
                    break;

                case "e":
                    menu();
                    break;

                default:
                    System.out.println("Opção invalida");
            }

        } while (opcao != "e");

    }

    public void subMenuCaixa() {
        System.out.println("");
        System.out.println("------- FLUXO DE CAIXA -------");

        double saldo = 0;

        //receber
        double credito1 = receber.getValor();
        double debito1 = 0;

        saldo = saldo + credito1 - debito1;

        System.out.println("| " + receber.getVencimento() + " | " + credito1 + " | " + debito1 + " | " + saldo + "  |");


        //pagar
        double credito2 = 0;
        double debito2 = pagar.getValor();

        saldo = saldo + credito2 - debito2;

        System.out.println("| " + pagar.getVencimento() + " |  " + credito2 + " | " + debito2 + " | " + saldo + " |");
    }

    static void main(String[] args) {
        MenuPrincipal menu = new MenuPrincipal();
        menu.menu();


    }


}