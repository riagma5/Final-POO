package JFrames;

import java.util.ArrayList;
import BackEnd.*;

public class JFMenu extends javax.swing.JFrame {

    protected static ArrayList<Habitat> habitatList; //Habitat container
    protected static ArrayList<Integer> locationList; //Location container
    //Self id, zone id, habitat id, specie id
    protected static ArrayList<Specie> specieList; //specie container
    protected static ArrayList<Zone> zoneList; // zone container
    protected static ArrayList<Itinerary> itineraryList; //itinerary container
    /////////MISSING TO MODIFY ROUTELIST
    protected static ArrayList<Integer> routeList; //Route container
    //self id, zone id, itinerary id
    protected static ArrayList<Guide> guideList; //Guide container
    protected static ArrayList<Carer> carerList; //Carer /cuidador container
    protected static ArrayList<Integer> guidedRouteList; //recorrido guiado
    //guided route container. Will include self id, zone id and itinerary id
    protected static ArrayList<Integer> carerSpecieList; //self id +
    //Carer id + Specie id
        
    protected JFHabitat habitat;
    protected JFItinerario itinerario;
    protected JFEspecie especie;
    protected JFZona zona;
    protected JFGuia guia;   
    protected JFCuidador cuidador;
    
    public JFMenu() {
        initComponents();
        setLocationRelativeTo(null);
        habitat = new JFHabitat(this, habitatList);
        itinerario = new JFItinerario(this,itineraryList);
        especie = new JFEspecie(this,specieList);
        zona = new JFZona(this,zoneList);
        guia = new JFGuia(this, guideList);
        cuidador = new JFCuidador(this, carerList);
        
        //INSERT OTHER FRAME OBJECTS
    }
    
    private void showHabitat(){
        habitat.setVisible(true);
    }
    
    private void showItinerario(){
        itinerario.setVisible(true);
    }
    
    private void showEspecie(){
        especie.setVisible(true);
    }
    
    private void showZona(){
        zona.setVisible(true);
    }
    
    private void showGuia(){
        guia.setVisible(true);
    }
    
    private void showCuidador(){
        cuidador.setVisible(true);
    }
    /*MISSING TO ADD SEARCH, DELETE, MODIFY AND SHOW METHODS
    
    protected void showHabitat(){}
    */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuPanel = new javax.swing.JPanel();
        menuTxt = new javax.swing.JLabel();
        habitat_button = new javax.swing.JButton();
        itinerary_button = new javax.swing.JButton();
        species_button = new javax.swing.JButton();
        zone_button = new javax.swing.JButton();
        guide_button = new javax.swing.JButton();
        carer_button = new javax.swing.JButton();
        exit_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuPanel.setBackground(new java.awt.Color(102, 204, 255));

        menuTxt.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        menuTxt.setForeground(new java.awt.Color(255, 255, 255));
        menuTxt.setText("            MENU");

        habitat_button.setBackground(new java.awt.Color(102, 153, 255));
        habitat_button.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        habitat_button.setForeground(new java.awt.Color(255, 255, 255));
        habitat_button.setText("Habitat");
        habitat_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                habitat_buttonActionPerformed(evt);
            }
        });

        itinerary_button.setBackground(new java.awt.Color(102, 153, 255));
        itinerary_button.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        itinerary_button.setForeground(new java.awt.Color(255, 255, 255));
        itinerary_button.setText("Itinerario");
        itinerary_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itinerary_buttonActionPerformed(evt);
            }
        });

        species_button.setBackground(new java.awt.Color(102, 153, 255));
        species_button.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        species_button.setForeground(new java.awt.Color(255, 255, 255));
        species_button.setText("Especie");
        species_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                species_buttonActionPerformed(evt);
            }
        });

        zone_button.setBackground(new java.awt.Color(102, 153, 255));
        zone_button.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        zone_button.setForeground(new java.awt.Color(255, 255, 255));
        zone_button.setText("Zona");
        zone_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zone_buttonActionPerformed(evt);
            }
        });

        guide_button.setBackground(new java.awt.Color(102, 153, 255));
        guide_button.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        guide_button.setForeground(new java.awt.Color(255, 255, 255));
        guide_button.setText("Guía");
        guide_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guide_buttonActionPerformed(evt);
            }
        });

        carer_button.setBackground(new java.awt.Color(102, 153, 255));
        carer_button.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        carer_button.setForeground(new java.awt.Color(255, 255, 255));
        carer_button.setText("Cuidador");
        carer_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carer_buttonActionPerformed(evt);
            }
        });

        exit_button.setBackground(new java.awt.Color(102, 153, 255));
        exit_button.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        exit_button.setForeground(new java.awt.Color(255, 255, 255));
        exit_button.setText("Salir");
        exit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(menuTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(173, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exit_button, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(carer_button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(guide_button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(zone_button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(species_button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(itinerary_button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(habitat_button, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(236, 236, 236))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(menuTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(habitat_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(itinerary_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(species_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(zone_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(guide_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(carer_button)
                .addGap(35, 35, 35)
                .addComponent(exit_button)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_buttonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exit_buttonActionPerformed

    private void habitat_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_habitat_buttonActionPerformed
        showHabitat();
        this.dispose();
    }//GEN-LAST:event_habitat_buttonActionPerformed

    private void itinerary_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itinerary_buttonActionPerformed
        showItinerario();
        this.dispose();
    }//GEN-LAST:event_itinerary_buttonActionPerformed

    private void species_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_species_buttonActionPerformed
        showEspecie();
        this.dispose();
    }//GEN-LAST:event_species_buttonActionPerformed

    private void zone_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zone_buttonActionPerformed
        showZona();
        this.dispose();
    }//GEN-LAST:event_zone_buttonActionPerformed

    private void guide_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guide_buttonActionPerformed
       showGuia();
       this.dispose();
    }//GEN-LAST:event_guide_buttonActionPerformed

    private void carer_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carer_buttonActionPerformed
        showCuidador();
        this.dispose();
    }//GEN-LAST:event_carer_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(JFMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton carer_button;
    private javax.swing.JButton exit_button;
    private javax.swing.JButton guide_button;
    private javax.swing.JButton habitat_button;
    private javax.swing.JButton itinerary_button;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JLabel menuTxt;
    private javax.swing.JButton species_button;
    private javax.swing.JButton zone_button;
    // End of variables declaration//GEN-END:variables
}
