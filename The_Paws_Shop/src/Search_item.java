import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


public class Search_item extends javax.swing.JFrame {
 Connection con=null;
     PreparedStatement pst=null;
     ResultSet rs=null;
    
    public Search_item() {
        initComponents();
         
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        eid = new javax.swing.JTextField();
        ianimal = new javax.swing.JTextField();
        icategory = new javax.swing.JTextField();
        iprice = new javax.swing.JTextField();
        iquantity = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        eid_b = new javax.swing.JButton();
        oeid = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        iname = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("The Paws Shop");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Enter Item ID :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 130, 20);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Animal");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 130, 94, 25);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Catagory");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 170, 94, 25);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Price");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 210, 94, 25);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Quantity");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 240, 94, 25);

        eid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eidActionPerformed(evt);
            }
        });
        getContentPane().add(eid);
        eid.setBounds(150, 10, 204, 22);
        getContentPane().add(ianimal);
        ianimal.setBounds(160, 120, 180, 30);
        getContentPane().add(icategory);
        icategory.setBounds(160, 160, 180, 30);
        getContentPane().add(iprice);
        iprice.setBounds(160, 200, 103, 30);
        getContentPane().add(iquantity);
        iquantity.setBounds(160, 240, 71, 30);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(240, 290, 72, 23);

        eid_b.setText("Search Item");
        eid_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eid_bActionPerformed(evt);
            }
        });
        getContentPane().add(eid_b);
        eid_b.setBounds(320, 290, 92, 23);

        oeid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oeidActionPerformed(evt);
            }
        });
        getContentPane().add(oeid);
        oeid.setBounds(160, 40, 180, 30);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Item ID");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 50, 60, 25);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Name");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 90, 60, 25);

        iname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inameActionPerformed(evt);
            }
        });
        getContentPane().add(iname);
        iname.setBounds(160, 80, 180, 30);

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Downloads\\SVMyCtb.jpg")); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 440, 350);

        setSize(new java.awt.Dimension(449, 367));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void eidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eidActionPerformed

    private void eid_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eid_bActionPerformed
       String EID = eid.getText();
       con = DB_connect.connect();
       try {
           String sql="SELECT  *  FROM add_items WHERE ID=?";
             pst=con.prepareStatement(sql);           
             pst.setString(1,EID);
             rs=pst.executeQuery();
             
             if(rs.next()){
                 int RID= rs.getInt("ID");
                 String RID1;
                 RID1 = String.valueOf(RID);
                 oeid.setText(RID1);
                 String nam = rs.getNString("Name");
                 iname.setText(nam);
                 String ani = rs.getNString("Animal");
                 ianimal.setText(ani);
                 String cata = rs.getNString("Category");
                 icategory.setText(cata);
                  int  ip = rs.getInt("Unit_price");
                 String inputp = String.valueOf(ip);
                 iprice.setText(inputp);
                 int  iq = rs.getInt("Quantity");
                 String inputq = String.valueOf(iq);
                 iquantity.setText(inputq);
                 
             }
             else
             {
                  JOptionPane.showMessageDialog(null, "You Entered invalid ID.Try Again", "Invalid ID", JOptionPane.INFORMATION_MESSAGE);
                 System.out.println("Value Not found");
             }

       } 
              catch(SQLException e){
             System.out.print(e);
             System.out.println(rs);
              }
       
    }//GEN-LAST:event_eid_bActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void oeidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oeidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oeidActionPerformed

    private void inameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inameActionPerformed

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
            java.util.logging.Logger.getLogger(Search_item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Search_item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Search_item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search_item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Search_item().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField eid;
    private javax.swing.JButton eid_b;
    private javax.swing.JTextField ianimal;
    private javax.swing.JTextField icategory;
    private javax.swing.JTextField iname;
    private javax.swing.JTextField iprice;
    private javax.swing.JTextField iquantity;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField oeid;
    // End of variables declaration//GEN-END:variables
}
