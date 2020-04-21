
package JFrames;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import BackEnd.Zone;

public class JFZone extends javax.swing.JFrame {

    protected JFMenu menu;
    private String searchZone;
    private int j;
    
    public JFZone() {
        initComponents();
    }

    public JFZone(JFMenu menu, ArrayList<Zone> zoneList) {
        super();
        initComponents();
        setLocationRelativeTo(null);
        this.menu = menu;
        menu.zoneList = zoneList; 
        searchZone = "";
        j = 0;
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        zonaPanel = new javax.swing.JPanel();
        zonaTxt = new javax.swing.JLabel();
        zonaGoBackButton = new javax.swing.JButton();
        zonaSaveButton = new javax.swing.JButton();
        zonaDeleteButton = new javax.swing.JButton();
        zonaChangeButton = new javax.swing.JButton();
        zonaSearchButton = new javax.swing.JButton();
        zonaNameTxt = new javax.swing.JLabel();
        habitatNameField = new javax.swing.JTextField();
        zonaExtensionField = new javax.swing.JTextField();
        zonaExtensionTxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        zonaPanel.setBackground(new java.awt.Color(102, 204, 255));

        zonaTxt.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        zonaTxt.setForeground(new java.awt.Color(255, 255, 255));
        zonaTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        zonaTxt.setText("Zona");

        zonaGoBackButton.setBackground(new java.awt.Color(102, 153, 255));
        zonaGoBackButton.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        zonaGoBackButton.setForeground(new java.awt.Color(255, 255, 255));
        zonaGoBackButton.setText("Regresar");
        zonaGoBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zonaGoBackButtonActionPerformed(evt);
            }
        });

        zonaSaveButton.setBackground(new java.awt.Color(102, 153, 255));
        zonaSaveButton.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        zonaSaveButton.setForeground(new java.awt.Color(255, 255, 255));
        zonaSaveButton.setText("Guardar");
        zonaSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zonaSaveButtonActionPerformed(evt);
            }
        });

        zonaDeleteButton.setBackground(new java.awt.Color(102, 153, 255));
        zonaDeleteButton.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        zonaDeleteButton.setForeground(new java.awt.Color(255, 255, 255));
        zonaDeleteButton.setText("Eliminar");
        zonaDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zonaDeleteButtonActionPerformed(evt);
            }
        });

        zonaChangeButton.setBackground(new java.awt.Color(102, 153, 255));
        zonaChangeButton.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        zonaChangeButton.setForeground(new java.awt.Color(255, 255, 255));
        zonaChangeButton.setText("Modificar");
        zonaChangeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zonaChangeButtonActionPerformed(evt);
            }
        });

        zonaSearchButton.setBackground(new java.awt.Color(102, 153, 255));
        zonaSearchButton.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        zonaSearchButton.setForeground(new java.awt.Color(255, 255, 255));
        zonaSearchButton.setText("Buscar");
        zonaSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zonaSearchButtonActionPerformed(evt);
            }
        });

        zonaNameTxt.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        zonaNameTxt.setForeground(new java.awt.Color(255, 255, 255));
        zonaNameTxt.setText("Nombre");

        habitatNameField.setBackground(new java.awt.Color(102, 153, 255));
        habitatNameField.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        habitatNameField.setForeground(new java.awt.Color(255, 255, 255));
        habitatNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                habitatNameFieldActionPerformed(evt);
            }
        });

        zonaExtensionField.setBackground(new java.awt.Color(102, 153, 255));
        zonaExtensionField.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        zonaExtensionField.setForeground(new java.awt.Color(255, 255, 255));

        zonaExtensionTxt.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        zonaExtensionTxt.setForeground(new java.awt.Color(255, 255, 255));
        zonaExtensionTxt.setText("Extensión");

        javax.swing.GroupLayout zonaPanelLayout = new javax.swing.GroupLayout(zonaPanel);
        zonaPanel.setLayout(zonaPanelLayout);
        zonaPanelLayout.setHorizontalGroup(
            zonaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, zonaPanelLayout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addGroup(zonaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(zonaPanelLayout.createSequentialGroup()
                        .addGroup(zonaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(zonaExtensionField, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(zonaExtensionTxt)
                            .addGroup(zonaPanelLayout.createSequentialGroup()
                                .addComponent(zonaSaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(zonaDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(zonaChangeButton))
                            .addComponent(zonaNameTxt))
                        .addGap(105, 105, 105))
                    .addGroup(zonaPanelLayout.createSequentialGroup()
                        .addComponent(habitatNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(zonaSearchButton)
                        .addContainerGap())))
            .addGroup(zonaPanelLayout.createSequentialGroup()
                .addGroup(zonaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, zonaPanelLayout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(zonaTxt))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, zonaPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(zonaGoBackButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        zonaPanelLayout.setVerticalGroup(
            zonaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(zonaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(zonaTxt)
                .addGap(40, 40, 40)
                .addComponent(zonaNameTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(zonaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(habitatNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zonaSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addComponent(zonaExtensionTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(zonaExtensionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(zonaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zonaSaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zonaDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zonaChangeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(zonaGoBackButton)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(zonaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(zonaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void zonaGoBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zonaGoBackButtonActionPerformed
        this.dispose();
        menu.setVisible(true);
    }//GEN-LAST:event_zonaGoBackButtonActionPerformed

    private void zonaSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zonaSaveButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zonaSaveButtonActionPerformed

    private void zonaDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zonaDeleteButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zonaDeleteButtonActionPerformed

    private void zonaChangeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zonaChangeButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zonaChangeButtonActionPerformed

    private void zonaSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zonaSearchButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zonaSearchButtonActionPerformed

    private void habitatNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_habitatNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_habitatNameFieldActionPerformed

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
            java.util.logging.Logger.getLogger(JFZone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFZone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFZone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFZone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFZone().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField habitatNameField;
    private javax.swing.JButton zonaChangeButton;
    private javax.swing.JButton zonaDeleteButton;
    private javax.swing.JTextField zonaExtensionField;
    private javax.swing.JLabel zonaExtensionTxt;
    private javax.swing.JButton zonaGoBackButton;
    private javax.swing.JLabel zonaNameTxt;
    private javax.swing.JPanel zonaPanel;
    private javax.swing.JButton zonaSaveButton;
    private javax.swing.JButton zonaSearchButton;
    private javax.swing.JLabel zonaTxt;
    // End of variables declaration//GEN-END:variables
}
