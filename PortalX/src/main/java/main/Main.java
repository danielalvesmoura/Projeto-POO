package main;

import main.menu.*;

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Uma janela ae");
        frame.setSize(300,300);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton botaoCadastro = new JButton("Cadastrar");

        botaoCadastro.addActionListener(e -> {
            JOptionPane.showMessageDialog();
        });

        frame.getContentPane().add(botaoCadastro);

        frame.setVisible(true);
    }



}