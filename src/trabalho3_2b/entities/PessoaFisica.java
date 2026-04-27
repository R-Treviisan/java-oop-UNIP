package trabalho3_2b.entities;

public class PessoaFisica extends Pessoa{
    private String cpf;
    private String rg;
    private String emissor;
    private Pessoa pessoa;

    public PessoaFisica() {
    }

    public PessoaFisica(int id, String nome, Endereco endereco, Telefone telefone,
                        String email, String cpf, String rg, String emissor, Pessoa pessoa) {

        super(id, nome, endereco, telefone, email);
        this.cpf = cpf;
        this.rg = rg;
        this.emissor = emissor;
        this.pessoa = pessoa;
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

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public void entrar(){
        super.entrar();
        System.out.println("----CADASTRO PESSOA FISICA----");
        System.out.print("CPF: ");
        cpf = leia.nextLine();
        System.out.print("RG: ");
        rg = leia.nextLine();
        System.out.print("Emissor: ");
        emissor = leia.nextLine();

    }

    @Override
    public void imprimir(){

        super.imprimir();
        System.out.println("----CADASTRO PESSOA FISICA----");
        System.out.println("CPF: " + this.cpf);
        System.out.println("RG: " + this.rg);
        System.out.println("Emissor: " + this.emissor);
    }
}
