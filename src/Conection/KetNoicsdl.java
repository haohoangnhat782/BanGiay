/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class KetNoicsdl {
    private String user = "sa";
    private String password = "123456";
    private String url = "jdbc:sqlserver://TANDAT:1433;databaseName=ProjectJava2;encrypt=false";
    private Connection connection = null;
    private Statement statement = null;
    private PreparedStatement pstatement = null;

    public void Connect() {
        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            Logger.getLogger(KetNoicsdl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void Disconnect() {
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException ex) {
                Logger.getLogger(KetNoicsdl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(KetNoicsdl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public ResultSet executeQuery(String sql) {
        ResultSet rs = null;

        try {
            Connect();
            statement = connection.createStatement();
            rs = statement.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(KetNoicsdl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;

    }
//    public PreparedStatement executeUpdate(String sql){
//        PreparedStatement pstatement = null;
//        try {
//            Connect();
//            pstatement = connection.prepareStatement(sql);
//            pstatement.executeUpdate();
//        } catch (SQLException ex) {
//            Logger.getLogger(MySQLConnect.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return pstatement;
//    }
    public Connection getConnection()
    {
        Connect();
        return connection;
    }
}
