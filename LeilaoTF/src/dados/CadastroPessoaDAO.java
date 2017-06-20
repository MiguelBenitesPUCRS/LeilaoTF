package dados;

import java.util.List;

import negocio.Pessoa;
import negocio.PessoaFisica;

public interface CadastroPessoaDAO<E> {
    boolean adicionar(E pessoa) throws CadastroDAOException;
    Pessoa getPessoaPorNome(E nome) throws CadastroDAOException;
    List<E> getPessoa() throws CadastroDAOException;
}
