/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.university;

/**
 *
 * @author ACER
 */
public class universityDAO {
    PreparedStatement stm;
    Connection connect;
    ResultSet rs;
    public ArrayList<university> getAllUniversity(){
        ArrayList<university> listU = new ArrayList<>();
        try {
            String sql = "select * from University";
            connect = new DBConnect().ConnectDB();
            stm = connect.prepareStatement(sql);
            rs = stm.executeQuery();
            while (rs.next()) {                
                listU.add(new university(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)));
            }
        } catch (Exception e) {
        }
        return listU;
    }
    
    public ArrayList<university> getUniversityByArea(String name){
        ArrayList<university> listU = new ArrayList<>();
        try {
            String sql = "select * from University where area = ?";
            connect = new DBConnect().ConnectDB();
            stm = connect.prepareStatement(sql);
            stm.setString(1, name);
            rs =stm.executeQuery();
            while (rs.next()) {                
                listU.add(new university(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)));
            }
        } catch (Exception e) {
        }
        return listU;
    }
    
    public ArrayList<university> getUniversityByID(String id){
        ArrayList<university> listU = new ArrayList<>();
        try {
            String sql = "select * from University where id = ?";
            connect = new DBConnect().ConnectDB();
            stm = connect.prepareStatement(sql);
            stm.setString(1, id);
            rs =stm.executeQuery();
            while (rs.next()) {                
                listU.add(new university(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)));
            }
        } catch (Exception e) {
        }
        return listU;
    }
    
    public void updateU(String id, String code, String nameE, String name, String area, String location, String type){
        String sql = "update University set code = ?, nameEnglish =?, name  = ?, area = ?, location = ?, type = ? where id = ?";
        try {
            connect = new DBConnect().ConnectDB();
            stm = connect.prepareStatement(sql);
            stm.setString(1, code);
            stm.setString(2, nameE);
            stm.setString(3, name);
            stm.setString(4, area);
            stm.setString(5, location);
            stm.setString(6, type);
            stm.setString(7, id);
            stm.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public void delete(String id){
        String sql = "delete from university where id = ?";
        try {
            connect = new DBConnect().ConnectDB();
            stm = connect.prepareStatement(sql);
            stm.setString(1, id);
            stm.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    
    public void addnew(String nameE, String name, String area, String location, String code, String type){
        String sql = "insert into University values (?,?,?,?,?,?)";
        try {
            connect  =new DBConnect().ConnectDB();
            stm = connect.prepareStatement(sql);
            stm.setString(1, code);
            stm.setString(2, nameE);
            stm.setString(3, name);
            stm.setString(4, area);
            stm.setString(5, location);
            stm.setString(6, type);
            stm.executeUpdate();
        } catch (Exception e) {
        }
    }
}
