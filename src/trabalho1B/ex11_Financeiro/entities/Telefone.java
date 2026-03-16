package trabalho1B.ex11_Financeiro.entities;

import java.util.Scanner;

public class Telefone {
    private int ddd;
    private long numero;

    public void entrar(){
        Scanner leia = new Scanner(System.in);

        System.out.println("DDD: ");
        ddd = leia.nextInt();

        System.out.println("Numero: ");
        numero = leia.nextLong();

    }

    public void imprimir(){

        System.out.println("DDD: " + ddd);
        System.out.println("Numero: " + numero);

    }

    public Telefone(){

    }

    public Telefone(int ddd, long numero) {
        this.ddd = ddd;
        this.numero = numero;
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
