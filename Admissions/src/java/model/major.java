/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ACER
 */
public class major {
    int id;
    String code, name, subject, majorName;

    public major() {
    }

    public major(int id, String code, String name, String subject, String majorName) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.subject = subject;
        this.majorName = majorName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    @Override
    public String toString() {
        return "major{" + "id=" + id + ", code=" + code + ", name=" + name + ", subject=" + subject + ", majorName=" + majorName + '}';
    }
    
    
    
}
