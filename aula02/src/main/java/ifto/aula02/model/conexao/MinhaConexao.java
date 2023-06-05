package ifto.aula02.model.conexao;

import java.sql.Connection;

public class MinhaConexao {

    public static Connection conexao(){
        ConexaoJDBC conexao = new ConexaoHDB();
        return conexao.criarConexao();
    }
}