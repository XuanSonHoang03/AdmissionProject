/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ACER
 */
public class university {
   int id;
   String code;
   String name;
   String nameEnglish;
   String area;
   String location;
   String type;
    public university() {
    }

    public university(int id, String code,String nameEnglish, String name, String area, String location, String type) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.nameEnglish = nameEnglish;
        this.area = area;
        this.location = location;
        this.type = type;
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

    public String getArea() {
        return area;
    }

    public String getNameEnglish() {
        return nameEnglish;
    }

    public void setNameEnglish(String nameEnglish) {
        this.nameEnglish = nameEnglish;
    }
    
    

    public void setArea(String area) {
        this.area = area;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "university{" + "id=" + id + ", code=" + code + ", name=" + name + ", nameEnglish=" + nameEnglish + ", area=" + area + ", location=" + location + ", type=" + type + '}';
    }

 

    
    
    
   
   
}
