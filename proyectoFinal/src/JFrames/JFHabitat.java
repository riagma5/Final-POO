
package JFrames;

import javax.swing.JOptionPane;
<<<<<<< HEAD
import BackEnd.Habitat;
<<<<<<< HEAD
import java.util.ArrayList;
import com.mysql.jdbc.Connection;
//import java.sql.Statement;
import java.sql.*;
=======
import SQL.Connection;

>>>>>>> 7b270606b646d0e26d7e8b982a36a77e8ec3e78e
=======
import static JFrames.JFLogin.getConection;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
>>>>>>> 5782f630e4a48c7113040375e8835f0ee85fdc37

public class JFHabitat extends javax.swing.JFrame {
    PreparedStatement ps;
    ResultSet sr;
    protected JFMenu menu;
<<<<<<< HEAD
    private static ArrayList<Habitat> habitatList;
    private Habitat habitat;
=======
>>>>>>> 7b270606b646d0e26d7e8b982a36a77e8ec3e78e

    
    private void cleanBox() {
        habitatNameField.setText(null);
        registerWeatherField1.setText(null);
        habitatVegetationField1.setText(null);
        habitatContinentField1.setText(null);
        
    }
    
    public JFHabitat(){
        initComponents();
    }
    
    public JFHabitat(JFMenu menu) {
        super();
        initComponents();
        setLocationRelativeTo(null);
        this.menu = menu;
<<<<<<< HEAD
        habitatList = new ArrayList<Habitat>();
    }
    
    private String[] defaultLabel(){
        String dL[] = {"ID", "Nombre", "Clima", "Vegetación", "Continente"};
        return dL;
    }
    
    private String[][] setMatrix(){
        ArrayList<Habitat> tempList = showDataDB();
        
        String[][] matrixInfo = new String[tempList.size()][5];
        for(int i = 0; i < tempList.size();i++){
            matrixInfo[i][0] = tempList.get(i).getId()+"";
            matrixInfo[i][1] = tempList.get(i).getHabitatName();
            matrixInfo[i][2] = tempList.get(i).getWeather();
            matrixInfo[i][3] = tempList.get(i).getVegetation();
            matrixInfo[i][4] = tempList.get(i).getContinent();
        }
        
        return matrixInfo;
    }
    
    
    public ArrayList<Habitat> showDataDB() {
        Connection conex = new Connection();
        try{
            Statement st = conex.getConnection().createStatement();
            ResultSet rs = st.executeQuery("Select * FROM habitat ");
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
=======
    }
    
    private void cleanField(){
        habitatNameField.setText(null);
        habitatWeatherField.setText(null);
        habitatVegetationField.setText(null);
        habitatContinentField.setText(null);
    }
    
    @SuppressWarnings("unchecked")
>>>>>>> 7b270606b646d0e26d7e8b982a36a77e8ec3e78e
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jMenuItem1 = new javax.swing.JMenuItem();
        HeaderPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        JPanel_inputVariables = new javax.swing.JPanel();
        habitatNameTxt = new javax.swing.JLabel();
        habitatNameField = new javax.swing.JTextField();
<<<<<<< HEAD
=======
        habitatWeatherField = new javax.swing.JTextField();
>>>>>>> 7b270606b646d0e26d7e8b982a36a77e8ec3e78e
        habitatWeatherTxt = new javax.swing.JLabel();
        registerWeatherField1 = new javax.swing.JTextField();
        habitatVegetationTxt = new javax.swing.JLabel();
        habitatVegetationField = new javax.swing.JTextField();
        habitatContinentTxt1 = new javax.swing.JLabel();
<<<<<<< HEAD
        habitatContinentField1 = new javax.swing.JTextField();
        jScrollPane_Matrix = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        habitat_showTable = new javax.swing.JTable();
        JPanel_Buttons = new javax.swing.JPanel();
        habitatSaveButton = new javax.swing.JButton();
        habitatSearchButton = new javax.swing.JButton();
        habitatDeleteButton = new javax.swing.JButton();
        habitatChangeButton = new javax.swing.JButton();
        habitatGoBackButton = new javax.swing.JButton();
        headerPanel = new javax.swing.JPanel();
        habitatTxt = new javax.swing.JLabel();
=======
        habitatContinentField = new javax.swing.JTextField();
>>>>>>> 7b270606b646d0e26d7e8b982a36a77e8ec3e78e

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        HeaderPanel.setBackground(new java.awt.Color(102, 204, 255));

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

<<<<<<< HEAD
=======
        habitatWeatherField.setBackground(new java.awt.Color(102, 153, 255));
        habitatWeatherField.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        habitatWeatherField.setForeground(new java.awt.Color(255, 255, 255));
        habitatWeatherField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                habitatWeatherFieldActionPerformed(evt);
            }
        });

>>>>>>> 7b270606b646d0e26d7e8b982a36a77e8ec3e78e
        habitatWeatherTxt.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        habitatWeatherTxt.setForeground(new java.awt.Color(255, 255, 255));
        habitatWeatherTxt.setText("Clima");

        registerWeatherField1.setBackground(new java.awt.Color(102, 153, 255));
        registerWeatherField1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        registerWeatherField1.setForeground(new java.awt.Color(255, 255, 255));

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

<<<<<<< HEAD
        javax.swing.GroupLayout JPanel_inputVariablesLayout = new javax.swing.GroupLayout(JPanel_inputVariables);
        JPanel_inputVariables.setLayout(JPanel_inputVariablesLayout);
        JPanel_inputVariablesLayout.setHorizontalGroup(
            JPanel_inputVariablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_inputVariablesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanel_inputVariablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(habitatNameTxt)
                    .addComponent(habitatVegetationField1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(habitatContinentField1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(habitatWeatherTxt))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(JPanel_inputVariablesLayout.createSequentialGroup()
                .addGroup(JPanel_inputVariablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(habitatNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registerWeatherField1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(habitatVegetationTxt)
                    .addComponent(habitatContinentTxt1))
                .addGap(0, 0, Short.MAX_VALUE))
=======
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
>>>>>>> 7b270606b646d0e26d7e8b982a36a77e8ec3e78e
        );
        JPanel_inputVariablesLayout.setVerticalGroup(
            JPanel_inputVariablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_inputVariablesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(habitatNameTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(habitatNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(habitatWeatherTxt)
<<<<<<< HEAD
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerWeatherField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(habitatVegetationTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(habitatVegetationField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(habitatContinentTxt1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(habitatContinentField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
=======
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
>>>>>>> 7b270606b646d0e26d7e8b982a36a77e8ec3e78e
        );

        habitat_showTable.setModel(new javax.swing.table.DefaultTableModel(
            setMatrix(), defaultLabel())
    );

    org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, habitat_showTable, org.jdesktop.beansbinding.ObjectProperty.create(), habitat_showTable, org.jdesktop.beansbinding.BeanProperty.create("autoscrolls"));
    bindingGroup.addBinding(binding);

    jScrollPane1.setViewportView(habitat_showTable);

    jScrollPane_Matrix.setViewportView(jScrollPane1);

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jScrollPane_Matrix, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(JPanel_inputVariables, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(JPanel_inputVariables, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(53, Short.MAX_VALUE))
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jScrollPane_Matrix, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addContainerGap())
    );

    habitatSaveButton.setBackground(new java.awt.Color(102, 153, 255));
    habitatSaveButton.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
    habitatSaveButton.setForeground(new java.awt.Color(255, 255, 255));
    habitatSaveButton.setText("Guardar");
    habitatSaveButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            habitatSaveButtonActionPerformed(evt);
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

    habitatGoBackButton.setBackground(new java.awt.Color(102, 153, 255));
    habitatGoBackButton.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
    habitatGoBackButton.setForeground(new java.awt.Color(255, 255, 255));
    habitatGoBackButton.setText("Regresar");
    habitatGoBackButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            habitatGoBackButtonActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout JPanel_ButtonsLayout = new javax.swing.GroupLayout(JPanel_Buttons);
    JPanel_Buttons.setLayout(JPanel_ButtonsLayout);
    JPanel_ButtonsLayout.setHorizontalGroup(
        JPanel_ButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(JPanel_ButtonsLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(JPanel_ButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(habitatSaveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(habitatChangeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(habitatSearchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(habitatDeleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(habitatGoBackButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    JPanel_ButtonsLayout.setVerticalGroup(
        JPanel_ButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(JPanel_ButtonsLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(habitatSaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(habitatSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(habitatDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(habitatChangeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(habitatGoBackButton)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    habitatTxt.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
    habitatTxt.setForeground(new java.awt.Color(255, 255, 255));
    habitatTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    habitatTxt.setText("Habitat");

    javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
    headerPanel.setLayout(headerPanelLayout);
    headerPanelLayout.setHorizontalGroup(
        headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
            .addContainerGap(26, Short.MAX_VALUE)
            .addComponent(habitatTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(19, 19, 19))
    );
    headerPanelLayout.setVerticalGroup(
        headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(habitatTxt)
            .addContainerGap())
    );

    javax.swing.GroupLayout HeaderPanelLayout = new javax.swing.GroupLayout(HeaderPanel);
    HeaderPanel.setLayout(HeaderPanelLayout);
    HeaderPanelLayout.setHorizontalGroup(
        HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
        .addGroup(HeaderPanelLayout.createSequentialGroup()
            .addGroup(HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(HeaderPanelLayout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(JPanel_Buttons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(HeaderPanelLayout.createSequentialGroup()
                    .addGap(362, 362, 362)
                    .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    HeaderPanelLayout.setVerticalGroup(
        HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(HeaderPanelLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addGroup(HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(JPanel_Buttons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(63, 63, 63))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(HeaderPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(HeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    bindingGroup.bind();

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void habitatGoBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_habitatGoBackButtonActionPerformed
        this.dispose();
        menu.setVisible(true);
    }//GEN-LAST:event_habitatGoBackButtonActionPerformed
//For saving dates = ps.setString(x, Date.ValueOf(y.getText()));
//For saving dates = ps.setString(x, cbxGenero.getSelectedItem().toString());
    private void habitatSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_habitatSaveButtonActionPerformed
<<<<<<< HEAD
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
=======
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
    
>>>>>>> 5782f630e4a48c7113040375e8835f0ee85fdc37
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
<<<<<<< HEAD
        
        /*Connection connect = null;
        try{
            connect = Connection.getConnection();
            connect.ps = connect.preprareStatement(
                    "Select * FROM habitat WHERE habitatId=");
            
  
        } catch(Exception e){
            System.err.println(e);
        }
        */
=======
        habitatSaveButton.setEnabled(false);
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
>>>>>>> 5782f630e4a48c7113040375e8835f0ee85fdc37
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
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JPanel JPanel_Buttons;
    private javax.swing.JPanel JPanel_inputVariables;
    private javax.swing.JButton habitatChangeButton;
    private javax.swing.JTextField habitatContinentField;
    private javax.swing.JLabel habitatContinentTxt1;
    private javax.swing.JButton habitatDeleteButton;
    private javax.swing.JButton habitatGoBackButton;
    private javax.swing.JTextField habitatNameField;
    private javax.swing.JLabel habitatNameTxt;
    private javax.swing.JButton habitatSaveButton;
    private javax.swing.JButton habitatSearchButton;
    private javax.swing.JLabel habitatTxt;
    private javax.swing.JTextField habitatVegetationField;
    private javax.swing.JLabel habitatVegetationTxt;
    private javax.swing.JTextField habitatWeatherField;
    private javax.swing.JLabel habitatWeatherTxt;
<<<<<<< HEAD
    private javax.swing.JTable habitat_showTable;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane_Matrix;
    private javax.swing.JTextField registerWeatherField1;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
=======
>>>>>>> 7b270606b646d0e26d7e8b982a36a77e8ec3e78e
    // End of variables declaration//GEN-END:variables
}
