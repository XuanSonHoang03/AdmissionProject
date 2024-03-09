/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.major;

/**
 *
 * @author ACER
 */
public class majorDAO {

    PreparedStatement stm;
    ResultSet rs;
    Connection connect;

    public ArrayList<major> getAllMajor() {
        ArrayList<major> listM = new ArrayList<>();
        try {
            String sql = "select * from major";
            connect = new DBConnect().ConnectDB();
            stm = connect.prepareStatement(sql);
            rs = stm.executeQuery();
            while (rs.next()) {
                listM.add(new major(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
            }
        } catch (Exception e) {
        }
        return listM;
    }

    public ArrayList<major> getAllMajorByName(String name) {
        ArrayList<major> listM = new ArrayList<>();
        try {
            String sql = "select * from major where [name] like ?";
            connect = new DBConnect().ConnectDB();
            stm = connect.prepareStatement(sql);
            stm.setString(1,"%" + name + "%");
            rs = stm.executeQuery();
            while (rs.next()) {
                listM.add(new major(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
            }
        } catch (Exception e) {
        }
        return listM;
    }
    
    public ArrayList<major> getAllMajorByID(String id) {
        ArrayList<major> listM = new ArrayList<>();
        try {
            String sql = "select * from major where id = ?";
            connect = new DBConnect().ConnectDB();
            stm = connect.prepareStatement(sql);
            stm.setString(1, id);
            rs = stm.executeQuery();
            while (rs.next()) {
                listM.add(new major(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
            }
        } catch (Exception e) {
        }
        return listM;
    }

    public void insert(String code, String name, String sub, String majorN) {
        String sql = " insert into major values (?,?,?,?)";
        try {
            connect = new DBConnect().ConnectDB();
            stm  =connect.prepareStatement(sql);
            stm.setString(1, code);
            stm.setString(2, name);
            stm.setString(3, sub);
            stm.setString(4, majorN);
            stm.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void update(String id, String code, String name, String sub, String majorN) {
        String sql = "update major set code= ?, name = ?, subject=?, majorName=? where id = ?";
        try {
            connect = new DBConnect().ConnectDB();
            stm = connect.prepareStatement(sql);
            stm.setString(1, code);
            stm.setString(2, name);
            stm.setString(3, sub);
            stm.setString(4, majorN);
            stm.setString(5, id);
            stm.executeUpdate();
        } catch (Exception e) {
        }
    }
    public void delete(String id){
        String sql = "delete from major where id = ?";
        try {
            connect = new DBConnect().ConnectDB();
            stm = connect.prepareStatement(sql);
            stm.setString(1, id);
            stm.executeUpdate();
        } catch (Exception e) {
        }
    }
}
