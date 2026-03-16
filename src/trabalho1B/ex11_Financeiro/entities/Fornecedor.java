package trabalho1B.ex11_Financeiro.entities;

public class Fornecedor extends PessoaJuridica{
    private double limite_compra;
    private String data_cadastro;
    private String site;


    public void entrar() {
        super.entrar();

        System.out.println("Limite de Compra: ");
        limite_compra = leia.nextDouble();
        leia.nextLine();

        System.out.println("Data de Cadastro: ");
        data_cadastro = leia.nextLine();

        System.out.println("Site: ");
        site = leia.nextLine();

    }


    public void imprimir() {
        super.imprimir();

        System.out.println("Limite de Compra: " + limite_compra);
        System.out.println("Data de Compra: " + data_cadastro);
        System.out.println("Site: " + site);



    }

    public Fornecedor(){

    }

    public Fornecedor(double limite_compra, String data_cadastro, String site) {
        this.limite_compra = limite_compra;
        this.data_cadastro = data_cadastro;
        this.site = site;
    }

    public Fornecedor(String cnpj, String inscricao_estadual, String contato, double limite_compra, String data_cadastro, String site) {
        super(cnpj, inscricao_estadual, contato);
        this.limite_compra = limite_compra;
        this.data_cadastro = data_cadastro;
        this.site = site;
    }

    public Fornecedor(int id, String nome, Endereco endereco, Telefone telefone, String email, String cnpj, String inscricao_estadual, String contato, double limite_compra, String data_cadastro, String site) {
        super(id, nome, endereco, telefone, email, cnpj, inscricao_estadual, contato);
        this.limite_compra = limite_compra;
        this.data_cadastro = data_cadastro;
        this.site = site;
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
