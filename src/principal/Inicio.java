/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import utilitarios.ListaEncadeada;
import utilitarios.Nodo;

/**
 *
 * @author lucas
 */
public class Inicio {

    public static void main(String[] args) {
        ListaEncadeada<String> lista = new ListaEncadeada<>();
        lista.adicionar("teste");
        lista.adicionar("Olá");
        lista.adicionar("mundo");
        Nodo<String> no = lista.getElemento();
        do {
            if (no != null) {
                System.out.println(no.getValor());
                no = no.getNext();
            }
        } while (no != null);
    }
}
