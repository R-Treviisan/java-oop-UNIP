package aula03.execicio2_completo.entities;

public class Funcionario {
    private String codigo;
    private String nome;
    private String pai;
    private String mae;
    private String telefone;
    private Holerite holerite;

    public Funcionario(String codigo, String nome, String pai, String mae, String telefone) {
        this.codigo = codigo;
        this.nome = nome;
        this.pai = pai;
        this.mae = mae;
        this.telefone = telefone;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Holerite getHolerite() {
        return holerite;
    }

    public void setHolerite(Holerite holerite) {
        this.holerite = holerite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPai() {
        return pai;
    }

    public void setPai(String pai) {
        this.pai = pai;
    }

    public String getMae() {
        return mae;
    }

    public void setMae(String mae) {
        this.mae = mae;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString (){
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append("---- DADOS DO FUNCIONARIO ----\n");
        sb.append("\n");
        sb.append("Funcionario: " + "(" + codigo + ") " + nome + "\n" );
        sb.append("Pai: " + pai + "\n");
        sb.append("Mãe: " + mae + "\n");
        sb.append("Telefone: " + telefone + "\n");
        sb.append("\n");
        sb.append("---- HOLERITE ----\n");
        sb.append("Salario Base " + String.format("%.2f",  holerite.getSalarioBase()) + "\n");
        sb.append("Dependentes quantidade: " + holerite.getDependentes() + "\n");
        sb.append("Salario Familia: " + String.format("%.2f" , holerite.getCalcularDependentes()) + "\n");
        sb.append("Deposisto FGTS: " + holerite.getFgts() + "\n");
        sb.append("\n");
        sb.append("---- DESCONTOS ----\n");
        sb.append("Desconto Trasporte: " + holerite.getValeTransporte() + "\n");
        sb.append("Desconto Assistência: " + holerite.getValorAssistencia() + "\n");
        sb.append("Desconto INSS: "+ holerite.getInss() + "\n");
        sb.append("Desconto IRRF" + holerite.getIrrf() + "\n");
        sb.append("Salario Liquido: " + holerite.getSalarioLiquido() + "\n");
        return sb.toString();

    }

}

