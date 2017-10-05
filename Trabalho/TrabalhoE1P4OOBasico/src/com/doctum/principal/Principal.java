package com.doctum.principal;
import com.doctum.oo.Cachorro;
import com.doctum.oo.Compra;
import com.doctum.oo.Pessoa;
import com.doctum.oo.Retangulo;

public class Principal {
    public static void main(String [] args){
        Cachorro c1 = new Cachorro("Bob",1.50);
        System.out.println("Nome: "+c1.getNome());
        c1.latir();
        
        Retangulo r1 = new Retangulo(1.5,2);
        System.out.println("É quadrado: "+r1.quadrado());
        System.out.println("A area é: "+r1.area());
        System.out.println("O perimetro é: "+r1.perimetro());
        
        Compra co1 = new Compra(700,7);
        System.out.println("O valor de cada parcela é: "+co1.valorParcela());
        
        Pessoa p1 = new Pessoa("João",1.68,70,9,10,1997);
        System.out.println("Nome: "+p1.getNome());
        System.out.println("Altura: "+p1.getAltura());
        System.out.println("Peso: "+p1.getPeso());
        System.out.println("IMC: "+p1.imc());
        System.out.println("Idade: "+p1.idade());
        
    }
}
