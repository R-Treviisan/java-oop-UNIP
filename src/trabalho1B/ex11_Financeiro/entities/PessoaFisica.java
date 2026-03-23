package trabalho1B.ex11_Financeiro.entities;

import trabalho1B.ex11_Financeiro.interfaces.InterfaceCadastro;

public class PessoaFisica extends Pessoa implements InterfaceCadastro {

    private String cpf;
    private String rg;
    private String emissor;

    public PessoaFisica() {
    }

    public PessoaFisica(int id, String nome, Endereco endereco, Telefone telefone,
                        String email, String cpf, String rg, String emissor) {

        super(id, nome, endereco, telefone, email);
        this.cpf = cpf;
        this.rg = rg;
        this.emissor = emissor;
    }

    public void entrar() {
        super.entrar();
        System.out.println("");
        System.out.println("--------CADASTRO DE PESSOAS FISICA--------");

        System.out.print("CPF: ");
        this.cpf = leia.nextLine();

        System.out.print("RG: ");
        this.rg = leia.nextLine();

        System.out.print("Emissor: ");
        this.emissor = leia.nextLine();

    }

    public void imprimir() {
        super.imprimir();
        System.out.println("");
        System.out.println("--------PESSOAS FISICA--------");

        System.out.println("CPF: " + this.cpf);
        System.out.println("RG: " + this.rg);
        System.out.println("EMISSOR: " + this.emissor);
        this.getTelefone().imprimir();
        this.getEndereco().imprimir();
        }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEmissor() {
        return emissor;
    }

    public void setEmissor(String emissor) {
        this.emissor = emissor;
    }
}
