package trabalho1B.ex11_Financeiro.entities;

import trabalho1B.ex11_Financeiro.interfaces.InterfaceCadastro;

public class Pessoa implements InterfaceCadastro {
    private int id;
    private String nome;
    private Endereco endereco;
    private Telefone telefone;
    private String email;

    public void entrar(){
        System.out.println("ID: ");
        id = leia.nextInt();
        leia.nextLine();

        System.out.println("Nome: ");
        nome = leia.nextLine();

        System.out.println("Email: ");
        email = leia.nextLine();

        endereco = new Endereco();
        endereco.entrar();

        telefone = new Telefone();
        telefone.entrar();


    }

    public void imprimir(){

        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);

        if(endereco != null){
            endereco.imprimir();
        }
        if(telefone != null){
            telefone.imprimir();
        }



    }

    public Pessoa(){

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
}

