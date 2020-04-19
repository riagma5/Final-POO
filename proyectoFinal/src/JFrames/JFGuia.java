
package JFrames;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import BackEnd.Guide;
import BackEnd.Habitat;

public class JFGuia extends javax.swing.JFrame {

    protected JFMenu menu;
    private String searchGuide;
    private int j;
    
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
        habitatGoBackButton = new javax.swing.JButton();
        habitatSaveButton = new javax.swing.JButton();
        habitatDeleteButton = new javax.swing.JButton();
        habitatChangeButton = new javax.swing.JButton();
        guiaSearchButton = new javax.swing.JButton();
        guiaNameTxt = new javax.swing.JLabel();
        habitatNameField = new javax.swing.JTextField();
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

        habitatGoBackButton.setBackground(new java.awt.Color(102, 153, 255));
        habitatGoBackButton.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        habitatGoBackButton.setForeground(new java.awt.Color(255, 255, 255));
        habitatGoBackButton.setText("Regresar");
        habitatGoBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                habitatGoBackButtonActionPerformed(evt);
            }
        });

        habitatSaveButton.setBackground(new java.awt.Color(102, 153, 255));
        habitatSaveButton.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        habitatSaveButton.setForeground(new java.awt.Color(255, 255, 255));
        habitatSaveButton.setText("Guardar");
        habitatSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                habitatSaveButtonActionPerformed(evt);
            }
        });

        habitatDeleteButton.setBackground(new java.awt.Color(102, 153, 255));
        habitatDeleteButton.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        habitatDeleteButton.setForeground(new java.awt.Color(255, 255, 255));
        habitatDeleteButton.setText("Eliminar");
        habitatDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                habitatDeleteButtonActionPerformed(evt);
            }
        });

        habitatChangeButton.setBackground(new java.awt.Color(102, 153, 255));
        habitatChangeButton.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        habitatChangeButton.setForeground(new java.awt.Color(255, 255, 255));
        habitatChangeButton.setText("Modificar");
        habitatChangeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                habitatChangeButtonActionPerformed(evt);
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
        guiaNameTxt.setText("Nombre");

        habitatNameField.setBackground(new java.awt.Color(102, 153, 255));
        habitatNameField.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        habitatNameField.setForeground(new java.awt.Color(255, 255, 255));
        habitatNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                habitatNameFieldActionPerformed(evt);
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
        guiaStartDateFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
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
                        .addComponent(habitatGoBackButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, guiaPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(habitatSaveButton)
                .addGap(11, 11, 11)
                .addComponent(habitatDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(habitatChangeButton)
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
                                    .addComponent(habitatNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(habitatNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(habitatSaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(habitatDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(habitatChangeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(habitatGoBackButton)
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

    private void habitatGoBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_habitatGoBackButtonActionPerformed
        this.dispose();
        menu.setVisible(true);
    }//GEN-LAST:event_habitatGoBackButtonActionPerformed

    private void habitatSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_habitatSaveButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_habitatSaveButtonActionPerformed

    private void habitatDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_habitatDeleteButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_habitatDeleteButtonActionPerformed

    private void habitatChangeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_habitatChangeButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_habitatChangeButtonActionPerformed

    private void guiaSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guiaSearchButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guiaSearchButtonActionPerformed

    private void habitatNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_habitatNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_habitatNameFieldActionPerformed

    private void guiaStartDateFormattedTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guiaStartDateFormattedTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guiaStartDateFormattedTextFieldActionPerformed

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
    private javax.swing.JButton habitatChangeButton;
    private javax.swing.JButton habitatDeleteButton;
    private javax.swing.JButton habitatGoBackButton;
    private javax.swing.JTextField habitatNameField;
    private javax.swing.JButton habitatSaveButton;
    private javax.swing.JLabel habitatTxt;
    // End of variables declaration//GEN-END:variables
}
