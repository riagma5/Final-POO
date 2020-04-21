package JFrames;

import com.mysql.jdbc.Connection;
import java.awt.event.KeyEvent;
import java.sql.DriverManager;

import javax.swing.*;
import javax.swing.JOptionPane;

/**
 * @author Ricardo Aguilera Martin & Armando Del Rio
 * Started on 2020/04/14
 * Finished on 2020/04/21*
 */
public class JFLogin extends javax.swing.JFrame {
    //Data Base//
    public static final String  URL ="jdbc:mysql://localhost:3306/zoo";
    public static final String  USERNAME ="root";
    public static final String  PASSWORD ="root1234";
    private String usuario;
    private String contrasena;

    
    public static java.sql.Connection getConection(){
        java.sql.Connection con = null;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            con = (java.sql.Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Conexion exitosa");

        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }
    
    public JFLogin() {
        initComponents();
        setLocationRelativeTo(null);
        userField.setFocusable(true);
        
    }

    public void datos(String us, String pas) {
        usuario = "Admin";
        contrasena = "admin";
    }
    
    private void cleanField(){
        userField.setText("");
        passwordField.setText("");
    }
    
    private void validateData(){
        datos(usuario, contrasena);
            if (usuario.equals(userField.getText()) && contrasena.equals(passwordField.getText())) {
                getConection();
                JFMenu menu = new JFMenu();
                menu.setVisible(true);
                this.dispose();
            } else if (userField.getText().equals("") && passwordField.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Usuario y/o Contraseña estan vacios\nIngrese los por favor.");
                cleanField();
                userField.setFocusable(true);
            } else if (userField.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Usuario está vacio\nIngrese lo por favor.");
                cleanField();
                userField.setFocusable(true);
            } else if (passwordField.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Contraseña está vacio\nIngrese lo por favor.");
                cleanField();
                passwordField.setFocusable(true);
            } else if (userField.getText().compareTo(usuario) != 0 && passwordField.getText().compareTo(contrasena) != 0) {
                JOptionPane.showMessageDialog(this, "Usuario y/o Contraseña no válidos\nIngrese nuevamente.");
                cleanField();
                userField.setFocusable(true);
            } else if (userField.getText().compareTo(usuario) != 0) {
                JOptionPane.showMessageDialog(this, "Usuario no válido\nIngrese nuevamente.");
                cleanField();
                userField.setFocusable(true);
            } else if (passwordField.getText().compareTo(contrasena) != 0) {
                JOptionPane.showMessageDialog(this, "Contraseña no válida\nIngrese nuevamente.");
                cleanField();
                passwordField.setFocusable(true);
            }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginPanel = new javax.swing.JPanel();
        userTxt = new javax.swing.JLabel();
        passwordTxt = new javax.swing.JLabel();
        zooTxt = new javax.swing.JLabel();
        userField = new javax.swing.JTextField();
        exit_Button = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        login_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loginPanel.setBackground(new java.awt.Color(102, 204, 255));

        userTxt.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        userTxt.setForeground(new java.awt.Color(255, 255, 255));
        userTxt.setText("Usuario");

        passwordTxt.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        passwordTxt.setForeground(new java.awt.Color(255, 255, 255));
        passwordTxt.setText("Contraseña");

        zooTxt.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        zooTxt.setForeground(new java.awt.Color(255, 255, 255));
        zooTxt.setText("        Zoológico");

        userField.setBackground(new java.awt.Color(102, 153, 255));
        userField.setForeground(new java.awt.Color(255, 255, 255));

        exit_Button.setBackground(new java.awt.Color(102, 153, 255));
        exit_Button.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        exit_Button.setForeground(new java.awt.Color(255, 255, 255));
        exit_Button.setText("Salir");
        exit_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_ButtonActionPerformed(evt);
            }
        });

        passwordField.setBackground(new java.awt.Color(102, 153, 255));
        passwordField.setForeground(new java.awt.Color(255, 255, 255));
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        passwordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordFieldKeyPressed(evt);
            }
        });

        login_button.setBackground(new java.awt.Color(102, 153, 255));
        login_button.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        login_button.setForeground(new java.awt.Color(255, 255, 255));
        login_button.setText("Login");
        login_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passwordTxt)
                            .addComponent(userTxt)
                            .addComponent(userField)
                            .addComponent(zooTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                            .addComponent(passwordField)))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(exit_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(83, Short.MAX_VALUE))
            .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(loginPanelLayout.createSequentialGroup()
                    .addGap(155, 155, 155)
                    .addComponent(login_button, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(151, Short.MAX_VALUE)))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(zooTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(passwordTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(exit_Button))
            .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                    .addContainerGap(195, Short.MAX_VALUE)
                    .addComponent(login_button)
                    .addGap(36, 36, 36)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFieldKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
           validateData();
        }
    }//GEN-LAST:event_passwordFieldKeyPressed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void exit_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_ButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exit_ButtonActionPerformed

    private void login_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_buttonActionPerformed
        validateData();
    }//GEN-LAST:event_login_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit_Button;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JButton login_button;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordTxt;
    private javax.swing.JTextField userField;
    private javax.swing.JLabel userTxt;
    private javax.swing.JLabel zooTxt;
    // End of variables declaration//GEN-END:variables
}
