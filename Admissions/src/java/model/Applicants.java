/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ACER
 */

public class Applicants {
    private int id;
    private int idUser;
    private String name;
    private String gender;
    private String dob;
    private String location;
    private String phone;
    private String email;
   public Applicants() {
    }

    public Applicants(int id, int idUser, String name, String gender, String dob, String location, String phone, String email) {
        this.id = id;
        this.idUser = idUser;
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.location = location;
        this.phone = phone;
        this.email = email;
    }

    

    // Getters and setters for all fields

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "Applicants{" + "id=" + id + ", name=" + name + ", gender=" + gender + ", dob=" + dob + ", location=" + location + ", phone=" + phone + ", email=" + email;
    }
    
    
    
}
