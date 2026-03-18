package trabalho1B.ex11_Financeiro.application;

import trabalho1B.ex11_Financeiro.entities.*;

import java.util.Scanner;

public class MenuPrincipal {

    private Scanner leia = new Scanner(System.in);

    private Cliente cliente = new Cliente();
    private Fornecedor fornecedor = new Fornecedor();
    private Funcionario funcionario = new Funcionario();
    private Receber receber = new Receber();
    private Pagar pagar = new Pagar();

    public void menu() {

        int opcao;

        do {

            System.out.println("\n======== MENU PRINCIPAL ========");
            System.out.println("1 - Funcionario");
            System.out.println("2 - Cliente");
            System.out.println("3 - Fornecedor");
            System.out.println("4 - Receber");
            System.out.println("5 - Pagar");
            System.out.println("0 - Sair");

            System.out.print("Opcao: ");
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
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opcao invalida");
            }

        } while (opcao != 0);
    }

    public void menuFuncionario() {

        funcionario.lerArquivo();

        String opcao;

        do {

            System.out.println("\n=== MENU FUNCIONARIO ===");
            System.out.println("a - Incluir");
            System.out.println("b - Alterar");
            System.out.println("c - Consultar");
            System.out.println("d - Excluir");
            System.out.println("s - Salvar");
            System.out.println("e - Sair");

            System.out.print("Opcao: ");
            opcao = leia.nextLine();

            switch (opcao) {

                case "a":
                    funcionario.adicionarPessoa();
                    break;

                case "b":

                    System.out.print("Digite o ID do funcionario: ");
                    int idAlterar = leia.nextInt();
                    leia.nextLine();

                    funcionario.alterarPessoa(idAlterar);
                    break;

                case "c":
                    funcionario.listarPessoas();
                    break;

                case "d":

                    System.out.print("Digite o ID da pessoa: ");
                    int idExcluir = leia.nextInt();
                    leia.nextLine();

                    funcionario.excluirPessoa(idExcluir);
                    break;

                case "s":
                    funcionario.salvarArquivo();
                    break;

                case "e":
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opcao incorreta");
            }

        } while (!opcao.equals("e"));
    }

    public void menuCliente() {

        String opcao;

        do {

            System.out.println("\n=== MENU CLIENTE ===");
            System.out.println("a - Incluir");
            System.out.println("c - Consultar");
            System.out.println("s - Salvar");
            System.out.println("e - Sair");

            System.out.print("Opcao: ");
            opcao = leia.nextLine();

            switch (opcao) {

                case "a":
                    cliente.adicionarPessoa();
                    break;

                case "c":
                    cliente.listarPessoas();
                    break;

                case "s":
                    cliente.salvarArquivo();
                    break;

                case "e":
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opcao incorreta");
            }

        } while (!opcao.equals("e"));
    }

    public void menuFornecedor() {

        String opcao;

        do {

            System.out.println("\n=== MENU FORNECEDOR ===");
            System.out.println("a - Incluir");
            System.out.println("c - Consultar");
            System.out.println("s - Salvar");
            System.out.println("e - Sair");

            System.out.print("Opcao: ");
            opcao = leia.nextLine();

            switch (opcao) {

                case "a":
                    fornecedor.adicionarPessoa();
                    break;

                case "c":
                    fornecedor.listarPessoas();
                    break;

                case "s":
                    fornecedor.salvarArquivo();
                    break;

                case "e":
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opcao incorreta");
            }

        } while (!opcao.equals("e"));
    }

    public void menuReceber() {

        String opcao;

        do {

            System.out.println("\n=== MENU RECEBER ===");
            System.out.println("a - Incluir");
            System.out.println("b - Alterar");
            System.out.println("c - Consultar");
            System.out.println("d - Excluir");
            System.out.println("e - Sair");

            System.out.print("Opcao: ");
            opcao = leia.nextLine();

            switch (opcao) {

                case "a":
                case "b":
                    receber.entrar();
                    break;

                case "c":
                    receber.imprimir();
                    break;

                case "d":
                    System.out.println("Receber excluido com sucesso");
                    break;

                case "e":
                    break;

                default:
                    System.out.println("Opcao incorreta");
            }

        } while (!opcao.equals("e"));
    }

    public void menuPagar() {

        String opcao;

        do {

            System.out.println("\n=== MENU PAGAR ===");
            System.out.println("a - Incluir");
            System.out.println("b - Alterar");
            System.out.println("c - Consultar");
            System.out.println("d - Excluir");
            System.out.println("e - Sair");

            System.out.print("Opcao: ");
            opcao = leia.nextLine();

            switch (opcao) {

                case "a":
                case "b":
                    pagar.entrar();
                    break;

                case "c":
                    pagar.imprimir();
                    break;

                case "d":
                    System.out.println("Pagamento excluido com sucesso");
                    break;

                case "e":
                    break;

                default:
                    System.out.println("Opcao incorreta");
            }

        } while (!opcao.equals("e"));
    }

    public void fluxoCaixa() {

        System.out.println("-----------------------------------------------");
        System.out.println("|                FLUXO DE CAIXA               |");
        System.out.println("-----------------------------------------------");
        System.out.println("| VENCIMENTO | CREDITO | DEBITO | SALDO |");
        System.out.println("-----------------------------------------------");
    }

    public static void main(String[] args) {

        MenuPrincipal menu = new MenuPrincipal();
        menu.menu();

    }
}