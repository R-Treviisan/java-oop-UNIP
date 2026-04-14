package aps.fireBase;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class TelaPrincipal extends JFrame {
    private JTextField txtBusca;
    private JTable tabela;
    private DefaultTableModel modelo;

    public TelaPrincipal() {


        setTitle("APS - Espécies e Extinsção");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        //Painel topo
        JPanel painelTopo = new JPanel();

        JButton btnConectar = new JButton("Conectar");
        JButton btnSinc = new JButton("Sincronizar");
        JButton btnPesquisar = new JButton("Pesquisar");
        JButton btnLimpar = new JButton("Limpar");

        txtBusca = new JTextField(15);

        painelTopo.add(btnConectar);
        painelTopo.add(btnSinc);
        painelTopo.add(btnPesquisar);
        painelTopo.add(btnLimpar);

        add(painelTopo, BorderLayout.NORTH);

        //Tabela

        modelo = new DefaultTableModel();
        modelo.addColumn("Nome");
        modelo.addColumn("Categoria");

        tabela = new JTable();

        add(new JScrollPane(tabela), BorderLayout.CENTER);

        btnConectar.addActionListener(e -> conectar());
        btnSinc.addActionListener(e -> sincronizar());
        btnPesquisar.addActionListener(e -> pesquisar());
        btnLimpar.addActionListener(e -> limpar());

    }

    private void conectar() {
        JOptionPane.showMessageDialog(this, "Conectado ao FireBase!");

    }

    private void sincronizar(){
        FirebaseService.sincronizarDados();
        JOptionPane.showMessageDialog(this, "Dados enviado ao FireBase!");
    }

    private void pesquisar(){
        modelo.setRowCount(0);

        String json = BuscarDadosService.buscar();

        if (json == null || json.equals("null") || json.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nenhum dado encontrado!");
            return;
        }

        // remove chaves externas
        json = json.substring(1, json.length() - 1);

        String[] itens = json.split("},");

        for (String item : itens) {

            item = item.replace("{", "").replace("}", "").replace("\"", "");

            String[] partes = item.split(",");

            String nome = "";
            String categoria = "";

            for (String parte : partes) {

                if (parte.contains("nome:")) {
                    nome = parte.split("nome:")[1];
                }

                if (parte.contains("categoria:")) {
                    categoria = parte.split("categoria:")[1];
                }
            }

            if (!nome.isEmpty() && !categoria.isEmpty()) {
                modelo.addRow(new Object[]{nome, categoria});
            }
        }
    }

    private void limpar(){
        txtBusca.setText("");
        modelo.setRowCount(0);
    }

    public static void main (String[] args){
        new TelaPrincipal().setVisible(true);
    }
}
