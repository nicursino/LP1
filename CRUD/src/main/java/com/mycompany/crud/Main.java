package com.mycompany.crud;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    private static UsuarioDAO usuarioDAO = new UsuarioDAO();

    public static void main(String[] args) {
        JFrame frame = new JFrame("CRUD com Java Swing");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel labelNome = new JLabel("Nome:");
        JTextField textFieldNome = new JTextField(20);
        JLabel labelEmail = new JLabel("Email:");
        JTextField textFieldEmail = new JTextField(20);
        JLabel labelSenha = new JLabel("Senha:");
        JTextField textFieldSenha = new JTextField(20);
        
        JButton btnAdicionar = new JButton("Adicionar Usuário");
        btnAdicionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Usuario usuario = new Usuario();
                usuario.setNome(textFieldNome.getText());
                usuario.setEmail(textFieldEmail.getText());
                usuario.setSenha(textFieldSenha.getText());
                usuarioDAO.adicionarUsuario(usuario);
                JOptionPane.showMessageDialog(frame, "Usuário adicionado com sucesso!");
            }
        });

        JPanel panel = new JPanel();
        panel.add(labelNome);
        panel.add(textFieldNome);
        panel.add(labelEmail);
        panel.add(textFieldEmail);
        panel.add(labelSenha);
        panel.add(textFieldSenha);
        panel.add(btnAdicionar);

        frame.add(panel);
        frame.setVisible(true);
    }
}

