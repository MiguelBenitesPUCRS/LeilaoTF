package dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import negocio.Pessoa;

public class CadastroPessoaDAOJavaDb {
	
private static CadastroPessoaDAOJavaDb ref;
    
    public static CadastroPessoaDAOJavaDb getInstance() throws CadastroDAOException {
        if (ref == null)
            ref = new CadastroPessoaDAOJavaDb();
        return ref;
    }
    private CadastroPessoaDAOJavaDb() throws CadastroDAOException {
        try {
             Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        } catch (ClassNotFoundException ex) {
            throw new CadastroDAOException("JdbcOdbDriver not found!!");
        }
        // Cria o banco de dados vazio
        // Retirar do comentário se necessário
        
        try {
        	criarBanco();
        } catch (Exception ex) {
            System.out.println("Problemas para criar o banco: "+ex.getMessage());
            System.exit(0);
        } 
    }
    
    private static void criarBanco() throws CadastroDAOException {
        try {
            Connection con = DriverManager.getConnection("jdbc:derby:derbyDB;create=true");
            Statement sta = con.createStatement();
            String sql = 
            		"CREATE TABLE Pessoas ("
                    + "ID INTEGER NOT NULL PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"
                    + "EMAIL VARCHAR(50),"
                    + "LOGIN VARCHAR(50),"
                    + "SENHA VARCHAR(50),"
                    + ")";
            sta.executeUpdate(sql);
            sta.close();
            con.close();
        } catch (SQLException ex) {
            throw new CadastroDAOException(ex.getMessage());
        }
    }
    
    private static Connection getConnection() throws SQLException {
        //derbyDB sera o nome do diretorio criado localmente
        return DriverManager.getConnection("jdbc:derby:derbyDB");
    }
    /*
    @Override
    public boolean adicionar(Pessoa p) throws CadastroDAOException {
        try {
            Connection con = getConnection();
            PreparedStatement stmt = con.prepareStatement(
                    "INSERT INTO PESSOAS (NOME, TELEFONE, SEXO) VALUES (?,?,?)" //                             1        2         3            4          5             6
                    );
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getTelefone());
            stmt.setString(3, Character.toString(p.getSexo()));
            int ret = stmt.executeUpdate();
            con.close();
            return (ret>0);
        } catch (SQLException ex) {
            throw new CadastroDAOException("Falha ao adicionar.", ex);
        }
    }
    */

    public static void main(String[] args) throws CadastroDAOException {
		CadastroPessoaDAOJavaDb c = new  CadastroPessoaDAOJavaDb();
	
	}
}
