/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class PatientHistory {
    
    private ArrayList<Patient> patienthistory;
    
    public PatientHistory(){
        this.patienthistory = new ArrayList<Patient>();
    }

    public ArrayList<Patient> getPatienthistory() {
        return patienthistory;
    }

    public void setPatienthistory(ArrayList<Patient> patienthistory) {
        this.patienthistory = patienthistory;
    }
    
    public Patient newPatient(){
        Patient PatientNew = new Patient();
        patienthistory.add(PatientNew);
        return PatientNew;
    }
    
    public Patient newPatient(Patient patient){
    patienthistory.add(patient);
    return patient;
    }
    
    public int count(){
        return patienthistory.size();
    }
    
    public Patient deletePatient(Patient patient){
        patienthistory.remove(patient);
        return patient;
    }
}
