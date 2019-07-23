package managementsystem.patientpkg;

import java.awt.Component;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import managementsystem.DB;
import managementsystem.paitents;
import net.proteanit.sql.DbUtils;

public class Appointment extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    private Object idc;
    private Object j;

    public Appointment() {

        this.rs = null;
        initComponents();

        try {
            con = DB.mycon();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Appointment.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Appointment.class.getName()).log(Level.SEVERE, null, ex);
        }

        tableload();
    }

    public void tableload() {

        try {

            String sql = "SELECT appNo, pid , date , consultant , time , criticalstatus,DoctorFee,ChanelFee FROM appointment ";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            appointmenttable.setModel(DbUtils.resultSetToTableModel(rs));
            System.out.println("Done");

        } catch (SQLException e) {

            System.out.println(e);

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pidbox = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        appointmenttable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        searchbox = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        yesbox = new javax.swing.JRadioButton();
        nobox = new javax.swing.JRadioButton();
        appnobox = new javax.swing.JLabel();
        consultantbox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        doctorbox = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        chanelbox = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        datebox = new com.toedter.calendar.JDateChooser();
        timebox = new com.github.lgooddatepicker.components.TimePicker();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("PID");

        jLabel3.setText("Appointment No");

        jLabel4.setText("Consultant");

        jLabel5.setText("Date");

        jLabel7.setText("Time");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        appointmenttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        appointmenttable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appointmenttableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(appointmenttable);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("DELETE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setText("UPDATE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(710, 140));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Appointments");
        jLabel1.setPreferredSize(new java.awt.Dimension(110, 44));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("SEARCH APPOINTMENT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        searchbox.setText("Appointment No");
        searchbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchboxMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(searchbox, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(searchbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jLabel8.setText("Critical Status");

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        yesbox.setText("Yes");
        yesbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesboxActionPerformed(evt);
            }
        });

        nobox.setText("No");
        nobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noboxActionPerformed(evt);
            }
        });

        consultantbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a consultant", "Dr.Sumith Rajapura", "Dr.Neranjana Hettiarachchi", "Dr.Nishanthi Udayangi" }));
        consultantbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultantboxActionPerformed(evt);
            }
        });

        jLabel6.setText("Doctor Fee");

        doctorbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorboxActionPerformed(evt);
            }
        });

        jLabel9.setText("Channel Fee");

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton6.setText("Clear Fields");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(appnobox, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(yesbox)
                                        .addComponent(nobox)
                                        .addComponent(consultantbox, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(chanelbox, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                                        .addComponent(doctorbox)
                                        .addComponent(pidbox))
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(datebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(timebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(220, 220, 220)
                                .addComponent(jButton2)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jButton4)
                                .addGap(49, 49, 49)
                                .addComponent(jButton6)
                                .addGap(95, 95, 95)
                                .addComponent(jButton5)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(appnobox, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pidbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                                .addComponent(datebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(consultantbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                .addComponent(timebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(yesbox)
                                .addGap(3, 3, 3)
                                .addComponent(nobox)
                                .addGap(10, 10, 10)
                                .addComponent(doctorbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(chanelbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(806, 657));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        new paitents().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String pid = pidbox.getText();
        SimpleDateFormat j = new SimpleDateFormat("yyyy-MM-dd");
        String date = j.format(datebox.getDate());
        String consult = consultantbox.getSelectedItem().toString();
        String time = timebox.getText();
        String cricstat = null;
        String dfee = doctorbox.getText();
        String chanelfee = chanelbox.getText();

        validation1.Pidvalidation(pid);
        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        //String d = sdf.format(jDateChooser1.getDate());
        //if (date.equals("")) {
        //JOptionPane.showMessageDialog(this, "Choose a Date");
        //} else {
        //  validation.isValidPid(pid);
        //}

        if (j.format(datebox.getDate()).equals("")) {
            JOptionPane.showMessageDialog(rootPane, "date field cannot be empty!");
        }

        if (consultantbox.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Select a Doctor");
        } else {

            validation1.Timevalidation(time);
        }
        if (!(yesbox.isSelected()) && !(nobox.isSelected())) {
            JOptionPane.showMessageDialog(this, "Select a Critical Status");
        }
        if (dfee.equals("")) {
            JOptionPane.showMessageDialog(this, "Enter Doctor Fee");
        } else {
            validation1.isValidDfee(dfee);
        }
        if (chanelfee.equals("")) {
            JOptionPane.showMessageDialog(this, "Enter Chanel Fee");
        } else {
            validation1.isValidchanelfee(chanelfee);
        }

        if (yesbox.isSelected()) {
            cricstat = "Yes";
        } else if (nobox.isSelected()) {
            cricstat = "No";
        }

        try {

            String appointments = "SELECT No_of_appointments FROM consultant WHERE Name ='" + consult + "' ";
            pst = con.prepareStatement(appointments);
            rs = pst.executeQuery();

            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            String b = jTable1.getValueAt(0, 0).toString();
            int a = Integer.parseInt(b);

            System.out.println(a);

            if (a == 0) {
                JOptionPane.showMessageDialog(null, "There is no more available slots");
                System.out.println("Error");

            } else {
                try {

                    String q = "INSERT INTO appointment(pid,date,consultant,time,criticalstatus,DoctorFee,ChanelFee) VALUES ('" + pid + "', '" + date + "', '" + consult + "', '" + time + "','" + cricstat + "', '" + dfee + "', '" + chanelfee + "')";
                    pst = con.prepareStatement(q);
                    pst.execute();
                    System.out.println("Done");

                    tableload();

                } catch (SQLException e) {

                    System.out.println(e);

                }

                try {
                    String q = "UPDATE consultant SET No_of_appointments = No_of_appointments-1  WHERE Name = '" + consult + "' ";
                    pst = con.prepareStatement(q);
                    pst.execute();
                    System.out.println("Done");

                } catch (SQLException e) {
                    System.out.println(e);
                }
            }

        } catch (SQLException e) {

            System.out.println(e);

        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void yesboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesboxActionPerformed

        yesbox.setSelected(true);
        nobox.setSelected(false);
        String cricstat = "Yes";
    }//GEN-LAST:event_yesboxActionPerformed

    private void noboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noboxActionPerformed

        nobox.setSelected(true);
        yesbox.setSelected(false);
        String cricstat = "No";
    }//GEN-LAST:event_noboxActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        int x = JOptionPane.showConfirmDialog(null, "Do you Really Want To Delete?");

        if (x == 0) {

            String consult = consultantbox.getSelectedItem().toString();
            String appno = appnobox.getText();

            String q;
            q = "DELETE  FROM appointment WHERE appNo = '" + appno + "' ";

            try {

                pst = con.prepareStatement(q);
                pst.execute();
                System.out.println("Done");

                tableload();

            } catch (SQLException e) {
                System.out.println(e);
            }

            try {
                String q1 = "UPDATE consultant SET No_of_appointments = No_of_appointments+1  WHERE Name = '" + consult + "' ";
                pst = con.prepareStatement(q1);
                pst.execute();
                System.out.println("Done");

            } catch (SQLException e) {
                System.out.println(e);
            }
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void appointmenttableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appointmenttableMouseClicked

        int r = appointmenttable.getSelectedRow();

        try {
            String appno = appointmenttable.getValueAt(r, 0).toString();
            String pid = appointmenttable.getValueAt(r, 1).toString();
            SimpleDateFormat j = new SimpleDateFormat("yyyy-MM-dd");
            datebox.setDate(j.parse(appointmenttable.getValueAt(r, 2).toString()));
            String consultant = appointmenttable.getValueAt(r, 3).toString();
            String time = appointmenttable.getValueAt(r, 4).toString();
            String cricstat = appointmenttable.getValueAt(r, 5).toString();
            String dfee = appointmenttable.getValueAt(r, 6).toString();
            String chanelfee = appointmenttable.getValueAt(r, 7).toString();

            appnobox.setText(appno);
            pidbox.setText(pid);
            consultantbox.setSelectedItem(consultant);
            timebox.setText(time);
            doctorbox.setText(dfee);
            chanelbox.setText(chanelfee);

            if (cricstat.equals("Yes")) {
                yesbox.setSelected(true);
                nobox.setSelected(false);

            } else if (cricstat.equals("No")) {
                nobox.setSelected(true);
                yesbox.setSelected(false);

            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_appointmenttableMouseClicked


    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        int r = appointmenttable.getSelectedRow();

        String preconsultant = appointmenttable.getValueAt(r, 3).toString();

        int x = JOptionPane.showConfirmDialog(null, "Do You Really Want To Update?");

        if (x == 0) {
            String appno = appnobox.getText();
            String pid = pidbox.getText();
            SimpleDateFormat j = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
            String date = j.format(datebox.getDate());
            String consultant = consultantbox.getSelectedItem().toString();
            String time = timebox.getText();
            String cricstat = null;
            String dfee = doctorbox.getText();
            String chanelfee = chanelbox.getText();

            if (yesbox.isSelected()) {
                cricstat = "Yes";
            } else if (nobox.isSelected()) {
                cricstat = "No";
            }

            try {

                String sql = "UPDATE appointment SET pid = '" + pid + "' , date = '" + date + "' , consultant = '" + consultant + "' , time = '" + time + "' , criticalstatus = '" + cricstat + "', DoctorFee = '" + dfee + "', ChanelFee = '" + chanelfee + "'  WHERE appNo = '" + appno + "'";

                pst = con.prepareStatement(sql);
                pst.execute();
                System.out.println("Done");

                tableload();

            } catch (SQLException e) {
                System.out.println(e);
            }
            if (preconsultant != consultant) {

                try {
                    String q1 = "UPDATE consultant SET No_of_appointments = No_of_appointments-1  WHERE Name = '" + consultant + "' ";
                    pst = con.prepareStatement(q1);
                    pst.execute();
                    System.out.println("Done");

                    String q2 = "UPDATE consultant SET No_of_appointments = No_of_appointments+1  WHERE Name = '" + preconsultant + "' ";
                    pst = con.prepareStatement(q2);
                    pst.execute();
                    System.out.println("Done");

                    tableload();

                } catch (SQLException e) {

                    System.out.println(e);

                }
            }
        }


    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        String id = searchbox.getText();

        try {
            validation1.isValidAppointments(id);
            String sql = "SELECT appNo,pid,date,consultant,time,criticalstatus FROM appointment WHERE appNo = '" + id + "' ";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

            appointmenttable.setModel(DbUtils.resultSetToTableModel(rs));
            System.out.println("Done");

        } catch (SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void consultantboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultantboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_consultantboxActionPerformed

    private void doctorboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doctorboxActionPerformed

    private void searchboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchboxMouseClicked
        searchbox.setText(null);
    }//GEN-LAST:event_searchboxMouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        pidbox.setText(null);
        datebox.setDate(null);
        consultantbox.setSelectedIndex(0);
        timebox.setTime(null);
        appnobox.setText(null);
        yesbox.setSelected(false);
        nobox.setSelected(false);

        doctorbox.setText(null);
        chanelbox.setText(null);
    }//GEN-LAST:event_jButton6ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Appointment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appnobox;
    private javax.swing.JTable appointmenttable;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField chanelbox;
    private javax.swing.JComboBox<String> consultantbox;
    private com.toedter.calendar.JDateChooser datebox;
    private javax.swing.JTextField doctorbox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton nobox;
    private javax.swing.JTextField pidbox;
    private javax.swing.JTextField searchbox;
    private com.github.lgooddatepicker.components.TimePicker timebox;
    private javax.swing.JRadioButton yesbox;
    // End of variables declaration//GEN-END:variables

    private String selectoption() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
