package trabalho1B.ex11_Financeiro.entities;

import trabalho1B.ex11_Financeiro.interfaces.InterfaceCadastro;

public class Financeiro implements InterfaceCadastro {
    private int id;
    private int numero;
    private String emissao;
    private String vencimento;
    private String pagamento;
    private double valor;
    private double juros;
    private double multa;
    private double desconto;
    private double total;

    public Financeiro() {
    }

    public Financeiro(int id, int numero, String emissao, String vencimento, String pagamento, double valor, double juros, double multa, double desconto, double total) {
        this.id = id;
        this.numero = numero;
        this.emissao = emissao;
        this.vencimento = vencimento;
        this.pagamento = pagamento;
        this.valor = valor;
        this.juros = juros;
        this.multa = multa;
        this.desconto = desconto;
        this.total = total;
    }

    @Override
    public void entrar() {
        System.out.println("-------CADASTRO FINANCEIRO-------");

        System.out.print("ID: ");
        this.id = leia.nextInt();

        System.out.print("Numero: ");
        this.numero = leia.nextInt();
        leia.nextLine();

        System.out.print("Emissão: ");
        this.emissao = leia.nextLine();

        System.out.print("Vencimento: ");
        this.vencimento = leia.nextLine();

        System.out.print("Valor: ");
        this.valor = leia.nextDouble();

        System.out.print("Juros: ");
        this.juros = leia.nextDouble();

        System.out.print("Multa: ");
        this.multa = leia.nextDouble();

        System.out.print("Desconto: ");
        this.desconto = leia.nextDouble();

    }

    @Override
    public void imprimir() {

        System.out.println("ID: " + this.id);
        System.out.println("Numero: " + this.numero);
        System.out.println("Emissão: " + this.emissao);
        System.out.println("Vencimento: " + this.vencimento);
        System.out.println("Valor: " + this.valor);
        System.out.println("Juros: " + this.juros);
        System.out.println("Multa: " + this.multa);
        System.out.println("Valor Total: " + this.total);

    }

    public void alterarValores() {
        System.out.print("Novo valor: ");
        this.setValor(leia.nextDouble());

        System.out.print("Novo juros: ");
        this.setJuros(leia.nextDouble());

        System.out.print("Nova multa: ");
        this.setMulta(leia.nextDouble());

        System.out.print("Novo desconto: ");
        this.setDesconto(leia.nextDouble());

        this.setTotal(0);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEmissao() {
        return emissao;
    }

    public void setEmissao(String emissao) {
        this.emissao = emissao;
    }

    public String getVencimento() {
        return vencimento;
    }

    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }

    public String getPagamento() {
        return pagamento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getTotal() {
        return total;
    }

    public void calcularTotal() {
        this.total = (valor + multa + juros) - desconto;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
