package impossivel.iterators;

import impossivel.Exceptions.Unchecked;
import impossivel.collections.Stack;

public class StackIterator<T> implements Iterator<T> 
{
    int proxIndex;
    Stack<T> listaNext = null;

    public StackIterator(Stack<T> listaNext)
    {
        this.listaNext = listaNext;
    }

    @Override
    public T next() throws Unchecked 
    {
        if (!hasNext())
            throw new Unchecked();

        T valueT = listaNext.get(proxIndex);

        proxIndex += 1;

        return valueT;
    }

    @Override
    public boolean hasNext() 
    {
        return proxIndex < listaNext.getSize();
    }
    
}
