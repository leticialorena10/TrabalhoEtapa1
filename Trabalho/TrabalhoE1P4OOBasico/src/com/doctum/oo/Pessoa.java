package com.doctum.oo;

import java.util.Calendar;

public class Pessoa {

    private String nome;
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    private double altura;
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getAltura() {
        return altura;
    }


    private double peso;
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    private Calendar dataNascimento = Calendar.getInstance();
    public Calendar getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(int dia,int mes,int ano){
        this.dataNascimento.set(Calendar.DAY_OF_MONTH,dia);
        this.dataNascimento.set(Calendar.MONTH,mes);
        this.dataNascimento.set(Calendar.YEAR,ano);
    }
    
    public Pessoa (String nome, double altura, double peso, int dia, int mes, int ano){
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
        this.dataNascimento.set(Calendar.DAY_OF_MONTH,dia);
        this.dataNascimento.set(Calendar.MONTH,mes);
        this.dataNascimento.set(Calendar.YEAR,ano);
    }

    private Calendar hoje = Calendar.getInstance();
    public Calendar getHoje() {
        return hoje;
    }
    public void setHoje(Calendar hoje){
        this.hoje = hoje;
    }
    
    public int idade(){
        int idade = hoje.get(Calendar.YEAR)-dataNascimento.get(Calendar.YEAR);
        
        if(hoje.get(Calendar.MONTH) < dataNascimento.get(Calendar.MONTH)){
            idade--;
        }
        else if(hoje.get(Calendar.MONTH) == dataNascimento.get(Calendar.MONTH) && hoje.get(Calendar.DAY_OF_MONTH) < dataNascimento.get(Calendar.DAY_OF_MONTH)){
                idade--;
        }
        return idade;
    }
    
    public double imc(){
        return peso/(altura*altura);
    }
}
