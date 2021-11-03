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
public class Patient {
    private String patientid;
    private int insuranceno;
    private String diabetics;
    private String allergy;

    
    
public Patient(String patientid, int insuranceno, String diabetics, String allergy){
    this.patientid = patientid;
    this.insuranceno = insuranceno;
    this.diabetics = diabetics;
    this.allergy = allergy;
    
}

Patient(){
    
}
    public String getPatientid() {
        return patientid;
    }

    public void setPatientid(String patientid) {
        this.patientid = patientid;
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
    
    @Override
    public String toString(){
        return patientid;
    }
    
}
