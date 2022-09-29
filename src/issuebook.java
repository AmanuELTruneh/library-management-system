 import java.sql.*;
import javax.swing.JOptionPane;
 import project.connection;
public class issuebook extends javax.swing.JFrame {

     
    public issuebook() {
        initComponents();
        bidtxt.setText("");
        studidtxt.setText("");
        issuetxt.setText("");
        returntxt.setText("");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Date = new javax.swing.JLabel();
        bidtxt = new javax.swing.JTextField();
        issuetxt = new javax.swing.JTextField();
        returntxt = new javax.swing.JTextField();
        issuebtn = new javax.swing.JButton();
        closebtn = new javax.swing.JButton();
        studidtxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathilde-langevin-TFV9EPdYOaw-unsplash.jpg"))); // NOI18N
        jLabel4.setText(" ");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(325, 125));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(642, 451));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel1.setText("Book ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, -1, -1));

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel2.setText("Student ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, -1, -1));

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel3.setText("Issue Date");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, -1, -1));

        Date.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        Date.setText("Return Date");
        getContentPane().add(Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, -1, -1));

        bidtxt.setBackground(new java.awt.Color(51, 255, 255));
        bidtxt.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        bidtxt.setText(" ");
        getContentPane().add(bidtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 172, -1));

        issuetxt.setBackground(new java.awt.Color(51, 255, 255));
        issuetxt.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        issuetxt.setText(" ");
        getContentPane().add(issuetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 172, -1));

        returntxt.setBackground(new java.awt.Color(51, 255, 255));
        returntxt.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        returntxt.setText(" ");
        getContentPane().add(returntxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 172, -1));

        issuebtn.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        issuebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/issue.png"))); // NOI18N
        issuebtn.setText("issue");
        issuebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issuebtnActionPerformed(evt);
            }
        });
        getContentPane().add(issuebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 130, 40));

        closebtn.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        closebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cancel.png"))); // NOI18N
        closebtn.setText("close");
        closebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closebtnActionPerformed(evt);
            }
        });
        getContentPane().add(closebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, -1, 40));

        studidtxt.setBackground(new java.awt.Color(51, 255, 255));
        studidtxt.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        studidtxt.setText(" ");
        getContentPane().add(studidtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 170, -1));

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(251, 51, 51));
        jLabel6.setText("ISSUE BOOK");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathilde-langevin-TFV9EPdYOaw-unsplash.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closebtnActionPerformed
         setVisible(false);
    }//GEN-LAST:event_closebtnActionPerformed

    private void issuebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issuebtnActionPerformed
                     
                        
                      
                       String bid=bidtxt.getText();        
                        String sid=studidtxt.getText();
                     String issuedate1=issuetxt.getText();
                       String returndate1=returntxt.getText();
                       String returnbook1="NO";  
                       
                       try{
                           Connection con=connection.con();
                           Statement stmnt=con.createStatement();
                       
                           ResultSet rs=stmnt.executeQuery(" select * from book1 where  bookid ='"+bidtxt.getText()+"'");
                                
                           if(rs.next())
                           {
                          
                                    ResultSet rs1=stmnt.executeQuery("select * from student where studentid='"+studidtxt.getText()+"'");
                                       if(rs1.next()){
                         stmnt.executeUpdate("insert into issue2 values('"+bid+"','"+sid+"','"+issuedate1+"','"+returndate1+"','"+returnbook1+"')");
                                  
                               JOptionPane.showMessageDialog(null, "succfully issued");
                                   setVisible(false);
                                   new issuebook().setVisible(true);
                                     }else{
                                         JOptionPane.showMessageDialog(null, "incorect STUDENTID ");
                                          setVisible(false);
                                   new issuebook().setVisible(true);
                                       } 
                               
                           }
                           else
                           {
                               JOptionPane.showConfirmDialog(this, "Incorect BOOKID ");
                               setVisible(false);
                                   new issuebook().setVisible(true);
                           }
                           
                       }catch(Exception e){
                            JOptionPane.showConfirmDialog(null, "connection error :"+e);
                            setVisible(false);
                                   new issuebook().setVisible(true);
                       }
    }//GEN-LAST:event_issuebtnActionPerformed

     
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new issuebook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Date;
    private javax.swing.JTextField bidtxt;
    private javax.swing.JButton closebtn;
    private javax.swing.JButton issuebtn;
    private javax.swing.JTextField issuetxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField returntxt;
    private javax.swing.JTextField studidtxt;
    // End of variables declaration//GEN-END:variables
}
