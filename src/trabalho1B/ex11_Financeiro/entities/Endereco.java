package trabalho1B.ex11_Financeiro.entities;

import trabalho1B.ex11_Financeiro.interfaces.InterfaceCadastro;

public class Endereco implements InterfaceCadastro {
    private String logadouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private int cep;

    public Endereco() {

    }

    public Endereco(String logadouro, String numero, String complemento, String bairro,
                    String cidade, String estado, int cep) {
        this.logadouro = logadouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    public void entrar(){
        System.out.println("");
        System.out.println("----------CADASTRO ENDEREÇO----------");
        System.out.print("Logadouro: ");
        this.logadouro = leia.nextLine();

        System.out.print("Numero: ");
        this.numero = leia.nextLine();

        System.out.print("Complemento: ");
        this.complemento = leia.nextLine();

        System.out.print("Bairro: ");
        this.bairro = leia.nextLine();

        System.out.print("CEP: ");
        this.cep = leia.nextInt();
        leia.nextLine();

        System.out.print("Cidade: ");
        this.cidade = leia.nextLine();

        System.out.print("Estado: ");
        this.estado = leia.nextLine();


    }

    public void imprimir(){
        System.out.println("");
        System.out.println("----------ENDEREÇO----------");

        System.out.println("Logadouro: " + this.logadouro);
        System.out.println("Numero: " + this.numero);
        System.out.println("Complemento: " + this.complemento);
        System.out.println("Bairro: " + this.bairro);
        System.out.println("CEP: " + this.cep);
        System.out.println("Cidade: " + this.cidade);
        System.out.println("Estado: " + this.estado);



    }

    public void alterarEndereco(){
        System.out.println("");
        System.out.print("Novo Logadouro: ");
        this.logadouro = leia.nextLine();

        System.out.print("Novo Numero: ");
        this.numero = leia.nextLine();

        System.out.print("Novo Complemento: ");
        this.complemento = leia.nextLine();

        System.out.print("Novo Bairro: ");
        this.bairro = leia.nextLine();

        System.out.print("Novo Cidade: ");
        this.cidade = leia.nextLine();

        System.out.print("Novo Estado: ");
        this.estado = leia.nextLine();

        System.out.print("Novo CEP: ");
        this.cep = leia.nextInt();

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
