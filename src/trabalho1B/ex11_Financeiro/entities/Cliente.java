package trabalho1B.ex11_Financeiro.entities;

public class Cliente extends PessoaJuridica{
    private double limite_credito;
    private Endereco endereco_cobranca;

    public Cliente() {
    }

    public Cliente(int id, String nome, Endereco endereco, Telefone telefone, String email,
                   String cnpj, String inscricao_estadual, String contato,
                   double limite_credito, Endereco endereco_cobranca) {

        super(id, nome, endereco, telefone, email, cnpj, inscricao_estadual, contato);
        this.limite_credito = limite_credito;
        this.endereco_cobranca = endereco_cobranca;
    }

    @Override
    public void entrar(){
        super.entrar();

        System.out.println("-------CADASTRO DE CLIENTE------");

        System.out.print("Limite de credito: R$");
        this.limite_credito = leia.nextDouble();
        leia.nextLine();

        System.out.println("O endereço de cobrança é o mesmo do cadastro? S/N ");
        char resp = leia.nextLine().toUpperCase().charAt(0);

        if(resp == 'S'){
            endereco_cobranca = getEndereco();
        }else {
            endereco_cobranca = new Endereco();
            endereco_cobranca.entrar();
        }


    }

    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("");
        System.out.println("--------CLIENTE------");
        System.out.println("Limite de credito: R$" + this.limite_credito);
        if(endereco_cobranca != null){
        System.out.println("Endereço de combrança");
        endereco_cobranca.imprimir();
        }

    }

    public void alterarCliente(){

        int opcao;

        do {
            System.out.println("---- ALTERAR CLIENTE ----");
            System.out.println("1 - Limite de credito");
            System.out.println("2 - Endereço de cobrança");
            System.out.println("3 - Endereço ");
            System.out.println("4 - Telefone");
            System.out.println("0 - Sair");

            System.out.print("Opção: ");
            opcao = leia.nextInt();
            leia.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Novo limite de credito: ");
                    this.limite_credito = leia.nextDouble();
                    break;

                case 2:
                    System.out.print("Novo endereço de cobrança: ");
                    endereco_cobranca.entrar();
                    break;

                case 3:
                    System.out.println("Novo endereço: ");
                    this.getEndereco().alterarEndereco();
                    break;

                case 4:
                    System.out.println("Novo telefone: ");
                    this.getTelefone().alterarTelefone();
                    break;


                case 0:
                    System.out.println("Voltando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);
    }


    public double getLimite_credito() {
        return limite_credito;
    }

    public void setLimite_credito(double limite_credito) {
        this.limite_credito = limite_credito;
    }

    public Endereco getEndereco_cobranca() {
        return endereco_cobranca;
    }

    public void setEndereco_cobranca(Endereco endereco_cobranca) {
        this.endereco_cobranca = endereco_cobranca;
    }
}
