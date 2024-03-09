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
//ket qua tuyen sinh
public class Admissions {

    private int id;
    private int ID_Applicants;
    private String name_Applicants;
    private int ID_Programs;
    private String name_Program;
    private String result;
    private String file;
    private Date dateOfPublication;

    public Admissions() {
    }

    public Admissions(int id, int ID_Applicants, String name_Applicants, int ID_Programs, String name_Program, String result, String file, Date dateOfPublication) {
        this.id = id;
        this.ID_Applicants = ID_Applicants;
        this.name_Applicants = name_Applicants;
        this.ID_Programs = ID_Programs;
        this.name_Program = name_Program;
        this.result = result;
        this.file = file;
        this.dateOfPublication = dateOfPublication;
    }

    public String getName_Applicants() {
        return name_Applicants;
    }

    public void setName_Applicants(String name_Applicants) {
        this.name_Applicants = name_Applicants;
    }

    public String getName_Program() {
        return name_Program;
    }

    public void setName_Program(String name_Program) {
        this.name_Program = name_Program;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
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

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Date getDateOfPublication() {
        return dateOfPublication;
    }

    public void setDateOfPublication(Date dateOfPublication) {
        this.dateOfPublication = dateOfPublication;
    }

    @Override
    public String toString() {
        return "Admissions{" + "id=" + id + ", ID_Applicants=" + ID_Applicants + ", ID_Programs=" + ID_Programs + ", result=" + result + ", dateOfPublication=" + dateOfPublication + '}';
    }

}
