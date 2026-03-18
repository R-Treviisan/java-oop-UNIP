package trabalho1B.ex11_Financeiro.entities;


import trabalho1B.ex11_Financeiro.interfaces.InterfaceCadastro;

public class Cliente extends PessoaJuridica implements InterfaceCadastro {
    private double limite_credito;
    private Endereco endereco_cobranca;

    @Override
    public void entrar() {

        System.out.print("Limite de Credito: ");
            super.entrar();

        limite_credito = leia.nextDouble();

        endereco_cobranca = new Endereco();
        endereco_cobranca.entrar();

    }

    @Override
    public void imprimir() {
        super.imprimir();

        System.out.println("Limite de Credito: " + limite_credito);
        endereco_cobranca.imprimir();

    }

    public Cliente(){

    }

    public Cliente(double limite_credito, Endereco endereco_cobranca) {
        this.limite_credito = limite_credito;
        this.endereco_cobranca = endereco_cobranca;
    }

    public Cliente(String cnpj, String inscricao_estadual, String contato, double limite_credito, Endereco endereco_cobranca) {
        super(cnpj, inscricao_estadual, contato);
        this.limite_credito = limite_credito;
        this.endereco_cobranca = endereco_cobranca;
    }

    public Cliente(int id, String nome, Endereco endereco, Telefone telefone, String email, String cnpj, String inscricao_estadual, String contato, double limite_credito, Endereco endereco_cobranca) {
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
}
