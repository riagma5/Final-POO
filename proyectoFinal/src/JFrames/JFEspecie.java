
package JFrames;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import BackEnd.Specie;
import static JFrames.JFLogin.getConection;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Time;

public class JFEspecie extends javax.swing.JFrame {
    PreparedStatement ps;
    ResultSet sr;
    
    protected JFMenu menu;
    private String searchSpecie;
    private int j;

    private void cleanBox() {
        especieNameField.setText(null);
        especieScientificNameField.setText(null);
        especieDescriptionField.setText(null);
        
    }
   
    public JFEspecie() {
        initComponents();
    }

    public JFEspecie(JFMenu menu, ArrayList<Specie> specieList) {
        super();
        initComponents();
        setLocationRelativeTo(null);
        this.menu = menu;
        menu.specieList = specieList; 
        searchSpecie = "";
        j = 0;
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        especiePanel = new javax.swing.JPanel();
        especieTxt = new javax.swing.JLabel();
        especieGoBackButton = new javax.swing.JButton();
        especieSaveButton = new javax.swing.JButton();
        especieDeleteButton = new javax.swing.JButton();
        especieChangeButton = new javax.swing.JButton();
        especieSearchButton = new javax.swing.JButton();
        especieNameTxt = new javax.swing.JLabel();
        especieNameField = new javax.swing.JTextField();
        especieScientificNameField = new javax.swing.JTextField();
        especieScientificNameTxt = new javax.swing.JLabel();
        especieDescriptionTxt = new javax.swing.JLabel();
        especieDescriptionField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        especiePanel.setBackground(new java.awt.Color(102, 204, 255));

        especieTxt.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        especieTxt.setForeground(new java.awt.Color(255, 255, 255));
        especieTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        especieTxt.setText("Especies");

        especieGoBackButton.setBackground(new java.awt.Color(102, 153, 255));
        especieGoBackButton.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        especieGoBackButton.setForeground(new java.awt.Color(255, 255, 255));
        especieGoBackButton.setText("Regresar");
        especieGoBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                especieGoBackButtonActionPerformed(evt);
            }
        });

        especieSaveButton.setBackground(new java.awt.Color(102, 153, 255));
        especieSaveButton.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        especieSaveButton.setForeground(new java.awt.Color(255, 255, 255));
        especieSaveButton.setText("Guardar");
        especieSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                especieSaveButtonActionPerformed(evt);
            }
        });

        especieDeleteButton.setBackground(new java.awt.Color(102, 153, 255));
        especieDeleteButton.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        especieDeleteButton.setForeground(new java.awt.Color(255, 255, 255));
        especieDeleteButton.setText("Eliminar");
        especieDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                especieDeleteButtonActionPerformed(evt);
            }
        });

        especieChangeButton.setBackground(new java.awt.Color(102, 153, 255));
        especieChangeButton.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        especieChangeButton.setForeground(new java.awt.Color(255, 255, 255));
        especieChangeButton.setText("Modificar");
        especieChangeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                especieChangeButtonActionPerformed(evt);
            }
        });

        especieSearchButton.setBackground(new java.awt.Color(102, 153, 255));
        especieSearchButton.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        especieSearchButton.setForeground(new java.awt.Color(255, 255, 255));
        especieSearchButton.setText("Buscar");
        especieSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                especieSearchButtonActionPerformed(evt);
            }
        });

        especieNameTxt.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        especieNameTxt.setForeground(new java.awt.Color(255, 255, 255));
        especieNameTxt.setText("Nombre");

        especieNameField.setBackground(new java.awt.Color(102, 153, 255));
        especieNameField.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        especieNameField.setForeground(new java.awt.Color(255, 255, 255));
        especieNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                especieNameFieldActionPerformed(evt);
            }
        });

        especieScientificNameField.setBackground(new java.awt.Color(102, 153, 255));
        especieScientificNameField.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        especieScientificNameField.setForeground(new java.awt.Color(255, 255, 255));

        especieScientificNameTxt.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        especieScientificNameTxt.setForeground(new java.awt.Color(255, 255, 255));
        especieScientificNameTxt.setText("Nombre Científico");

        especieDescriptionTxt.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        especieDescriptionTxt.setForeground(new java.awt.Color(255, 255, 255));
        especieDescriptionTxt.setText("Descripción");

        especieDescriptionField.setBackground(new java.awt.Color(102, 153, 255));
        especieDescriptionField.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        especieDescriptionField.setForeground(new java.awt.Color(255, 255, 255));

        jButton1.setText("Mostrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout especiePanelLayout = new javax.swing.GroupLayout(especiePanel);
        especiePanel.setLayout(especiePanelLayout);
        especiePanelLayout.setHorizontalGroup(
            especiePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, especiePanelLayout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addGroup(especiePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(especiePanelLayout.createSequentialGroup()
                        .addGroup(especiePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(especieScientificNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(especieScientificNameTxt)
                            .addComponent(especieDescriptionTxt)
                            .addComponent(especieDescriptionField, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(especieNameTxt)
                            .addGroup(especiePanelLayout.createSequentialGroup()
                                .addComponent(especieSaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(especiePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1)
                                    .addGroup(especiePanelLayout.createSequentialGroup()
                                        .addComponent(especieDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(especieChangeButton)))))
                        .addGap(105, 105, 105))
                    .addGroup(especiePanelLayout.createSequentialGroup()
                        .addComponent(especieNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(especieSearchButton)
                        .addContainerGap())))
            .addGroup(especiePanelLayout.createSequentialGroup()
                .addGroup(especiePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, especiePanelLayout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(especieTxt))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, especiePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(especieGoBackButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        especiePanelLayout.setVerticalGroup(
            especiePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(especiePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(especieTxt)
                .addGap(40, 40, 40)
                .addComponent(especieNameTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(especiePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(especieNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(especieSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(especieScientificNameTxt)
                .addGap(11, 11, 11)
                .addComponent(especieScientificNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(especieDescriptionTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(especieDescriptionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(especiePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(especieSaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(especieDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(especieChangeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(especiePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(especieGoBackButton)
                    .addComponent(jButton1))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(especiePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(especiePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void especieGoBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_especieGoBackButtonActionPerformed
        this.dispose();
        menu.setVisible(true);
    }//GEN-LAST:event_especieGoBackButtonActionPerformed

    private void especieSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_especieSaveButtonActionPerformed
        Connection con = null;
        try {
            con = getConection();
            ps = con.prepareStatement("INSERT INTO especie (nombreEspanol, nombreCientifico, descripcion) VALUES(?,?,?) ");
            ps.setString(1, especieNameField.getText());
            ps.setString(2, especieScientificNameField.getText());
            ps.setString(3, especieDescriptionField.getText());
           

            int res = ps.executeUpdate();
            
            if(res > 0){
                JOptionPane.showMessageDialog(null, "Especie Guardada");
                cleanBox();
            } else {
                 JOptionPane.showMessageDialog(null, "Error al Guardar especie");
                 cleanBox();
            }
            
            con.close();
            
        } catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_especieSaveButtonActionPerformed

    private void especieDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_especieDeleteButtonActionPerformed
         Connection con = null;
        try {
            con = getConection();
            ps = con.prepareStatement("DELETE FROM especie WHERE nombreEspanol=?");
            ps.setString(1, especieNameField.getText());
            
           

            int res = ps.executeUpdate();
            
            if(res > 0){
                JOptionPane.showMessageDialog(null, "Especie eliminada");
                cleanBox();
                especieSaveButton.setEnabled(true);
            } else {
                 JOptionPane.showMessageDialog(null, "Error al eliminar especie");
                 cleanBox();
                 especieSaveButton.setEnabled(true);
            }
            
            con.close();
            
        } catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_especieDeleteButtonActionPerformed

    private void especieChangeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_especieChangeButtonActionPerformed
        Connection con = null;
        try {
            con = getConection();
            ps = con.prepareStatement("UPDATE especie SET nombreEspanol=?, nombreCientifico=? WHERE descripcion=?");
            ps.setString(1, especieNameField.getText());
            ps.setString(2, especieScientificNameField.getText());
            ps.setString(3, especieDescriptionField.getText());
           

            int res = ps.executeUpdate();
            
            if(res > 0){
                JOptionPane.showMessageDialog(null, "Especie modificada");
                cleanBox();
                especieSaveButton.setEnabled(true);
            } else {
                 JOptionPane.showMessageDialog(null, "Error al modificar especie");
                 cleanBox();
                 especieSaveButton.setEnabled(true);
            }
            
            con.close();
            
        } catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_especieChangeButtonActionPerformed

    private void especieSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_especieSearchButtonActionPerformed
         especieSaveButton.setEnabled(false);
        Connection con = null;
        
        try{
            
            con = (com.mysql.jdbc.Connection) getConection();
            ps = con.prepareStatement("SELECT * FROM especie WHERE nombreEspanol = ?");
            ps.setString(1, especieNameField.getText());
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                
                especieNameField.setText(rs.getString("nombreEspanol"));
                especieScientificNameField.setText(rs.getString("nombreCientifico"));
                especieDescriptionField.setText(rs.getString("descripcion"));
                
                
            } else {
                JOptionPane.showMessageDialog(null, "No existe una especie con este nombre");
            }
            
        } catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_especieSearchButtonActionPerformed

    private void especieNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_especieNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_especieNameFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFMostrarEspecie mostrarEspecie = new JFMostrarEspecie();
        setLocationRelativeTo(null);        
        mostrarEspecie.setVisible(true);
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
            java.util.logging.Logger.getLogger(JFEspecie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFEspecie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFEspecie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFEspecie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFEspecie().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton especieChangeButton;
    private javax.swing.JButton especieDeleteButton;
    private javax.swing.JTextField especieDescriptionField;
    private javax.swing.JLabel especieDescriptionTxt;
    private javax.swing.JButton especieGoBackButton;
    private javax.swing.JTextField especieNameField;
    private javax.swing.JLabel especieNameTxt;
    private javax.swing.JPanel especiePanel;
    private javax.swing.JButton especieSaveButton;
    private javax.swing.JTextField especieScientificNameField;
    private javax.swing.JLabel especieScientificNameTxt;
    private javax.swing.JButton especieSearchButton;
    private javax.swing.JLabel especieTxt;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
