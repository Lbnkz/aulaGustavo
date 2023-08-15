package semana05;

import banco.Conta;
import banco.Pessoa;
import java.util.ArrayList;

public class Semana05 {

    public static void main(String[] args) {
        ArrayList<Conta> banco = new ArrayList<>();

        Pessoa p1 = new Pessoa("Lucas", "099.123.121-98", "6.742.275", "991068743", "Rua tal");
        Pessoa p2 = new Pessoa("Joao", "798.456.234-88", "6.787.241", "991068743", "Rua tal");
        Pessoa p3 = new Pessoa("kaue", "023.987.089-18", "6.235.234", "991068743", "Rua tal");

        banco.add(new Conta(p1));
        banco.add(new Conta(p2));
        banco.add(new Conta(p3));

        for (Conta conta : banco) {
            
            conta.depositar(100.0);
            System.out.println(" ");
            conta.sacar(50.0);
        }
        
    }
}
