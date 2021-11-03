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
public class Encounter {
    private String patientID;
    private String appointid;
    private Date datetime;
    private int bloodpress;
    private int heartrate;
    private int resprate;
    
    public Encounter(String patientID,String appointid,Date datetime,int bloodpress,int heartrate, int resprate){
        this.patientID = patientID;
        this.datetime = datetime;
        this.appointid = appointid;
        this.bloodpress = bloodpress;
        this.resprate = resprate;
        this.heartrate = heartrate;
    }
    Encounter(){
        
    }

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }
    
    
    public String getAppointid() {
        return appointid;
    }

    public void setAppointid(String appointid) {
        this.appointid = appointid;
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

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }
    @Override
    public String toString(){
        return patientID;
    }
    
}
