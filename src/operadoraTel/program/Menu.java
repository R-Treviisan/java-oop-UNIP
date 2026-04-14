package operadoraTel.program;

import operadoraTel.entities.*;

import java.util.Scanner;

public class Menu {
    Scanner leia = new Scanner(System.in);
    private Operadora operadora;
    private Celular celular;
    private Fixo fixo;
    private Telefone telefone;
    private Cliente cliente;


    public void MenuPrincipal() {
        int opcao;
        do {
            System.out.println("------ MENU PRINCIPAL ------");
            System.out.println("");
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Operadora \n" +
                    "2 - Cliente \n" +
                    "3 - Telefone\n" +
                    "4 - Celular\n" +
                    "0 - Sair");
            opcao = leia.nextInt();
            leia.nextLine();

            switch (opcao) {

                case 1:
                    SubMenuOperadora();
                    break;
                case 2:
                    SubMenuCliente();
                    break;
            }

        } while (opcao != 0);
    }

    public void SubMenuOperadora() {
        Operadora operadora = null;
        String opcao;
        System.out.println("------ SUB MENU OPERADORA -----");
        System.out.println("");
        System.out.println("Escolha uma opção: ");
        System.out.println("a - Incluir\n" +
                "b - Alterar\n" +
                "c - Consultar\n" +
                "d - excluir\n" +
                "e - Voltar");

        opcao = leia.nextLine();

        switch (opcao.toLowerCase()) {
            case "a":
                operadora.entrar();
                break;

            case "b":
                operadora = new Operadora();
                operadora.entrar();
                break;
            case "c":
                if (operadora != null) {
                    operadora.imprimir();
                } else {
                    System.out.println("Operadora não cadastrada");
                }
                break;
            case "d":
                operadora = new Operadora();
                break;
            case "e":
                Menu menu = new Menu();
                menu.MenuPrincipal();

        }
        while (opcao != "e") ;
    }

    public void SubMenuCliente() {
        Cliente cliente = null;
        String opcao;
        System.out.println("------ SUB MENU CLIENTE -----");
        System.out.println("");
        System.out.println("Escolha uma opção: ");
        System.out.println("a - Incluir\n" +
                "b - Alterar\n" +
                "c - Consultar\n" +
                "d - excluir\n" +
                "e - Voltar");

        opcao = leia.nextLine();

        switch (opcao.toLowerCase()) {
            case "a":
                cliente.entrar();
                break;

            case "b":
                cliente.entrar();
                break;
            case "c":
                if (cliente != null) {
                    cliente.imprimir();
                } else {
                    System.out.println("Cliente não criado");
                }
                break;
            case "d":
                cliente = new Cliente();
                break;
            case "e":
                Menu menu = new Menu();
                menu.MenuPrincipal();

        }
        while (opcao != "e") ;

    }
}


