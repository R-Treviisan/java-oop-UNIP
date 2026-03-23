package trabalho1B.ex11_Financeiro.entities;

import trabalho1B.ex11_Financeiro.interfaces.InterfaceCadastro;

public class Pessoa implements InterfaceCadastro {

    private int id;
    private String nome;
    private Endereco endereco;
    private Telefone telefone;
    private String email;

    public Pessoa() {

    }

    public Pessoa(int id, String nome, Endereco endereco, Telefone telefone, String email) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    public void entrar(){
        System.out.println("");
        System.out.println("-------CADASTRO DE PESSOA-------");

        System.out.print("ID: ");
        this.id = leia.nextInt();
        leia.nextLine();

        System.out.print("Nome: ");
        this.nome = leia.nextLine();

        System.out.print("Email: ");
        this.email = leia.nextLine();

        this.telefone = new Telefone();
        this.telefone.entrar();
        leia.nextLine();

        this.endereco = new Endereco();
        this.endereco.entrar();


    }

    public void imprimir(){
        System.out.println("-------PESSOA-------");
        System.out.println("ID: " + this.id);
        System.out.println("Nome: " + this.nome);
        System.out.println("Email: " + this.email);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
