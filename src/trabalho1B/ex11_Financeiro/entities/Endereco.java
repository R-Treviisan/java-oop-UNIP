package trabalho1B.ex11_Financeiro.entities;

import java.io.Serializable;
import java.util.Scanner;

public class Endereco implements Serializable {
    private String logadouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private int cep; // PERGUNTAR SE POSSO TROCAR PARA STRING

    public void entrar() {
        Scanner leia = new Scanner(System.in);

        System.out.print("Logadouro: ");
        logadouro = leia.nextLine();

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

    public void imprimir() {
        System.out.println("Logadouro: " + logadouro);
        System.out.println("Numero: " + numero);
        System.out.println("Complemento: " + complemento);
        System.out.println("Bairro: " + bairro);
        System.out.println("Cidade: " + cidade);
        System.out.println("Estado: " + estado);
        System.out.println("CEP: " + cep);

    }

    public Endereco() {

    }

    public Endereco(String logadouro, String numero, String complemento, String bairro, String cidade, String estado, int cep) {
        this.logadouro = logadouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    public String getLogadouro() {
        return logadouro;
    }

    public void setLogadouro(String logadouro) {
        this.logadouro = logadouro;
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
}
