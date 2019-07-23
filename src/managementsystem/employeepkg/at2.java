/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managementsystem.employeepkg;

//import static Interfaces.at.id_box;
import managementsystem.*;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author BBR
 */
public class at2 extends javax.swing.JFrame {
    
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    String pname = null;
    int count = 0;
    String Eid = null;
    int otHours = 0;
    int punishments = 0;
    int fullDays = 0;
    int HalfDays = 0;
    int month = 0;
    String mnth = null;
    String status = null;
    String Not = null;
    String in = null;
    int m;

    /**
     * Creates new form at2
     */
    public at2() {
        initComponents();
        
        try {
            conn = DB.mycon();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(at2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(at2.class.getName()).log(Level.SEVERE, null, ex);
        }

        date.setText(date());
        time.setText(time());
        
        id_box.setText(at.id_box.getText());
        Eid = id_box.getText();
        String d = date.getText();
        String id = id_box.getText();
        try {
            String sql = "SELECT `in` FROM `eat" + Eid + "` WHERE `date` =('" + d + "') ";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));;
            String in = jTable1.getValueAt(0, 0).toString();
            
            if (in.equals("NULL")) {
                System.out.println("Null");
                TimeIn.setEnabled(true);
                
            } else {
                System.out.println("Not Null");
                TimeIn.setEnabled(false);
                
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
// check OUT time
        try {
            String sql = "SELECT `out` FROM `eat" + Eid + "` WHERE `date` =('" + d + "')";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));;
            String out = jTable1.getValueAt(0, 0).toString();
            
            if (out.equals("NULL")) {
                TimeOut.setEnabled(true);
                
            } else {
                TimeOut.setEnabled(false);
                
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
        try {
            String sql = "Select first_name from staff_information where id = ('" + Eid + "')";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));;
            String pname = jTable1.getValueAt(0, 0).toString();
            name_box.setText(pname);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    public void tableload(String id) {
        
        try {
            String s = "select * from `eat" + id + "`";
            pst = conn.prepareStatement(s);
            rs = pst.executeQuery();
            AttendList.jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
    }
    
    public String time() {
        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        String strDate = dateFormat.format(date);
        System.out.println("Converted String: " + strDate);
        return strDate;
    }

    public String date() {
        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        String Date = dateFormat.format(date);
        System.out.println("Converted String: " + Date);
        return Date;
    }
//    public void date() {
//        new Timer(0, (ActionEvent e) -> {
//            
//            Date ddate = Calendar.getInstance().getTime();
//            DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
//            String Date = dateFormat.format(ddate);
//            System.out.println("Converted String: " + Date);
//            date.setText(Date);
//        }).start();;
//        
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        TimeIn = new javax.swing.JButton();
        TimeOut = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        name_box = new javax.swing.JLabel();
        id_box = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        date = new javax.swing.JLabel();
        time = new javax.swing.JLabel();

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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel1.setText("Name :");

        TimeIn.setText("In");
        TimeIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimeInActionPerformed(evt);
            }
        });

        TimeOut.setText("Out");
        TimeOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimeOutActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel2.setText("ID :");

        name_box.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N

        id_box.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton3.setText("LogOut");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setText("View Attendence");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setToolTipText("");

        date.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        date.setForeground(new java.awt.Color(255, 255, 255));
        date.setText("date");

        time.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        time.setForeground(new java.awt.Color(255, 255, 255));
        time.setText("time");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(date)
                .addGap(38, 38, 38)
                .addComponent(time)
                .addGap(34, 34, 34))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(time)
                    .addComponent(date))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(46, 46, 46)
                        .addComponent(id_box, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(name_box, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TimeIn, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                    .addComponent(TimeOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(id_box, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TimeIn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(name_box, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(TimeOut, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        at a = new at();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void TimeInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimeInActionPerformed
        // TODO add your handling code here:

        String t = time.getText();
        String d = date.getText();
        
        String[] units = d.split("/");
        int Month = Integer.parseInt(units[0]);
        
        try {
            String sql = "SELECT MAX(count) FROM `eat" + Eid + "`";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));;
            String c = jTable1.getValueAt(0, 0).toString();
            count = Integer.parseInt(c);
            System.out.println("Count =" + count);
            
        } catch (Exception ex) {
            System.out.println(ex);
        }
        count++;

//        TimeIn.setEnabled(false);
//        TimeOut.setEnabled(true);
        try {
            String sql = "INSERT INTO `eat" + Eid + "`(`date`,`in`,`count`,`month`) VALUES ('" + d + "','" + t + "','" + count + "','" + Month + "') ";
            pst = conn.prepareStatement(sql);
            pst.execute();
            TimeIn.setEnabled(false);
            
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_TimeInActionPerformed

    private void TimeOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimeOutActionPerformed

        // TODO add your handling code here:
        String out = time.getText();
        String d = date.getText();

//calculations
        try {
            String sql = "SELECT `in` FROM `eat" + Eid + "` WHERE `date` =('" + d + "')";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            in = jTable1.getValueAt(0, 0).toString();
            
            String[] units = in.split(":");
            int Inhour = Integer.parseInt(units[0]); //first element
            System.out.println(Inhour);
            
            String[] Ounits = out.split(":");
            int Outhour = Integer.parseInt(Ounits[0]); //first element
            System.out.println(Outhour);
            
            String[] Dunits = d.split("/");
            m = Integer.parseInt(Dunits[0]); //3rd element
            System.out.println(m);

//            mnth = String.valueOf(m);
            int ot = Outhour - Inhour;
            
            if ((Inhour <= 9) && (Outhour >= 17)) {
                status = "Full Day";
                
                if (Outhour <= 17) {
                    otHours = 0;
                    String ots = String.valueOf(otHours);
                    
                    Not = ots;
                } else {
                    otHours = Outhour - 17;
                    String ots = String.valueOf(otHours);
                    Not = ots;
                    
                }
            } else {
                status = "Half Day";
                
            }
            
        } catch (Exception e) {
            System.out.println(e);
            
        }

        //Update values to attendence table
        try {
            String sql = "UPDATE `eat" + Eid + "` SET `out`=('" + out + "'),`month`=('" + m + "'),`OThours`=('" + otHours + "'),`status`=('" + status + "') WHERE `date`=('" + d + "')";
            System.out.println(sql);
            
            pst = conn.prepareStatement(sql);
            pst.execute();
            TimeOut.setEnabled(false);
            
        } catch (Exception ex) {
            System.out.println(ex);
        }
        

    }//GEN-LAST:event_TimeOutActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        // TODO add your handling code here:
        AttendList a = new AttendList();
        a.setVisible(true);
        String id = id_box.getText();
        AttendList.jLabel1.setText("Attendence Of Employee :" + id);
        tableload(id);
        

    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(at2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(at2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(at2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(at2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new at2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton TimeIn;
    private javax.swing.JButton TimeOut;
    private javax.swing.JLabel date;
    public static javax.swing.JLabel id_box;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel name_box;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}
