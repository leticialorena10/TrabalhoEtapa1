package com.doctum.bd;

public abstract class Conta {
    
    private int numero;
    public int getNumero() {
        return numero;
    }
    protected void setNumero(int numero) {
        this.numero = numero;
    }

    private String nome;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    private double saldo;
    public double getSaldo() {
        return saldo;
    }
    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}