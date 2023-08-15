package banco;

import java.util.Random;


public class Conta {

    public Conta(Pessoa titular) {
        this.titular = titular;
        this.saldo = 0.0;
        this.numero = this.gerarNumConta();
    }
    
    private int numero;
    private Pessoa titular;
    private double saldo;

    public int getNumero() {
        return numero;
    }
    public Pessoa getTitular() {
        return titular;
    }
    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor){
        if(valor > 0){
            this.saldo += valor;
            System.out.printf(this.titular.getNome() + " Saldo apos o deposito: R$%.2f", this.saldo);
        }else{
            System.out.println("Valor invalido");
        }
    }
    public void sacar(double valor){
        if(valor > 0 && valor <= this.saldo){
            this.saldo -= valor;
            System.out.printf(this.titular.getNome() + " Saldo apos o saque: R$%.2f", this.saldo);
        }else{
            System.out.println("Valor invalido");
        }
    }
    
    private int gerarNumConta() {
        Random random = new Random();    
        return random.nextInt(90000) + 10000;
    }
    
    
    
}
