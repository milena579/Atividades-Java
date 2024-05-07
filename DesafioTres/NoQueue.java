package DesafioTres;

public class NoQueue<E> {

    private NoQueue<E> before = null; // variavel depois
    private NoQueue<E> after = null;
    private E value;

    NoQueue(E newPos){
        this.value = newPos;
    }

    public NoQueue<E> getBefore() {
        return before;
    }
    public void setBefore(NoQueue<E> before) {
        this.before = before;
    }
    
    public NoQueue<E> getAfter() {
        return after;
    }
    public void setAfter(NoQueue<E> after) {
        this.after = after;
    }

    public E getValue() {
        return value;
    }
    public void setValue(E value) {
        this.value = value;
    }

}
