import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;


import javax.swing.table.DefaultTableModel;

 
public   class Add_cashier_account extends javax.swing.JFrame {

    public void dat(){
 try { 
      DefaultTableModel tbModel = (DefaultTableModel) TX.getModel();
      tbModel.setRowCount(0);
           String sql = "SELECT * FROM cashier_details";
           pst = con.prepareStatement(sql);
           rs = (ResultSet) pst.executeQuery();
           

           String DataRow[] = new String[4];
          
           while (rs.next()) {
                //int x=rs.getInt(1)
               DataRow[0] =String.valueOf(rs.getInt("Cashier_ID"));
               DataRow[1] =  (String) rs.getString(2);
               DataRow[2] =  (String) rs.getString(3);
               DataRow[3] = (String) rs.getString(4);

              
               tbModel.addRow(DataRow);
           }

       } catch (Exception e) {
           JOptionPane.showMessageDialog(null,e);
       }   
}
    
   Connection con=null;
     PreparedStatement pst=null;
      ResultSet rs=null;

    public Add_cashier_account() {
        initComponents();
        con = DB_connect.connect();
        dat();
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        V1 = new javax.swing.JTextField();
        V2 = new javax.swing.JTextField();
        V3 = new javax.swing.JTextField();
        V4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        outpu = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TX = new javax.swing.JTable();

        jTextField1.setText("jTextField1");

        jLabel5.setText("jLabel5");

        jLabel6.setText("jLabel6");

        Table1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        Table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cashier ID", "Cashier Name", "Gender", "Expiriences"
            }
        ));
        Table1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        Table1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(Table1);

        jButton3.setText("See all cashiers details");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("The Paws Shop");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Cashier ID :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 40, 80, 20);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Cashier Name :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 70, 110, 20);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Gender :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 110, 60, 20);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Experience :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 160, 80, 16);

        V1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                V1ActionPerformed(evt);
            }
        });
        getContentPane().add(V1);
        V1.setBounds(110, 30, 64, 30);
        getContentPane().add(V2);
        V2.setBounds(110, 70, 140, 30);

        V3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                V3ActionPerformed(evt);
            }
        });
        getContentPane().add(V3);
        V3.setBounds(110, 110, 71, 30);
        getContentPane().add(V4);
        V4.setBounds(110, 150, 92, 30);

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 300, 72, 23);

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(10, 270, 72, 23);
        getContentPane().add(outpu);
        outpu.setBounds(30, 190, 180, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Downloads\\SVMyCtb.jpg")); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 260, 340);

        TX.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cashier_ID", "Cashier_Name", "Gender", "Experience"
            }
        ));
        jScrollPane2.setViewportView(TX);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(262, 2, 440, 340);

        setSize(new java.awt.Dimension(712, 362));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void V1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_V1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_V1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
        String B = V2.getText();
        String C = V3.getText();
        String D = V4.getText();

        String S1 = "INSERT INTO cashier_details (Cashier_Name, Gender, Experience) VALUES (?,?,?)";

        try {
            pst = con.prepareStatement(S1);  
            pst.setString(1,B);
            pst.setString(2, C);
            pst.setString(3, D);

            int rowsAffected = pst.executeUpdate();
// JOptionPane.showMessageDialog(null,nCashier_Name:"+V2+"\nGender:"+V3+"\nExperience:"+V4+");
           
            if (rowsAffected > 0) {
                System.out.println("Data inserted successfully.");
                outpu.setText("Data inserted successfully.");
            } else {
                System.out.println("No data inserted");
                outpu.setText("No data inserted");
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
    
        
 
      dat(); 
                
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void V3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_V3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_V3ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_cashier_account().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TX;
    private javax.swing.JTable Table1;
    private javax.swing.JTextField V1;
    private javax.swing.JTextField V2;
    private javax.swing.JTextField V3;
    private javax.swing.JTextField V4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel outpu;
    // End of variables declaration//GEN-END:variables

  /*private void tbload() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }*/
}
   /* private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    
  }*/



