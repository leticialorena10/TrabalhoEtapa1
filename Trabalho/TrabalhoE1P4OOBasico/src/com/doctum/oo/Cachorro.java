package com.doctum.oo;
public class Cachorro {
    
    private String nome;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    private double tamanho;    
    public double getTamanho() {
        return tamanho;
    }
    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }
    
    private static int cont;
    
    public Cachorro(String nome, double tamanho){
        this.nome=nome;
        this.tamanho=tamanho;
        cont++;
    }
    
    public void latir(){
        System.out.println(nome+" está latindo");
    }
    
    public void brincar(){
        System.out.println(nome+" está brincando");
    }   
    
    public void mostrarCont(){
        System.out.println(cont+" cachorros foram criados");
    }
}
