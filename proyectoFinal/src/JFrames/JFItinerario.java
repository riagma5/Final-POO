
package JFrames;

import BackEnd.Habitat;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import BackEnd.Itinerary;
import static JFrames.JFLogin.getConection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Time;

public class JFItinerario extends javax.swing.JFrame {
    PreparedStatement ps;
    ResultSet sr;
    protected JFMenu menu;
    private String searchItinerary;
    private int j;
    
    private void cleanBox() {
        codeNameField.setText(null);
        itirenarioDuratiionFormattedTextField.setText(null);
        itinerarioLongField.setText(null);
        itinerarioVisiterField.setText(null);
    }
    
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
        codeNameField = new javax.swing.JTextField();
        itinerarioDurationTxt = new javax.swing.JLabel();
        itinerarioLongTxt = new javax.swing.JLabel();
        itinerarioLongField = new javax.swing.JTextField();
        itinerarioVisiterTxt = new javax.swing.JLabel();
        itinerarioVisiterField = new javax.swing.JTextField();
        itirenarioDuratiionFormattedTextField = new javax.swing.JFormattedTextField();
        itinerarioSpeciesField = new javax.swing.JTextField();
        itinerarioVisiterTxt1 = new javax.swing.JLabel();

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

        codeNameField.setBackground(new java.awt.Color(102, 153, 255));
        codeNameField.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        codeNameField.setForeground(new java.awt.Color(255, 255, 255));
        codeNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codeNameFieldActionPerformed(evt);
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
            itirenarioDuratiionFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        itirenarioDuratiionFormattedTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itirenarioDuratiionFormattedTextFieldActionPerformed(evt);
            }
        });

        itinerarioSpeciesField.setBackground(new java.awt.Color(102, 153, 255));
        itinerarioSpeciesField.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        itinerarioSpeciesField.setForeground(new java.awt.Color(255, 255, 255));

        itinerarioVisiterTxt1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        itinerarioVisiterTxt1.setForeground(new java.awt.Color(255, 255, 255));
        itinerarioVisiterTxt1.setText("Especies vistas");

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
                                .addComponent(codeNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(itinerarioSearchButton))
                            .addComponent(itinerarioSpeciesField, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(itinerarioVisiterTxt1)))
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
                    .addComponent(codeNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(itinerarioVisiterTxt1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(itinerarioSpeciesField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addComponent(itinerarioPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itinerarioGoBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itinerarioGoBackButtonActionPerformed
        this.dispose();
        menu.setVisible(true);
    }//GEN-LAST:event_itinerarioGoBackButtonActionPerformed

    private void itinerarioSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itinerarioSaveButtonActionPerformed
        Connection con = null;
        try {
            con = getConection();
            ps = con.prepareStatement("INSERT INTO itinerario (codigo, duracion, longitud, maxVisitante, especiesVisita) VALUES(?,?,?,?,?) ");
            ps.setInt(1, Integer.valueOf(codeNameField.getText()));
            ps.setTime(2, Time.valueOf(itirenarioDuratiionFormattedTextField.getText()));
            ps.setDouble(3, Double.valueOf(itinerarioLongField.getText()));
            ps.setInt(4,Integer.valueOf(itinerarioVisiterField.getText()));
            ps.setInt(5,Integer.valueOf(itinerarioSpeciesField.getText()));
           

            int res = ps.executeUpdate();
            
            if(res > 0){
                JOptionPane.showMessageDialog(null, "Zona Guardada");
                cleanBox();
            } else {
                 JOptionPane.showMessageDialog(null, "Error al Guardar zona");
                 cleanBox();
            }
            
            con.close();
            
        } catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_itinerarioSaveButtonActionPerformed

    private void itinerarioDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itinerarioDeleteButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itinerarioDeleteButtonActionPerformed

    private void itinerarioChangeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itinerarioChangeButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itinerarioChangeButtonActionPerformed

    private void itinerarioSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itinerarioSearchButtonActionPerformed
        com.mysql.jdbc.Connection con = null;
        
        try{
            
            con = (com.mysql.jdbc.Connection) getConection();
            ps = con.prepareStatement("SELECT * FROM itinerario WHERE codigo = ?");
            ps.setString(1, codeNameField.getText());
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                
                codeNameField.setText(rs.getString("codigo"));
                itirenarioDuratiionFormattedTextField.setText(rs.getString("duracion"));
                itinerarioLongField.setText(rs.getString("longitud"));
                itinerarioVisiterField.setText(rs.getString("maxVisitante"));
                itinerarioSpeciesField.setText(rs.getString("especiesVisita"));
                
            } else {
                JOptionPane.showMessageDialog(null, "No existe una persona con la clave");
            }
            
        } catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_itinerarioSearchButtonActionPerformed

    private void codeNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codeNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codeNameFieldActionPerformed

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
    private javax.swing.JTextField codeNameField;
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
    private javax.swing.JTextField itinerarioSpeciesField;
    private javax.swing.JLabel itinerarioTxt;
    private javax.swing.JTextField itinerarioVisiterField;
    private javax.swing.JLabel itinerarioVisiterTxt;
    private javax.swing.JLabel itinerarioVisiterTxt1;
    private javax.swing.JFormattedTextField itirenarioDuratiionFormattedTextField;
    // End of variables declaration//GEN-END:variables
}
