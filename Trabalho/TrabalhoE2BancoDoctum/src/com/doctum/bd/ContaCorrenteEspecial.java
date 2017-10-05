package com.doctum.bd;

public class ContaCorrenteEspecial extends ContaCorrente {
    
    public ContaCorrenteEspecial(int numero, String nome, double saldo, double limite) {
        super(numero, nome, saldo);
        this.limite=limite;
    }

    private double limite;
    public double getLimite() {
        return limite;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    @Override
    public void sacar(double valorSaque){
        if(valorSaque > 0){
            if(valorSaque <= this.limite){
                this.setSaldo(this.getSaldo()- valorSaque);
                System.out.println("Saque efetuado!");
            }
            else{
                System.out.println("Valor de saque inválido!");
            }
        }
        else{
            System.out.println("Valor de saque inválido!");
        }
    }
}
