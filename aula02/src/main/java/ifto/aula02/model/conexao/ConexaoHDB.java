package ifto.aula02.model.conexao;

import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.SQLException;
import java.sql.DriverManager;

public class ConexaoHDB implements ConexaoJDBC{

    @Override
    public Connection criarConexao() {
        try {
            Class.forName("org.h2.Driver");
            String url = "jdbc:h2:mem:bdpweb";
            String usuario = "usuario";
            String senha = "senha";
            return DriverManager.getConnection(url, usuario, senha);

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ConexaoHDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
