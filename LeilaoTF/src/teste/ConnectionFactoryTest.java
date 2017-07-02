package teste;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;

import dados.ConnectionFactory;

public class ConnectionFactoryTest {

public static void main(String[] args) throws SQLException {
	Connection connection = new ConnectionFactory().getConnection();

	System.out.println("Conexão aberta!");

	connection.close();
}
}
