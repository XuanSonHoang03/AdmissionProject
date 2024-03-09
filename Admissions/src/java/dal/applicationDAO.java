/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Applications;

/**
 *
 * @author ACER
 */
public class applicationDAO {
    PreparedStatement stm;
    ResultSet rs;
    Connection connect;

    public ArrayList<Applications> getAllApplication(){
        ArrayList<Applications> list = new ArrayList<>();
        try {
            String sql = "select * from applications";
            connect = new DBConnect().ConnectDB();
            stm = connect.prepareStatement(sql);
            rs = stm.executeQuery();
            
            while (rs.next()) {                
                list.add(new Applications(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getDate(7)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    public void addNew(String idApp, String nameApp, String idP, String nameP, String action, String DaySend){
        String sql = "insert into applications values (?,?,?,?,?,?)";
        try {
            connect = new DBConnect().ConnectDB();
            stm  =connect.prepareStatement(sql);
            stm.setString(1, idApp);
            stm.setString(2, nameApp);
            stm.setString(3, idP);
            stm.setString(4, nameP);
            stm.setString(5, action);
            stm.setString(6, DaySend);
            stm.executeUpdate();
        } catch (Exception e) {
        }
    }
}
