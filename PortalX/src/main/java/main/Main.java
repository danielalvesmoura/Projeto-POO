package main;

import main.menu.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();

        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while(opcao != 2) {
            MenuPrincipal menuPrincipal = new MenuPrincipal();
            menuPrincipal.menuAcao();

            System.out.println("Deseja continuar? [1] Sim, [2] Não");

            opcao = 0;
            while(true) {
                try {
                    opcao = scanner.nextInt();
                    if(opcao != 1 && opcao != 2) {
                        System.out.println("Resposta inválida. Tente novamente:");
                    } else {
                        break;
                    }
                } catch(InputMismatchException e) {
                    System.out.println("Resposta inválida. Tente novamente:");
                    scanner = new Scanner(System.in);
                }
            }

        }
    }



}