package semana05;


public class Pessoa {

    public Pessoa(String nome, String telDono, String endereco) {
        this.nome = nome;
        this.telDono = telDono;
        this.endereco = endereco;
    }
    
    
    private String nome;
    private String telDono;
    private String endereco;

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelDono() {
        return this.telDono;
    }
    public void setTelDono(String telDono) {
        this.telDono = telDono;
    }

    public String getEndereco() {
        return this.endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
}
