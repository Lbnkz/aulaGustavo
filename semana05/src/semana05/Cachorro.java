package semana05;

public class Cachorro {

    public Cachorro(String nome, String raca, int idade, String porte, Pessoa dono) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.porte = porte;
        this.dono = dono;
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return this.raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return this.idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getPorte() {
        return this.porte;
    }
    public void setPorte(String porte) {
        this.porte = porte;
    }

    public Pessoa getDono() {
        return this.dono;
    }
    public void setDono(Pessoa dono) {
        this.dono = dono;
    }

    

    private String nome;
    private String raca;
    private int idade;
    private String porte;
    private Pessoa dono;

}
