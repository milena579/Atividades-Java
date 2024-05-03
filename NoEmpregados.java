package DesafioDois;

public class NoEmpregados 
{
    //Atributos netx
    private NoEmpregados next = null;
    public NoEmpregados getNext() {
        return next;
    }

    public void setNext(NoEmpregados next) {
        this.next = next;
    }

    private Empregado value;
    NoEmpregados(Empregado value)
    {
        this.value = value;
    }

    Empregado getEmpregado(){
        return value;
    }

    
}
   
