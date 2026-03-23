package trabalho1B.ex11_Financeiro.entities;

import trabalho1B.ex11_Financeiro.interfaces.InterfaceCadastro;

public class Telefone implements InterfaceCadastro {
    private int ddd;
    private long numero;

    public Telefone() {
    }
    public Telefone(int ddd, long numero) {
        this.ddd = ddd;
        this.numero = numero;
    }

    public void entrar(){
        System.out.println("");
        System.out.println("------- CADASTRO TELEFONE -------");

        System.out.print("DDD: ");
        this.ddd = leia.nextInt();

        System.out.print("Numero: ");
        this.numero = leia.nextLong();

    }

    public void imprimir(){
        leia.nextLine();
        System.out.println("");
        System.out.println("------- TELEFONE -------");

        System.out.println("DDD: " + this.ddd);

        System.out.println("Numero: " + this.numero);
    }

    public void alterarTelefone(){

        System.out.print("Novo DDD: ");
        this.ddd = leia.nextInt();
        leia.nextLine();

        System.out.print("Novo Numero: ");
        this.numero = leia.nextLong();
        leia.nextLine();

    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }
}

