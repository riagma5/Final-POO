
package JFrames;

import javax.swing.JOptionPane;
import SQL.Connection;


public class JFHabitat extends javax.swing.JFrame {

    protected JFMenu menu;

    public JFHabitat(){
        initComponents();
    }
    
    public JFHabitat(JFMenu menu) {
        super();
        initComponents();
        setLocationRelativeTo(null);
        this.menu = menu;
    }
    
    private void cleanField(){
        habitatNameField.setText(null);
        habitatWeatherField.setText(null);
        habitatVegetationField.setText(null);
        habitatContinentField.setText(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        habitatPanel = new javax.swing.JPanel();
        habitatTxt = new javax.swing.JLabel();
        habitatGoBackButton = new javax.swing.JButton();
        habitatSaveButton = new javax.swing.JButton();
        habitatDeleteButton = new javax.swing.JButton();
        habitatChangeButton = new javax.swing.JButton();
        habitatSearchButton = new javax.swing.JButton();
        habitatNameTxt = new javax.swing.JLabel();
        habitatNameField = new javax.swing.JTextField();
        habitatWeatherField = new javax.swing.JTextField();
        habitatWeatherTxt = new javax.swing.JLabel();
        habitatVegetationTxt = new javax.swing.JLabel();
        habitatVegetationField = new javax.swing.JTextField();
        habitatContinentTxt1 = new javax.swing.JLabel();
        habitatContinentField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        habitatPanel.setBackground(new java.awt.Color(102, 204, 255));

        habitatTxt.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        habitatTxt.setForeground(new java.awt.Color(255, 255, 255));
        habitatTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        habitatTxt.setText("Habitat");

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

        habitatSearchButton.setBackground(new java.awt.Color(102, 153, 255));
        habitatSearchButton.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        habitatSearchButton.setForeground(new java.awt.Color(255, 255, 255));
        habitatSearchButton.setText("Buscar");
        habitatSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                habitatSearchButtonActionPerformed(evt);
            }
        });

        habitatNameTxt.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        habitatNameTxt.setForeground(new java.awt.Color(255, 255, 255));
        habitatNameTxt.setText("Nombre");

        habitatNameField.setBackground(new java.awt.Color(102, 153, 255));
        habitatNameField.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        habitatNameField.setForeground(new java.awt.Color(255, 255, 255));
        habitatNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                habitatNameFieldActionPerformed(evt);
            }
        });

        habitatWeatherField.setBackground(new java.awt.Color(102, 153, 255));
        habitatWeatherField.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        habitatWeatherField.setForeground(new java.awt.Color(255, 255, 255));
        habitatWeatherField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                habitatWeatherFieldActionPerformed(evt);
            }
        });

        habitatWeatherTxt.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        habitatWeatherTxt.setForeground(new java.awt.Color(255, 255, 255));
        habitatWeatherTxt.setText("Clima");

        habitatVegetationTxt.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        habitatVegetationTxt.setForeground(new java.awt.Color(255, 255, 255));
        habitatVegetationTxt.setText("Vegetación");

        habitatVegetationField.setBackground(new java.awt.Color(102, 153, 255));
        habitatVegetationField.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        habitatVegetationField.setForeground(new java.awt.Color(255, 255, 255));
        habitatVegetationField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                habitatVegetationFieldActionPerformed(evt);
            }
        });

        habitatContinentTxt1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        habitatContinentTxt1.setForeground(new java.awt.Color(255, 255, 255));
        habitatContinentTxt1.setText("Continente");

        habitatContinentField.setBackground(new java.awt.Color(102, 153, 255));
        habitatContinentField.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        habitatContinentField.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout habitatPanelLayout = new javax.swing.GroupLayout(habitatPanel);
        habitatPanel.setLayout(habitatPanelLayout);
        habitatPanelLayout.setHorizontalGroup(
            habitatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(habitatPanelLayout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addGroup(habitatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(habitatPanelLayout.createSequentialGroup()
                        .addGroup(habitatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(habitatWeatherField, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(habitatWeatherTxt)
                            .addComponent(habitatVegetationTxt)
                            .addComponent(habitatVegetationField, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(habitatContinentTxt1)
                            .addComponent(habitatContinentField, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(habitatNameTxt)
                            .addGroup(habitatPanelLayout.createSequentialGroup()
                                .addComponent(habitatSaveButton)
                                .addGap(20, 20, 20)
                                .addComponent(habitatDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(habitatChangeButton)))
                        .addGap(105, 105, 105))
                    .addGroup(habitatPanelLayout.createSequentialGroup()
                        .addComponent(habitatNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(habitatSearchButton)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, habitatPanelLayout.createSequentialGroup()
                .addGroup(habitatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, habitatPanelLayout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(habitatTxt))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, habitatPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(habitatGoBackButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        habitatPanelLayout.setVerticalGroup(
            habitatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(habitatPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(habitatTxt)
                .addGap(40, 40, 40)
                .addComponent(habitatNameTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(habitatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(habitatNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(habitatSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(habitatWeatherTxt)
                .addGap(11, 11, 11)
                .addComponent(habitatWeatherField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(habitatVegetationTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(habitatVegetationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(habitatContinentTxt1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(habitatContinentField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(habitatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
            .addComponent(habitatPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(habitatPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void habitatGoBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_habitatGoBackButtonActionPerformed
        this.dispose();
        menu.setVisible(true);
    }//GEN-LAST:event_habitatGoBackButtonActionPerformed
//For saving dates = ps.setString(x, Date.ValueOf(y.getText()));
//For saving dates = ps.setString(x, cbxGenero.getSelectedItem().toString());
    private void habitatSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_habitatSaveButtonActionPerformed
        Connection connect = null;
        try{
            connect = Connection.getConnection();
            Connection.rs = Connection.ps.executeQuery(
                    "INSERT INTO habitat (nombreHabitat, clima, vegetacion,"
                            + " continente) VALUES(?,?,?,?)");
            Connection.ps.setString(1, habitatNameField.getText());
            Connection.ps.setString(2, habitatWeatherField.getText());
            Connection.ps.setString(3, habitatVegetationField.getText());
            Connection.ps.setString(4, habitatContinentField.getText());
            
            int res = Connection.ps.executeUpdate();
            if(res > 0 ){
                JOptionPane.showMessageDialog(null, "Habitat guardado");
                cleanField();
            } else{
                JOptionPane.showMessageDialog(null, "Error al guardar Habitat");
                cleanField();
            }
            connect.ps.close();
            
        }catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_habitatSaveButtonActionPerformed

    private void habitatDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_habitatDeleteButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_habitatDeleteButtonActionPerformed

    private void habitatChangeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_habitatChangeButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_habitatChangeButtonActionPerformed

    private void habitatSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_habitatSearchButtonActionPerformed
        
        /*Connection connect = null;
        try{
            connect = Connection.getConnection();
            connect.ps = connect.preprareStatement(
                    "Select * FROM habitat WHERE habitatId=");
            
  
        } catch(Exception e){
            System.err.println(e);
        }
        */
    }//GEN-LAST:event_habitatSearchButtonActionPerformed

    private void habitatNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_habitatNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_habitatNameFieldActionPerformed

    private void habitatWeatherFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_habitatWeatherFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_habitatWeatherFieldActionPerformed

    private void habitatVegetationFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_habitatVegetationFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_habitatVegetationFieldActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFHabitat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFHabitat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFHabitat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFHabitat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFHabitat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton habitatChangeButton;
    private javax.swing.JTextField habitatContinentField;
    private javax.swing.JLabel habitatContinentTxt1;
    private javax.swing.JButton habitatDeleteButton;
    private javax.swing.JButton habitatGoBackButton;
    private javax.swing.JTextField habitatNameField;
    private javax.swing.JLabel habitatNameTxt;
    private javax.swing.JPanel habitatPanel;
    private javax.swing.JButton habitatSaveButton;
    private javax.swing.JButton habitatSearchButton;
    private javax.swing.JLabel habitatTxt;
    private javax.swing.JTextField habitatVegetationField;
    private javax.swing.JLabel habitatVegetationTxt;
    private javax.swing.JTextField habitatWeatherField;
    private javax.swing.JLabel habitatWeatherTxt;
    // End of variables declaration//GEN-END:variables
}
