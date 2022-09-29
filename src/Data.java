import java.sql.*;
import project.connection;
import java.util.*;
import   java.net.*;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;//DOWNLOAD rs2xml.jar add into liberary
public class Data extends javax.swing.JFrame {

     
    public Data() {
        initComponents();
    }

     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        close = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(325, 125));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(700, 450));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(251, 51, 51));
        jLabel1.setText("Issue Book Deitals");
        jLabel1.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 11, -1, -1));

        jTable1.setBackground(new java.awt.Color(51, 204, 255));
        jTable1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 55, 640, 107));

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(251, 51, 51));
        jLabel2.setText("Return Book Deitals");
        jLabel2.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 202, -1, -1));

        jTable2.setBackground(new java.awt.Color(51, 204, 255));
        jTable2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 251, 640, 114));

        close.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cancel.png"))); // NOI18N
        close.setText("close");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, -1, 44));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathilde-langevin-TFV9EPdYOaw-unsplash.jpg"))); // NOI18N
        jLabel3.setText(" ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        try{
            Connection con=connection.con();
            Statement stmnt=con.createStatement();
            ResultSet rs=stmnt.executeQuery( 
            "select \n"+
             "issue2.studentid,\n" +
               "issue2.bookid,\n"+
               "issue2.returndate,\n"+                 
              "issue2.issuedate \n "+              
                    " from   issue2 where issue2.returnbook='NO' \n");                                        
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));        
            ResultSet rs1=stmnt.executeQuery( 
                     "select \n"+
             "issue2.studentid,\n" +
               "issue2.bookid,\n"+
               "issue2.returndate,\n"+               
              "issue2.issuedate \n "+              
                    " from   issue2 where issue2.returnbook='YES' \n");                     
             jTable2.setModel(DbUtils.resultSetToTableModel(rs1));
            }catch(Exception e)
            {
            JOptionPane.showMessageDialog(null, "connection error: "  +e);
            }
         
    }//GEN-LAST:event_formComponentShown

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        setVisible(false);
    }//GEN-LAST:event_closeActionPerformed

     
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Data().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
