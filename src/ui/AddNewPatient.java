/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.CarInfo;
import model.CarsHistory;
import model.Patient;
import model.PatientHistory;

/**
 *
 * @author Admin
 */
public class AddNewPatient extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    CarsHistory history;
    PatientHistory patienthistory;
    
    public AddNewPatient(CarsHistory history, PatientHistory patienthistory) {
        initComponents();
        this.history = history;
        this.patienthistory = patienthistory;
        
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
        bttnupdate = new javax.swing.JButton();
        jmanufyear = new javax.swing.JLabel();
        txtage = new javax.swing.JTextField();
        jseats = new javax.swing.JLabel();
        jmaintenance = new javax.swing.JLabel();
        jlocation = new javax.swing.JLabel();
        txtcommunity = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        jcarmodel = new javax.swing.JLabel();
        txtaddress = new javax.swing.JTextField();
        txtgender = new javax.swing.JTextField();
        lbladdress = new javax.swing.JLabel();
        lblage = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();
        lblgender = new javax.swing.JLabel();
        lblcommunity = new javax.swing.JLabel();
        jpersonid = new javax.swing.JLabel();
        txtpatientid = new javax.swing.JTextField();
        jcity = new javax.swing.JLabel();
        txtcity = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtinsno = new javax.swing.JTextField();
        jinsurno = new javax.swing.JLabel();
        jdiab = new javax.swing.JLabel();
        txtdiab = new javax.swing.JTextField();
        jaller = new javax.swing.JLabel();
        txtaller = new javax.swing.JTextField();
        lbldiab = new javax.swing.JLabel();
        lblinscno = new javax.swing.JLabel();
        lblall = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 153));

        jPanel2.setBackground(new java.awt.Color(255, 153, 51));

        jviewtitle.setFont(new java.awt.Font("Sitka Heading", 1, 24)); // NOI18N
        jviewtitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jviewtitle.setText("Add New Patient Details");

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
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Person ID", "Name", "Address", "Age", "Gender", "Community", "City"
            }
        ));
        jScrollPane1.setViewportView(tblpersondetails);

        bttnview.setText("View Details");
        bttnview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnviewActionPerformed(evt);
            }
        });

        bttnupdate.setText("Add Patient");
        bttnupdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bttnupdateMousePressed(evt);
            }
        });
        bttnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnupdateActionPerformed(evt);
            }
        });

        jmanufyear.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jmanufyear.setText("Address:");

        txtage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtageKeyReleased(evt);
            }
        });

        jseats.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jseats.setText("Age:");

        jmaintenance.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jmaintenance.setText("Gender:");

        jlocation.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jlocation.setText("Community:");

        txtcommunity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcommunityKeyReleased(evt);
            }
        });

        jcarmodel.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jcarmodel.setText("Name:");

        txtaddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtaddressKeyReleased(evt);
            }
        });

        txtgender.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtgenderKeyReleased(evt);
            }
        });

        jpersonid.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jpersonid.setText("Patient ID:");

        txtpatientid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpatientidActionPerformed(evt);
            }
        });
        txtpatientid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpatientidKeyReleased(evt);
            }
        });

        jcity.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jcity.setText("City:");

        txtcity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcityKeyReleased(evt);
            }
        });

        jButton1.setText("Person Data");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtinsno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtinsnoKeyReleased(evt);
            }
        });

        jinsurno.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jinsurno.setText("Insurance Number:");

        jdiab.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jdiab.setText("Diabetic:");

        txtdiab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtdiabKeyReleased(evt);
            }
        });

        jaller.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jaller.setText("Any allergies:");

        txtaller.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtallerKeyReleased(evt);
            }
        });

        lbldiab.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N

        lblall.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 903, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jlocation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jmaintenance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jseats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jpersonid, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jinsurno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jdiab, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jaller, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jcarmodel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jmanufyear)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtcity)
                    .addComponent(txtpatientid)
                    .addComponent(txtcommunity, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                    .addComponent(txtname, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                    .addComponent(txtaddress, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                    .addComponent(txtage, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                    .addComponent(txtgender, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtinsno)
                    .addComponent(txtdiab)
                    .addComponent(txtaller))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblcommunity, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                .addComponent(lblgender, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbladdress, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblage, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblinscno, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblall, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbldiab, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jButton1)
                        .addGap(34, 34, 34)
                        .addComponent(bttnview))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(377, 377, 377)
                        .addComponent(bttnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(bttnview))))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jpersonid, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpatientid, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblage, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbladdress, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jcarmodel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(jmanufyear, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jseats, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jmaintenance, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtgender, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblgender, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlocation, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtcommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblcommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcity, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcity, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtinsno, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jinsurno, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblinscno, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jdiab, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdiab, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbldiab, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jaller, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtaller, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblall, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(bttnupdate)
                .addGap(55, 55, 55))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bttnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnupdateActionPerformed
        // TODO add your handling code here:
        String patientid = txtpatientid.getText();
        int selectedRowIndex = tblpersondetails.getSelectedRow();
        
        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this,"Please select a row to convert details");
            return;
        }
        
        if(txtname.getText().length()<=0 || txtaddress.getText().length()<=0 || txtage.getText().length()<=0 || 
                txtcommunity.getText().length()<=0 || txtgender.getText().length()<=0 || txtpatientid.getText().length()<=0 || 
                txtcity.getText().length()<=0 || txtinsno.getText().length()<=0|| txtdiab.getText().length()<=0 || txtaller.getText().length()<=0){
            JOptionPane.showMessageDialog(this, "Any field is left blank!");
        }
        else{
            
            for (Patient p : patienthistory.getPatienthistory()){
            if(p.getPatientid().contains(patientid)){
                JOptionPane.showMessageDialog(this, "Patient already exists!");
                return;
            }
            else
                break;
            }
                 
            //populateTable();
        
            String id = txtpatientid.getText();
            int insuranceno = Integer.parseInt(txtinsno.getText());
            String diab = txtdiab.getText();
            String allergy = txtaller.getText();
//            String name = txtname.getText();
//            String address = txtaddress.getText();
//            int seats = Integer.parseInt(txtage.getText());
//            String community = txtcommunity.getText();
//            String gender = txtgender.getText();
            //String city = txtcity.getText();
        
            Patient p = patienthistory.newPatient();
            
            p.setPatientid(id);
            p.setInsuranceno(insuranceno);
            p.setDiabetics(diab);
            p.setAllergy(allergy);
        
            JOptionPane.showMessageDialog(this, "Patient Details Saved!");
            
            
            txtpatientid.setText("");
            txtinsno.setText("");
            txtdiab.setText("");
            txtaller.setText("");
            txtname.setText("");
            txtaddress.setText("");
            txtage.setText("");
            txtcommunity.setText("");
            txtgender.setText("");
            txtcity.setText("");
        }
        
        
    }//GEN-LAST:event_bttnupdateActionPerformed

    private void bttnviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnviewActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblpersondetails.getSelectedRow();
        
        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this,"Please select a row to View");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblpersondetails.getModel();
        CarInfo selectedCarDetails = (CarInfo) model.getValueAt(selectedRowIndex, 0);
        
        
        txtpatientid.setText(selectedCarDetails.getPersonid());
        txtname.setText(selectedCarDetails.getName());
        txtaddress.setText(String.valueOf(selectedCarDetails.getAddress()));
        txtage.setText(String.valueOf(selectedCarDetails.getAge()));
        txtgender.setText(selectedCarDetails.getGender());
        txtcommunity.setText(selectedCarDetails.getCommunity());
        txtcity.setText(selectedCarDetails.getCity());
        
        
    }//GEN-LAST:event_bttnviewActionPerformed

    private void bttnupdateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttnupdateMousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_bttnupdateMousePressed

    private void txtaddressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtaddressKeyReleased
        // TODO add your handling code here:
        String PAT = "^[A-Za-z0-9 ,.A-Za-z0-9]{0,50}$";
        Pattern pat = Pattern.compile(PAT);
        Matcher m = pat.matcher(txtaddress.getText());
        if(m.matches()){
            lbladdress.setText(null);
            bttnupdate.setEnabled(true);
        }
        else{
            lbladdress.setText("Invalid Entry!");
            bttnupdate.setEnabled(false);
            
        }
    }//GEN-LAST:event_txtaddressKeyReleased

    private void txtageKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtageKeyReleased
        // TODO add your handling code here:
        String PAT = "^[0-9]{0,3}$";
        Pattern pat = Pattern.compile(PAT);
        Matcher m = pat.matcher(txtage.getText());
        if(m.matches()){
            lblname.setText(null);
            bttnupdate.setEnabled(true);
        }
        else{
            lblname.setText("Invalid Entry");
            bttnupdate.setEnabled(false);
            
        }
    }//GEN-LAST:event_txtageKeyReleased

    private void txtgenderKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtgenderKeyReleased
        // TODO add your handling code here:
        String PAT = "^(Male|male|female|Female|Others|others)$";
        Pattern pat = Pattern.compile(PAT);
        Matcher m = pat.matcher(txtgender.getText());
        if(m.matches()){
            lblgender.setText(null);
            bttnupdate.setEnabled(true);
        }
        else{
            lblgender.setText("Invalid Entry");
            bttnupdate.setEnabled(false);
        }
        
    }//GEN-LAST:event_txtgenderKeyReleased

    private void txtcommunityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcommunityKeyReleased
        // TODO add your handling code here:
        String PAT = "^(02215 Community 1|02215 community 1|02215 Community 2|02215 community 2)$";
        Pattern pat = Pattern.compile(PAT);
        Matcher m = pat.matcher(txtcommunity.getText());
        if(m.matches()){
            lblcommunity.setText(null);
            bttnupdate.setEnabled(true);
        }
        else{
            lblcommunity.setText("Invalid entry!");
            bttnupdate.setEnabled(false);
            
        }
    }//GEN-LAST:event_txtcommunityKeyReleased

    private void txtpatientidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpatientidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpatientidActionPerformed

    private void txtpatientidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpatientidKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpatientidKeyReleased

    private void txtcityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcityKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcityKeyReleased

    private void txtinsnoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtinsnoKeyReleased
        // TODO add your handling code here:
        String PAT = "^[0-9]{4}$";
        Pattern pat = Pattern.compile(PAT);
        Matcher m = pat.matcher(txtinsno.getText());
        if(m.matches()){
            lblinscno.setText(null);
            bttnupdate.setEnabled(true);
        }
        else{
            lblinscno.setText("Enter 4 digits!");
            bttnupdate.setEnabled(false);
            
        }
    }//GEN-LAST:event_txtinsnoKeyReleased

    private void txtdiabKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiabKeyReleased
        // TODO add your handling code here:
        String PAT = "^(Yes|yes|No|no)$";
        Pattern pat = Pattern.compile(PAT);
        Matcher m = pat.matcher(txtdiab.getText());
        if(m.matches()){
            lbldiab.setText(null);
            bttnupdate.setEnabled(true);
        }
        else{
            lbldiab.setText("Yes/No");
            bttnupdate.setEnabled(false);
        }
    }//GEN-LAST:event_txtdiabKeyReleased

    private void txtallerKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtallerKeyReleased
        // TODO add your handling code here:
        String PAT = "^[A-Za-z ,A-Za-z]{0,50}$";
        Pattern pat = Pattern.compile(PAT);
        Matcher m = pat.matcher(txtaller.getText());
        if(m.matches()){
            lblall.setText(null);
            bttnupdate.setEnabled(true);
        }
        else{
            lblall.setText("Invalid Entry!");
            bttnupdate.setEnabled(false);
            
        }
    }//GEN-LAST:event_txtallerKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnupdate;
    private javax.swing.JButton bttnview;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jaller;
    private javax.swing.JLabel jcarmodel;
    private javax.swing.JLabel jcity;
    private javax.swing.JLabel jdiab;
    private javax.swing.JLabel jinsurno;
    private javax.swing.JLabel jlocation;
    private javax.swing.JLabel jmaintenance;
    private javax.swing.JLabel jmanufyear;
    private javax.swing.JLabel jpersonid;
    private javax.swing.JLabel jseats;
    private javax.swing.JLabel jviewtitle;
    private javax.swing.JLabel lbladdress;
    private javax.swing.JLabel lblage;
    private javax.swing.JLabel lblall;
    private javax.swing.JLabel lblcommunity;
    private javax.swing.JLabel lbldiab;
    private javax.swing.JLabel lblgender;
    private javax.swing.JLabel lblinscno;
    private javax.swing.JLabel lblname;
    private javax.swing.JTable tblpersondetails;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtaller;
    private javax.swing.JTextField txtcity;
    private javax.swing.JTextField txtcommunity;
    private javax.swing.JTextField txtdiab;
    private javax.swing.JTextField txtgender;
    private javax.swing.JTextField txtinsno;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtpatientid;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel) tblpersondetails.getModel();
        model.setRowCount(0);
        
        for(CarInfo ci : history.getHistory()){
            
            Object[] row = new Object[7];
            row[0] = ci;
            row[1] = ci.getName();
            row[2] = ci.getAddress();
            row[3] = ci.getAge();
            row[4] = ci.getGender();
            row[5] = ci.getCommunity();
            row[6] = ci.getCity();
            
            
        model.addRow(row);
        }
        
    }

   
    
    
    
}

    

   
