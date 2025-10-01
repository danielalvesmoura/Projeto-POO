package main;

import javax.swing.*;
import main.*;
import main.menuComponentes.telaPrincipal.Botoes;

public class Menu {

    Botoes botoes = new Botoes();

    public void menuPrincipal() {
        JFrame frame = new JFrame("Portal X");
        frame.setSize(1000,500);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(null);

        botoes.criaBotaoCadastrar(frame);
    }

}
