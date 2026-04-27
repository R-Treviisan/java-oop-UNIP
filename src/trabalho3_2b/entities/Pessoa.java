package trabalho3_2b.entities;

import trabalho3_2b.interfaces.Interface;

public class Pessoa implements Interface {

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

    @Override
    public void entrar() {

        System.out.println("----CADASTRO PESSOA----");
        System.out.print("Id: ");
        id = leia.nextInt();
        leia.nextLine();
        System.out.print("Nome: ");
        nome = leia.nextLine();
        endereco.entrar();
        telefone.entrar();
        System.out.println("Email: ");
        email = leia.nextLine();


    }

    @Override
    public void imprimir() {

        System.out.println("Id: " + this.id);
        System.out.println("Nome: " + this.nome);
        endereco.imprimir();
        endereco.imprimir();
        System.out.println("Email: " + this.email);

    }
}
