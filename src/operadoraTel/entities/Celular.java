package operadoraTel.entities;

public class Celular extends Telefone {
    private int plano;
    private int capacidade;
    private double desconto;

    public Celular() {
    }

    public Celular(String id_telefone, Operadora operadora, Cliente cliente, int ddd, long numero, double valor, int plano, int capacidade, double desconto) {
        super(id_telefone, operadora, cliente, ddd, numero, valor);
        this.plano = plano;
        this.capacidade = capacidade;
        this.desconto = desconto;
    }

    public int getPlano() {
        return plano;
    }

    public void setPlano(int plano) {
        this.plano = plano;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public void totaldesconto() {
        double totalCalculado = 0;

        if (this.plano == 1) {
            totalCalculado = (getValor() / 100) * 0.03;

        } else if (this.plano > 1 && this.plano <= 2) {
            totalCalculado = (getValor() / 100) * 0.05;
        }else if (this.plano >= 2 && this.plano <= 5) {
            totalCalculado = (getValor() / 100) * 0.07;
        }else if (this.plano > 5) {
            totalCalculado = (getValor() / 100) * 0.1;
        }

        setDesconto(totalCalculado);

    }
}
