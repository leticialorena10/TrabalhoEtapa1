package com.doctum.oo;
public class Retangulo {
    
    private double base;
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }    
    
    private double altura;
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public Retangulo(double base,double altura){
        this.altura=altura;
        this.base=base;
    }
    
    public double area(){
        return base*altura;
    }
    
    public double perimetro(){
        return 2*base+2*altura;
    }
    
    public boolean quadrado(){
        return base==altura;
    }
}
