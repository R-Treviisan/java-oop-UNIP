package operadoraTel.entities;

import operadoraTel.interfaces.InterfaceTelefone;

public class Cliente implements InterfaceTelefone {
    private String id_cliente;
    private String nome;
    private Long cpf;

    public Cliente() {
    }

    public Cliente(String id_cliente, String nome, Long cpf) {
        this.id_cliente = id_cliente;
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(String id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }


    @Override
    public void entrar() {
        System.out.println("----- ENTRAR CLIENTE -----");
        System.out.println("");

        System.out.print("ID Cliente: ");
        this.id_cliente = leia.nextLine();

        System.out.print("Nome: ");
        this.nome = leia.nextLine();

        System.out.print("CPF: ");
        this.cpf = leia.nextLong();
        leia.nextLine();
    }

    @Override
    public void imprimir() {

        System.out.println("----- IMPRIMIR CLIENTE -----");
        System.out.println("");

        System.out.print("ID Cliente: " + this.id_cliente);

        System.out.print("Nome: " + this.nome);

        System.out.print("CPF: " + this.cpf);
    }
}
