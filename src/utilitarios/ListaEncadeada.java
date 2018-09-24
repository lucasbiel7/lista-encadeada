/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilitarios;

/**
 *
 * @author lucas
 * @param <T>
 */
public class ListaEncadeada<T> {

    private Nodo<T> elemento;
    private long quantidade;

    public void adicionar(T t) {
        if (elemento == null) {
            elemento = new Nodo<>(t, null);
        } else {
            Nodo<T> elementoAtual = elemento;
            do {
                if (elementoAtual.getNext() == null) {
                    elementoAtual.setNext(new Nodo<>(t, null));
                    break;
                }
                elementoAtual = elementoAtual.getNext();
            } while (elementoAtual != null);
        }
    }

    public Nodo<T> getElemento() {
        return elemento;
    }

    public long getQuantidade() {
        return quantidade;
    }
}
