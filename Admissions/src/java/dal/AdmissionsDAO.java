/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Admissions;

/**
 *
 * @author ACER
 */
public class AdmissionsDAO {

    PreparedStatement stm;
    ResultSet rs;
    Connection connect;

    public ArrayList<Admissions> getResult(int id) {
        ArrayList<Admissions> list = new ArrayList<>();
        String sql = "select * from Admissions a \n"
                + "join Applicants ap on ap.ID = a.ID_UngVien\n"
                + "join Users u on u.ID = ap.IDUser\n"
                + "where u.ID=?";
        try {
            connect = new DBConnect().ConnectDB();
            stm = connect.prepareStatement(sql);
            stm.setInt(1, id);
            rs = stm.executeQuery();
            while (rs.next()) {
                list.add(new Admissions(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getDate(8)));
            }
        } catch (Exception e) {
        }
        return list;
    }

}
