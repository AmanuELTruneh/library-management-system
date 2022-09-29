 import java.sql.*;
import javax.swing.JOptionPane;
 import project.connection;
public class newstudent extends javax.swing.JFrame {

     
    public newstudent() {
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
        sidtxt = new javax.swing.JTextField();
        nametxt = new javax.swing.JTextField();
        fnametxt = new javax.swing.JTextField();
        cboxcname = new javax.swing.JComboBox<>();
        comboxbranchn = new javax.swing.JComboBox<>();
        savebtn = new javax.swing.JButton();
        closebtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(325, 125));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(629, 460));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setText("Student_ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setText("Father Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setText("Course Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, -1, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setText("Branch Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, -1, -1));

        sidtxt.setBackground(new java.awt.Color(51, 204, 255));
        sidtxt.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        getContentPane().add(sidtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 179, -1));

        nametxt.setBackground(new java.awt.Color(51, 204, 255));
        nametxt.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        getContentPane().add(nametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 179, -1));

        fnametxt.setBackground(new java.awt.Color(51, 204, 255));
        fnametxt.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        fnametxt.setText(" ");
        getContentPane().add(fnametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 179, -1));

        cboxcname.setBackground(new java.awt.Color(51, 204, 255));
        cboxcname.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        cboxcname.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DLD", "Materia", "INtroductionSw", "l", " " }));
        getContentPane().add(cboxcname, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 179, -1));

        comboxbranchn.setBackground(new java.awt.Color(51, 204, 255));
        comboxbranchn.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        comboxbranchn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Electrical", "IT", "SoftWare", "Mechanical", "Civi", "Cotml", "Economics", " ", " " }));
        getContentPane().add(comboxbranchn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 179, -1));

        savebtn.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        savebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save.png"))); // NOI18N
        savebtn.setText("save");
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });
        getContentPane().add(savebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, -1, 50));

        closebtn.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        closebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cancel.png"))); // NOI18N
        closebtn.setText("close");
        closebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closebtnActionPerformed(evt);
            }
        });
        getContentPane().add(closebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, -1, 50));

        jLabel6.setBackground(new java.awt.Color(153, 255, 255));
        jLabel6.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setText("NEW STUDENT ADD");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 140, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathilde-langevin-TFV9EPdYOaw-unsplash.jpg"))); // NOI18N
        jLabel8.setText(" ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
         String studentid=sidtxt.getText();
         String sname=nametxt.getText();
         String sfname=fnametxt.getText();
         String coursename=(String)cboxcname.getSelectedItem();
         String branchname=(String)comboxbranchn.getSelectedItem();
         try{
             Connection con=connection.con();
             Statement stmnt=con.createStatement();
             stmnt.executeUpdate(" insert into student values('"+studentid+"','"+sname+"','"+sfname+"','"+coursename+"','"+branchname+"')");
             JOptionPane.showMessageDialog(this, "one value inserted");
              setVisible(false);
              new newstudent().setVisible(true);
         }catch(Exception e){
        JOptionPane.showMessageDialog(this, " not inserted ");
             setVisible(false);
             new newstudent().setVisible(true);
         }
    }//GEN-LAST:event_savebtnActionPerformed

    private void closebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closebtnActionPerformed
        setVisible(false);
    }//GEN-LAST:event_closebtnActionPerformed

     
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newstudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboxcname;
    private javax.swing.JButton closebtn;
    private javax.swing.JComboBox<String> comboxbranchn;
    private javax.swing.JTextField fnametxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField nametxt;
    private javax.swing.JButton savebtn;
    private javax.swing.JTextField sidtxt;
    // End of variables declaration//GEN-END:variables
}
