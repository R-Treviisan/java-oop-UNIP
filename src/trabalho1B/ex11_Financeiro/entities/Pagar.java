package trabalho1B.ex11_Financeiro.entities;

public class Pagar extends Financeiro {
    private Fornecedor fornecedor;
    private String boleto;

    public void entrar() {
        super.entrar();

        System.out.println("Boleto: ");
        boleto = leia.nextLine();

        Fornecedor fornecedor = new Fornecedor();
        fornecedor.entrar();

    }

    public void imprimir() {
        super.imprimir();

        System.out.println("Boleto: " + boleto);

        fornecedor.imprimir();



    }

    public Pagar() {

    }

    public Pagar(Fornecedor fornecedor, String boleto) {
        this.fornecedor = fornecedor;
        this.boleto = boleto;
    }

    public Pagar(int id, int numero, String emissao, String vencimento, String pagamento, double valor, double juros, double multa, double desconto, double total, Fornecedor fornecedor, String boleto) {
        super(id, numero, emissao, vencimento, pagamento, valor, juros, multa, desconto, total);
        this.fornecedor = fornecedor;
        this.boleto = boleto;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getBoleto() {
        return boleto;
    }

    public void setBoleto(String boleto) {
        this.boleto = boleto;
    }
}
