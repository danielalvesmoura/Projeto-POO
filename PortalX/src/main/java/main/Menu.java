package main;

import javax.swing.*;
import main.*;

public class Menu {

    static JFrame frame = new JFrame("Portal X");

    Componentes componentes = new Componentes();

    public void menuPrincipal() {

        frame.setSize(1000,500);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(null);

        componentes.criaBotao(frame,"Cadastrar",450,200);

        frame.setVisible(true);
    }

    public void menuCadastro() {

    }

}
