package DesafioTres;

public class Queue<E> {
    private NoQueue<E> head;
    private NoQueue<E> tail;
    private Integer size;

    Queue(){
        this.head = null; // construtor
        this.tail = null;
        this.size = 0;
    }

    void enqueue(E valor){ //função que adiconar no fim da fila 
        size++;
        NoQueue<E> node = new NoQueue<>(valor); //variavel node é do tipo Noqueue

        if (head == null){
            head = node; 
            tail = node;
            return;
        }
        
        tail.setAfter(node);
        node.setBefore(tail);
        tail = node;
    }

    E dequeue(){ // função que remove o ultimo valor e retorna 
        E valor = head.getValue();
        head = head.getAfter();
        head.setBefore(null);

        return valor;
    }

    E peek(){ //função que retorna o ultimo valor sem remover
        E valor = head.getValue();
        return valor;
    }

    Integer size(){ //função que retorna o tamanho da lista
        return this.size;
    }
}
