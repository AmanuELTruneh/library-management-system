
import javax.swing.JFrame;
import javax.swing.JOptionPane;

 
public class Login extends javax.swing.JFrame {

     
    public Login() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        untxt.setText(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        untxt = new javax.swing.JTextField();
        passtxt = new javax.swing.JPasswordField();
        loginbtn = new javax.swing.JButton();
        cancelbtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 51, 51));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 32, 130));
        jLabel1.setText("USER NAME");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, -1, -1));

        jLabel2.setBackground(new java.awt.Color(102, 255, 255));
        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 32, 130));
        jLabel2.setText("PASSWORD");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, -1, -1));

        untxt.setBackground(new java.awt.Color(51, 204, 255));
        untxt.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        untxt.setText(" ");
        getContentPane().add(untxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 270, 230, 40));

        passtxt.setBackground(new java.awt.Color(51, 204, 255));
        passtxt.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        getContentPane().add(passtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 320, 230, 40));

        loginbtn.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        loginbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login1.png"))); // NOI18N
        loginbtn.setText("Login");
        loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });
        getContentPane().add(loginbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 370, 133, 60));

        cancelbtn.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        cancelbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cancel.png"))); // NOI18N
        cancelbtn.setText("close");
        cancelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbtnActionPerformed(evt);
            }
        });
        getContentPane().add(cancelbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 370, -1, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pickawood-8SfXsep8EIA-unsplash.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-520, -1040, 3850, 6190));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnActionPerformed
     
     
      if(untxt.getText().equals("admin")&& passtxt.getText().equals("admin"))
              {   
      setVisible(false);
            new Home().setVisible(true);
              }     
            else{
            JOptionPane.showMessageDialog(this, "Enter corect name and password");
            untxt.setText("");
            passtxt.setText("");
                } 
    }//GEN-LAST:event_loginbtnActionPerformed

    private void cancelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_cancelbtnActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton loginbtn;
    private javax.swing.JPasswordField passtxt;
    private javax.swing.JTextField untxt;
    // End of variables declaration//GEN-END:variables
}
