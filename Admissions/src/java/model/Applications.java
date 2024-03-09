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
public class Applications {
    private int id;
    private int ID_Applicants;
    private String name_Applicant;
    private int ID_Programs;
    private String name_Program;
    private String status;
    private Date DaySendApplication;

    public Applications() {
    }

    public Applications(int id, int ID_Applicants, String name_Applicant, int ID_Programs, String name_Program, String status, Date DaySendApplication) {
        this.id = id;   
        this.ID_Applicants = ID_Applicants;
        this.name_Applicant = name_Applicant;
        this.ID_Programs = ID_Programs;
        this.name_Program = name_Program;
        this.status = status;
        this.DaySendApplication = DaySendApplication;
    }

    public String getName_Applicant() {
        return name_Applicant;
    }

    public void setName_Applicant(String name_Applicant) {
        this.name_Applicant = name_Applicant;
    }

    public String getName_Program() {
        return name_Program;
    }

    public void setName_Program(String name_Program) {
        this.name_Program = name_Program;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getID_Applicants() {
        return ID_Applicants;
    }

    public void setID_Applicants(int ID_Applicants) {
        this.ID_Applicants = ID_Applicants;
    }

    public int getID_Programs() {
        return ID_Programs;
    }

    public void setID_Programs(int ID_Programs) {
        this.ID_Programs = ID_Programs;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDaySendApplication() {
        return DaySendApplication;
    }

    public void setDaySendApplication(Date DaySendApplication) {
        this.DaySendApplication = DaySendApplication;
    }

    @Override
    public String toString() {
        return "Applications{" + "id=" + id + ", ID_Applicants=" + ID_Applicants + ", ID_Programs=" + ID_Programs + ", status=" + status + ", DaySendApplication=" + DaySendApplication + '}';
    }
    
    
    
}
