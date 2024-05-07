package DesafioDois;

public class Empregado {
    private String nome;
    private String cpf;
    private String dataNasc;
    private String senha;
    private Boolean adm;

    void novoEmpregado(String nome, String cpf, String dataNasc, String senha, Boolean adm){
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        this.senha = senha;
        this.adm = adm;
    }

    //NOME
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    //CPF
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    //Data Nasc
    public String getDataNasc() {
        return dataNasc;
    }
    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    //SENHA
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    //ADM    
    public Boolean getAdm() {
        return adm;
    }
    public void setAdm(Boolean adm) {
        this.adm = adm;
    }
    
    
    
}
