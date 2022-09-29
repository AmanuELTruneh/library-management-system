 import java.sql.*;
import javax.swing.JOptionPane;
 import project.connection;
public class Returnbook extends javax.swing.JFrame {

     
    public Returnbook() {
        initComponents();
    }

     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bidtxt = new javax.swing.JTextField();
        sidtxt = new javax.swing.JTextField();
        issuetxt = new javax.swing.JTextField();
        datetxt = new javax.swing.JTextField();
        searchbtn = new javax.swing.JButton();
        returnbtn = new javax.swing.JButton();
        closebtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(325, 125));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(610, 469));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel1.setText("Book ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel2.setText("Student ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, -1));

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel3.setText("Issue Date");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, -1, -1));

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel4.setText("Due Date");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, -1, -1));

        bidtxt.setBackground(new java.awt.Color(51, 204, 255));
        bidtxt.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        bidtxt.setText(" ");
        getContentPane().add(bidtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 163, -1));

        sidtxt.setBackground(new java.awt.Color(51, 204, 255));
        sidtxt.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        sidtxt.setText(" ");
        getContentPane().add(sidtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 163, -1));

        issuetxt.setBackground(new java.awt.Color(51, 204, 255));
        issuetxt.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        issuetxt.setText(" ");
        getContentPane().add(issuetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 163, -1));

        datetxt.setBackground(new java.awt.Color(51, 204, 255));
        datetxt.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        datetxt.setText(" ");
        getContentPane().add(datetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 163, -1));

        searchbtn.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        searchbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search.png"))); // NOI18N
        searchbtn.setText("search");
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });
        getContentPane().add(searchbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, -1, -1));

        returnbtn.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        returnbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/return.png"))); // NOI18N
        returnbtn.setText("Return");
        returnbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnbtnActionPerformed(evt);
            }
        });
        getContentPane().add(returnbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, -1, -1));

        closebtn.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        closebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cancel.png"))); // NOI18N
        closebtn.setText("close");
        closebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closebtnActionPerformed(evt);
            }
        });
        getContentPane().add(closebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, -1, 50));

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setText("RETURN BOOK");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 110, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathilde-langevin-TFV9EPdYOaw-unsplash.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
                String bookid=bidtxt.getText();
                String studentid=sidtxt.getText();
                try{
                    Connection con=connection.con();
                    Statement stmnt=con.createStatement();
                    ResultSet rs=stmnt.executeQuery(" select * from issue2 where studentid='"+studentid+"' and bookid='"+bookid+"'");
                    if(rs.next()){
                        issuetxt.setText(rs.getString(3));
                        datetxt.setText(rs.getString(4));
                        
                    }else{
                        JOptionPane.showMessageDialog(null, " Book not issued to this Student ");
                        setVisible(false);
                        new Returnbook().setVisible(true);
                    }
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "connection error:"+e);
                    
                }
        
    }//GEN-LAST:event_searchbtnActionPerformed

    private void returnbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnbtnActionPerformed
             String bookid=bidtxt.getText();
             String studentid=sidtxt.getText();
             try{
                 Connection con=connection.con();
                 Statement stmnt=con.createStatement();
                 stmnt.executeUpdate(" update issue2 set returnbook='Yes' where bookid='"+bookid+"' and studentid='"+studentid+"'");
                 JOptionPane.showMessageDialog(null, "Book succefuly Returned ");
                 setVisible(false);
                 new Returnbook().setVisible(true);
                 
             }
             catch(Exception e){
                 JOptionPane.showMessageDialog(null, "connection error:"+e);
             }
    }//GEN-LAST:event_returnbtnActionPerformed

    private void closebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closebtnActionPerformed
        setVisible(false);
        
    }//GEN-LAST:event_closebtnActionPerformed

     
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
            java.util.logging.Logger.getLogger(Returnbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Returnbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Returnbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Returnbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Returnbook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bidtxt;
    private javax.swing.JButton closebtn;
    private javax.swing.JTextField datetxt;
    private javax.swing.JTextField issuetxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton returnbtn;
    private javax.swing.JButton searchbtn;
    private javax.swing.JTextField sidtxt;
    // End of variables declaration//GEN-END:variables
}
