package com.hiveit.pe.sistemaventas.connection;

import java.sql.Connection;
import java.sql.SQLException;

public interface ConDB {
	 Connection getConnection() throws SQLException;
}
