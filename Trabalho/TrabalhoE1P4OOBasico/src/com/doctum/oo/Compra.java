package com.doctum.oo;
public class Compra {
    
    public int getNumeroParcelas() {
        return numeroParcelas;
    }
    public void setNumeroParcelas(int numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
    }
    private int numeroParcelas;
    
    private double valorTotal;
    public double getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    public Compra(double valorTotal,int numeroParcelas){
        this.numeroParcelas = numeroParcelas;
        this.valorTotal = valorTotal;
    }
    
    public double valorParcela(){
        return valorTotal/numeroParcelas;
    }
}
