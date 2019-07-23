package managementsystem.patientpkg;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import managementsystem.DB;
import managementsystem.paitents;
import net.proteanit.sql.DbUtils;

public class Slots extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public Slots() {

        this.rs = null;
        initComponents();

        try {
            con = DB.mycon();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Slots.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Slots.class.getName()).log(Level.SEVERE, null, ex);
        }

        tableload();

    }

    public void tableload() {
        try {

            String sql = "SELECT EmpID , Name ,Date, Time , No_of_appointments FROM consultant ";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            slotstable.setModel(DbUtils.resultSetToTableModel(rs));
            System.out.println("Done");

        } catch (Exception e) {

            System.out.println(e);

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        searchbutton = new javax.swing.JButton();
        searchbox = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        slotstable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nobox = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        empidbox = new javax.swing.JLabel();
        consultantbox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        datebox = new com.toedter.calendar.JDateChooser();
        timebox = new com.github.lgooddatepicker.components.TimePicker();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(730, 550));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Slots");

        searchbutton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        searchbutton.setText("SEARCH SLOTS");
        searchbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbuttonActionPerformed(evt);
            }
        });

        searchbox.setText("Consultant EmpID or Name");
        searchbox.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                searchboxComponentRemoved(evt);
            }
        });
        searchbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchboxMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchboxMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                searchboxMousePressed(evt);
            }
        });
        searchbox.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                searchboxComponentHidden(evt);
            }
        });
        searchbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchboxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(searchbutton)
                .addGap(37, 37, 37)
                .addComponent(searchbox, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(449, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchbutton)
                    .addComponent(searchbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        slotstable.setModel(new javax.swing.table.DefaultTableModel(
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
        slotstable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slotstableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(slotstable);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("EmpID");

        jLabel3.setText("consultant");

        jLabel4.setText("Time");
        jLabel4.setToolTipText("");

        jLabel5.setText("No of Appointments");
        jLabel5.setToolTipText("");

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("ADD");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setText("DELETE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setText("UPDATE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        consultantbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a consultant", "Dr.Sumith Rajapura", "Dr.Neranjana Hettiarachchi", "Dr.Nishanthi Udayangi" }));
        consultantbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultantboxActionPerformed(evt);
            }
        });

        jLabel6.setText("Date");
        jLabel6.setToolTipText("");

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("Clear Fields");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(empidbox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(44, 44, 44))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(consultantbox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(nobox, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(datebox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                                                    .addComponent(timebox, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jButton2)
                        .addGap(62, 62, 62)
                        .addComponent(jButton4)
                        .addGap(65, 65, 65)
                        .addComponent(jButton5)
                        .addGap(54, 54, 54)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(29, 29, 29))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(consultantbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(empidbox, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(datebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(timebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(nobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton4)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton1))
                .addGap(83, 83, 83))
        );

        setSize(new java.awt.Dimension(804, 633));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        new paitents().setVisible(true);
       this.dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String consult = consultantbox.getSelectedItem().toString();
        SimpleDateFormat j = new SimpleDateFormat("yyyy-MM-dd");
        String date = j.format(datebox.getDate());
        String time = timebox.getText();
        String no = nobox.getText();

        if (consultantbox.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Select a Doctor");
        }
        if (date.equals("")) {
            JOptionPane.showMessageDialog(this, "Choose a Date");
        } else {
            validation1.Timevalidation(time);
        }
        if (no.equals("")) {
            JOptionPane.showMessageDialog(this, "No Of Appointment feild cannot be empty");
        }
         //else {
            //validation.isValidAppointments(no);
        //}
        else {
            try {

                String q = "INSERT INTO consultant ( Name,Date, Time, No_of_appointments) VALUES('" + consult + "','" + date + "','" + time + "','" + no + "')";
                       pst = con.prepareStatement(q);
                pst.execute();
                System.out.println("Done");

                tableload();

            } catch (SQLException e) {

                System.out.println(e);

            }
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        int x = JOptionPane.showConfirmDialog(null, "Do you Really Want To Delete?");

        if (x == 0) {

            String id = empidbox.getText();

            String q = "DELETE  FROM consultant WHERE EmpID = '" + id + "' ";

            try {

                pst = con.prepareStatement(q);
                pst.execute();
                System.out.println("Done");

                tableload();

            } catch (SQLException e) {

                System.out.println(e);

            }

        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void slotstableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slotstableMouseClicked

        try {
            int r;
            r = slotstable.getSelectedRow();

            String id = slotstable.getValueAt(r, 0).toString();
            String name = slotstable.getValueAt(r, 1).toString();
            SimpleDateFormat j = new SimpleDateFormat("yyyy-MM-dd");
            String time = slotstable.getValueAt(r, 3).toString();
            String noslots = slotstable.getValueAt(r, 4).toString();

            empidbox.setText(id);
            consultantbox.setSelectedItem(name);
            datebox.setDate(j.parse(slotstable.getValueAt(r, 2).toString()));
            timebox.setText(time);
            nobox.setText(noslots);

        } catch (ParseException e) {

            System.out.println(e);
        }
    }//GEN-LAST:event_slotstableMouseClicked

    private void searchbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbuttonActionPerformed

        String id;
        String name;
        id = searchbox.getText();
        name = searchbox.getText();

        try {

            String sql = "SELECT EmpID,Name,Time,No_of_appointments FROM consultant WHERE EmpID LIKE '%" + id + "%' OR Name LIKE  '%" + name + "%' ";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

            slotstable.setModel(DbUtils.resultSetToTableModel(rs));
            System.out.println("Done");

        } catch (SQLException e) {

            System.out.println(e);

        }

    }//GEN-LAST:event_searchbuttonActionPerformed

    private void searchboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchboxMouseClicked
        searchbox.setText(null);


    }//GEN-LAST:event_searchboxMouseClicked

    private void searchboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchboxActionPerformed

    private void searchboxComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_searchboxComponentRemoved

    }//GEN-LAST:event_searchboxComponentRemoved

    private void searchboxComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_searchboxComponentHidden

    }//GEN-LAST:event_searchboxComponentHidden

    private void searchboxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchboxMouseEntered

    }//GEN-LAST:event_searchboxMouseEntered

    private void searchboxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchboxMousePressed

    }//GEN-LAST:event_searchboxMousePressed

    private void consultantboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultantboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_consultantboxActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int r = slotstable.getSelectedRow();

        int x = JOptionPane.showConfirmDialog(null, "Do You Really Want To Update?");

        if (x == 0) {

            String empid = empidbox.getText();
            String consultant = consultantbox.getSelectedItem().toString();
            SimpleDateFormat j = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
            String date = j.format(datebox.getDate());
            String time = timebox.getText();
            String No = nobox.getText();

            try {

                String sql = "UPDATE consultant SET EmpID = '" + empid + "'  , Name = '" + consultant + "' , Date = '" + date + "', Time = '" + time + "', No_of_appointments = '" + No + "' WHERE EmpID = '" + empid + "'";

                pst = con.prepareStatement(sql);
                pst.execute();
                System.out.println("Done");

                tableload();

            } catch (SQLException e) {
                System.out.println(e);
            }
    }//GEN-LAST:event_jButton5ActionPerformed
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
            empidbox.setText(null);
            nobox.setText(null);
            consultantbox.setSelectedItem(null);
            datebox.setDate((null));
            timebox.setTime(null);
              
    }//GEN-LAST:event_jButton3ActionPerformed
    

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Slots().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> consultantbox;
    private com.toedter.calendar.JDateChooser datebox;
    private javax.swing.JLabel empidbox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nobox;
    private javax.swing.JTextField searchbox;
    private javax.swing.JButton searchbutton;
    private javax.swing.JTable slotstable;
    private com.github.lgooddatepicker.components.TimePicker timebox;
    // End of variables declaration//GEN-END:variables
}
