/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/** 
 *
 * @author ACER
 */
public class DBConnect {
    protected Connection connection;

    public Connection ConnectDB() {
        try {
            String user = "sa";
            String pass = "123";
            String url = "jdbc:sqlserver://localhost;database=travelprj";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException | SQLException e) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, e);
        }
        return connection;
    }
    public static void main(String[] args) {
        try {
            System.out.println(new DBConnect().connection);
        } catch (Exception e) {
        }
    }
}
