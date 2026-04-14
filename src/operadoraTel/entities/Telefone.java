package operadoraTel.entities;

import operadoraTel.interfaces.InterfaceTelefone;

public class Telefone implements InterfaceTelefone {
    private String id_telefone;
    private Operadora operadora;
    private Cliente cliente;
    private int ddd;
    private long numero;
    private double valor;

    public Telefone() {
    }

    public Telefone(String id_telefone, Operadora operadora, Cliente cliente, int ddd, long numero, double valor) {
        this.id_telefone = id_telefone;
        this.operadora = operadora;
        this.cliente = cliente;
        this.ddd = ddd;
        this.numero = numero;
        this.valor = valor;
    }

    public String getId_telefone() {
        return id_telefone;
    }

    public void setId_telefone(String id_telefone) {
        this.id_telefone = id_telefone;
    }

    public Operadora getOperadora() {
        return operadora;
    }

    public void setOperadora(Operadora operadora) {
        this.operadora = operadora;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public void entrar() {
        System.out.println("----- ENTRAR TELEFONE -----");
        System.out.println("");
        System.out.print("ID telefone: ");
        this.id_telefone = leia.nextLine();

        System.out.print("DDD: ");
        this.ddd = leia.nextInt();

        System.out.print("Numero: ");
        this.numero = leia.nextLong();

        System.out.println("Tipo: (Fixo / Celular) ");
        String tipo = leia.nextLine();

        if(tipo.toLowerCase() == "fixo"){
            Fixo fixo = new Fixo();
            fixo.entrar();
        }else{
            Celular celular = new Celular();
            celular.entrar();
        }
    }

    @Override
    public void imprimir() {

    }
}
