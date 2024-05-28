package impossivel.iterators;

import impossivel.Exceptions.Unchecked;

import impossivel.collections.Node;

public class LinkedListIterator<T> implements Iterator<T> 
{
    Node<T> next = null;

    public LinkedListIterator(Node<T> first) 
    {
        this.next = first;
    }

    @Override
    public T next() throws Unchecked 
    {
        if (next == null)
            throw new Unchecked();

        T value = next.getValue();

        next = next.getNext();

        return value;
    }

    @Override
    public boolean hasNext() 
    {
        return next != null;
    }   
}