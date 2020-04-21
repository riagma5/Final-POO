
package JFrames;
import javax.swing.*;
//import javax.swing.JOptionPane;
import java.util.ArrayList;
import BackEnd.Habitat;
import static JFrames.JFLogin.getConection;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import javax.swing.table.DefaultTableModel;

public class JFHabitat extends javax.swing.JFrame {
    PreparedStatement ps;
    ResultSet sr;
    protected JFMenu menu;
    ArrayList<Habitat> habitatList;
    Habitat habitat;
    
    private void cleanBox() {
        habitatNameField.setText(null);
        registerWeatherField1.setText(null);
        habitatVegetationField1.setText(null);
        habitatContinentField1.setText(null);
    }
    
    public JFHabitat(){ initComponents(); }
    
    public JFHabitat(JFMenu menu, ArrayList<Habitat> habitatList) {
        super();
        initComponents();
        setLocationRelativeTo(null);
        this.menu = menu;
        habitatList = new ArrayList<Habitat>();
        habitat = new Habitat();
    }
    
   
    
    public ArrayList<Habitat> showDataDB() {
        Connection con = null;

        try{
            con = (Connection)JFrames.JFLogin.getConection();
            ps = con.prepareStatement("SELECT * FROM habitat WHERE nombreHabitat = ?");
            
            Statement st = JFrames.JFLogin.getConection().createStatement();
            ResultSet rs = ps.executeQuery("Select * FROM habitat ");
            while(rs.next()){
                habitat.setId(Integer.parseInt(rs.getString("idHabitat")));
                habitat.setHabitatName(rs.getString("nombreHabitat"));
                habitat.setWeather(rs.getString("clima"));
                habitat.setVegetation(rs.getString("vegetacion"));
                habitat.setContinent(rs.getString("continente"));
                habitatList.add(new Habitat());
            }
            rs.close();
            st.close();
                   
        }catch(SQLException e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e);
        }
        return habitatList;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        table = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
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
        jButton1 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table.setViewportView(jTable1);

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

        jButton1.setText("Mostrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

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
                            .addComponent(habitatNameTxt)
                            .addGroup(habitatPanelLayout.createSequentialGroup()
                                .addComponent(habitatSaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
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
                        .addComponent(habitatGoBackButton)
                        .addGap(124, 124, 124)
                        .addComponent(jButton1)))
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
                .addGap(18, 18, 18)
                .addComponent(habitatContinentField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(habitatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(habitatSaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(habitatDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(habitatChangeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(habitatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(habitatGoBackButton)
                    .addComponent(jButton1))
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
        Connection con = null;
        try {
            con = getConection();
            ps = con.prepareStatement("DELETE FROM habitat WHERE nombreHabitat=?");
            ps.setString(1, habitatNameField.getText());
            
            
           

            int res = ps.executeUpdate();
            
            if(res > 0){
                JOptionPane.showMessageDialog(null, "Habitat eliminada");
                cleanBox();
                habitatSaveButton.setEnabled(true);
            } else {
                 JOptionPane.showMessageDialog(null, "Error al eliminar el modificada");
                 cleanBox();
                 habitatSaveButton.setEnabled(true);
            }
            
            con.close();
            
        } catch(Exception e){
            System.out.println(e);
        }
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
                habitatSaveButton.setEnabled(true);
            } else {
                 JOptionPane.showMessageDialog(null, "Error al Guardar el modificada");
                 cleanBox();
                 habitatSaveButton.setEnabled(true);
            }
            
            con.close();
            
        } catch(Exception e){
            System.out.println(e);
        }
    
    }//GEN-LAST:event_habitatChangeButtonActionPerformed

    private void habitatSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_habitatSearchButtonActionPerformed
        habitatSaveButton.setEnabled(false);
        Connection con = null;
        
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFMostrarHabitat mostrarHabitat = new JFMostrarHabitat();
        setLocationRelativeTo(null);        
        mostrarHabitat.setVisible(true);
                
                
    }//GEN-LAST:event_jButton1ActionPerformed
     /*private ArrayList<String> showMe(){
          Connection con = null;
          ArrayList<String> lista = new ArrayList<String>();
        try{
            
            con = (com.mysql.jdbc.Connection) getConection();
            ps = con.prepareStatement("SELECT * FROM habitat");
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                lista.add(
                rs.getString("idHabitat"),
                rs.getString("nombreHabitat"),
                rs.getString("clima"),
                rs.getString("vegetacion"),
                rs.getString("continente"));
            }
            
        } catch(Exception e){
            System.err.println(e);
        }
        return lista;
     }*/
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
    private javax.swing.JButton jButton1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField registerWeatherField1;
    private javax.swing.JScrollPane table;
    // End of variables declaration//GEN-END:variables
}
