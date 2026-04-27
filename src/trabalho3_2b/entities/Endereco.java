package trabalho3_2b.entities;

import trabalho3_2b.interfaces.Interface;

public class Endereco implements Interface {
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private int cep;

    public Endereco() {
    }

    public Endereco(String logradouro, String numero, String complemento, String bairro, String cidade, String estado, int cep) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    @Override
    public void entrar() {
        System.out.println("----CADASTRO ENDEREÇO----");
        System.out.print("Logradouro: ");
        logradouro = leia.nextLine();
        System.out.print("Numero: ");
        numero = leia.nextLine();
        System.out.print("Complemento: ");
        complemento = leia.nextLine();
        System.out.print("Bairro: ");
        bairro = leia.nextLine();
        System.out.print("Cidade: ");
        cidade = leia.nextLine();
        System.out.print("Estado: ");
        estado = leia.nextLine();
        System.out.print("CEP: ");
        cep = leia.nextInt();
        leia.nextLine();


    }

    @Override
    public void imprimir() {
        System.out.println("----CADASTRO ENDEREÇO----");
        System.out.print("Logradouro: " + this.logradouro);
        System.out.print("Numero: " + this.numero);
        System.out.print("Complemento: " + this.complemento);
        System.out.print("Bairro: " + this.bairro);
        System.out.print("Cidade: " + this.cidade);
        System.out.print("Estado: " + this.estado);
        System.out.print("CEP: " + this.cep);
    }
}
