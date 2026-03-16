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

    public void entrar(){

        System.out.println("ID: ");
        id = leia.nextInt();

        System.out.println("Numero: ");
        numero = leia.nextInt();

        System.out.println("Emissao: ");
        emissao = leia.next();

        System.out.println("Vencimento: ");
        vencimento = leia.next();

        System.out.println("Pagamento: ");
        pagamento = leia.next();

        System.out.println("Valor: ");
        valor = leia.nextDouble();

        System.out.println("Juros: ");
        juros = leia.nextDouble();

        System.out.println("Multa: ");
        multa = leia.nextDouble();

        System.out.println("Desconto: ");
        desconto = leia.nextDouble();

        System.out.println("Total: ");
        total = leia.nextDouble();


    }

    public void imprimir(){

        System.out.println("ID: " + id);
        System.out.println("Numero: " + numero);
        System.out.println("Emissao: " + emissao);
        System.out.println("Vencimento: " + vencimento);
        System.out.println("Pagamento: " + pagamento);
        System.out.println("Valor: " + valor);
        System.out.println("Juros: " + juros);
        System.out.println("Multa: " + multa);
        System.out.println("Desconto: " + desconto);
        System.out.println("Total: " + total);

    }

    public Financeiro(){

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

    public void setTotal(double total) {
        this.total = total;
    }
}
