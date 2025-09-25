package main.menu;

import java.util.Scanner;
import java.util.InputMismatchException;

public class MenuPrincipal {
    public void menuAcao() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("O que deseja fazer?");
        System.out.println("[1] Cadastrar");

        int opcao = 0;

        while(true) {
            try {
                opcao = scanner.nextInt();
                if(opcao != 1) {
                    System.out.println("Resposta inválida. Tente novamente:");
                } else {
                    break;
                }
            } catch(InputMismatchException e) {
                System.out.println("Resposta inválida. Tente novamente:");
                scanner = new Scanner(System.in);
            }
        }

        if(opcao == 1) {
            menuCadastro();
        }
    }

    public void menuCadastro() {

    }


}
