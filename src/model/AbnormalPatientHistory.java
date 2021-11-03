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
public class AbnormalPatientHistory {
    
    private ArrayList<AbnormalPatient> abnormalpatienthistory;
    
    public AbnormalPatientHistory(){
        this.abnormalpatienthistory = new ArrayList<AbnormalPatient>();
    }

    public ArrayList<AbnormalPatient> getAbnormalpatienthistory() {
        return abnormalpatienthistory;
    }

    public void setAbnormalpatienthistory(ArrayList<AbnormalPatient> abnormalpatienthistory) {
        this.abnormalpatienthistory = abnormalpatienthistory;
    }
    
    public AbnormalPatient addAbnormalPatient(){
        AbnormalPatient pat = new AbnormalPatient();
        abnormalpatienthistory.add(pat);
        return pat;
    }
    public AbnormalPatient addAbnormalPatient(AbnormalPatient pat1){
        
        abnormalpatienthistory.add(pat1);
        return pat1;
    }
    
}
