package trabalho1B.ex11_Financeiro.entities;

public class Receber extends Financeiro{
    private Cliente cliente;
    private String nota_fiscal;

    public Receber() {
    }

    public Receber(int id, int numero, String emissao, String vencimento, String pagamento,
                   double valor, double juros, double multa, double desconto, double total,
                   Cliente cliente, String nota_fiscal) {

        super(id, numero, emissao, vencimento, pagamento, valor, juros, multa, desconto, total);
        this.cliente = cliente;
        this.nota_fiscal = nota_fiscal;
    }

    @Override
    public void entrar(){
        super.entrar();
        System.out.println("-------CADASTRO RECEBER-------");
        System.out.print("Nota fiscal");
        this.nota_fiscal = leia.nextLine();
    }

    @Override
    public void imprimir(){
        cliente.imprimir();
        System.out.println("-------NOTA RECEBER-------");
        System.out.println("Nota N°" + this.nota_fiscal);
        super.imprimir();

    }

    public void alterarReceber(){
        int opcao;

        do {
            System.out.println("---- ALTERAR RECEBER ----");
            System.out.println("1 - Numero da nota");
            System.out.println("2 - Valores");
            System.out.println("0 - Sair");

            System.out.print("Opção: ");
            opcao = leia.nextInt();
            leia.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Novo numero da nota: ");
                    this.nota_fiscal = leia.next();
                    break;

                case 2:
                    System.out.print("Valores");
                    alterarValores();
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getNota_fiscal() {
        return nota_fiscal;
    }

    public void setNota_fiscal(String nota_fiscal) {
        this.nota_fiscal = nota_fiscal;
    }
}
