 import java.sql.*;
import javax.swing.JOptionPane;
 import project.connection;
public class newbook extends javax.swing.JFrame {

     
    public newbook() {
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
        bidtxt = new javax.swing.JTextField();
        bnametxt = new javax.swing.JTextField();
        publishtxt = new javax.swing.JTextField();
        pricetxt = new javax.swing.JTextField();
        pyeartxt = new javax.swing.JTextField();
        savebtn = new javax.swing.JButton();
        closebtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(325, 125));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(638, 522));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel1.setText("Book_ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, -1));

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel2.setText("Book_Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, -1, -1));

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel3.setText("Publisher");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel4.setText("Price");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, -1, -1));

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel5.setText("publisher_year");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, -1, -1));

        bidtxt.setBackground(new java.awt.Color(51, 204, 255));
        bidtxt.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        bidtxt.setText(" ");
        getContentPane().add(bidtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 175, -1));

        bnametxt.setBackground(new java.awt.Color(51, 204, 255));
        bnametxt.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        bnametxt.setText(" ");
        getContentPane().add(bnametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 175, -1));

        publishtxt.setBackground(new java.awt.Color(51, 204, 255));
        publishtxt.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        publishtxt.setText(" ");
        getContentPane().add(publishtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 175, -1));

        pricetxt.setBackground(new java.awt.Color(51, 204, 255));
        pricetxt.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        pricetxt.setText(" ");
        getContentPane().add(pricetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 175, -1));

        pyeartxt.setBackground(new java.awt.Color(51, 204, 255));
        pyeartxt.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        pyeartxt.setText(" ");
        getContentPane().add(pyeartxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 175, -1));

        savebtn.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        savebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save.png"))); // NOI18N
        savebtn.setText("save");
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });
        getContentPane().add(savebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, -1, 44));

        closebtn.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        closebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cancel.png"))); // NOI18N
        closebtn.setText("close");
        closebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closebtnActionPerformed(evt);
            }
        });
        getContentPane().add(closebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, -1, 44));

        jLabel6.setBackground(new java.awt.Color(102, 102, 255));
        jLabel6.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setText("NEW BOOK ADD");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 140, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathilde-langevin-TFV9EPdYOaw-unsplash.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
        String bookid=bidtxt.getText();
        String bookname=bnametxt.getText();
        String publisher=publishtxt.getText();
        String price=pricetxt.getText();
        String publishy=pyeartxt.getText();
        try{
            Connection con=connection.con();
            Statement stmnt=con.createStatement();
            stmnt.executeUpdate("insert into book values('"+bookid+"','"+bookname+"','"+publisher+"','"+price+"','"+publishy+"')");
            JOptionPane.showMessageDialog(null, "one values inserted");
            setVisible(false);
            new newbook().setVisible(true);
            
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, "not inserted values");
            setVisible(false);
            new newbook().setVisible(true);
        
        }
    }//GEN-LAST:event_savebtnActionPerformed

    private void closebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closebtnActionPerformed
        setVisible(false);
    }//GEN-LAST:event_closebtnActionPerformed

     
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newbook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bidtxt;
    private javax.swing.JTextField bnametxt;
    private javax.swing.JButton closebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField pricetxt;
    private javax.swing.JTextField publishtxt;
    private javax.swing.JTextField pyeartxt;
    private javax.swing.JButton savebtn;
    // End of variables declaration//GEN-END:variables
}
