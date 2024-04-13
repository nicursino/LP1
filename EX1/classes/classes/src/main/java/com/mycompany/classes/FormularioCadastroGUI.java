/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classes;

/**
 *
 * @author Noite
 */
import javax.swing.*;

public class FormularioCadastroGUI extends JFrame {
    
    private JTextField txtNome;
    private JTextField txtIdade;
    private JTextField txtRua;
    private JTextField txtCidade;
    private JTextField txtCEP;

    public FormularioCadastroGUI() {
        setTitle("Cadastro de Pessoa");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        JPanel panelPessoa = new JPanel();
        panelPessoa.setLayout(new BoxLayout(panelPessoa, BoxLayout.Y_AXIS));

        JLabel lblNome = new JLabel("Nome:");
        txtNome = new JTextField(20);
        panelPessoa.add(lblNome);
        panelPessoa.add(txtNome);

        JLabel lblIdade = new JLabel("Idade:");
        txtIdade = new JTextField(20);
        panelPessoa.add(lblIdade);
        panelPessoa.add(txtIdade);

        JPanel panelEndereco = new JPanel();
        panelEndereco.setLayout(new BoxLayout(panelEndereco, BoxLayout.Y_AXIS));

        JLabel lblRua = new JLabel("Rua:");
        txtRua = new JTextField(20);
        panelEndereco.add(lblRua);
        panelEndereco.add(txtRua);

        JLabel lblCidade = new JLabel("Cidade:");
        txtCidade = new JTextField(20);
        panelEndereco.add(lblCidade);
        panelEndereco.add(txtCidade);

        JLabel lblCEP = new JLabel("CEP:");
        txtCEP = new JTextField(20);
        panelEndereco.add(lblCEP);
        panelEndereco.add(txtCEP);

        JButton btnCadastrar = new JButton("Cadastrar");
        btnCadastrar.addActionListener(e -> cadastrar());
        add(panelPessoa);
        add(panelEndereco);
        add(btnCadastrar);

        setVisible(true);
    }

    private void cadastrar() {
        String nome = txtNome.getText();
        int idade = Integer.parseInt(txtIdade.getText());
        String rua = txtRua.getText();
        String cidade = txtCidade.getText();
        String cep = txtCEP.getText();

        Endereco endereco = new Endereco(rua, cidade, cep);
        Pessoa pessoa = new Pessoa(nome, idade, endereco);

        JOptionPane.showMessageDialog(this, "Pessoa cadastrada:\n" + pessoa);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(FormularioCadastroGUI::new);
    }
}
