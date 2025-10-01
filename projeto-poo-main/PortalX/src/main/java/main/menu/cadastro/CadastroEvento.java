package main.menu.cadastro;

import java.util.Scanner;

public class CadastroEvento {
    public void cadastrar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o nome do produto?");
        String nome = scanner.nextLine();

        System.out.println("Qual o preço do produto?");
        double preco = scanner.nextDouble();

        //eventoService.cadastrar(nome, preco);

        System.out.println("Produto cadastrado com sucesso!");
    }
}
