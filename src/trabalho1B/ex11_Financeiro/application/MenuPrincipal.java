package trabalho1B.ex11_Financeiro.application;

import trabalho1B.ex11_Financeiro.entities.*;
import trabalho1B.ex11_Financeiro.interfaces.InterfaceCadastro;

import java.util.Scanner;


public class MenuPrincipal {
    Scanner leia = new Scanner(System.in);
    private Cliente cliente = new Cliente();
    private Fornecedor fornecedor = new Fornecedor();
    private Funcionario funcionario = new Funcionario();
    private Receber receber = new Receber();
    private Pagar pagar = new Pagar();


    public void menu() {

        int opcao;

        do {
            System.out.println("\n========MENU PRINCIPAL========");
            System.out.println("1 - Funcionario");
            System.out.println("2 - Cliente");
            System.out.println("3 - Fornecedor");
            System.out.println("4 - Receber");
            System.out.println("5 - Pagar");

            System.out.println("0 - Sair ");

            System.out.println("Opção: ");
            opcao = leia.nextInt();
            leia.nextLine();

            switch (opcao) {
                case 1:
                    menuFuncionario();
                    break;
                case 2:
                    menuCliente();
                    break;
                case 3:
                    menuFornecedor();
                    break;
                case 4:
                    menuReceber();
                    break;
                case 5:
                    menuPagar();
                    break;
                case 0:
                    System.out.println("SAINDO");
                    break;
                default:
                    System.out.println("Opção inválida");


            }
        } while (opcao != 0);

    }

    public void menuFuncionario() {
        String opcao;
        do {
            System.out.println("a - Incluir");
            System.out.println("b - Alterar");
            System.out.println("c - Consultar");
            System.out.println("d - Excluir");
            System.out.println("e - Sair ");

            System.out.println("Opcao: ");
            opcao = leia.nextLine();

            switch (opcao) {
                case "a":
                    funcionario.entrar();
                    break;
                case "b":
                    funcionario.entrar();
                    break;

                case "c":
                    funcionario.imprimir();
                    break;
                case "d":
                    System.out.println("Funcionario excluido com sucesso"); //tem que criar array
                    break;

                default:
                    System.out.println("Opção incorreta");
            }

        } while (opcao.equals("e"));
    }

    public void menuCliente() {
        String opcao;

        do {
            System.out.println("a - Incluir");
            System.out.println("b - Alterar");
            System.out.println("c - Consultar");
            System.out.println("d - Excluir");
            System.out.println("e - Sair ");

            System.out.println("Opcao: ");
            opcao = leia.nextLine();

            switch (opcao) {
                case "a":
                    cliente.entrar();
                    break;
                case "b":
                    cliente.entrar();
                    break;

                case "c":
                    cliente.imprimir();
                    break;
                case "d":
                    System.out.println("Cliente excluido com sucesso"); //tem que criar array
                    break;

                default:
                    System.out.println("Opção incorreta");
            }

        } while (opcao.equals("e"));

    }

    public void menuFornecedor() {
        String opcao;
        do {
            System.out.println("a - Incluir");
            System.out.println("b - Alterar");
            System.out.println("c - Consultar");
            System.out.println("d - Excluir");
            System.out.println("e - Sair ");

            System.out.println("Opcao: ");
            opcao = leia.nextLine();

            switch (opcao) {
                case "a":
                    fornecedor.entrar();
                    break;
                case "b":
                    fornecedor.entrar();
                    break;

                case "c":
                    fornecedor.imprimir();
                    break;
                case "d":
                    System.out.println("Fornecedor excluido com sucesso"); //tem que criar array
                    break;

                default:
                    System.out.println("Opção incorreta");
            }

        } while (opcao.equals("e"));


    }

    public void menuReceber() {
        String opcao;
        do {
            System.out.println("a - Incluir");
            System.out.println("b - Alterar");
            System.out.println("c - Consultar");
            System.out.println("d - Excluir");
            System.out.println("e - Sair ");

            System.out.println("Opcao: ");
            opcao = leia.nextLine();

            switch (opcao) {
                case "a":
                    receber.entrar();
                    break;
                case "b":
                    receber.entrar();
                    break;
                case "c":
                    receber.imprimir();
                    break;
                case "d":
                    System.out.println("Receber excluído com sucesso");
                    break;
            }
        } while (opcao.equals("e"));


    }

    public void menuPagar() {
        String opcao;
        do {
            System.out.println("a - Incluir");
            System.out.println("b - Alterar");
            System.out.println("c - Consultar");
            System.out.println("d - Excluir");
            System.out.println("e - Sair ");

            System.out.println("Opcao: ");
            opcao = leia.nextLine();

            switch (opcao) {
                case "a":
                    pagar.entrar();
                    break;
                case "b":
                    pagar.entrar();
                    break;
                case "c":
                    pagar.imprimir();
                    break;
                    case "d":
                        System.out.println("Pagamento excluido com  sucesso");
                        break;
                case "e":
                    System.out.println("");
                    break;
                    default:
                        System.out.println("Opção incorreta");
                        menuPagar();
            }
        }  while (opcao.equals("e"));
    }

    public void fluxoCaixa() {
        System.out.println("-----------------------------------------------");
        System.out.println("|                 FLUXO CAIXA                 |");
        System.out.println("-----------------------------------------------");
        System.out.println("| VENCIMENTO | CRÉDITO | DÉBITO | SALDO |");
        System.out.println("-----------------------------------------------");
        System.out.println("");


    }

    public static void main(String[] args) {

        MenuPrincipal menu = new MenuPrincipal();
        menu.menu();

    }



}
