
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement ;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Add_item extends javax.swing.JFrame {
Connection con = null;
PreparedStatement pst = null;
    
    public Add_item() {
        initComponents();

       con = DB_connect.connect();
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ai1 = new javax.swing.JTextField();
        ai2 = new javax.swing.JComboBox<>();
        ai3 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ai4 = new javax.swing.JTextField();
        ai5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("The Paws Shop");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Product Name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 30, 120, 25);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Animal");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 70, 82, 25);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Catagory");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 100, 80, 25);

        ai1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ai1ActionPerformed(evt);
            }
        });
        getContentPane().add(ai1);
        ai1.setBounds(150, 30, 155, 30);

        ai2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "Dog", "Cat", "Bird", "Fish" }));
        ai2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ai2ActionPerformed(evt);
            }
        });
        getContentPane().add(ai2);
        ai2.setBounds(150, 70, 80, 22);

        ai3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "Food and Treats", "Pet Toys", "Harnesses and Leashes", "Cages and Crates", "Grooming Products:", " " }));
        ai3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ai3ActionPerformed(evt);
            }
        });
        getContentPane().add(ai3);
        ai3.setBounds(150, 100, 154, 22);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Price");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 140, 50, 25);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Quantity");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 180, 80, 25);

        ai4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ai4ActionPerformed(evt);
            }
        });
        getContentPane().add(ai4);
        ai4.setBounds(150, 140, 127, 30);

        ai5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ai5ActionPerformed(evt);
            }
        });
        getContentPane().add(ai5);
        ai5.setBounds(150, 180, 71, 30);

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(30, 230, 72, 23);

        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(30, 260, 75, 23);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Downloads\\SVMyCtb.jpg")); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 420, 310);

        setSize(new java.awt.Dimension(428, 320));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String productName = ai1.getText();
        String animal = (String) ai2.getSelectedItem();
        String category = (String) ai3.getSelectedItem();
        String price = ai4.getText();
        String quantity = ai5.getText();

        if (con != null) {
            String sql = "INSERT INTO add_items (Name, Animal, Category, Unit_Price, Quantity) VALUES (?, ?, ?, ?, ?)";

            try {
                pst = con.prepareStatement(sql);
                pst.setString(1, productName);
                pst.setString(2, animal);
                pst.setString(3, category);
                pst.setString(4, price);
                pst.setString(5, quantity);

                int rowsAffected = pst.executeUpdate();

                if (rowsAffected > 0) {
                    System.out.println("Data inserted successfully.");
                } else {
                    System.out.println("No data inserted.");
                }
                ai1.setText("");
                ai4.setText("");
                ai5.setText("");
            } catch (SQLException e) {
                System.out.println("SQL error: " + e.getMessage());
            } finally {
                try {
                    if (pst != null) {
                        pst.close();
                    }
                } catch (SQLException e) {
                    System.out.println("Error closing PreparedStatement: " + e.getMessage());
                }
            }
        } else {
            System.out.println("Unable to perform database operations, connection is null.");
        }
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void ai5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ai5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ai5ActionPerformed

    private void ai2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ai2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ai2ActionPerformed

    private void ai3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ai3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ai3ActionPerformed

    private void ai4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ai4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ai4ActionPerformed

    private void ai1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ai1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ai1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(() -> {
        new Add_item().setVisible(true); // Create an instance of Add_item and make it visible
    });
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ai1;
    private javax.swing.JComboBox<String> ai2;
    private javax.swing.JComboBox<String> ai3;
    private javax.swing.JTextField ai4;
    private javax.swing.JTextField ai5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
