
package trabalho1B.ex11_Financeiro.entities;

import trabalho1B.ex11_Financeiro.interfaces.InterfaceCadastro;

import java.io.*;
import java.util.ArrayList;

public class Pessoa implements InterfaceCadastro, Serializable {

    private static ArrayList<Pessoa> listPessoas = new ArrayList<>();

    private int id;
    private String nome;
    private Endereco endereco;
    private Telefone telefone;
    private String email;

    public Pessoa() {
    }

    public Pessoa(int id, String nome, Endereco endereco, Telefone telefone, String email) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    public void entrar() {

        System.out.print("ID: ");
        id = leia.nextInt();
        leia.nextLine();

        System.out.print("Nome: ");
        nome = leia.nextLine();

        System.out.print("Email: ");
        email = leia.nextLine();

        endereco = new Endereco();
        endereco.entrar();

        telefone = new Telefone();
        telefone.entrar();

    }

    public void adicionarPessoa() {

        this.entrar();
        listPessoas.add(this);

    }

    public void salvarArquivo() {

        try (FileOutputStream arquivo = new FileOutputStream("Pessoas.dat");
             ObjectOutputStream obj = new ObjectOutputStream(arquivo)) {

            obj.writeObject(listPessoas);
            System.out.println("Lista salva com sucesso");

        } catch (Exception e) {
            System.out.println("Erro ao salvar");
        }

    }

    public void lerArquivo() {

        try (FileInputStream arquivo = new FileInputStream("Pessoas.dat");
             ObjectInputStream obj = new ObjectInputStream(arquivo)) {

            listPessoas = (ArrayList<Pessoa>) obj.readObject();
            System.out.println("Pessoas carregadas: " + listPessoas.size());

        } catch (Exception e) {
            System.out.println("Arquivo ainda não existe");
        }

    }

    public void alterarPessoa(int id) {

        for (Pessoa p : listPessoas) {

            if (p.getId() == id) {

                System.out.println("Digite os novos dados:");
                p.entrar();
                salvarArquivo();
                System.out.println("Pessoa alterada com sucesso");
                return;

            }

        }

        System.out.println("Pessoa não encontrada");

    }

    public void excluirPessoa(int id) {

        for (int i = 0; i < listPessoas.size(); i++) {

            if (listPessoas.get(i).getId() == id) {

                listPessoas.remove(i);
                salvarArquivo();
                System.out.println("Pessoa excluída com sucesso");
                return;

            }

        }

        System.out.println("Pessoa não encontrada");

    }

    public void listarPessoas() {

        if (listPessoas.isEmpty()) {
            System.out.println("Nenhuma pessoa cadastrada");
            return;
        }

        for (Pessoa p : listPessoas) {

            p.imprimir();
            System.out.println("---------------------");

        }

    }

    public void imprimir() {

        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);

        if (endereco != null) {
            endereco.imprimir();
        }

        if (telefone != null) {
            telefone.imprimir();
        }

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

