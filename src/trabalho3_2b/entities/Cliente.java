package trabalho3_2b.entities;

public class Cliente extends PessoaJuridica{
    private double limite_credito;
    private Endereco endereco_cobranca;

    public Cliente() {
    }

    public Cliente(int id, String nome, Endereco endereco, Telefone telefone,
                   String email, String cnpj, String inscricao_estadual, String contato,
                   double limite_credito, Endereco endereco_cobranca) {

        super(id, nome, endereco, telefone, email, cnpj, inscricao_estadual, contato);
        this.limite_credito = limite_credito;
        this.endereco_cobranca = endereco_cobranca;
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

    @Override
    public void entrar() {
        super.entrar();
        System.out.println("----CADASTRO CLIENTE----");
        System.out.print("Limite de credito");
        limite_credito = leia.nextDouble();
        System.out.print("----ENDEREÇO DE COBRANÇA---- ");
        endereco_cobranca = new Endereco();
        endereco_cobranca.entrar();



    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("----CADASTRO CLIENTE----");
        System.out.println("Limite de credito: " + this.limite_credito);
        System.out.print("----ENDEREÇO DE COBRANÇA---- ");
        if (endereco_cobranca != null) {
            endereco_cobranca.imprimir();
        } else {
            System.out.println("Não cadastrado");
        }

    }
}
