/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.user;

/**
 *
 * @author ACER
 */
public class userDAO {

    PreparedStatement stm;
    Connection connect = null;
    ResultSet rs = null;

    public ArrayList<user> getAllUser() {
        ArrayList<user> listU = new ArrayList<>();
        String sql = "select * from Users";
        try {
            connect = new DBConnect().ConnectDB();
            stm = connect.prepareStatement(sql);
            rs = stm.executeQuery();
            while (rs.next()) {
                listU.add(new user(rs.getByte(1), rs.getString(2), rs.getString(3), rs.getString(4)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listU;
    }

    public void UpdatePass(String pass, String user, String role) {
        String sql = "update users set MatKhau = ? where TenDangNhap = ? and VaiTro = ?";
        try {
            connect = new DBConnect().ConnectDB();
            stm = connect.prepareStatement(sql);
            stm.setString(1, pass);
            stm.setString(2, user);
            stm.setString(3, role);
            stm.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public void DeleteUser(int id){
        String sql = "delete from Users where id = ?";
        try {
            connect = new DBConnect().ConnectDB();
            stm = connect.prepareStatement(sql);
            stm.setInt(1, id);
            stm.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void addNewUser(String user, String pass, String role){
        String sql = "insert into Users values (?, ?, ?)";
        try {
            connect = new DBConnect().ConnectDB();
            stm = connect.prepareStatement(sql);
            stm.setString(1, user);
            stm.setString(2, pass);
            stm.setString(3, role);
            stm.executeUpdate();
        } catch (Exception e) {
        }
    }

    public int getLastAddedUserId() {
        int idLast = 0;
        userDAO getU = new userDAO();
        ArrayList<user> listA = getU.getAllUser();
        
        for(user u : listA){
            if(u.getId() > idLast){
                idLast = u.getId();
            }
        }
        return idLast;
    }

}
