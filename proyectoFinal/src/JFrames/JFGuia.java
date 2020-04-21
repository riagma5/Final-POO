package JFrames;

import java.sql.DriverManager;

import java.util.ArrayList;
import BackEnd.Guide;
import java.util.ArrayList;
import BackEnd.Carer;

import static JFrames.JFLogin.getConection;
import java.sql.Connection;
import java.sql.Date;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Time;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.*;

public class JFGuia extends javax.swing.JFrame {

    PreparedStatement ps;
    ResultSet sr;

    protected JFMenu menu;
    private String searchGuide;
    private int j;

    private void cleanBox() {
        guideNameField.setText(null);
        guiaDirectionField.setText(null);
        guiaPhoneField.setText(null);
        guiaStartDateFormattedTextField.setText(null);
        guiaHourFormattedTextField.setText(null);
    }

    public JFGuia() {
        initComponents();
    }

    public JFGuia(JFMenu menu, ArrayList<Guide> guideList) {
        super();
        initComponents();
        setLocationRelativeTo(null);
        this.menu = menu;
        menu.guideList = guideList;
        searchGuide = "";
        j = 0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        guiaPanel = new javax.swing.JPanel();
        habitatTxt = new javax.swing.JLabel();
        guideGoBackButton = new javax.swing.JButton();
        guideSaveButton = new javax.swing.JButton();
        guideDeleteButton = new javax.swing.JButton();
        guideChangeButton = new javax.swing.JButton();
        guiaSearchButton = new javax.swing.JButton();
        guiaNameTxt = new javax.swing.JLabel();
        guideNameField = new javax.swing.JTextField();
        guiaDirectionField = new javax.swing.JTextField();
        guiaDirectionTxt = new javax.swing.JLabel();
        guiaPhoneTxt = new javax.swing.JLabel();
        guiaPhoneField = new javax.swing.JTextField();
        guiaStartDateTxt = new javax.swing.JLabel();
        guiaStartDateFormattedTextField = new javax.swing.JFormattedTextField();
        guiaHourTxt = new javax.swing.JLabel();
        guiaHourFormattedTextField = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        guiaPanel.setBackground(new java.awt.Color(102, 204, 255));

        habitatTxt.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        habitatTxt.setForeground(new java.awt.Color(255, 255, 255));
        habitatTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        habitatTxt.setText("Guia");

        guideGoBackButton.setBackground(new java.awt.Color(102, 153, 255));
        guideGoBackButton.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        guideGoBackButton.setForeground(new java.awt.Color(255, 255, 255));
        guideGoBackButton.setText("Regresar");
        guideGoBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guideGoBackButtonActionPerformed(evt);
            }
        });

        guideSaveButton.setBackground(new java.awt.Color(102, 153, 255));
        guideSaveButton.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        guideSaveButton.setForeground(new java.awt.Color(255, 255, 255));
        guideSaveButton.setText("Guardar");
        guideSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guideSaveButtonActionPerformed(evt);
            }
        });

        guideDeleteButton.setBackground(new java.awt.Color(102, 153, 255));
        guideDeleteButton.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        guideDeleteButton.setForeground(new java.awt.Color(255, 255, 255));
        guideDeleteButton.setText("Eliminar");
        guideDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guideDeleteButtonActionPerformed(evt);
            }
        });

        guideChangeButton.setBackground(new java.awt.Color(102, 153, 255));
        guideChangeButton.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        guideChangeButton.setForeground(new java.awt.Color(255, 255, 255));
        guideChangeButton.setText("Modificar");
        guideChangeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guideChangeButtonActionPerformed(evt);
            }
        });

        guiaSearchButton.setBackground(new java.awt.Color(102, 153, 255));
        guiaSearchButton.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        guiaSearchButton.setForeground(new java.awt.Color(255, 255, 255));
        guiaSearchButton.setText("Buscar");
        guiaSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guiaSearchButtonActionPerformed(evt);
            }
        });

        guiaNameTxt.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        guiaNameTxt.setForeground(new java.awt.Color(255, 255, 255));
        guiaNameTxt.setText("Nombre y Apellido");

        guideNameField.setBackground(new java.awt.Color(102, 153, 255));
        guideNameField.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        guideNameField.setForeground(new java.awt.Color(255, 255, 255));
        guideNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guideNameFieldActionPerformed(evt);
            }
        });

        guiaDirectionField.setBackground(new java.awt.Color(102, 153, 255));
        guiaDirectionField.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        guiaDirectionField.setForeground(new java.awt.Color(255, 255, 255));

        guiaDirectionTxt.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        guiaDirectionTxt.setForeground(new java.awt.Color(255, 255, 255));
        guiaDirectionTxt.setText("Dirección");

        guiaPhoneTxt.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        guiaPhoneTxt.setForeground(new java.awt.Color(255, 255, 255));
        guiaPhoneTxt.setText("Teléfono");

        guiaPhoneField.setBackground(new java.awt.Color(102, 153, 255));
        guiaPhoneField.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        guiaPhoneField.setForeground(new java.awt.Color(255, 255, 255));

        guiaStartDateTxt.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        guiaStartDateTxt.setForeground(new java.awt.Color(255, 255, 255));
        guiaStartDateTxt.setText("Fecha de Contratación");

        guiaStartDateFormattedTextField.setBackground(new java.awt.Color(102, 153, 255));
        guiaStartDateFormattedTextField.setForeground(new java.awt.Color(255, 255, 255));
        try {
            guiaStartDateFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        guiaStartDateFormattedTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guiaStartDateFormattedTextFieldActionPerformed(evt);
            }
        });

        guiaHourTxt.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        guiaHourTxt.setForeground(new java.awt.Color(255, 255, 255));
        guiaHourTxt.setText("Hora");

        guiaHourFormattedTextField.setBackground(new java.awt.Color(102, 153, 255));
        guiaHourFormattedTextField.setForeground(new java.awt.Color(255, 255, 255));
        try {
            guiaHourFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        guiaHourFormattedTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guiaHourFormattedTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout guiaPanelLayout = new javax.swing.GroupLayout(guiaPanel);
        guiaPanel.setLayout(guiaPanelLayout);
        guiaPanelLayout.setHorizontalGroup(
            guiaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guiaPanelLayout.createSequentialGroup()
                .addGroup(guiaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, guiaPanelLayout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(habitatTxt))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, guiaPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(guideGoBackButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, guiaPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(guideSaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(guideDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(guideChangeButton)
                .addGap(108, 108, 108))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, guiaPanelLayout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addGroup(guiaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(guiaHourTxt)
                    .addComponent(guiaHourFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(guiaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(guiaPanelLayout.createSequentialGroup()
                            .addGroup(guiaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(guiaDirectionField, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(guiaDirectionTxt)
                                .addComponent(guiaPhoneTxt)
                                .addComponent(guiaPhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(guiaStartDateTxt)
                                .addComponent(guiaNameTxt))
                            .addGap(119, 119, 119))
                        .addGroup(guiaPanelLayout.createSequentialGroup()
                            .addGroup(guiaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(guiaPanelLayout.createSequentialGroup()
                                    .addComponent(guideNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(guiaSearchButton))
                                .addComponent(guiaStartDateFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addContainerGap()))))
        );
        guiaPanelLayout.setVerticalGroup(
            guiaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guiaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(habitatTxt)
                .addGap(40, 40, 40)
                .addComponent(guiaNameTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(guiaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(guideNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guiaSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(guiaDirectionTxt)
                .addGap(11, 11, 11)
                .addComponent(guiaDirectionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(guiaPhoneTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(guiaPhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(guiaStartDateTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(guiaStartDateFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(guiaHourTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(guiaHourFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(guiaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guideSaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guideDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guideChangeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(guideGoBackButton)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(guiaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(guiaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guideGoBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guideGoBackButtonActionPerformed
        this.dispose();
        menu.setVisible(true);
    }//GEN-LAST:event_guideGoBackButtonActionPerformed

    private void guideSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guideSaveButtonActionPerformed
        Connection con = null;
            
            try {
                con = getConection();
                ps = con.prepareStatement("INSERT INTO guia (nombre, direccion, telefono, start_date, horario) VALUES(?,?,?,?,?) ");
                ps.setString(1, guideNameField.getText());
                ps.setString(2, guiaDirectionField.getText());
                ps.setString(3, guiaPhoneField.getText());
                ps.setDate(4, Date.valueOf(guiaStartDateFormattedTextField.getText()));
                ps.setTime(5, Time.valueOf(guiaHourFormattedTextField.getText()));

                int res = ps.executeUpdate();

                if (res > 0) {
                    JOptionPane.showMessageDialog(null, "Persona Guardada");
                    cleanBox();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Guardar persona");
                    cleanBox();
                }
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(JFGuia.class.getName()).log(Level.SEVERE, null, ex);
            }

        
    }//GEN-LAST:event_guideSaveButtonActionPerformed

    private void guideDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guideDeleteButtonActionPerformed
        Connection con = null;
            
            try {
                con = getConection();
                ps = con.prepareStatement("DELETE FROM guia WHERE nombre=?");
                ps.setString(1, guideNameField.getText());
                

                int res = ps.executeUpdate();

                if (res > 0) {
                    JOptionPane.showMessageDialog(null, "Persona eliminada");
                    cleanBox();
                    guideSaveButton.setEnabled(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Error al eliminar persona");
                    cleanBox();
                    guideSaveButton.setEnabled(true);
                }
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(JFGuia.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_guideDeleteButtonActionPerformed

    private void guideChangeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guideChangeButtonActionPerformed
        Connection con = null;
            
            try {
                con = getConection();
                ps = con.prepareStatement("UPDATE guia SET nombre=?, direccion=?, telefono=?, start_date=? WHERE horario=? ");
                ps.setString(1, guideNameField.getText());
                ps.setString(2, guiaDirectionField.getText());
                ps.setString(3, guiaPhoneField.getText());
                ps.setDate(4, Date.valueOf(guiaStartDateFormattedTextField.getText()));
                ps.setTime(5, Time.valueOf(guiaHourFormattedTextField.getText()));

                int res = ps.executeUpdate();

                if (res > 0) {
                    JOptionPane.showMessageDialog(null, "Persona Modificada");
                    cleanBox();
                    guideSaveButton.setEnabled(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Error al modificar persona");
                    cleanBox();
                    guideSaveButton.setEnabled(true);
                }
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(JFGuia.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_guideChangeButtonActionPerformed

    private void guiaSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guiaSearchButtonActionPerformed
        guideSaveButton.setEnabled(false);
        com.mysql.jdbc.Connection con = null;
        
        try{
            
            con = (com.mysql.jdbc.Connection) getConection();
            ps = con.prepareStatement("SELECT * FROM guia WHERE nombre = ?");
            ps.setString(1, guideNameField.getText());
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                
                guideNameField.setText(rs.getString("nombre"));
                guiaDirectionField.setText(rs.getString("direccion"));
                guiaPhoneField.setText(rs.getString("telefono"));
                guiaStartDateFormattedTextField.setText(rs.getString("start_date"));
                guiaHourFormattedTextField.setText(rs.getString("horario"));
                
            } else {
                JOptionPane.showMessageDialog(null, "No existe una persona con ese nombre");
            }
            
        } catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_guiaSearchButtonActionPerformed

    private void guideNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guideNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guideNameFieldActionPerformed

    private void guiaStartDateFormattedTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guiaStartDateFormattedTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guiaStartDateFormattedTextFieldActionPerformed

    private void guiaHourFormattedTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guiaHourFormattedTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guiaHourFormattedTextFieldActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(JFGuia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFGuia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFGuia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFGuia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFGuia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField guiaDirectionField;
    private javax.swing.JLabel guiaDirectionTxt;
    private javax.swing.JFormattedTextField guiaHourFormattedTextField;
    private javax.swing.JLabel guiaHourTxt;
    private javax.swing.JLabel guiaNameTxt;
    private javax.swing.JPanel guiaPanel;
    private javax.swing.JTextField guiaPhoneField;
    private javax.swing.JLabel guiaPhoneTxt;
    private javax.swing.JButton guiaSearchButton;
    private javax.swing.JFormattedTextField guiaStartDateFormattedTextField;
    private javax.swing.JLabel guiaStartDateTxt;
    private javax.swing.JButton guideChangeButton;
    private javax.swing.JButton guideDeleteButton;
    private javax.swing.JButton guideGoBackButton;
    private javax.swing.JTextField guideNameField;
    private javax.swing.JButton guideSaveButton;
    private javax.swing.JLabel habitatTxt;
    // End of variables declaration//GEN-END:variables
}
