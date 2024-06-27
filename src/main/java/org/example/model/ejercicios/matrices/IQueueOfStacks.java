package org.example.model.ejercicios.matrices;

public interface IQueueOfStacks {

    /**
     * Añade una pila a la cola de pilas.
     *
     * @param stack la pila que se desea añadir
     */
    void addStack(Stack stack);

    /**
     * Devuelve la cola de pilas.
     *
     * @return la cola de pilas
     */
    Queue getQueueOfStacks();

    /**
     * Devuelve el tamaño de la cola (número de pilas).
     *
     * @return el tamaño de la cola
     */
    int size();

    /**
     * Devuelve el tamaño de cada pila.
     *
     * @return el tamaño de cada pila
     */
    int getN();
}