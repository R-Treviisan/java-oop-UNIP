package trabalho1B.ex11_Financeiro.entities;

public class PessoaJuridica extends Pessoa {
    private String cnpj;
    private String inscricao_estadual;
    private String contato;

    public void entrar(){
        super.entrar();

        System.out.println("CNPJ: ");
        cnpj = leia.nextLine();

        System.out.println("Inscricao estadual: ");
        inscricao_estadual = leia.nextLine();

        System.out.println("Contato: ");
        contato = leia.nextLine();

    }

    public void imprimir(){
        super.imprimir();
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Inscricao estadual: " + inscricao_estadual);
        System.out.println("Contato: " + contato);


    }

    public PessoaJuridica(){

    }

    public PessoaJuridica(String cnpj, String inscricao_estadual, String contato) {
        this.cnpj = cnpj;
        this.inscricao_estadual = inscricao_estadual;
        this.contato = contato;
    }

    public PessoaJuridica(int id, String nome, Endereco endereco, Telefone telefone, String email, String cnpj, String inscricao_estadual, String contato) {
        super(id, nome, endereco, telefone, email);
        this.cnpj = cnpj;
        this.inscricao_estadual = inscricao_estadual;
        this.contato = contato;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricao_estadual() {
        return inscricao_estadual;
    }

    public void setInscricao_estadual(String inscricao_estadual) {
        this.inscricao_estadual = inscricao_estadual;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
}
