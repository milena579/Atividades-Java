package DesafioDois;

public class Ponto {
    Empregado empregado;
    Integer minutos;
    Integer horas;
    String dataPonto;

    void batePonto(Empregado empregado, Integer horas, Integer minutos, String dataPonto ){
        this.empregado = empregado;
        this.horas = horas;
        this.minutos = minutos;
        this.dataPonto = dataPonto;
    }

    public Empregado getEmpregado() {
        return empregado;
    }

    public void setEmpregado(Empregado empregado) {
        this.empregado = empregado;
    }

    public Integer getMinutos() {
        return minutos;
    }

    public void setMinutos(Integer minutos) {
        this.minutos = minutos;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public String getDataPonto() {
        return dataPonto;
    }

    public void setDataPonto(String dataPonto) {
        this.dataPonto = dataPonto;
    }
}
