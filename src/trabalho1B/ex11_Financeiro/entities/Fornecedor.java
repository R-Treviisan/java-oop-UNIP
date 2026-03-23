package trabalho1B.ex11_Financeiro.entities;

public class Fornecedor extends PessoaJuridica {
    private double limite_compra;
    private String data_cadastro;
    private String site;

    public Fornecedor() {

    }

    public Fornecedor(int id, String nome, Endereco endereco, Telefone telefone,
                      String email, String cnpj, String inscricao_estadual, String contato,
                      double limite_compra, String data_cadastro, String site) {

        super(id, nome, endereco, telefone, email, cnpj, inscricao_estadual, contato);
        this.limite_compra = limite_compra;
        this.data_cadastro = data_cadastro;
        this.site = site;
    }

    @Override
    public void entrar() {
        super.entrar();
        System.out.println("--------CADASTRO FORNECEDOR--------");
        System.out.print("Limite de compra: ");
        this.limite_compra = leia.nextDouble();
        leia.nextLine();

        System.out.print("Data de cadastro");
        this.data_cadastro = leia.nextLine();

        System.out.println("Site: ");
        this.site = leia.nextLine();

    }

    @Override
    public void imprimir() {
        super.imprimir();

        System.out.print("Limite de compra: " + this.limite_compra);
        System.out.print("Data de cadastro" + this.data_cadastro);
        System.out.println("Site: " + this.site);

    }

    public void alterarFornecedor() {
        int opcao;

        do {
            System.out.println("---- ALTERAR FORNECEDOR ----");
            System.out.println("1 - Limite de compra");
            System.out.println("2 - Data de cadastro");
            System.out.println("3 - Site");
            System.out.println("4 - Telefone");
            System.out.println("5 - Endereço");
            System.out.println("0 - Sair");

            System.out.print("Opção: ");
            opcao = leia.nextInt();
            leia.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Novo limite de compra: ");
                    this.limite_compra = leia.nextDouble();
                    break;

                case 2:
                    System.out.print("Nova data de cadastro: ");
                    this.data_cadastro = leia.nextLine();
                    break;

                case 3:
                    System.out.print("Novo site: ");
                    this.site = leia.nextLine();
                    break;

                case 4:
                    System.out.println("Novo telefone: ");
                    this.getTelefone().alterarTelefone();
                    break;

                case 5:
                    System.out.println("Novo endereço: ");
                    this.getEndereco().alterarEndereco();
                    break;

                case 0:
                    System.out.println("Voltando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);
    }

    public double getLimite_compra() {
        return limite_compra;
    }

    public void setLimite_compra(double limite_compra) {
        this.limite_compra = limite_compra;
    }

    public String getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(String data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }
}
