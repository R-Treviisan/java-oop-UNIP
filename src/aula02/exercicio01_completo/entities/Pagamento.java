package exercicio01_completo.entities;

public class Pagamento {

    private Double salarioBruto;
    private Double adiantamento;

    public Pagamento(Double salarioBruto, Double adiantamento) {
        this.salarioBruto = salarioBruto;
        this.adiantamento = adiantamento;
    }

    public Double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(Double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public Double getAdiantamento() {
        return adiantamento;
    }

    public void setAdiantamento(Double adiantamento) {
        this.adiantamento = adiantamento;
    }

    public Double getInss(){
        return  this.salarioBruto * 0.11;
    }

    public Double getFgts(){
        return this.salarioBruto * 0.08;
    }

    public Double getSalarioLiquido(){
        return this.salarioBruto - adiantamento - getInss();
    }

    public String toString(){

        return "----- HOLERITE ----\n"
                + "Salario Bruto: R$" + String.format("%.2f", salarioBruto) + "\n"
                + "Adiantamento: R$" + String.format("%.2f", adiantamento) + "\n"
                + "Desconto Inss: R$" + String.format("%.2f",getInss()) + "\n"
                + "Desconto FGTS: R$" + String.format("%.2f", getFgts()) + "\n"
                + "--------------------------------------------\n"
                + "Salario Liquido: R$" + String.format("%.2f", getSalarioLiquido());
    }

}
