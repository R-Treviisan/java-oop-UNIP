package trabalho3_2b.entities;

import trabalho3_2b.interfaces.Interface;

public class Telefone implements Interface {
    private int ddd;
    private Long numero;

    public Telefone() {
    }

    public Telefone(int ddd, Long numero) {
        this.ddd = ddd;
        this.numero = numero;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    @Override
    public void entrar() {
        System.out.println("----CADASTRO TELEFONE----");
        System.out.print("DDD: ");
        ddd = leia.nextInt();
        System.out.print("Numero: ");
        numero = leia.nextLong();
        leia.nextLine();

    }

    @Override
    public void imprimir() {
        System.out.println("DDD: " + this.ddd);
        System.out.println("Numero: " + this.numero);

    }
}
