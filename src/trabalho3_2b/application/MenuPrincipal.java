package trabalho3_2b.application;

import trabalho1B.ex11_Financeiro.entities.Fornecedor;
import trabalho3_2b.entities.Cliente;
import trabalho3_2b.entities.Funcionario;
import trabalho3_2b.entities.Pagar;
import trabalho3_2b.entities.Receber;

import java.util.Scanner;

public class MenuPrincipal {
    Scanner leia = new Scanner(System.in);
    private Cliente cliente;
    private Fornecedor fornecedor;
    private Funcionario funcionario;
    private Receber receber;
    private Pagar pagar;

    public MenuPrincipal() {
    }

    public MenuPrincipal(Cliente cliente, Fornecedor fornecedor, Funcionario funcionario, Receber receber, Pagar pagar) {
        this.cliente = cliente;
        this.fornecedor = fornecedor;
        this.funcionario = funcionario;
        this.receber = receber;
        this.pagar = pagar;
    }

    public void menu(){
        System.out.println("----MENU PRINCIPAL----");
        System.out.print("escolha uma opção: ");
        System.out.println("2 - Menu Funcionario");
        System.out.println("3 - Menu Fornecedor");
        System.out.println("4 - Menu Cliente");
        System.out.println("5 - Menu Financeiro");
        System.out.println("6 - Menu Pagar");
        System.out.println("7 - Menu Receber");
        System.out.println("8 - Menu Caixa");
        System.out.println("0 - Encerrar");
    }

    public void subMenuFuncionario(){
        int opcao;

        do {
        System.out.println("=== SUB MENU FUNCIONARIO ===");
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Consultar");
        System.out.println("0 - Voltar");
        opcao = leia.nextInt();
        leia.nextLine();
            switch (opcao){
                case 1:
                    funcionario.entrar();
                    break;
                case 2:
                    funcionario = new Funcionario();
                    funcionario.entrar();
                    break;
                case 3:
                    if(funcionario != null){
                    funcionario.imprimir();
                    }else{
                        System.out.println("Funcionario sem cadastro");
                        subMenuFuncionario();
                    }

                    break;
                case 4:
                    funcionario = new Funcionario();
                    System.out.println("Cadastrar Novamente? S/N");
                    char resp = leia.nextLine().toUpperCase().charAt(0);
                    if (resp == 'S'){
                        funcionario.entrar();
                    }else {
                        subMenuFuncionario();
                    }


            }
        }

    }
}
