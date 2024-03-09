/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;

/**
 *
 * @author ACER
 */
public class Programs {
    private int id;
    private String name;
    private String describe;
    private Date registrationOpeningDate;   //ngày mo cua dang kí
    private Date registrationClosingDate;   //ngày dóng cua dang kí
    private int quantity;
    private String admissionConditions;     //dieu kien tuyen sinh

    public Programs() {
    }

    public Programs(int id, String name, String describe, Date registrationOpeningDate, Date registrationClosingDate, int quantity, String admissionConditions) {
        this.id = id;
        this.name = name;
        this.describe = describe;
        this.registrationOpeningDate = registrationOpeningDate;
        this.registrationClosingDate = registrationClosingDate;
        this.quantity = quantity;
        this.admissionConditions = admissionConditions;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public Date getRegistrationOpeningDate() {
        return registrationOpeningDate;
    }

    public void setRegistrationOpeningDate(Date registrationOpeningDate) {
        this.registrationOpeningDate = registrationOpeningDate;
    }

    public Date getRegistrationClosingDate() {
        return registrationClosingDate;
    }

    public void setRegistrationClosingDate(Date registrationClosingDate) {
        this.registrationClosingDate = registrationClosingDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getAdmissionConditions() {
        return admissionConditions;
    }

    public void setAdmissionConditions(String admissionConditions) {
        this.admissionConditions = admissionConditions;
    }

    @Override
    public String toString() {
        return "Programs{" + "id=" + id + ", name=" + name + ", describe=" + describe + ", registrationOpeningDate=" + registrationOpeningDate + ", registrationClosingDate=" + registrationClosingDate + ", quantity=" + quantity + ", admissionConditions=" + admissionConditions + '}';
    }
    
    
}
