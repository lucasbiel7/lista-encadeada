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
public class Nodo<T> {

    private T valor;
    private Nodo<T> proximo;

    public Nodo(T valor, Nodo<T> next) {
        this.valor = valor;
        this.proximo = next;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public Nodo<T> getProximo() {
        return proximo;
    }

    public void setProximo(Nodo<T> proximo) {
        this.proximo = proximo;
    }

}
