package aps.fireBase;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;


public class TelaInterface extends JFrame {


    private JTable tabela;
    private DefaultTableModel tabelaModel;
    private JComboBox<String> comboFaunaFlora;
    private JComboBox<String> comboGrupo;
    private JTextField txtFamilia;
    private JTextField txtEspecie;
    private JTextField txtBioma;
    private JTextField txtCategoria;
    private JTextField txtAmeacas;
    private JTextField txtNomeComum;
    private JTextField txtEstados;
    private JButton btnPesquisar;
    private JButton btnLimpar;
    private JButton btnSincronizar;
    private JButton btnConectar;
    private JButton btnSair;

    public TelaInterface() {

        setTitle("APS - Espécies");

        setSize(800, 800); //largura - altura
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // ================== FILTROS ==================
        JPanel topo = new JPanel(new GridLayout(5, 6, 10, 5));

        // linha 1 - Sincronizar e conectar
        btnSincronizar = new JButton("Sincronizar");
        btnConectar = new JButton("Conectar");
        btnSair = new JButton("Sair");

        topo.add(new JLabel(""));
        topo.add(new JLabel(""));

        topo.add(btnSincronizar);
        btnSincronizar.addActionListener(e -> sincronizar());
        topo.add(btnConectar);
        btnConectar.addActionListener(e -> conectar());

        topo.add(new JLabel(""));

        topo.add(btnSair);
        btnSair.addActionListener(e -> System.exit(0));

        // Linha 2 - Labels
        topo.add(new JLabel("Fauna/Flora"));
        topo.add(new JLabel("Grupo"));
        topo.add(new JLabel("Família"));
        topo.add(new JLabel("Espécie"));
        topo.add(new JLabel("Bioma"));
        topo.add(new JLabel()); // espaço botão

        // Linha 3 - Campos
        comboFaunaFlora = new JComboBox<>(new String[]{"---", "Fauna", "Flora"});
        comboGrupo = new JComboBox<>(new String[]{"---", "Aves", "Mamíferos"});
        txtFamilia = new JTextField();
        txtEspecie = new JTextField();
        txtBioma = new JTextField();
        btnPesquisar = new JButton("Pesquisar");



        topo.add(comboFaunaFlora);
        topo.add(comboGrupo);
        topo.add(txtFamilia);
        topo.add(txtEspecie);
        topo.add(txtBioma);

        topo.add(btnPesquisar);
        btnPesquisar.addActionListener(e -> pesquisar());

        // Linha 4 - Labels
        topo.add(new JLabel("Categoria"));
        topo.add(new JLabel("Ameaças"));
        topo.add(new JLabel("Nome comum"));
        topo.add(new JLabel("Estados"));
        topo.add(new JLabel(""));
        topo.add(new JLabel(""));

        // Linha 5 - Campos
        txtCategoria = new JTextField();
        txtAmeacas = new JTextField();
        txtNomeComum = new JTextField();
        txtEstados = new JTextField();

        topo.add(txtCategoria);
        topo.add(txtAmeacas);
        topo.add(txtNomeComum);
        topo.add(txtEstados);

        topo.add(new JLabel(""));

        btnLimpar = new JButton("Limpar");
        topo.add(btnLimpar);
        btnLimpar.addActionListener(e -> limpar());

        add(topo, BorderLayout.NORTH);

        // Chama a tabela
        tabelaResultado();
    }

    public void tabelaResultado() {

        // ================== CABEÇALHO ==================
        tabelaModel = new DefaultTableModel();

        tabelaModel.addColumn("Fauna/Flora");
        tabelaModel.addColumn("Grupo");
        tabelaModel.addColumn("Família");
        tabelaModel.addColumn("Espécie");
        tabelaModel.addColumn("Nome Comum");
        tabelaModel.addColumn("Categoria");
        tabelaModel.addColumn("Bioma");
        tabelaModel.addColumn("Ameaças");
        tabelaModel.addColumn("Estados");

        // ================== TABELA ==================
        tabela = new JTable(tabelaModel);
        tabela.setRowHeight(23);
        tabela.setFont(new Font("Arial", Font.PLAIN, 14));
        tabela.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));
        tabela.getTableHeader().setPreferredSize(new Dimension(0, 30));
        tabela.setGridColor(new Color(220,220,220));
        tabela.setShowVerticalLines(true);
        add(new JScrollPane(tabela), BorderLayout.CENTER);

        // ================== DADO INICIAL ==================
        tabelaModel.addRow(new Object[]{

        });
    }

    public void pesquisar() {
        tabelaModel.setRowCount(0);

        String faunaFlora = comboFaunaFlora.getSelectedItem().toString();
        String grupo = comboGrupo.getSelectedItem().toString();
        String familia = txtFamilia.getText().trim().toLowerCase();
        String especie = txtEspecie.getText().trim().toLowerCase();
        String bioma = txtBioma.getText().trim().toLowerCase();
        String categoriaFiltro = txtCategoria.getText().trim().toLowerCase();
        String ameacas = txtAmeacas.getText().trim().toLowerCase();
        String nomeComum = txtNomeComum.getText().trim().toLowerCase();
        String estados = txtEstados.getText().trim().toLowerCase();

        String json = BuscarDadosService.buscar();

        if (json == null || json.equals("null") || json.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nenhum dado encontrado!");
            return;
        }

        json = json.trim();

        if (json.length() < 2) {
            JOptionPane.showMessageDialog(this, "JSON invalido.");
            return;
        }

// remove { }
        json = json.substring(1, json.length() - 1);

// separa cada item
        String[] itens = json.split("},");

        for (String item : itens) {

            item = item.replace("{", "").replace("}", "").replace("\"", "");

            String[] partes = item.split(",");

            // variáveis do Firebase
            String fFaunaFlora = "";
            String fGrupo = "";
            String fFamilia = "";
            String fEspecie = "";
            String fNomeComum = "";
            String fCategoria = "";
            String fBioma = "";
            String fAmeacas = "";
            String fEstados = "";

            for (String parte : partes) {

                if (parte.contains("faunaFlora:"))
                    fFaunaFlora = parte.split("faunaFlora:")[1].trim();

                if (parte.contains("grupo:"))
                    fGrupo = parte.split("grupo:")[1].trim();

                if (parte.contains("familia:"))
                    fFamilia = parte.split("familia:")[1].trim();

                if (parte.contains("especie:"))
                    fEspecie = parte.split("especie:")[1].trim();

                if (parte.contains("nomeComum:"))
                    fNomeComum = parte.split("nomeComum:")[1].trim();

                if (parte.contains("categoria:"))
                    fCategoria = parte.split("categoria:")[1].trim();

                if (parte.contains("bioma:"))
                    fBioma = parte.split("bioma:")[1].trim();

                if (parte.contains("ameacas:"))
                    fAmeacas = parte.split("ameacas:")[1].trim();

                if (parte.contains("estados:"))
                    fEstados = parte.split("estados:")[1].trim();
            }

            // ================== FILTROS ==================

            boolean okFauna = faunaFlora.equals("---") || fFaunaFlora.equalsIgnoreCase(faunaFlora);
            boolean okGrupo = grupo.equals("---") || fGrupo.equalsIgnoreCase(grupo);
            boolean okFamilia = familia.isEmpty() || fFamilia.toLowerCase().contains(familia);
            boolean okEspecie = especie.isEmpty() || fEspecie.toLowerCase().contains(especie);
            boolean okNome = nomeComum.isEmpty() || fNomeComum.toLowerCase().contains(nomeComum);
            boolean okCategoria = categoriaFiltro.isEmpty() || fCategoria.toLowerCase().contains(categoriaFiltro);
            boolean okBioma = bioma.isEmpty() || fBioma.toLowerCase().contains(bioma);
            boolean okAmeacas = ameacas.isEmpty() || fAmeacas.toLowerCase().contains(ameacas);
            boolean okEstados = estados.isEmpty() || fEstados.toLowerCase().contains(estados);

            // ================== RESULTADO ==================

            if (okFauna && okGrupo && okFamilia && okEspecie &&
                    okNome && okCategoria && okBioma &&
                    okAmeacas && okEstados) {

                tabelaModel.addRow(new Object[]{
                        fFaunaFlora,
                        fGrupo,
                        fFamilia,
                        fEspecie,
                        fNomeComum,
                        fCategoria,
                        fBioma,
                        fAmeacas,
                        fEstados
                });
            }
        }

        if (tabelaModel.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Nenhum resultado para o filtro informado.");
        }
    }


    public void limpar() {

        // Limpa o ComboBox
        comboFaunaFlora.setSelectedIndex(0);
        comboGrupo.setSelectedIndex(0);

        // Limpa campos de texto
        txtFamilia.setText("");
        txtEspecie.setText("");
        txtBioma.setText("");
        txtCategoria.setText("");
        txtAmeacas.setText("");
        txtNomeComum.setText("");
        txtEstados.setText("");

        // Limpa a tabela
        tabelaModel.setRowCount(0);


    }

    private void sincronizar(){
        FirebaseService.sincronizarDados();
        JOptionPane.showMessageDialog(this, "Dados enviado ao FireBase!");
    }

    private void conectar() {
        JOptionPane.showMessageDialog(this, "Conectado ao FireBase!");

    }


    // ================== MAIN ==================
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new TelaInterface().setVisible(true);
        });
    }
}