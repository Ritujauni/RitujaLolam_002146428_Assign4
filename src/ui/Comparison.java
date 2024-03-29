/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.List;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.AbnormalPatient;
import model.AbnormalPatientHistory;
import model.CarInfo;
import model.CarsHistory;
import model.Encounter;
import model.EncounterHistory;
import model.Patient;
import model.PatientHistory;

/**
 *
 * @author Admin
 */
public class Comparison extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    CarsHistory history;
    PatientHistory patienthistory;
    EncounterHistory encounterhistory;
    AbnormalPatientHistory abnormalhistory;
    
    public Comparison(CarsHistory history,EncounterHistory encounterhistory ,PatientHistory patienthistory,AbnormalPatientHistory abnormalhistory) {
        initComponents();
        this.history = history;
        this.patienthistory = patienthistory;
        this.encounterhistory = encounterhistory;
        this.abnormalhistory = abnormalhistory;
        
        //populateTable();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jviewtitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblpersondetails = new javax.swing.JTable();
        bttnview = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblcomparison = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 153));

        jPanel2.setBackground(new java.awt.Color(255, 153, 51));

        jviewtitle.setFont(new java.awt.Font("Sitka Heading", 1, 24)); // NOI18N
        jviewtitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jviewtitle.setText("Abnormal Community Comparison");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jviewtitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jviewtitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblpersondetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Person ID", "Name", "Address", "Age", "Gender", "Community", "City", "Appointment Date", "Insurance no.", "Diabetic", "Allergy", "Blood Pressure", "Respiratory rate", "Heart rate"
            }
        ));
        jScrollPane1.setViewportView(tblpersondetails);

        bttnview.setText("Compare Data");
        bttnview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnviewActionPerformed(evt);
            }
        });

        jButton1.setText("Person Data");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tblcomparison.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Community", "No. of People"
            }
        ));
        jScrollPane3.setViewportView(tblcomparison);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1037, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(171, 171, 171)
                        .addComponent(bttnview, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttnview)
                    .addComponent(jButton1))
                .addGap(46, 46, 46)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(373, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bttnviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnviewActionPerformed
        // TODO add your handling code here:
        DefaultTableModel cmodel = (DefaultTableModel) tblcomparison.getModel();
        cmodel.setRowCount(0);
        
        List<String> commList = new ArrayList<String>();
        
        for (AbnormalPatient ab : abnormalhistory.getAbnormalpatienthistory()){
            if (!commList.contains(ab.getCommunity())){
                commList.add(ab.getCommunity());
            }
        }
        
        for (String c :commList){
            int count = 0;
            for (AbnormalPatient ab : abnormalhistory.getAbnormalpatienthistory()){
                if(ab.getCommunity()== c){
                    count++;
                }
            }
            
            Object[] row = new Object[2];
            
            row[0] = c;
            row[1] = count;
            
            cmodel.addRow(row);
        }
        
        
        
        
    }//GEN-LAST:event_bttnviewActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String patientid = "";
        for(Encounter e : encounterhistory.getEncounterHistory()){
            if(e.getBloodpress() > 120){
                patientid = e.getPatientID();
                collectAbnormalData(patientid, e);
            }
        }
        
        DefaultTableModel model = (DefaultTableModel) tblpersondetails.getModel();
        model.setRowCount(0);
        
        for(AbnormalPatient ab : abnormalhistory.getAbnormalpatienthistory()){
            
            Object[] row = new Object[14];
            row[0] = ab;
            row[1] = ab.getName();
            row[2] = ab.getAddress();
            row[3] = ab.getAge();
            row[4] = ab.getGender();
            row[5] = ab.getCommunity();
            row[6] = ab.getCity();
            SimpleDateFormat date = new SimpleDateFormat("MM/dd/yyyy");
            row[7] = date.format(ab.getDatetime());
            row[8] = ab.getInsuranceno();
            row[9] = ab.getDiabetics();
            row[10] = ab.getAllergy();
            row[11] = ab.getBloodpress();
            row[12] = ab.getHeartrate();
            row[13] = ab.getResprate();
            
        model.addRow(row);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnview;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel jviewtitle;
    private javax.swing.JTable tblcomparison;
    private javax.swing.JTable tblpersondetails;
    // End of variables declaration//GEN-END:variables

    

    private void collectAbnormalData(String patientid, Encounter e) {
        
        AbnormalPatient ap = abnormalhistory.addAbnormalPatient();
        CarInfo selectedperson = null;
        for (CarInfo ci : history.getHistory()){
            
            if (ci.getPersonid().equals(patientid)){
                
                selectedperson = ci;
            }
        }
        
        Patient selectedPatient = null;
        for (Patient p : patienthistory.getPatienthistory()){
            if(p.getPatientid().equals(patientid)){
                selectedPatient = p;
            }
        }
        ap.setPersonid(patientid);
        ap.setName(selectedperson.getName());
        ap.setAddress(selectedperson.getAddress());
        ap.setAge(selectedperson.getAge());
        ap.setGender(selectedperson.getGender());
        ap.setCommunity(selectedperson.getCommunity());
        ap.setDatetime(e.getDatetime());
        ap.setInsuranceno(selectedPatient.getInsuranceno());
        ap.setDiabetics(selectedPatient.getDiabetics());
        ap.setAllergy(selectedPatient.getAllergy());
        ap.setBloodpress(e.getBloodpress());
        ap.setResprate(e.getResprate());
        ap.setHeartrate(e.getHeartrate());
        
        
                
    }

   
    
    
    
}

    

   
