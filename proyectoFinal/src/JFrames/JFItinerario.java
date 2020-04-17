
package JFrames;

import BackEnd.Habitat;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import BackEnd.Itinerary;

public class JFItinerario extends javax.swing.JFrame {

    protected JFMenu menu;
    private String searchItinerary;
    private int j;
    
    public JFItinerario() {
        initComponents();
    }

    public JFItinerario(JFMenu menu, ArrayList<Itinerary> itineraryList) {
        super();
        initComponents();
        setLocationRelativeTo(null);
        this.menu = menu;
        menu.itineraryList = itineraryList; 
        searchItinerary = "";
        j = 0;
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        itinerarioPanel = new javax.swing.JPanel();
        itinerarioTxt = new javax.swing.JLabel();
        itinerarioGoBackButton = new javax.swing.JButton();
        itinerarioSaveButton = new javax.swing.JButton();
        itinerarioDeleteButton = new javax.swing.JButton();
        itinerarioChangeButton = new javax.swing.JButton();
        itinerarioSearchButton = new javax.swing.JButton();
        itinerarioCodeTxt = new javax.swing.JLabel();
        habitatNameField3 = new javax.swing.JTextField();
        itinerarioDurationTxt = new javax.swing.JLabel();
        itinerarioLongTxt = new javax.swing.JLabel();
        itinerarioLongField = new javax.swing.JTextField();
        itinerarioVisiterTxt = new javax.swing.JLabel();
        itinerarioVisiterField = new javax.swing.JTextField();
        itirenarioDuratiionFormattedTextField = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        itinerarioPanel.setBackground(new java.awt.Color(102, 204, 255));
        itinerarioPanel.setPreferredSize(new java.awt.Dimension(510, 471));

        itinerarioTxt.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        itinerarioTxt.setForeground(new java.awt.Color(255, 255, 255));
        itinerarioTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itinerarioTxt.setText("Itinerario");

        itinerarioGoBackButton.setBackground(new java.awt.Color(102, 153, 255));
        itinerarioGoBackButton.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        itinerarioGoBackButton.setForeground(new java.awt.Color(255, 255, 255));
        itinerarioGoBackButton.setText("Regresar");
        itinerarioGoBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itinerarioGoBackButtonActionPerformed(evt);
            }
        });

        itinerarioSaveButton.setBackground(new java.awt.Color(102, 153, 255));
        itinerarioSaveButton.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        itinerarioSaveButton.setForeground(new java.awt.Color(255, 255, 255));
        itinerarioSaveButton.setText("Guardar");
        itinerarioSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itinerarioSaveButtonActionPerformed(evt);
            }
        });

        itinerarioDeleteButton.setBackground(new java.awt.Color(102, 153, 255));
        itinerarioDeleteButton.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        itinerarioDeleteButton.setForeground(new java.awt.Color(255, 255, 255));
        itinerarioDeleteButton.setText("Eliminar");
        itinerarioDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itinerarioDeleteButtonActionPerformed(evt);
            }
        });

        itinerarioChangeButton.setBackground(new java.awt.Color(102, 153, 255));
        itinerarioChangeButton.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        itinerarioChangeButton.setForeground(new java.awt.Color(255, 255, 255));
        itinerarioChangeButton.setText("Modificar");
        itinerarioChangeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itinerarioChangeButtonActionPerformed(evt);
            }
        });

        itinerarioSearchButton.setBackground(new java.awt.Color(102, 153, 255));
        itinerarioSearchButton.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        itinerarioSearchButton.setForeground(new java.awt.Color(255, 255, 255));
        itinerarioSearchButton.setText("Buscar");
        itinerarioSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itinerarioSearchButtonActionPerformed(evt);
            }
        });

        itinerarioCodeTxt.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        itinerarioCodeTxt.setForeground(new java.awt.Color(255, 255, 255));
        itinerarioCodeTxt.setText("Código");

        habitatNameField3.setBackground(new java.awt.Color(102, 153, 255));
        habitatNameField3.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        habitatNameField3.setForeground(new java.awt.Color(255, 255, 255));
        habitatNameField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                habitatNameField3ActionPerformed(evt);
            }
        });

        itinerarioDurationTxt.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        itinerarioDurationTxt.setForeground(new java.awt.Color(255, 255, 255));
        itinerarioDurationTxt.setText("Duración");

        itinerarioLongTxt.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        itinerarioLongTxt.setForeground(new java.awt.Color(255, 255, 255));
        itinerarioLongTxt.setText("Longitud");

        itinerarioLongField.setBackground(new java.awt.Color(102, 153, 255));
        itinerarioLongField.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        itinerarioLongField.setForeground(new java.awt.Color(255, 255, 255));

        itinerarioVisiterTxt.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        itinerarioVisiterTxt.setForeground(new java.awt.Color(255, 255, 255));
        itinerarioVisiterTxt.setText("Visitantes");

        itinerarioVisiterField.setBackground(new java.awt.Color(102, 153, 255));
        itinerarioVisiterField.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        itinerarioVisiterField.setForeground(new java.awt.Color(255, 255, 255));

        itirenarioDuratiionFormattedTextField.setBackground(new java.awt.Color(102, 153, 255));
        itirenarioDuratiionFormattedTextField.setForeground(new java.awt.Color(255, 255, 255));
        try {
            itirenarioDuratiionFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        itirenarioDuratiionFormattedTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itirenarioDuratiionFormattedTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout itinerarioPanelLayout = new javax.swing.GroupLayout(itinerarioPanel);
        itinerarioPanel.setLayout(itinerarioPanelLayout);
        itinerarioPanelLayout.setHorizontalGroup(
            itinerarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, itinerarioPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(itinerarioTxt)
                .addGap(188, 188, 188))
            .addGroup(itinerarioPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(itinerarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, itinerarioPanelLayout.createSequentialGroup()
                        .addGap(0, 83, Short.MAX_VALUE)
                        .addGroup(itinerarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(itinerarioDurationTxt)
                            .addComponent(itinerarioLongTxt)
                            .addComponent(itinerarioVisiterTxt)
                            .addComponent(itinerarioVisiterField, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(itinerarioPanelLayout.createSequentialGroup()
                                .addComponent(itinerarioSaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(itinerarioDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(itinerarioChangeButton))
                            .addComponent(itinerarioCodeTxt)
                            .addGroup(itinerarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(itirenarioDuratiionFormattedTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(itinerarioLongField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE))
                            .addGroup(itinerarioPanelLayout.createSequentialGroup()
                                .addComponent(habitatNameField3, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(itinerarioSearchButton))))
                    .addGroup(itinerarioPanelLayout.createSequentialGroup()
                        .addComponent(itinerarioGoBackButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        itinerarioPanelLayout.setVerticalGroup(
            itinerarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itinerarioPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(itinerarioTxt)
                .addGap(40, 40, 40)
                .addComponent(itinerarioCodeTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(itinerarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(habitatNameField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itinerarioSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(itinerarioDurationTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(itirenarioDuratiionFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(itinerarioLongTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(itinerarioLongField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(itinerarioVisiterTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(itinerarioVisiterField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(itinerarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itinerarioSaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itinerarioDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itinerarioChangeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(itinerarioGoBackButton)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(itinerarioPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(itinerarioPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itinerarioGoBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itinerarioGoBackButtonActionPerformed
        this.dispose();
        menu.setVisible(true);
    }//GEN-LAST:event_itinerarioGoBackButtonActionPerformed

    private void itinerarioSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itinerarioSaveButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itinerarioSaveButtonActionPerformed

    private void itinerarioDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itinerarioDeleteButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itinerarioDeleteButtonActionPerformed

    private void itinerarioChangeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itinerarioChangeButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itinerarioChangeButtonActionPerformed

    private void itinerarioSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itinerarioSearchButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itinerarioSearchButtonActionPerformed

    private void habitatNameField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_habitatNameField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_habitatNameField3ActionPerformed

    private void itirenarioDuratiionFormattedTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itirenarioDuratiionFormattedTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itirenarioDuratiionFormattedTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(JFItinerario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFItinerario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFItinerario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFItinerario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFItinerario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton habitatChangeButton;
    private javax.swing.JButton habitatChangeButton1;
    private javax.swing.JButton habitatChangeButton2;
    private javax.swing.JTextField habitatContinentField1;
    private javax.swing.JTextField habitatContinentField2;
    private javax.swing.JTextField habitatContinentField3;
    private javax.swing.JLabel habitatContinentTxt1;
    private javax.swing.JLabel habitatContinentTxt2;
    private javax.swing.JLabel habitatContinentTxt3;
    private javax.swing.JButton habitatDeleteButton;
    private javax.swing.JButton habitatDeleteButton1;
    private javax.swing.JButton habitatDeleteButton2;
    private javax.swing.JButton habitatGoBackButton;
    private javax.swing.JButton habitatGoBackButton1;
    private javax.swing.JButton habitatGoBackButton2;
    private javax.swing.JTextField habitatNameField;
    private javax.swing.JTextField habitatNameField1;
    private javax.swing.JTextField habitatNameField2;
    private javax.swing.JTextField habitatNameField3;
    private javax.swing.JLabel habitatNameTxt;
    private javax.swing.JLabel habitatNameTxt1;
    private javax.swing.JLabel habitatNameTxt2;
    private javax.swing.JPanel habitatPanel;
    private javax.swing.JPanel habitatPanel1;
    private javax.swing.JPanel habitatPanel2;
    private javax.swing.JButton habitatSaveButton;
    private javax.swing.JButton habitatSaveButton1;
    private javax.swing.JButton habitatSaveButton2;
    private javax.swing.JButton habitatSearchButton;
    private javax.swing.JButton habitatSearchButton1;
    private javax.swing.JButton habitatSearchButton2;
    private javax.swing.JLabel habitatTxt;
    private javax.swing.JLabel habitatTxt1;
    private javax.swing.JLabel habitatTxt2;
    private javax.swing.JTextField habitatVegetationField1;
    private javax.swing.JTextField habitatVegetationField2;
    private javax.swing.JTextField habitatVegetationField3;
    private javax.swing.JLabel habitatVegetationTxt;
    private javax.swing.JLabel habitatVegetationTxt1;
    private javax.swing.JLabel habitatVegetationTxt2;
    private javax.swing.JLabel habitatWeatherTxt;
    private javax.swing.JLabel habitatWeatherTxt1;
    private javax.swing.JLabel habitatWeatherTxt2;
    private javax.swing.JButton itinerarioChangeButton;
    private javax.swing.JLabel itinerarioCodeTxt;
    private javax.swing.JButton itinerarioDeleteButton;
    private javax.swing.JLabel itinerarioDurationTxt;
    private javax.swing.JButton itinerarioGoBackButton;
    private javax.swing.JTextField itinerarioLongField;
    private javax.swing.JLabel itinerarioLongTxt;
    private javax.swing.JPanel itinerarioPanel;
    private javax.swing.JButton itinerarioSaveButton;
    private javax.swing.JButton itinerarioSearchButton;
    private javax.swing.JLabel itinerarioTxt;
    private javax.swing.JTextField itinerarioVisiterField;
    private javax.swing.JLabel itinerarioVisiterTxt;
    private javax.swing.JFormattedTextField itirenarioDuratiionFormattedTextField;
    private javax.swing.JTextField registerWeatherField1;
    private javax.swing.JTextField registerWeatherField2;
    private javax.swing.JTextField registerWeatherField3;
    // End of variables declaration//GEN-END:variables
}
