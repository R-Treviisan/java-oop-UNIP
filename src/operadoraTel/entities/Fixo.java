package operadoraTel.entities;

public class Fixo extends Telefone {
    private String modalidade;
    private double valor_adcional;

    public Fixo() {
    }

    public Fixo(String id_telefone, Operadora operadora, Cliente cliente, int ddd, long numero, double valor, String modalidade, double valor_adcional) {
        super(id_telefone, operadora, cliente, ddd, numero, valor);
        this.modalidade = modalidade;
        this.valor_adcional = valor_adcional;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public double getValor_adcional() {
        return valor_adcional;
    }

    public void setValor_adcional(double valor_adcional) {
        this.valor_adcional = valor_adcional;
    }

    public void totalAdcional() {
        double totalCalculado = 0;

        if (this.valor_adcional > 100 && this.valor_adcional <= 200) {
            totalCalculado = (getValor() / 100) * 0.05;
        } else if (this.valor_adcional > 200 && this.valor_adcional <= 500) {
            totalCalculado = (getValor() / 100) * 0.07;
        } else if (this.valor_adcional > 500 && this.valor_adcional <= 1000) {
            totalCalculado = (getValor() / 100) * 0.1;
        } else if (this.valor_adcional > 1000) {
            totalCalculado = (getValor() / 100) * 0.12;
        }

        setValor_adcional(totalCalculado);

    }
}
