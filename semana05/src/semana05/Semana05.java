package semana05;

import java.util.ArrayList;


public class Semana05 {


    public static void main(String[] args) {
        
        ArrayList<Cachorro> listaDog = new ArrayList<>();
        
        
        
        Pessoa donoUm = new Pessoa("Lucas", "1234-5678", "Rua oafnawdd, n° 123");
        
        
        
        
        
        listaDog.add(new Cachorro("Python", "Labrador", 4, "Grande", donoUm));
        listaDog.add(new Cachorro("Java", "Husk", 6, "Grande", donoUm));
       

        
        for(Cachorro dog : listaDog){
            System.out.println(dog.getNome() + " - "+ dog.getDono().getNome());
        }
    }    
}
