package operadoraTel.entities;

import operadoraTel.interfaces.InterfaceTelefone;

public class Operadora implements InterfaceTelefone {
    private int id_operadora;
    private String nome;

    public Operadora() {

    }

    public Operadora(int id_operadora, String nome) {
        this.id_operadora = id_operadora;
        this.nome = nome;
    }

    public int getId_operadora() {
        return id_operadora;
    }

    public void setId_operadora(int id_operadora) {
        this.id_operadora = id_operadora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public void entrar() {
        System.out.println("----- ENTRAR OPERADORA -----");
        System.out.println("");
        System.out.print("ID operadora: ");
        this.id_operadora = leia.nextInt();
        leia.nextLine();

        System.out.print("Nome: ");
        this.nome = leia.nextLine();
    }

    @Override
    public void imprimir() {

        System.out.println("----- IMPRIMIR OPERADORA -----");
        System.out.println("");
        System.out.print("ID operadora: "  + this.id_operadora);
        System.out.print("Nome: " + this.nome);

    }
}
