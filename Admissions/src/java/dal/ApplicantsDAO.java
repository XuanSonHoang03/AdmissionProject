/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Applicants;

/**
 *
 * @author ACER
 */
public class ApplicantsDAO {

    Connection connect;
    ResultSet rs;
    PreparedStatement stm;

    public ArrayList<Applicants> getAllApplicants() {
        ArrayList<Applicants> listA = new ArrayList<>();
        String sql = "select * from Applicants";
        try {
            connect = new DBConnect().ConnectDB();
            stm = connect.prepareStatement(sql);
            rs = stm.executeQuery();
            while (rs.next()) {
                listA.add(new Applicants(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6),
                        rs.getString(7), rs.getString(8)));
            }
        } catch (Exception e) {
        }
        return listA;
    }

    public void addNewApplicants(int idUser, String name, String gender, Date dob,
            String location, String phone, String email) {
        String sql = "INSERT INTO Applicants VALUES\n"
                + "(?, ?, ?, ?, ?, ?, ?)";
        try {
            connect = new DBConnect().ConnectDB();
            stm = connect.prepareStatement(sql);
            stm.setInt(1, idUser);
            stm.setString(2, name);
            stm.setString(3, gender);
            stm.setDate(4, dob);
            stm.setString(5, location);
            stm.setString(6, phone);
            stm.setString(7, email);
            stm.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void UpdateApplicants(String name, String gender, String dob,
            String location, String phone, String email, String id) {
        String sql = "update Applicants set [name] = ?, gender = ?, dob = ?, [location] = ?\n"
                + ", phone = ?, email = ? where idUser = ?";
        try {
            connect = new DBConnect().ConnectDB();
            stm = connect.prepareStatement(sql);
            stm.setString(1, name);
            stm.setString(2, gender);
            stm.setString(3, dob);
            stm.setString(4, location);
            stm.setString(5, phone);
            stm.setString(6, email);
            stm.setString(7, id);
            stm.executeUpdate();
        } catch (Exception e) {
        }
    }

    public ArrayList<Applicants> getAllApplicantsByName(String name) {
        ArrayList<Applicants> listA = new ArrayList<>();
        String sql = "SELECT a.* FROM Applicants AS a\n"
                + "JOIN Users AS u ON a.ID_UngVien = u.ID\n"
                + "WHERE u.TenDangNhap = ?";
        try {
            connect = new DBConnect().ConnectDB();
            stm = connect.prepareStatement(sql);
            stm.setString(1, name);
            rs = stm.executeQuery();
            while (rs.next()) {
                listA.add(new Applicants(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6),
                        rs.getString(7), rs.getString(8)));
            }
        } catch (Exception e) {
        }
        return listA;
    }

    public ArrayList<Applicants> getAllApplicantsByID(String id) {
        ArrayList<Applicants> listA = new ArrayList<>();
        String sql = "SELECT a.* FROM Applicants a  \n"
                + "JOIN Users AS u ON a.IDUser = u.ID\n"
                + "WHERE u.id = ?";
        try {
            connect = new DBConnect().ConnectDB();
            stm = connect.prepareStatement(sql);
            stm.setString(1, id);
            rs = stm.executeQuery();
            while (rs.next()) {
                listA.add(new Applicants(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6),
                        rs.getString(7), rs.getString(8)));
            }
        } catch (Exception e) {
        }
        return listA;
    }

}
