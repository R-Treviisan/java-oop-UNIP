package trabalho1B.ex11_Financeiro.entities;



public class Funcionario extends PessoaFisica {

    private String data_admissao;
    private String data_demissao;
    private String ctps;
    private double salario;

    public Funcionario() {
    }

    public Funcionario(int id, String nome, Endereco endereco, Telefone telefone,
                       String email, String cpf, String rg, String emissor,
                       String data_admissao, String data_demissao, String ctps, double salario) {

        super(id, nome, endereco, telefone, email, cpf, rg, emissor);
        this.data_admissao = data_admissao;
        this.data_demissao = data_demissao;
        this.ctps = ctps;
        this.salario = salario;
    }

    @Override
    public void entrar() {
        super.entrar();
        System.out.println("");
        System.out.println("-------CADASTRO DO FUNCIONARIO -------");

        System.out.print("Data de admissão: ");
        this.data_admissao = leia.nextLine();

        System.out.print("Data de demissão: ");
        this.data_demissao = leia.nextLine();

        System.out.print("CTPS: ");
        this.ctps = leia.nextLine();

        System.out.print("Salario: ");
        this.salario = leia.nextDouble();

    }

    @Override
    public void imprimir() {

        super.imprimir();
        System.out.println("");
        System.out.println("------- FUNCIONARIO -------");

        System.out.println("Data de admissão: " + this.data_admissao);
        System.out.println("Data de demissao: " + this.data_demissao);
        System.out.println("CTPS: " + this.ctps);
        System.out.println("Salario: " + this.salario);
        System.out.println("");

    }

    public void alterarFuncionario(){
        int opcao;

        do {
            System.out.println("---- ALTERAR FUNCIONÁRIO ----");
            System.out.println("1 - Data de admissão");
            System.out.println("2 - Data de demissão");
            System.out.println("3 - CTPS");
            System.out.println("4 - Salário");
            System.out.println("5 - Telefone");
            System.out.println("6 - Endereço");
            System.out.println("0 - Voltar");

            System.out.print("Opção: ");
            opcao = leia.nextInt();


            switch (opcao) {
                case 1:
                    System.out.print("Nova data de admissão: ");
                    this.data_admissao = leia.nextLine();
                    break;

                case 2:
                    System.out.print("Nova data de demissão: ");
                    this.data_demissao = leia.nextLine();
                    break;

                case 3:
                    System.out.print("Nova CTPS: ");
                    this.ctps = leia.nextLine();
                    break;

                case 4:
                    System.out.print("Novo salário: ");
                    this.salario = leia.nextDouble();
                    break;

                case 5:
                    System.out.println("Novo telefone: ");
                    this.getTelefone().alterarTelefone();
                    break;

                case 6:
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



    public String getData_admissao() {
        return data_admissao;
    }

    public void setData_admissao(String data_admissao) {
        this.data_admissao = data_admissao;
    }

    public String getData_demissao() {
        return data_demissao;
    }

    public void setData_demissao(String data_demissao) {
        this.data_demissao = data_demissao;
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


}
