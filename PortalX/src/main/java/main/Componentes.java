package main;

import javax.swing.*;

public class Componentes {
    public void criaBotao(JFrame frame, String texto, int x, int y) {
        JButton botao = new JButton(texto);

        botao.setBounds(x,y,100,50);

        botao.addActionListener(e -> {
            frame.remove(botao);
            //frame.revalidate();
            frame.repaint();
        });

        frame.getContentPane().add(botao);
    }
}
