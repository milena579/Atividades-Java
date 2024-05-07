package DesafioTres;

public class Stack <E> {
    private E[] lista;
    private Integer size = 0;

    Stack(){
        lista = (E[]) (new Object[10]);
    }

    Stack(int capacity){
        lista = (E[]) (new Object[capacity]);
    }

    void Push (E value){
        if(size == lista.length){
            E[] copy = (E[]) (new Object [2 * lista.length]);
            for (int i = 0; i < size; i++){
                copy[i] = lista[i];
            }
            lista = copy;
        }
        lista[size] = value;
        size++;
    }

    Integer size(){
        return this.size;
    }

    E getPeek(){
        return this.lista[size-1];
    } 
    
    E pop(){
        E removido = lista[size-1];
        //lista[size-1] = null;
        size--;

        return removido;
    }
}

