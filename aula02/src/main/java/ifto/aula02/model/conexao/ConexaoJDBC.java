package ifto.aula02.model.conexao;

import java.sql.Connection;

public interface ConexaoJDBC {

    public Connection criarConexao();
}
