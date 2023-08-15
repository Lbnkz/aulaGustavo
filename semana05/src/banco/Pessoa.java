package banco;


public class Pessoa {

    public Pessoa(String nome, String cpf, String rg, String telefone, String endereco) {
        this.nome = nome;
        if(this.validCPF(cpf)){
            this.cpf = cpf;
        }
        this.rg = rg;
        this.telefone = telefone;
        this.endereco = endereco;
    }
    
    private String nome;
    private String cpf;
    private String rg;
    private String telefone;
    private String endereco;

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    
    private boolean validCPF(String cpf){
        return true;
    }
  
}
