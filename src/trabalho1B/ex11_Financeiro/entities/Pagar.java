package trabalho1B.ex11_Financeiro.entities;

import javax.xml.transform.Source;

public class Pagar extends Financeiro{
    private Fornecedor fornecedor;
    private String boleto;

    public Pagar() {
    }

    public Pagar(int id, int numero, String emissao, String vencimento, String pagamento,
                 double valor, double juros, double multa, double desconto, double total, Fornecedor fornecedor, String boleto) {

        super(id, numero, emissao, vencimento, pagamento, valor, juros, multa, desconto, total);
        this.fornecedor = fornecedor;
        this.boleto = boleto;
    }

    @Override
    public void entrar(){

        super.entrar();
        leia.nextLine();

        System.out.println("-------CADASTRO BOLETO-------");
        System.out.print("Boleto: ");
        this.boleto = leia.nextLine();

    }

    @Override
    public void imprimir(){
        System.out.println("--------BOLETO--------");
        System.out.println("Boleto N°: " + this.boleto);
        super.imprimir();

    }

    public void alterarPagar(){
        int opcao;

        do {
            System.out.println("---- ALTERAR PAGAR ----");
            System.out.println("1 - Numero do boleto");
            System.out.println("2 - Valores");
            System.out.println("0 - Sair");

            System.out.print("Opção: ");
            opcao = leia.nextInt();
            leia.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Novo numero do boleto: ");
                    this.boleto = leia.nextLine();
                    break;

                case 2:
                    System.out.print("Valores");
                    alterarValores();
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);
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
