package impossivel.iterators;

import impossivel.Exceptions.Unchecked;
import impossivel.collections.ArrayList;

public class ArrayListIterator<T> implements Iterator<T>
{
    int proxIndex = 0;
    ArrayList<T> listaNext = null;

    public ArrayListIterator(ArrayList<T> lista) 
    {
        this.listaNext = lista;
    }

	@Override
    public T next() throws Unchecked
    {
        if (!hasNext())
            throw new Unchecked();
        
        T value = listaNext.get(proxIndex);
        proxIndex += 1;

        return value;
    }

    @Override
    public boolean hasNext() {
        return proxIndex < listaNext.getSize();
    }
}