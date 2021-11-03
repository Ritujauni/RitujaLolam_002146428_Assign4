/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Admin
 */
public class CarInfo {
    
    private String personid;
    private String name ;
    private String address;
    private int age;
    private String community;
    private String gender;
    private String city;
    
    public CarInfo(String personid, String name, String address,int age, String community, String gender, String city){
        this.personid = personid;
        this.name = name;
        this.address = address;
        this.age = age;
        this.community = community;
        this.gender = gender;
        this.city = city;
        
    }
    CarInfo(){
        
    }

    public String getPersonid() {
        return personid;
    }

    public void setPersonid(String personid) {
        this.personid = personid;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    @Override
    public String toString(){
        return personid;
    }
    
}
