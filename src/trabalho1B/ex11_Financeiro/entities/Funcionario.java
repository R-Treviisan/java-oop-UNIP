package trabalho1B.ex11_Financeiro.entities;

public class Funcionario extends PessoaFisica {
    private String data_admissao;
    private String data_demissao;
    private String ctps;
    private double salario;

    public void entrar(){
        super.entrar();


        System.out.println("Data de admissao: ");
        data_admissao = leia.nextLine();

        System.out.println("Data demissao: ");
        data_demissao = leia.nextLine();

        System.out.println("Ctps: ");
        ctps = leia.nextLine();

        System.out.println("Salario: ");
        salario = leia.nextDouble();

    }


    public void imprimir() {
        super.imprimir();

        System.out.println("Data de admissao: " + data_admissao);
                System.out.println("Ctps: " + ctps);
        System.out.println("Salario: " + salario);


    }

    public Funcionario(){

    }

    public Funcionario(String data_admissao, String data_demissao, String ctps, double salario) {
        this.data_admissao = data_admissao;
        this.data_demissao = data_demissao;
        this.ctps = ctps;
        this.salario = salario;
    }

    public Funcionario(String cpf, String rg, String emissor, String data_admissao, String data_demissao, String ctps, double salario) {
        super(cpf, rg, emissor);
        this.data_admissao = data_admissao;
        this.data_demissao = data_demissao;
        this.ctps = ctps;
        this.salario = salario;
    }

    public Funcionario(int id, String nome, Endereco endereco, Telefone telefone, String email, String cpf, String rg, String emissor, String data_admissao, String data_demissao, String ctps, double salario) {
        super(id, nome, endereco, telefone, email, cpf, rg, emissor);
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
