package main;

import service.*;

import java.util.Scanner;

import model.Evento;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();

        Scanner scanner = new Scanner(System.in);
        int opcao = 1;

        while(opcao != 2) {
            main.menu();

            System.out.println("Deseja continuar? [1] Sim, [2] Não");
            opcao = scanner.nextInt();

            while(opcao != 1 && opcao != 2) {
                System.out.println("Opção inválida! Digite novamente:");
                opcao = scanner.nextInt();
            }

        }
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("O que deseja fazer?");
        System.out.println("[1] Cadastrar");
        System.out.println("[2] Listar todos com preço acima da média");
        System.out.println("[3] Exibir média de preços dos produtos abaixo de 100");
        System.out.println("[4] Mostrar mais caro e mais barato");

        int opcao = scanner.nextInt();

        if(opcao == 1) {
            System.out.println("");
            cadastrar();
            System.out.println("");
        } else if (opcao == 2) {
            System.out.println("");
            produtoService.listarAcimaDaMedia();
            System.out.println("");
        } else if (opcao == 3) {
            System.out.println("\nA média de preços dos produtos com preço abaixo de 100 é " + produtoService.mediaAbaixoDeCem() + "\n");
        } else if (opcao == 4) {
            Produto caro = produtoService.maisCaro();
            Produto barato = produtoService.maisBarato();

            System.out.println("\nO produto mais caro é " + caro.getNome() + " e o mais barato é " + barato.getNome() + "\n");
        }
    }

    public void cadastrar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o nome do produto?");
        String nome = scanner.nextLine();

        System.out.println("Qual o preço do produto?");
        double preco = scanner.nextDouble();

        produtoService.cadastrar(nome, preco);

        System.out.println("Produto cadastrado com sucesso!");
    }

}