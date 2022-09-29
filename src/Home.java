
import java.awt.*;

 
public class Home extends javax.swing.JFrame {

    
    public Home() {
        initComponents();
       setExtendedState(MAXIMIZED_BOTH);
         
    }

     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nstubtn = new javax.swing.JButton();
        nbookbtn = new javax.swing.JButton();
        stastibtn = new javax.swing.JButton();
        ibookbtn = new javax.swing.JButton();
        rbookbtn = new javax.swing.JButton();
        logoutbtn = new javax.swing.JButton();
        aboutbtn = new javax.swing.JButton();
        qoutebtn = new javax.swing.JButton();
        l1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nstubtn.setBackground(new java.awt.Color(51, 255, 255));
        nstubtn.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        nstubtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newstudent1.png"))); // NOI18N
        nstubtn.setText("Register new student");
        nstubtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nstubtnActionPerformed(evt);
            }
        });
        getContentPane().add(nstubtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 290, 90));

        nbookbtn.setBackground(new java.awt.Color(51, 255, 255));
        nbookbtn.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        nbookbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newbook1.png"))); // NOI18N
        nbookbtn.setText("Register new book");
        nbookbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nbookbtnActionPerformed(evt);
            }
        });
        getContentPane().add(nbookbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 260, 80));

        stastibtn.setBackground(new java.awt.Color(51, 255, 255));
        stastibtn.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        stastibtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/statistics1.png"))); // NOI18N
        stastibtn.setText("Data");
        stastibtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stastibtnActionPerformed(evt);
            }
        });
        getContentPane().add(stastibtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 180, 190, 80));

        ibookbtn.setBackground(new java.awt.Color(51, 255, 255));
        ibookbtn.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        ibookbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/issue1.png"))); // NOI18N
        ibookbtn.setText("Issue book");
        ibookbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ibookbtnActionPerformed(evt);
            }
        });
        getContentPane().add(ibookbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 290, 80));

        rbookbtn.setBackground(new java.awt.Color(51, 255, 255));
        rbookbtn.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        rbookbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/returnbook.png"))); // NOI18N
        rbookbtn.setText("Return book");
        rbookbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbookbtnActionPerformed(evt);
            }
        });
        getContentPane().add(rbookbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 260, 70));

        logoutbtn.setBackground(new java.awt.Color(51, 255, 255));
        logoutbtn.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        logoutbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout.png"))); // NOI18N
        logoutbtn.setText("Logout");
        logoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbtnActionPerformed(evt);
            }
        });
        getContentPane().add(logoutbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 300, 190, 70));

        aboutbtn.setBackground(new java.awt.Color(51, 255, 255));
        aboutbtn.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        aboutbtn.setText("About us");
        aboutbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        aboutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutbtnActionPerformed(evt);
            }
        });
        getContentPane().add(aboutbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 200, 70));

        qoutebtn.setBackground(new java.awt.Color(51, 255, 255));
        qoutebtn.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        qoutebtn.setText("liberary qoute");
        qoutebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qoutebtnActionPerformed(evt);
            }
        });
        getContentPane().add(qoutebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 400, 210, 70));

        l1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/i46.png"))); // NOI18N
        l1.setText(" ");
        l1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        l1.setAlignmentY(0.0F);
        l1.setAutoscrolls(true);
        l1.setFocusable(false);
        l1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        l1.setRequestFocusEnabled(false);
        getContentPane().add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 1040, 130));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/brian-quid-6O9dPC51s7M-unsplash.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setPreferredSize(new java.awt.Dimension(1958, 1580));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbtnActionPerformed
         setVisible(false);
         new Login().setVisible(true);
    }//GEN-LAST:event_logoutbtnActionPerformed

    private void nstubtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nstubtnActionPerformed
                   
                   new newstudent().setVisible(true);
    }//GEN-LAST:event_nstubtnActionPerformed

    private void nbookbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nbookbtnActionPerformed
         new newbook().setVisible(true);
    }//GEN-LAST:event_nbookbtnActionPerformed

    private void ibookbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ibookbtnActionPerformed
        new issuebook().setVisible(true);
    }//GEN-LAST:event_ibookbtnActionPerformed

    private void rbookbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbookbtnActionPerformed
        new Returnbook().setVisible(true);
    }//GEN-LAST:event_rbookbtnActionPerformed

    private void stastibtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stastibtnActionPerformed
         new Data().setVisible(true);
    }//GEN-LAST:event_stastibtnActionPerformed

    private void aboutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutbtnActionPerformed
         new aboutus().setVisible(true);
    }//GEN-LAST:event_aboutbtnActionPerformed

    private void qoutebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qoutebtnActionPerformed
              new liberaryqoute().setVisible(true);
    }//GEN-LAST:event_qoutebtnActionPerformed

   
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aboutbtn;
    private javax.swing.JButton ibookbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel l1;
    private javax.swing.JButton logoutbtn;
    private javax.swing.JButton nbookbtn;
    private javax.swing.JButton nstubtn;
    private javax.swing.JButton qoutebtn;
    private javax.swing.JButton rbookbtn;
    private javax.swing.JButton stastibtn;
    // End of variables declaration//GEN-END:variables
}
