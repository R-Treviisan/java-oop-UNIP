package trabalho3_2b.entities;

public class Funcionario extends PessoaFisica {
    private String data_admissao;
    private String data_demissao;
    private String ctps;
    private Double salario;

    public Funcionario() {
    }

    public Funcionario(int id, String nome, Endereco endereco, Telefone telefone, String email, String cpf, String rg, String emissor, Pessoa pessoa, String data_admissao, String data_demissao, String ctps, Double salario) {
        super(id, nome, endereco, telefone, email, cpf, rg, emissor, pessoa);
        this.data_admissao = data_admissao;
        this.data_demissao = data_demissao;
        this.ctps = ctps;
        this.salario = salario;
    }

    public String getData_admissao() {
        return data_admissao;
    }

    public void setData_admissao(String data_admissao) {
        this.data_admissao = data_admissao;
    }

    public String getData_demissao() {
        return data_demissao;
    }

    public void setData_demissao(String data_demissao) {
        this.data_demissao = data_demissao;
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public void entrar(){
        super.entrar();
        System.out.println("----CADASTRO FUNCIONARIO----");
        System.out.print("Data de admissão: ");
        data_admissao = leia.nextLine();
        System.out.print("Data de demissão: ");
        data_demissao = leia.nextLine();
        System.out.print("CTPS: ");
        ctps = leia.nextLine();
        System.out.print("Salario: ");
        salario = leia.nextDouble();
        leia.nextLine();

    }

    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("----CADASTRO FUNCIONARIO----");
        System.out.println("Data de admissão: " + this.data_admissao);
        System.out.println("Data de demissão: " + this.data_demissao);
        System.out.println("CTPS: " + this.ctps);
        System.out.println("Salário: " + this.salario);
    }
}
