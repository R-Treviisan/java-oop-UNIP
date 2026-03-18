package trabalho1B.ex11_Financeiro.entities;

import trabalho1B.ex11_Financeiro.interfaces.InterfaceCadastro;

import java.io.*;
import java.util.ArrayList;

public class Financeiro implements InterfaceCadastro, Serializable {
    ArrayList <Financeiro>listFinancas = new ArrayList<>();

    private int id;
    private int numero;
    private String emissao;
    private String vencimento;
    private String pagamento;
    private double valor;
    private double juros;
    private double multa;
    private double desconto;
    private double total;

    public void entrar(){

        System.out.print("ID: ");
        id = leia.nextInt();

        System.out.print("Numero: ");
        numero = leia.nextInt();

        System.out.print("Emissao: ");
        emissao = leia.next();

        System.out.print("Vencimento: ");
        vencimento = leia.next();

        System.out.print("Pagamento: ");
        pagamento = leia.next();

        System.out.print("Valor: ");
        valor = leia.nextDouble();

        System.out.print("Juros: ");
        juros = leia.nextDouble();

        System.out.print("Multa: ");
        multa = leia.nextDouble();

        System.out.print("Desconto: ");
        desconto = leia.nextDouble();

        System.out.print("Total: ");
        total = leia.nextDouble();


    }

    public void imprimir(){

        System.out.println("ID: " + id);
        System.out.println("Numero: " + numero);
        System.out.println("Emissao: " + emissao);
        System.out.println("Vencimento: " + vencimento);
        System.out.println("Pagamento: " + pagamento);
        System.out.println("Valor: " + valor);
        System.out.println("Juros: " + juros);
        System.out.println("Multa: " + multa);
        System.out.println("Desconto: " + desconto);
        System.out.println("Total: " + total);

    }

    public void salvarArquivo() {

        try (FileOutputStream arquivo = new FileOutputStream("Financeiro.dat");
             ObjectOutputStream obj = new ObjectOutputStream(arquivo)) {

            obj.writeObject(listFinancas);

            System.out.println("Lista salva com sucesso");

        } catch (Exception e) {
            // e.printStackTrace();
            System.out.println("Erro ao salvar");
        }

    }

    public void lerArquivo() {
        try (FileInputStream arquivo = new FileInputStream("Financeiro.dat");
             ObjectInputStream obj = new ObjectInputStream(arquivo)) {

            listFinancas = (ArrayList < Financeiro >) obj.readObject();
            obj.close();
            arquivo.close();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Arquivo ainda não existe");
        }
    }

    public void alterarFinanceiro(int id){

        for (Financeiro f : listFinancas){

            if (f.getId() == id){

                System.out.println("Encontrado");

                f.entrar();

                System.out.println("Dados financeiro não encontrado");
                return;
            }
        }

        System.out.println("Financeiro não encontrado");
    }

    public void deletarFinanceiro(int id){
        for (int i = 0 ; i < listFinancas.size(); i++){

            if(listFinancas.get(i).getId() == id){
                listFinancas.remove(i);
                System.out.println("Dados removido com sucesso");
                salvarArquivo();
                return;

            }

            System.out.println("Dados financeiro não encontrado");
        }

    }

    public void incluir() {

        Financeiro f = new Financeiro();
        f.entrar();

        listFinancas.add(f);

        salvarArquivo();

    }



    public Financeiro(){

    }

    public Financeiro(int id, int numero, String emissao, String vencimento, String pagamento, double valor, double juros, double multa, double desconto, double total) {
        this.id = id;
        this.numero = numero;
        this.emissao = emissao;
        this.vencimento = vencimento;
        this.pagamento = pagamento;
        this.valor = valor;
        this.juros = juros;
        this.multa = multa;
        this.desconto = desconto;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEmissao() {
        return emissao;
    }

    public void setEmissao(String emissao) {
        this.emissao = emissao;
    }

    public String getVencimento() {
        return vencimento;
    }

    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }

    public String getPagamento() {
        return pagamento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
