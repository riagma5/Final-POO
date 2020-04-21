
package JFrames;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import BackEnd.Habitat;
import static JFrames.JFLogin.getConection;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;

public class JFHabitat extends javax.swing.JFrame {
    PreparedStatement ps;
    ResultSet sr;
    protected JFMenu menu;
    private String searchHabitat;
    private int j;

    
    private void cleanBox() {
        habitatNameField.setText(null);
        registerWeatherField1.setText(null);
        habitatVegetationField1.setText(null);
        habitatContinentField1.setText(null);
        
    }
    
    public JFHabitat(){
        initComponents();
    }
    
    public JFHabitat(JFMenu menu, ArrayList<Habitat> habitatList) {
        super();
        initComponents();
        setLocationRelativeTo(null);
        this.menu = menu;
        menu.habitatList = habitatList; 
        searchHabitat = "";
        j = 0;
    }
    
    protected int search(String dummy){ //searches value in list
        for(int i = 0; i < menu.habitatList.size(); i++){
            if(!menu.habitatList.contains(dummy)){
                searchHabitat =  menu.habitatList.get(i).getHabitatName();
                j = 1;
                break;
            } else {searchHabitat = ""; j = 0;}
        }
        JOptionPane.showMessageDialog(this, "Habitat inexistente");
        
        return j;
    }
    
    //adds values to list given values
    protected void addValues(String habitatName, String weather, 
            String vegetation, String continent){
        search(habitatName);
        if(searchHabitat.equals("")){
            int tempHabitatId = menu.habitatList.size() + 1;
            menu.habitatList
                    .add(new Habitat(tempHabitatId, habitatName,weather,vegetation,
                        continent));
        } else {
                JOptionPane.showMessageDialog(this, "El habitat ya existe");
        }
    }
    
    
    protected void deleteValues(String dummy){ //deletes value in list givent int
        search(dummy);
        if(searchHabitat.equals("")){
            menu.habitatList.remove(j);
        } else {
                JOptionPane.showMessageDialog(this, "El habitat no existe");
        }
    }
    
    protected void modifyValues(int dummy){ //modifies values in list given int
        
    }
    
    protected void showValues(){ //shows arraylist values in list
        
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
        registerWeatherField1 = new javax.swing.JTextField();
        habitatWeatherTxt = new javax.swing.JLabel();
        habitatVegetationTxt = new javax.swing.JLabel();
        habitatVegetationField1 = new javax.swing.JTextField();
        habitatContinentTxt1 = new javax.swing.JLabel();
        habitatContinentField1 = new javax.swing.JTextField();

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

        registerWeatherField1.setBackground(new java.awt.Color(102, 153, 255));
        registerWeatherField1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        registerWeatherField1.setForeground(new java.awt.Color(255, 255, 255));

        habitatWeatherTxt.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        habitatWeatherTxt.setForeground(new java.awt.Color(255, 255, 255));
        habitatWeatherTxt.setText("Clima");

        habitatVegetationTxt.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        habitatVegetationTxt.setForeground(new java.awt.Color(255, 255, 255));
        habitatVegetationTxt.setText("Vegetación");

        habitatVegetationField1.setBackground(new java.awt.Color(102, 153, 255));
        habitatVegetationField1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        habitatVegetationField1.setForeground(new java.awt.Color(255, 255, 255));

        habitatContinentTxt1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        habitatContinentTxt1.setForeground(new java.awt.Color(255, 255, 255));
        habitatContinentTxt1.setText("Continente");

        habitatContinentField1.setBackground(new java.awt.Color(102, 153, 255));
        habitatContinentField1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        habitatContinentField1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout habitatPanelLayout = new javax.swing.GroupLayout(habitatPanel);
        habitatPanel.setLayout(habitatPanelLayout);
        habitatPanelLayout.setHorizontalGroup(
            habitatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(habitatPanelLayout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addGroup(habitatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(habitatPanelLayout.createSequentialGroup()
                        .addGroup(habitatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(registerWeatherField1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(habitatWeatherTxt)
                            .addComponent(habitatVegetationTxt)
                            .addComponent(habitatVegetationField1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(habitatContinentTxt1)
                            .addComponent(habitatContinentField1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(habitatPanelLayout.createSequentialGroup()
                                .addComponent(habitatSaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(habitatDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(habitatChangeButton))
                            .addComponent(habitatNameTxt))
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
                .addComponent(registerWeatherField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(habitatVegetationTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(habitatVegetationField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(habitatContinentTxt1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(habitatContinentField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void habitatSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_habitatSaveButtonActionPerformed
        Connection con = null;
        try {
            con = getConection();
            ps = con.prepareStatement("INSERT INTO habitat (nombreHabitat, clima, vegetacion, continente) VALUES(?,?,?,?) ");
            ps.setString(1, habitatNameField.getText());
            ps.setString(2, registerWeatherField1.getText());
            ps.setString(3, habitatVegetationField1.getText());
            ps.setString(4, habitatContinentField1.getText());
            
           

            int res = ps.executeUpdate();
            
            if(res > 0){
                JOptionPane.showMessageDialog(null, "Habitat Guardada");
                cleanBox();
            } else {
                 JOptionPane.showMessageDialog(null, "Error al Guardar el Habitat");
                 cleanBox();
            }
            
            con.close();
            
        } catch(Exception e){
            System.out.println(e);
        }
    
    }//GEN-LAST:event_habitatSaveButtonActionPerformed

    private void habitatDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_habitatDeleteButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_habitatDeleteButtonActionPerformed

    private void habitatChangeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_habitatChangeButtonActionPerformed
       
        Connection con = null;
        try {
            con = getConection();
            ps = con.prepareStatement("UPDATE habitat SET nombreHabitat=?, clima=?, vegetacion=? WHERE continente=? ");
            ps.setString(1, habitatNameField.getText());
            ps.setString(2, registerWeatherField1.getText());
            ps.setString(3, habitatVegetationField1.getText());
            ps.setString(4, habitatContinentField1.getText());
            
           

            int res = ps.executeUpdate();
            
            if(res > 0){
                JOptionPane.showMessageDialog(null, "Habitat Modificada");
                cleanBox();
            } else {
                 JOptionPane.showMessageDialog(null, "Error al Guardar el modificada");
                 cleanBox();
            }
            
            con.close();
            
        } catch(Exception e){
            System.out.println(e);
        }
    
    }//GEN-LAST:event_habitatChangeButtonActionPerformed

    private void habitatSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_habitatSearchButtonActionPerformed
        com.mysql.jdbc.Connection con = null;
        
        try{
            
            con = (com.mysql.jdbc.Connection) getConection();
            ps = con.prepareStatement("SELECT * FROM habitat WHERE nombreHabitat = ?");
            ps.setString(1, habitatNameField.getText());
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                
                habitatNameField.setText(rs.getString("nombreHabitat"));
                registerWeatherField1.setText(rs.getString("clima"));
                habitatVegetationField1.setText(rs.getString("vegetacion"));
                habitatContinentField1.setText(rs.getString("continente"));
                
            } else {
                JOptionPane.showMessageDialog(null, "No existe una persona con la clave");
            }
            
        } catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_habitatSearchButtonActionPerformed

    private void habitatNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_habitatNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_habitatNameFieldActionPerformed

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
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFHabitat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton habitatChangeButton;
    private javax.swing.JTextField habitatContinentField1;
    private javax.swing.JLabel habitatContinentTxt1;
    private javax.swing.JButton habitatDeleteButton;
    private javax.swing.JButton habitatGoBackButton;
    private javax.swing.JTextField habitatNameField;
    private javax.swing.JLabel habitatNameTxt;
    private javax.swing.JPanel habitatPanel;
    private javax.swing.JButton habitatSaveButton;
    private javax.swing.JButton habitatSearchButton;
    private javax.swing.JLabel habitatTxt;
    private javax.swing.JTextField habitatVegetationField1;
    private javax.swing.JLabel habitatVegetationTxt;
    private javax.swing.JLabel habitatWeatherTxt;
    private javax.swing.JTextField registerWeatherField1;
    // End of variables declaration//GEN-END:variables
}
