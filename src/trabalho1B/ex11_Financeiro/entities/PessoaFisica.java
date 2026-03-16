package trabalho1B.ex11_Financeiro.entities;

public class PessoaFisica extends Pessoa {

    private String cpf;
    private String rg;
    private String emissor;

    public void entrar() {
        super.entrar();

        System.out.println("Dados do Pessoa Fisica");
        System.out.println("CPF: ");
        cpf = leia.nextLine();

        System.out.println("RG: ");
        rg = leia.nextLine();

        System.out.println("Emissor: ");
        emissor = leia.nextLine();
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("CPF: " + cpf);
        System.out.println("RG: " + rg);
        System.out.println("Emissor: " + emissor);


    }

    public PessoaFisica(){

    }

    public PessoaFisica(String cpf, String rg, String emissor) {
        this.cpf = cpf;
        this.rg = rg;
        this.emissor = emissor;
    }

    public PessoaFisica(int id, String nome, Endereco endereco, Telefone telefone, String email, String cpf, String rg, String emissor) {
        super(id, nome, endereco, telefone, email);
        this.cpf = cpf;
        this.rg = rg;
        this.emissor = emissor;
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
