package trabalho3_2b.entities;

import trabalho3_2b.interfaces.Interface;

import java.util.Scanner;

public class Financeiro implements Interface {

    private int id;
    private int numero;
    private String emissao;
    private String vencimento;
    private String pagamento;
    private double valor;
    private double juros;
    private double desconto;
    private double total;

    private Scanner leia = new Scanner(System.in);

    public Financeiro() {
    }

    public Financeiro(int id, int numero, String emissao, String vencimento,
                      String pagamento, double valor, double juros,
                      double desconto) {

        this.id = id;
        this.numero = numero;
        this.emissao = emissao;
        this.vencimento = vencimento;
        this.pagamento = pagamento;
        this.valor = valor;
        this.juros = juros;
        this.desconto = desconto;
        calcularTotal();
    }

    // ================= GETTERS / SETTERS =================

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
        calcularTotal();
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
        calcularTotal();
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
        calcularTotal();
    }

    public double getTotal() {
        return total;
    }

    // ================= REGRAS DE NEGÓCIO =================

    public void aplicarDesconto(double percDesconto) {
        this.desconto = valor * (percDesconto / 100);
        calcularTotal();
    }

    public void aplicarJuros(double percJuros) {
        this.juros = valor * (percJuros / 100);
        calcularTotal();
    }

    public void calcularTotal() {
        this.total = valor + juros - desconto;
    }

    // ================= INTERFACE =================

    @Override
    public void entrar() {
        System.out.println("----FINANCEIRO----");

        System.out.print("ID: ");
        id = leia.nextInt();

        System.out.print("Número: ");
        numero = leia.nextInt();
        leia.nextLine();

        System.out.print("Data emissão: ");
        emissao = leia.nextLine();

        System.out.print("Data vencimento: ");
        vencimento = leia.nextLine();

        System.out.print("Data pagamento: ");
        pagamento = leia.nextLine();

        System.out.print("Valor: ");
        valor = leia.nextDouble();

        System.out.print("Percentual desconto: ");
        double percDesc = leia.nextDouble();

        System.out.print("Percentual juros: ");
        double percJuros = leia.nextDouble();

        aplicarDesconto(percDesc);
        aplicarJuros(percJuros);
    }

    @Override
    public void imprimir() {
        System.out.println("----FINANCEIRO----");
        System.out.println("ID: " + id);
        System.out.println("Número: " + numero);
        System.out.println("Emissão: " + emissao);
        System.out.println("Vencimento: " + vencimento);
        System.out.println("Pagamento: " + pagamento);
        System.out.println("Valor: " + valor);
        System.out.println("Juros: " + juros);
        System.out.println("Desconto: " + desconto);
        System.out.println("Total: " + total);
    }
}