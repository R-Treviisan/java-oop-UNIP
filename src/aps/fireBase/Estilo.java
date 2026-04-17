package aps.fireBase;

import javax.swing.*;
import javax.swing.table.JTableHeader;
import java.awt.*;

public class Estilo {

    // ================== CORES ==================
    public static final Color COR_FUNDO = new Color(245, 245, 245);
    public static final Color COR_BOTAO = new Color(255, 255, 255, 40);
    public static final Color COR_TEXTO = Color.BLACK;
    public static final Color COR_TABELA = Color.WHITE;
    public static final Color COR_CABECALHO = new Color(200, 200, 200);

    // ================== FONTES ==================
    public static final Font FONTE_PADRAO = new Font("Arial", Font.PLAIN, 12);
    public static final Font FONTE_TITULO = new Font("Arial", Font.BOLD, 14);

    // ================== APLICAR TEMA GLOBAL ==================
    public static void aplicarTema() {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        UIManager.put("Label.font", FONTE_PADRAO);
        UIManager.put("Button.font", FONTE_PADRAO);
        UIManager.put("TextField.font", FONTE_PADRAO);
        UIManager.put("ComboBox.font", FONTE_PADRAO);
        UIManager.put("Table.font", FONTE_PADRAO);
    }

    // ================== BOTÃO ==================
    public static void estilizarBotao(JButton botao) {
        botao.setBackground(COR_BOTAO);
        botao.setForeground(Color.WHITE);
        botao.setFocusPainted(false);
    }

    // ================== TEXTFIELD ==================
    public static void estilizarCampo(JTextField campo) {
        campo.setBackground(Color.WHITE);
        campo.setForeground(COR_TEXTO);
    }

    // ================== COMBOBOX ==================
    public static void estilizarCombo(JComboBox<?> combo) {
        combo.setBackground(Color.WHITE);
        combo.setForeground(COR_TEXTO);
    }

    // ================== TABELA ==================
    public static void estilizarTabela(JTable tabela) {
        tabela.setBackground(COR_TABELA);
        tabela.setForeground(COR_TEXTO);
        tabela.setRowHeight(22);

        JTableHeader header = tabela.getTableHeader();
        header.setBackground(COR_CABECALHO);
        header.setForeground(Color.BLACK);
    }
}