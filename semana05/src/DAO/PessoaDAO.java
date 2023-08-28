
package DAO;

import Models.Pessoa;
import java.util.UUID;


public interface PessoaDAO {
    public Pessoa inserirPessoa(Pessoa pessoa);
    public Pessoa obterPessoaId(UUID Id);
}
