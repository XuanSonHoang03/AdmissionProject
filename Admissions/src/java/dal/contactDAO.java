/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.contact;

/**
 *
 * @author ACER
 */
public class contactDAO {
    PreparedStatement stm;
    ResultSet rs;
    Connection connect;

    public ArrayList<contact> getContact(){
        ArrayList<contact> listC = new ArrayList<>();
        String sql = "select * from contact";
        try {
            connect = new DBConnect().ConnectDB();
            stm = connect.prepareStatement(sql);
            rs = stm.executeQuery();
            while (rs.next()) {                
                listC.add(new contact(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)));
            }
        } catch (Exception e) {
        }
        return listC;
    }
}
