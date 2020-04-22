package JFrames;



import java.util.ArrayList;
import BackEnd.Carer;

import static JFrames.JFLogin.getConection;
import java.sql.Connection;
import java.sql.Date;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.Time;

import javax.swing.*;

public class JFCuidador extends javax.swing.JFrame {

    PreparedStatement ps;
    ResultSet sr;
    protected JFMenu menu;
    private String searchCarer;
    private int j;

    private void cleanBox() {
        carerNameField.setText(null);
        carerDirectionField.setText(null);
        carerStartDateField.setText(null);
        carerHourField.setText(null);
    }
    
    public JFCuidador() {
        initComponents();
    }

    public JFCuidador(JFMenu menu, ArrayList<Carer> carerList) {
        super();
        initComponents();
        setLocationRelativeTo(null);
        this.menu = menu;
        menu.carerList = carerList;
        searchCarer = "";
        j = 0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        carerPanel = new javax.swing.JPanel();
        carerTxt = new javax.swing.JLabel();
        carerGoBackButton = new javax.swing.JButton();
        carerSaveButton = new javax.swing.JButton();
        carerDeleteButton = new javax.swing.JButton();
        carerChangeButton = new javax.swing.JButton();
        carerSearchButton = new javax.swing.JButton();
        carerNameTxt = new javax.swing.JLabel();
        carerNameField = new javax.swing.JTextField();
        carerDirectionField = new javax.swing.JTextField();
        carerDirectionTxt = new javax.swing.JLabel();
        carerStartDateTxt = new javax.swing.JLabel();
        carerHourTxt = new javax.swing.JLabel();
        carerStartDateField = new javax.swing.JFormattedTextField();
        carerHourField = new javax.swing.JFormattedTextField();
        txtId = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        carerPanel.setBackground(new java.awt.Color(102, 204, 255));

        carerTxt.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        carerTxt.setForeground(new java.awt.Color(255, 255, 255));
        carerTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        carerTxt.setText("Cuidador");

        carerGoBackButton.setBackground(new java.awt.Color(102, 153, 255));
        carerGoBackButton.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        carerGoBackButton.setForeground(new java.awt.Color(255, 255, 255));
        carerGoBackButton.setText("Regresar");
        carerGoBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carerGoBackButtonActionPerformed(evt);
            }
        });

        carerSaveButton.setBackground(new java.awt.Color(102, 153, 255));
        carerSaveButton.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        carerSaveButton.setForeground(new java.awt.Color(255, 255, 255));
        carerSaveButton.setText("Guardar");
        carerSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carerSaveButtonActionPerformed(evt);
            }
        });

        carerDeleteButton.setBackground(new java.awt.Color(102, 153, 255));
        carerDeleteButton.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        carerDeleteButton.setForeground(new java.awt.Color(255, 255, 255));
        carerDeleteButton.setText("Eliminar");
        carerDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carerDeleteButtonActionPerformed(evt);
            }
        });

        carerChangeButton.setBackground(new java.awt.Color(102, 153, 255));
        carerChangeButton.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        carerChangeButton.setForeground(new java.awt.Color(255, 255, 255));
        carerChangeButton.setText("Modificar");
        carerChangeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carerChangeButtonActionPerformed(evt);
            }
        });

        carerSearchButton.setBackground(new java.awt.Color(102, 153, 255));
        carerSearchButton.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        carerSearchButton.setForeground(new java.awt.Color(255, 255, 255));
        carerSearchButton.setText("Buscar");
        carerSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carerSearchButtonActionPerformed(evt);
            }
        });

        carerNameTxt.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        carerNameTxt.setForeground(new java.awt.Color(255, 255, 255));
        carerNameTxt.setText("Nombre y Apellido");

        carerNameField.setBackground(new java.awt.Color(102, 153, 255));
        carerNameField.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        carerNameField.setForeground(new java.awt.Color(255, 255, 255));
        carerNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carerNameFieldActionPerformed(evt);
            }
        });

        carerDirectionField.setBackground(new java.awt.Color(102, 153, 255));
        carerDirectionField.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        carerDirectionField.setForeground(new java.awt.Color(255, 255, 255));

        carerDirectionTxt.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        carerDirectionTxt.setForeground(new java.awt.Color(255, 255, 255));
        carerDirectionTxt.setText("Dirección");

        carerStartDateTxt.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        carerStartDateTxt.setForeground(new java.awt.Color(255, 255, 255));
        carerStartDateTxt.setText("Fecha de Contratación");

        carerHourTxt.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        carerHourTxt.setForeground(new java.awt.Color(255, 255, 255));
        carerHourTxt.setText("Hora");

        carerStartDateField.setBackground(new java.awt.Color(102, 153, 255));
        carerStartDateField.setForeground(new java.awt.Color(255, 255, 255));
        try {
            carerStartDateField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        carerHourField.setBackground(new java.awt.Color(102, 153, 255));
        carerHourField.setForeground(new java.awt.Color(255, 255, 255));
        try {
            carerHourField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtId.setBackground(new java.awt.Color(102, 204, 255));
        txtId.setEnabled(false);

        jButton1.setText("Mostrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout carerPanelLayout = new javax.swing.GroupLayout(carerPanel);
        carerPanel.setLayout(carerPanelLayout);
        carerPanelLayout.setHorizontalGroup(
            carerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(carerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(carerGoBackButton)
                .addContainerGap(407, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, carerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(carerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(carerHourField, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carerHourTxt)
                    .addComponent(carerStartDateTxt)
                    .addGroup(carerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(carerPanelLayout.createSequentialGroup()
                            .addGroup(carerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(carerDirectionField, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(carerDirectionTxt)
                                .addComponent(carerNameTxt)
                                .addGroup(carerPanelLayout.createSequentialGroup()
                                    .addGroup(carerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButton1)
                                        .addGroup(carerPanelLayout.createSequentialGroup()
                                            .addComponent(carerSaveButton)
                                            .addGap(18, 18, 18)
                                            .addComponent(carerDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(18, 18, 18)
                                    .addComponent(carerChangeButton)))
                            .addGap(105, 105, 105))
                        .addGroup(carerPanelLayout.createSequentialGroup()
                            .addComponent(carerNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(carerSearchButton)
                            .addContainerGap()))
                    .addComponent(carerStartDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(carerPanelLayout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(carerTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        carerPanelLayout.setVerticalGroup(
            carerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(carerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(carerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carerTxt)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(carerNameTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(carerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(carerNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carerSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(carerDirectionTxt)
                .addGap(16, 16, 16)
                .addComponent(carerDirectionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(carerStartDateTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(carerStartDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(carerHourTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(carerHourField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(carerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carerSaveButton)
                    .addComponent(carerDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carerChangeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(carerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(carerGoBackButton)
                    .addComponent(jButton1))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(carerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(carerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void carerGoBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carerGoBackButtonActionPerformed
        this.dispose();
        menu.setVisible(true);
    }//GEN-LAST:event_carerGoBackButtonActionPerformed

    

    private void carerSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carerSaveButtonActionPerformed
        
        Connection con = null;
        try {
            con = getConection();
            ps = con.prepareStatement("INSERT INTO cuidador (nombre, direccionCuidador, inicioCuidador, horaCuidador) VALUES(?,?,?,?) ");
            ps.setString(1, carerNameField.getText());
            ps.setString(2, carerDirectionField.getText());
            ps.setDate(3,Date.valueOf(carerStartDateField.getText()));
            ps.setTime(4, Time.valueOf(carerHourField.getText()));
           

            int res = ps.executeUpdate();
            
            if(res > 0){
                JOptionPane.showMessageDialog(null, "Persona Guardada");
                cleanBox();
            } else {
                 JOptionPane.showMessageDialog(null, "Error al Guardar persona");
                 cleanBox();
            }
            
            con.close();
            
        } catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_carerSaveButtonActionPerformed

    private void carerDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carerDeleteButtonActionPerformed
        Connection con = null;
        try {
            con = getConection();
            ps = con.prepareStatement("DELETE FROM cuidador WHERE nombre=?");
            ps.setString(1, carerNameField.getText());
            

            int res = ps.executeUpdate();
            
            if(res > 0){
                JOptionPane.showMessageDialog(null, "Persona eliminada");
                cleanBox();
                carerSaveButton.setEnabled(true);
            } else {
                 JOptionPane.showMessageDialog(null, "Error al eliminar persona");
                 cleanBox();
                 carerSaveButton.setEnabled(true);
            }
            
            con.close();
            
        } catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_carerDeleteButtonActionPerformed

    private void carerChangeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carerChangeButtonActionPerformed
        Connection con = null;
        try {
            con = getConection();
            ps = con.prepareStatement("UPDATE cuidador SET nombre=?, direccionCuidador=?, inicioCuidador=? WHERE horaCuidador =?");
            ps.setString(1, carerNameField.getText());
            ps.setString(2, carerDirectionField.getText());
            ps.setDate(3,Date.valueOf(carerStartDateField.getText()));
            ps.setTime(4, Time.valueOf(carerHourField.getText()));
            

            int res = ps.executeUpdate();
            
            if(res > 0){
                JOptionPane.showMessageDialog(null, "Persona Modificada");
                cleanBox();
                carerSaveButton.setEnabled(true);
            } else {
                 JOptionPane.showMessageDialog(null, "Error al Modificar persona");
                 cleanBox();
                 carerSaveButton.setEnabled(true);
            }
            
            con.close();
            
        } catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_carerChangeButtonActionPerformed

    private void carerSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carerSearchButtonActionPerformed
        carerSaveButton.setEnabled(false);
        com.mysql.jdbc.Connection con = null;
        
        try{
            
            con = (com.mysql.jdbc.Connection) getConection();
            ps = con.prepareStatement("SELECT * FROM cuidador WHERE nombre = ?");
            ps.setString(1, carerNameField.getText());
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                
                carerNameField.setText(rs.getString("nombre"));
                carerDirectionField.setText(rs.getString("direccionCuidador"));
                carerStartDateField.setText(rs.getString("inicioCuidador"));
                carerHourField.setText(rs.getString("horaCuidador"));
                
            } else {
                JOptionPane.showMessageDialog(null, "No existe una persona con ese nombre");
            }
            
        } catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_carerSearchButtonActionPerformed

    private void carerNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carerNameFieldActionPerformed
        
    }//GEN-LAST:event_carerNameFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFMostrarCuidador mostrarCuidador = new JFMostrarCuidador();
        setLocationRelativeTo(null);        
        mostrarCuidador.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(JFCuidador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFCuidador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFCuidador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFCuidador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFCuidador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton carerChangeButton;
    private javax.swing.JButton carerDeleteButton;
    private javax.swing.JTextField carerDirectionField;
    private javax.swing.JLabel carerDirectionTxt;
    private javax.swing.JButton carerGoBackButton;
    private javax.swing.JFormattedTextField carerHourField;
    private javax.swing.JLabel carerHourTxt;
    private javax.swing.JTextField carerNameField;
    private javax.swing.JLabel carerNameTxt;
    private javax.swing.JPanel carerPanel;
    private javax.swing.JButton carerSaveButton;
    private javax.swing.JButton carerSearchButton;
    private javax.swing.JFormattedTextField carerStartDateField;
    private javax.swing.JLabel carerStartDateTxt;
    private javax.swing.JLabel carerTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}
