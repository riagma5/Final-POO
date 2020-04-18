
package JFrames;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import BackEnd.Habitat;

public class JFHabitat extends javax.swing.JFrame {

    protected JFMenu menu;
    private String searchHabitat;
    private int j;

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

        Registro = new javax.swing.JFrame();
        registerPanel = new javax.swing.JPanel();
        registerTxt = new javax.swing.JLabel();
        RegisterGoBack_button = new javax.swing.JButton();
        registerOK_button = new javax.swing.JButton();
        registerWeatherField = new javax.swing.JTextField();
        registerVegetationField = new javax.swing.JTextField();
        registerContinentField = new javax.swing.JTextField();
        registerNameField = new javax.swing.JTextField();
        registerNameTxt = new javax.swing.JLabel();
        registerWeatherTxt = new javax.swing.JLabel();
        registerVegetationTxt = new javax.swing.JLabel();
        registerContinentTxt = new javax.swing.JLabel();
        habitatPanel = new javax.swing.JPanel();
        habitatTxt = new javax.swing.JLabel();
        habitatRegister_Button = new javax.swing.JButton();
        habitatShow_Button = new javax.swing.JButton();
        habitatModify_Button = new javax.swing.JButton();
        habitatDelete_Button = new javax.swing.JButton();
        habitatSearch_Button = new javax.swing.JButton();
        habitatGoBack_Button = new javax.swing.JButton();

        Registro.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        registerPanel.setBackground(new java.awt.Color(102, 204, 255));

        registerTxt.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        registerTxt.setForeground(new java.awt.Color(255, 255, 255));
        registerTxt.setText("Registro");

        RegisterGoBack_button.setBackground(new java.awt.Color(102, 153, 255));
        RegisterGoBack_button.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        RegisterGoBack_button.setForeground(new java.awt.Color(255, 255, 255));
        RegisterGoBack_button.setText("Regresar");
        RegisterGoBack_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterGoBack_buttonActionPerformed(evt);
            }
        });

        registerOK_button.setBackground(new java.awt.Color(102, 153, 255));
        registerOK_button.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        registerOK_button.setForeground(new java.awt.Color(255, 255, 255));
        registerOK_button.setText("OK");
        registerOK_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerOK_buttonActionPerformed(evt);
            }
        });

        registerWeatherField.setBackground(new java.awt.Color(102, 153, 255));
        registerWeatherField.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        registerWeatherField.setForeground(new java.awt.Color(255, 255, 255));

        registerVegetationField.setBackground(new java.awt.Color(102, 153, 255));
        registerVegetationField.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        registerVegetationField.setForeground(new java.awt.Color(255, 255, 255));

        registerContinentField.setBackground(new java.awt.Color(102, 153, 255));
        registerContinentField.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        registerContinentField.setForeground(new java.awt.Color(255, 255, 255));

        registerNameField.setBackground(new java.awt.Color(102, 153, 255));
        registerNameField.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        registerNameField.setForeground(new java.awt.Color(255, 255, 255));

        registerNameTxt.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        registerNameTxt.setForeground(new java.awt.Color(255, 255, 255));
        registerNameTxt.setText("Nombre");

        registerWeatherTxt.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        registerWeatherTxt.setForeground(new java.awt.Color(255, 255, 255));
        registerWeatherTxt.setText("Clima");

        registerVegetationTxt.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        registerVegetationTxt.setForeground(new java.awt.Color(255, 255, 255));
        registerVegetationTxt.setText("Vegetación");

        registerContinentTxt.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        registerContinentTxt.setForeground(new java.awt.Color(255, 255, 255));
        registerContinentTxt.setText("Continente");

        javax.swing.GroupLayout registerPanelLayout = new javax.swing.GroupLayout(registerPanel);
        registerPanel.setLayout(registerPanelLayout);
        registerPanelLayout.setHorizontalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addComponent(RegisterGoBack_button)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerPanelLayout.createSequentialGroup()
                        .addGap(0, 138, Short.MAX_VALUE)
                        .addComponent(registerTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122))))
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(registerContinentTxt)
                    .addComponent(registerVegetationTxt)
                    .addComponent(registerWeatherTxt)
                    .addComponent(registerNameTxt)
                    .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(registerNameField)
                        .addComponent(registerWeatherField)
                        .addComponent(registerVegetationField)
                        .addComponent(registerContinentField, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(registerOK_button)
                .addGap(166, 166, 166))
        );
        registerPanelLayout.setVerticalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(registerTxt)
                .addGap(15, 15, 15)
                .addComponent(registerNameTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(registerWeatherTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerWeatherField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(registerVegetationTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerVegetationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(registerContinentTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerContinentField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(registerOK_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RegisterGoBack_button)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout RegistroLayout = new javax.swing.GroupLayout(Registro.getContentPane());
        Registro.getContentPane().setLayout(RegistroLayout);
        RegistroLayout.setHorizontalGroup(
            RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        RegistroLayout.setVerticalGroup(
            RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistroLayout.createSequentialGroup()
                .addComponent(registerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        habitatPanel.setBackground(new java.awt.Color(102, 204, 255));

        habitatTxt.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        habitatTxt.setForeground(new java.awt.Color(255, 255, 255));
        habitatTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        habitatTxt.setText("Habitat");

        habitatRegister_Button.setBackground(new java.awt.Color(102, 153, 255));
        habitatRegister_Button.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        habitatRegister_Button.setForeground(new java.awt.Color(255, 255, 255));
        habitatRegister_Button.setText("Registro");
        habitatRegister_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                habitatRegister_ButtonActionPerformed(evt);
            }
        });

        habitatShow_Button.setBackground(new java.awt.Color(102, 153, 255));
        habitatShow_Button.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        habitatShow_Button.setForeground(new java.awt.Color(255, 255, 255));
        habitatShow_Button.setText("Mostrar");

        habitatModify_Button.setBackground(new java.awt.Color(102, 153, 255));
        habitatModify_Button.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        habitatModify_Button.setForeground(new java.awt.Color(255, 255, 255));
        habitatModify_Button.setText("Modificar");

        habitatDelete_Button.setBackground(new java.awt.Color(102, 153, 255));
        habitatDelete_Button.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        habitatDelete_Button.setForeground(new java.awt.Color(255, 255, 255));
        habitatDelete_Button.setText("Borrar");

        habitatSearch_Button.setBackground(new java.awt.Color(102, 153, 255));
        habitatSearch_Button.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        habitatSearch_Button.setForeground(new java.awt.Color(255, 255, 255));
        habitatSearch_Button.setText("Buscar");

        habitatGoBack_Button.setBackground(new java.awt.Color(102, 153, 255));
        habitatGoBack_Button.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        habitatGoBack_Button.setForeground(new java.awt.Color(255, 255, 255));
        habitatGoBack_Button.setText("Regresar");
        habitatGoBack_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                habitatGoBack_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout habitatPanelLayout = new javax.swing.GroupLayout(habitatPanel);
        habitatPanel.setLayout(habitatPanelLayout);
        habitatPanelLayout.setHorizontalGroup(
            habitatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(habitatPanelLayout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addGroup(habitatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(habitatTxt)
                    .addGroup(habitatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(habitatRegister_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(habitatShow_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(habitatModify_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(habitatDelete_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(habitatSearch_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(190, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, habitatPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(habitatGoBack_Button)
                .addGap(56, 56, 56))
        );
        habitatPanelLayout.setVerticalGroup(
            habitatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(habitatPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(habitatTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(habitatRegister_Button)
                .addGap(18, 18, 18)
                .addComponent(habitatShow_Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(habitatModify_Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(habitatDelete_Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(habitatSearch_Button)
                .addGap(35, 35, 35)
                .addComponent(habitatGoBack_Button)
                .addGap(57, 57, 57))
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

    private void habitatGoBack_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_habitatGoBack_ButtonActionPerformed
        this.dispose();
        menu.setVisible(true);
    }//GEN-LAST:event_habitatGoBack_ButtonActionPerformed

    private void habitatRegister_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_habitatRegister_ButtonActionPerformed
        Registro.setLocationRelativeTo(null);
        Registro.setVisible(true);
        Registro.setSize(399, 433);
        dispose();

    }//GEN-LAST:event_habitatRegister_ButtonActionPerformed

    private void registerOK_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerOK_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerOK_buttonActionPerformed

    private void RegisterGoBack_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterGoBack_buttonActionPerformed
        Registro.setVisible(false);
        this.setVisible(true);
        
    }//GEN-LAST:event_RegisterGoBack_buttonActionPerformed

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
    private javax.swing.JButton RegisterGoBack_button;
    private javax.swing.JFrame Registro;
    private javax.swing.JButton habitatDelete_Button;
    private javax.swing.JButton habitatGoBack_Button;
    private javax.swing.JButton habitatModify_Button;
    private javax.swing.JPanel habitatPanel;
    private javax.swing.JButton habitatRegister_Button;
    private javax.swing.JButton habitatSearch_Button;
    private javax.swing.JButton habitatShow_Button;
    private javax.swing.JLabel habitatTxt;
    private javax.swing.JTextField registerContinentField;
    private javax.swing.JLabel registerContinentTxt;
    private javax.swing.JTextField registerNameField;
    private javax.swing.JLabel registerNameTxt;
    private javax.swing.JButton registerOK_button;
    private javax.swing.JPanel registerPanel;
    private javax.swing.JLabel registerTxt;
    private javax.swing.JTextField registerVegetationField;
    private javax.swing.JLabel registerVegetationTxt;
    private javax.swing.JTextField registerWeatherField;
    private javax.swing.JLabel registerWeatherTxt;
    // End of variables declaration//GEN-END:variables
}
