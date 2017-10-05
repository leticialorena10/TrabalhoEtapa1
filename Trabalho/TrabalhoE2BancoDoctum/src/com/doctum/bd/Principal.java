package com.doctum.bd;

public class Principal {

    public static void main(String[] args) {
        
        ContaCorrente cc1 = new ContaCorrente(1, "João", 3000);
        
        System.out.println("Conta corrente: " + cc1.getNumero() + "\nProprietário: " + cc1.getNome());
        System.out.println("Saldo: " + cc1.getSaldo());
        cc1.depositar(1000);
        System.out.println("Saldo: " + cc1.getSaldo());
        
        System.out.println("\n");
        
        ContaCorrente cc2 = new ContaCorrente(2, "Mikael", 3000);
        
        System.out.println("Conta corrente: " + cc2.getNumero() + "\nProprietário: " + cc2.getNome());
        System.out.println("Saldo: " + cc2.getSaldo());
        cc2.depositar(1000);
        System.out.println("Saldo: " + cc2.getSaldo());
        cc2.sacar(700);
        System.out.println("Saldo: " + cc2.getSaldo());
        
        System.out.println("\n");
        
        ContaCorrente cc3 = new ContaCorrente(3, "Alisson", 3000);        
        System.out.println("Conta corrente: " + cc3.getNumero() + "\nProprietário: " + cc3.getNome());
        System.out.println("Saldo: " + cc3.getSaldo());
        cc3.sacar(3300);
        System.out.println("Saldo: " + cc3.getSaldo());        
        System.out.println("\n");
        
        ContaCorrenteEspecial cce1 = new ContaCorrenteEspecial(1, "João", 1000, 7000);        
        System.out.println("Conta corrente especial: " + cce1.getNumero() + "\nProprietário: " + cce1.getNome() + "\nLimite: " + cce1.getLimite());
        System.out.println("Saldo: " + cce1.getSaldo());
        cce1.depositar(250);
        System.out.println("Saldo: " + cce1.getSaldo());
        cce1.sacar(3000);
        System.out.println("Saldo: " + cce1.getSaldo());        
        System.out.println("\n");
        
        ContaCorrenteEspecial cce2 = new ContaCorrenteEspecial(2, "Mikael", 1000, 8000);        
        System.out.println("Conta corrente especial: " + cce2.getNumero() + "\nProprietário: " + cce2.getNome() + "\nLimite: " + cce2.getLimite());
        System.out.println("Saldo: " + cce2.getSaldo());
        cce2.depositar(750);
        System.out.println("Saldo: " + cce2.getSaldo());
        cce2.sacar(2500);
        System.out.println("Saldo: " + cce2.getSaldo());        
        System.out.println("\n");
        
        ContaCorrenteEspecial cce3 = new ContaCorrenteEspecial(3, "Alisson", 1000, 9000);
        
        System.out.println("Conta corrente especial: " + cce3.getNumero() + "\nProprietário: " + cce3.getNome() + "\nLimite: " + cce3.getLimite());
        System.out.println("Saldo: " + cce3.getSaldo());
        cce3.depositar(1000);
        System.out.println("Saldo: " + cce3.getSaldo());
        cce3.sacar(10000);
        System.out.println("Saldo: " + cce3.getSaldo());        
        System.out.println("\n");        
    }
    
}
