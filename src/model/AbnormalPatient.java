/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class AbnormalPatient {
    
    private String personid;
    private String name ;
    private String address;
    private int age;
    private String community;
    private String gender;
    private String city;
    private int insuranceno;
    private String diabetics;
    private String allergy;
    private String appointid;
    private Date datetime;
    private int bloodpress;
    private int heartrate;
    private int resprate;

    public String getPersonid() {
        return personid;
    }

    public void setPersonid(String personid) {
        this.personid = personid;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getInsuranceno() {
        return insuranceno;
    }

    public void setInsuranceno(int insuranceno) {
        this.insuranceno = insuranceno;
    }

    public String getDiabetics() {
        return diabetics;
    }

    public void setDiabetics(String diabetics) {
        this.diabetics = diabetics;
    }

    public String getAllergy() {
        return allergy;
    }

    public void setAllergy(String allergy) {
        this.allergy = allergy;
    }

    public String getAppointid() {
        return appointid;
    }

    public void setAppointid(String appointid) {
        this.appointid = appointid;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public int getBloodpress() {
        return bloodpress;
    }

    public void setBloodpress(int bloodpress) {
        this.bloodpress = bloodpress;
    }

    public int getHeartrate() {
        return heartrate;
    }

    public void setHeartrate(int heartrate) {
        this.heartrate = heartrate;
    }

    public int getResprate() {
        return resprate;
    }

    public void setResprate(int resprate) {
        this.resprate = resprate;
    }
    
    @Override
    public String toString(){
        return personid;
    }
}
