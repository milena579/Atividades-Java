package DesafioDois;

public class ListaEmpregados {
    private NoEmpregados head = null;
    private int size = 0;

    void add(Empregado empregado)
    {
        size++;
        NoEmpregados node = new NoEmpregados(empregado);
        if ( head == null ){
            head = node;
            return;
        }

        NoEmpregados atual = head;
        while(atual.getNext() != null){
            atual = atual.getNext();
        }

        atual.setNext(node);
    }

    Empregado getEmpregados(int index)
    {
        NoEmpregados atual = head;

        if (index > size){
            return null;
        }

        for(int i = 0; i < index; i++)
        {
            atual = atual.getNext();
        }

        return atual.getEmpregado();
    }

    int getSize(){
        return size;
    }
}
