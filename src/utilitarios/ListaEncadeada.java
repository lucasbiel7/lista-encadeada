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
public class ListaEncadeada<T extends Comparable> {

    private Nodo<T> elemento;
    private long quantidade;

    /**
     * Adiciona um no no final da lista
     *
     * @param t
     */
    public void adicionar(T t) {
        if (elemento == null) {
            elemento = new Nodo<>(t, null);
            quantidade++;
        } else {
            Nodo<T> elementoAtual = elemento;
            while (elementoAtual != null) {
                if (elementoAtual.getProximo() == null) {
                    elementoAtual.setProximo(new Nodo<>(t, null));
                    quantidade++;
                    break;
                }
                elementoAtual = elementoAtual.getProximo();
            }
        }
    }

    /**
     * Recupera primeiro elemento da lista encadeada
     *
     * @return
     */
    public Nodo<T> getElemento() {
        return elemento;
    }

    /**
     * Método para remover da lista
     *
     * @param index
     */
    public void remover(int index) {
        Nodo<T> elementoAtual = elemento;
        for (int i = 0; i < index - 1; i++) {
            if (elementoAtual == null) {
                break;
            }
            elementoAtual = elementoAtual.getProximo();
        }
        if (elementoAtual != null) {
            if (index == 0) {
                elemento = elementoAtual.getProximo();
                quantidade--;
            } else if (index == quantidade) {
                elementoAtual.setProximo(null);
                quantidade--;
            } else {
                elementoAtual.setProximo(elementoAtual.getProximo().getProximo());
                quantidade--;
            }
        }
    }

    public long getQuantidade() {
        return quantidade;
    }

    /**
     * Imprimi os dados da lista
     *
     */
    public void imprimir() {
        Nodo<T> no = getElemento();
        while (no != null) {
            System.out.print(no.getValor());
            no = no.getProximo();
            if (no != null) {
                System.out.print(", ");
            }
        }
        System.out.println("");
    }

    public void adicionarOrdenado(T valor) {
        if (elemento == null) {
            elemento = new Nodo<>(valor, null);
            quantidade++;
        } else {
            Nodo<T> nodoAnterior = null;
            Nodo<T> nodo = elemento;
            while (nodo != null) {
                if (nodo.getValor().compareTo(valor) > 0) {
                    if (nodoAnterior == null) {
                        elemento = new Nodo<>(valor, nodo);
                        quantidade++;
                    } else {
                        nodoAnterior.setProximo(new Nodo<>(valor, nodo));
                        quantidade++;
                    }
                    break;
                } else {
                    if (nodo.getProximo() == null) {
                        nodo.setProximo(new Nodo(valor, null));
                        quantidade++;
                        break;
                    }
                    nodoAnterior = nodo;
                    nodo = nodo.getProximo();
                }
            }
        }
    }
}
