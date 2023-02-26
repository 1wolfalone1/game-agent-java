/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.sql.Connection;
import java.sql.SQLException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 *
 * @author ASUS
 */
public class DBHelper {
    public static Connection makeConnectDB()throws /*ClassNotFoundException,*/ SQLException, NamingException{
//        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//        
//        String url = "jdbc:sqlserver://localhost:1433;databaseName=GAME_AGENT;instanceName=NNHATTHIEN";
//        
//        Connection con = DriverManager.getConnection(url, "sa", "12345");
//        return con;

        Context context = new InitialContext();
        
        Context tomcatContext = (Context)context.lookup("java:comp/env");
        
        DataSource ds = (DataSource) tomcatContext.lookup("_DBlink");
        
        Connection con = ds.getConnection();
        
        return con;
    }
}
