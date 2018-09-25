/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.Scanner;
import utilitarios.ListaEncadeada;

/**
 *
 * @author lucas
 */
public class Inicio {

    public static void main(String[] args) {
        ListaEncadeada<String> lista = new ListaEncadeada<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seja bem vindo ao sistema de listas encadeadas");
        int op;
        do {
            System.out.println("0 - Sair");
            System.out.println("1 - Inserir um valor ao final");
            System.out.println("2 - Inserir um valor ordenado");
            System.out.println("3 - Remover uma posição");
            System.out.println("4 - Imprimir lista");
            op = scanner.nextInt();
            scanner.nextLine();
            switch (op) {
                case 1:
                    System.out.println("Digite o valor a ser inserido");
                    lista.adicionar(scanner.nextLine());
                    break;
                case 2:
                    System.out.println("Digite o valor a ser inserido ordenado");
                    lista.adicionarOrdenado(scanner.nextLine());
                    break;
                case 3:
                    System.out.println("Digite a opção a ser removida");
                    lista.remover(scanner.nextInt() - 1);
                    break;
                case 4:
                    System.out.println("-----------------");
                    lista.imprimir();
                    System.out.println("-----------------");
            }
        } while (op != 0);
    }
}
