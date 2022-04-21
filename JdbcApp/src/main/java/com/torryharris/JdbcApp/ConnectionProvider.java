package com.torryharris.JdbcApp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {

private static String url="jdbc:mysql://localhost:3306/batch98";
private static String username="root";
private static String password="root";
static Connection con=null;

public static Connection createConnection() {

try {
con=DriverManager.getConnection(url,username,password);

} catch (SQLException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}

return con;
}
}