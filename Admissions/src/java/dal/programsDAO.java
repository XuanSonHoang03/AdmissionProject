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
import model.Programs;

/**
 *
 * @author ACER
 */
public class programsDAO {
    PreparedStatement stm;
    ResultSet rs;
    Connection connect;
    public ArrayList<Programs> getAllApplication(){
        ArrayList<Programs> listP = new ArrayList<>();
        String sql = "select * from Programs";
        try {
            connect = new DBConnect().ConnectDB();
            stm = connect.prepareStatement(sql);
            rs = stm.executeQuery();
            while(rs.next()){
                listP.add(new Programs(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getDate(5), rs.getInt(6), rs.getString(7)));
            }
        } catch (Exception e) {
        }
        return listP;
    }
    
    public ArrayList<Programs> getALlByName(String name){
        ArrayList<Programs> listP = new ArrayList<>();
        String sql = "select * from Programs where TenChuongTrinh LIKE ?";
        try {
            connect = new DBConnect().ConnectDB();
            stm = connect.prepareStatement(sql);
            stm.setString(1,"%" + name + "%");
            rs = stm.executeQuery();
            while (rs.next()) {                
                listP.add(new Programs(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getDate(5), rs.getInt(6), rs.getString(7)));
            }
        } catch (Exception e) {
        }
        return listP;
    }
    
    public ArrayList<Programs> getALlByID(String id){
        ArrayList<Programs> listP = new ArrayList<>();
        String sql = "select * from Programs where id = ?";
        try {
            connect = new DBConnect().ConnectDB();
            stm = connect.prepareStatement(sql);
            stm.setString(1, id);
            rs = stm.executeQuery();
            while (rs.next()) {                
                listP.add(new Programs(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getDate(5), rs.getInt(6), rs.getString(7)));
            }
        } catch (Exception e) {
        }
        return listP;
    }
    
    public void update(String id, String name, String dayopen, String des, String dayclose, String add, String quan){
        String sql = "update Programs set TenChuongTrinh =? , MoTa = ?, NgayMoCuaDangKy = ?, NgayDongCuaDangKy=?, SoLuongTuyenSinh=?, DieuKienTuyenSinh=? where ID =?";
        try {
            connect = new DBConnect().ConnectDB();
            stm = connect.prepareStatement(sql);
            stm.setString(1, name);
            stm.setString(2, des);
            stm.setString(3, dayopen);
            stm.setString(4, dayclose);
            stm.setString(5, quan);
            stm.setString(6, add);
            stm.setString(7, id);
            stm.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public void delete(String id){
        String sql = "delete from Programs where ID = ?";
        try {
            connect = new DBConnect().ConnectDB();
            stm = connect.prepareStatement(sql);
            stm.setString(1, id);
            stm.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public void addNew(String name, String mota, String opendate, String closedate, int quan, String add){
        String sql = "insert into Programs values (?,?,?,?,?,?)";
        try {
            connect = new DBConnect().ConnectDB();
            stm = connect.prepareStatement(sql);
            stm.setString(1, name);
            stm.setString(2, mota);
            stm.setString(3, opendate);
            stm.setString(4, closedate);
            stm.setInt(5, quan);
            stm.setString(6, add);
            stm.executeUpdate();
        } catch (Exception e) {
        }
    }
}
