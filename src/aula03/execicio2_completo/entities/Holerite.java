package aula03.execicio2_completo.entities;

public class Holerite {
    private Double salarioBase;
    private Double inss;
    private Double fgts;
    private Double irrf;
    private Double valeTransporte;
    private Double valorAssistencia;
    private int dependentes;

    public Holerite(Double salarioBase, int dependentes) {
        this.salarioBase = salarioBase;
        this.dependentes = dependentes;
    }

    public Double getValeTransporte() {
        valeTransporte = salarioBase * 0.06;
        return valeTransporte;
    }

    public void setValeTransporte(Double valeTransporte) {
        this.valeTransporte = valeTransporte;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Double getValorAssistencia() {
        valorAssistencia = salarioBase * 0.05;
        return valorAssistencia;
    }

    public void setValorAssistencia(Double valorAssistencia) {
        this.valorAssistencia = valorAssistencia;
    }

    public int getDependentes() {
        return dependentes;
    }

    public void setDependentes(int dependentes) {
        this.dependentes = dependentes;
    }

    public double getCalcularDependentes(){
        final double valorDependente = 189.59;
        double calcularDependentes =  dependentes * valorDependente;
        return calcularDependentes;
    }

    public Double getInss() {

        if(salarioBase <= 1621){
            inss = salarioBase * 0.075;
        } else if (salarioBase<= 2902 ){
            inss = salarioBase * 0.09;
        } else if (salarioBase <= 4354) {
            inss = salarioBase * 0.12;
        } else {
            inss = 4355 * 0.14;
        }return inss;

    }

    public Double getFgts(){
        return fgts = salarioBase * 0.08;
    }

    public Double getIrrf(){
        if(salarioBase <= 2428){
            System.out.println("Isento");
        }else if (salarioBase<=2826) {
            irrf = salarioBase * 0.075;
        }else if (salarioBase <= 3751){
            irrf = salarioBase * 0.15;
        } else if (salarioBase <= 4664) {
            irrf = salarioBase * 0.225;
        }else {
            irrf = 4665 * 0.275;
        }return irrf;

    }

    public Double getSalarioLiquido(){
        double salarioLiquido = (salarioBase - irrf - inss - valeTransporte - valorAssistencia) + dependentes;
        return salarioLiquido;
    }


}
