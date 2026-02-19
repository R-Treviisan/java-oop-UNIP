package aula03.exercicio1_completo.entities;

public class Aluno {

    private int alu_codigo;
    private String alu_cpf;
    private String alu_rg;
    private String alu_nome;
    private String alu_endereco;
    private int alu_numero;
    private String alu_complemento;
    private String alu_bairro;
    private String alu_cidade;
    private String alu_estado;
    private String alu_telefone;
    private String alu_celular;
    private String alu_email;
    private double alu_salario;
    private boolean alu_masculino;


    public Aluno (){}

    public Aluno(int alu_codigo, String alu_cpf, String alu_rg, String alu_nome,
                 String alu_endereco, int alu_numero, String alu_complemento, String alu_bairro,
                 String alu_cidade, String alu_estado, String alu_telefone, String alu_celular,
                 String alu_email, double alu_salario, boolean alu_masculino) {

        this.alu_codigo = alu_codigo;
        this.alu_cpf = alu_cpf;
        this.alu_rg = alu_rg;
        this.alu_nome = alu_nome;
        this.alu_endereco = alu_endereco;
        this.alu_numero = alu_numero;
        this.alu_complemento = alu_complemento;
        this.alu_bairro = alu_bairro;
        this.alu_cidade = alu_cidade;
        this.alu_estado = alu_estado;
        this.alu_telefone = alu_telefone;
        this.alu_celular = alu_celular;
        this.alu_email = alu_email;
        this.alu_salario = alu_salario;
        this.alu_masculino = alu_masculino;
    }

    public int getAlu_codigo() {
        return alu_codigo;
    }

    public void setAlu_codigo(int alu_codigo) {
        this.alu_codigo = alu_codigo;
    }

    public String getAlu_cpf() {
        return alu_cpf;
    }

    public void setAlu_cpf(String alu_cpf) {
        this.alu_cpf = alu_cpf;
    }

    public String getAlu_rg() {
        return alu_rg;
    }

    public void setAlu_rg(String alu_rg) {
        this.alu_rg = alu_rg;
    }

    public String getAlu_nome() {
        return alu_nome;
    }

    public void setAlu_nome(String alu_nome) {
        this.alu_nome = alu_nome;
    }

    public String getAlu_endereco() {
        return alu_endereco;
    }

    public void setAlu_endereco(String alu_endereco) {
        this.alu_endereco = alu_endereco;
    }

    public int getAlu_numero() {
        return alu_numero;
    }

    public void setAlu_numero(int alu_numero) {
        this.alu_numero = alu_numero;
    }

    public String getAlu_complemento() {
        return alu_complemento;
    }

    public void setAlu_complemento(String alu_complemento) {
        this.alu_complemento = alu_complemento;
    }

    public String getAlu_bairro() {
        return alu_bairro;
    }

    public void setAlu_bairro(String alu_bairro) {
        this.alu_bairro = alu_bairro;
    }

    public String getAlu_cidade() {
        return alu_cidade;
    }

    public void setAlu_cidade(String alu_cidade) {
        this.alu_cidade = alu_cidade;
    }

    public String getAlu_estado() {
        return alu_estado;
    }

    public void setAlu_estado(String alu_estado) {
        this.alu_estado = alu_estado;
    }

    public String getAlu_telefone() {
        return alu_telefone;
    }

    public void setAlu_telefone(String alu_telefone) {
        this.alu_telefone = alu_telefone;
    }

    public String getAlu_celular() {
        return alu_celular;
    }

    public void setAlu_celular(String alu_celular) {
        this.alu_celular = alu_celular;
    }

    public String getAlu_email() {
        return alu_email;
    }

    public void setAlu_email(String alu_email) {
        this.alu_email = alu_email;
    }

    public double getAlu_salario() {
        return alu_salario;
    }

    public void setAlu_salario(double alu_salario) {
        this.alu_salario = alu_salario;
    }

    public boolean isAlu_masculino() {
        return alu_masculino;
    }

    public void setAlu_masculino(boolean alu_masculino) {
        this.alu_masculino = alu_masculino;
    }

    @Override
    public String toString() {
        return "----- DADOS DO ALUNO -----\n"
                + "Código: " + alu_codigo + "\n"
                + "CPF: " + alu_cpf + "\n"
                + "RG: " + alu_rg + "\n"
                + "Nome: " + alu_nome + "\n"
                + "Endereço: " + alu_endereco + ", Nº " + alu_numero + "\n"
                + "Complemento: " + alu_complemento + "\n"
                + "Bairro: " + alu_bairro + "\n"
                + "Cidade: " + alu_cidade + "\n"
                + "Estado: " + alu_estado + "\n"
                + "Telefone: " + alu_telefone + "\n"
                + "Celular: " + alu_celular + "\n"
                + "Email: " + alu_email + "\n"
                + "Salário: R$ " + String.format("%.2f", alu_salario) + "\n"
                + "Sexo: " + (alu_masculino ? "Masculino" : "Feminino");
    }
}

