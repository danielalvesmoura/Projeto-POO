package main.menuComponentes.telaPrincipal;

import javax.swing.*;

public class Botoes {

    public void criaBotaoCadastrar(JFrame frame) {
        JButton botaoCadastro = new JButton("Cadastrar");

        botaoCadastro.setBounds(450,200,100,50);

        botaoCadastro.addActionListener(e -> {
            frame.remove(botaoCadastro);
            //frame.revalidate();
            frame.repaint();

            System.out.println("botaoCadastro clicado");
        });

        frame.getContentPane().add(botaoCadastro);

        frame.setVisible(true);
    }

}
