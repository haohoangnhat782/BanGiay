
package Conection;
import java.sql.*;
import java.sql.DriverManager;
public class Database {
    public static Connection getConnection() throws Exception{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://LAPTOP-RVDD9GI8\\MAYAO:1433;databaseName=Java;encrypt=false";
        
        return DriverManager.getConnection(url,"sa","4869");
    }
}
