
package JFrames;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import BackEnd.Carer;
import BackEnd.Habitat;

public class JFCuidador extends javax.swing.JFrame {

    protected JFMenu menu;
    private String searchCarer;
    private int j;
    
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
        habitatGoBackButton = new javax.swing.JButton();
        habitatSaveButton = new javax.swing.JButton();
        habitatDeleteButton = new javax.swing.JButton();
        habitatChangeButton = new javax.swing.JButton();
        carerSearchButton = new javax.swing.JButton();
        carerNameTxt = new javax.swing.JLabel();
        carerNameField = new javax.swing.JTextField();
        carerDirectionField = new javax.swing.JTextField();
        carerDirectionTxt = new javax.swing.JLabel();
        carerStartDateTxt = new javax.swing.JLabel();
        carerStartDateFormattedTextField = new javax.swing.JFormattedTextField();
        carerHourTxt = new javax.swing.JLabel();
        carerHourFormattedTextField = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        carerPanel.setBackground(new java.awt.Color(102, 204, 255));

        carerTxt.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        carerTxt.setForeground(new java.awt.Color(255, 255, 255));
        carerTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        carerTxt.setText("Cuidador");

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
        carerNameTxt.setText("Nombre");

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

        carerStartDateFormattedTextField.setBackground(new java.awt.Color(102, 153, 255));
        carerStartDateFormattedTextField.setForeground(new java.awt.Color(255, 255, 255));
        carerStartDateFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        carerStartDateFormattedTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carerStartDateFormattedTextFieldActionPerformed(evt);
            }
        });

        carerHourTxt.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        carerHourTxt.setForeground(new java.awt.Color(255, 255, 255));
        carerHourTxt.setText("Hora");

        carerHourFormattedTextField.setBackground(new java.awt.Color(102, 153, 255));
        carerHourFormattedTextField.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout carerPanelLayout = new javax.swing.GroupLayout(carerPanel);
        carerPanel.setLayout(carerPanelLayout);
        carerPanelLayout.setHorizontalGroup(
            carerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(carerPanelLayout.createSequentialGroup()
                .addGroup(carerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, carerPanelLayout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(carerTxt))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, carerPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(habitatGoBackButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, carerPanelLayout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addGroup(carerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(carerHourTxt)
                    .addComponent(carerHourFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carerStartDateTxt)
                    .addComponent(carerStartDateFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(carerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(carerPanelLayout.createSequentialGroup()
                            .addGroup(carerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(carerDirectionField, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(carerDirectionTxt)
                                .addGroup(carerPanelLayout.createSequentialGroup()
                                    .addComponent(habitatSaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(habitatDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(habitatChangeButton))
                                .addComponent(carerNameTxt))
                            .addGap(105, 105, 105))
                        .addGroup(carerPanelLayout.createSequentialGroup()
                            .addComponent(carerNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(carerSearchButton)
                            .addContainerGap()))))
        );
        carerPanelLayout.setVerticalGroup(
            carerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(carerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(carerTxt)
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
                .addComponent(carerStartDateFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(carerHourTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(carerHourFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(carerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(habitatSaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(habitatDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(habitatChangeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(habitatGoBackButton)
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

    private void carerSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carerSearchButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carerSearchButtonActionPerformed

    private void carerNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carerNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carerNameFieldActionPerformed

    private void carerStartDateFormattedTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carerStartDateFormattedTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carerStartDateFormattedTextFieldActionPerformed

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
    private javax.swing.JTextField carerDirectionField;
    private javax.swing.JLabel carerDirectionTxt;
    private javax.swing.JFormattedTextField carerHourFormattedTextField;
    private javax.swing.JLabel carerHourTxt;
    private javax.swing.JTextField carerNameField;
    private javax.swing.JLabel carerNameTxt;
    private javax.swing.JPanel carerPanel;
    private javax.swing.JButton carerSearchButton;
    private javax.swing.JFormattedTextField carerStartDateFormattedTextField;
    private javax.swing.JLabel carerStartDateTxt;
    private javax.swing.JLabel carerTxt;
    private javax.swing.JButton habitatChangeButton;
    private javax.swing.JButton habitatDeleteButton;
    private javax.swing.JButton habitatGoBackButton;
    private javax.swing.JButton habitatSaveButton;
    // End of variables declaration//GEN-END:variables
}
