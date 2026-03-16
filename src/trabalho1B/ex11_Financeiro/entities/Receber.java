package trabalho1B.ex11_Financeiro.entities;

import javax.swing.*;

public class Receber extends Financeiro {

    private Cliente cliente;
    private String nota_fiscal;

    public void entrar(){
        super.entrar();

        System.out.println("Nota Fiscal: ");
        nota_fiscal = leia.nextLine();

        Cliente cliente = new Cliente();
        cliente.entrar();


    }

    public void imprimir(){
        super.imprimir();

        System.out.println("Nota Fiscal: " + nota_fiscal);

        cliente.imprimir();

    }

    public Receber(){

    }

    public Receber(Cliente cliente, String nota_fiscal) {
        this.cliente = cliente;
        this.nota_fiscal = nota_fiscal;
    }

    public Receber(int id, int numero, String emissao, String vencimento, String pagamento, double valor, double juros, double multa, double desconto, double total, Cliente cliente, String nota_fiscal) {
        super(id, numero, emissao, vencimento, pagamento, valor, juros, multa, desconto, total);
        this.cliente = cliente;
        this.nota_fiscal = nota_fiscal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getNota_fiscal() {
        return nota_fiscal;
    }

    public void setNota_fiscal(String nota_fiscal) {
        this.nota_fiscal = nota_fiscal;
    }
}
