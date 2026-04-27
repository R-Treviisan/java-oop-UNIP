package trabalho3_2b.entities;

import trabalho1B.ex11_Financeiro.entities.Fornecedor;
import trabalho3_2b.interfaces.Interface;

public class Pagar implements Interface {
    private Fornecedor fornecedor;
    private String boleto;

    public Pagar() {
    }

    public Pagar(Fornecedor fornecedor, String boleto) {
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

    @Override
    public void entrar() {
        System.out.println("----CADASTRO BOLETO----");
        System.out.print("Boleto Nº: ");
        boleto = leia.nextLine();

    }

    @Override
    public void imprimir() {
        System.out.println("----CADASTRO BOLETO----");
        System.out.println("Boleto Nº: " + this.boleto);
        System.out.println("----IMPRIMIR FORNECEDOR----");
        fornecedor.imprimir();

    }
}
