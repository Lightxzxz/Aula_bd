package com.example.aula_bd;

public class Pessoas {
    int cod;
    String nome, tel, email;
    public Pessoas(){
    }
    public Pessoas(int cod, String nome, String tel, String email){
        this.cod = cod;
        this.nome = nome;
        this.tel = tel;
        this.email = email;
    }

    public int getCod() {
        return cod;
    }
    public String getNome(){
        return nome;
    }

    public String getTel() {
        return tel;
    }

    public String getEmail() {
        return email;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
