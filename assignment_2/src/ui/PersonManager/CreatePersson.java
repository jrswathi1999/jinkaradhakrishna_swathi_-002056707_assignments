/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.PersonManager;

import java.awt.CardLayout;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Address;
import model.Person;
import model.PersonDirectory;

/**
 *
 * @author jrswa
 */
public class CreatePersson extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private PersonDirectory personDirectory;

    /**
     * Creates new form CreateAccount
     */
    public CreatePersson(JPanel userProcessContainer, PersonDirectory personDirectory) //contructor
    {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.personDirectory= personDirectory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backbtnc = new javax.swing.JButton();
        routinglb = new javax.swing.JLabel();
        accountlb = new javax.swing.JLabel();
        banknamelb = new javax.swing.JLabel();
        balancelb = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtSSN = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        createaccbtn = new javax.swing.JButton();
        createLabel = new javax.swing.JLabel();
        JPanelHomeAdd = new javax.swing.JPanel();
        cityLbl = new javax.swing.JLabel();
        zipLBL = new javax.swing.JLabel();
        HtxtStreetAdd = new javax.swing.JTextField();
        HtxtUnitNo = new javax.swing.JTextField();
        HtxtCity = new javax.swing.JTextField();
        HtxtPhone = new javax.swing.JTextField();
        streetaddLBL = new javax.swing.JLabel();
        unitLBL = new javax.swing.JLabel();
        phoneLBL = new javax.swing.JLabel();
        stateLBL = new javax.swing.JLabel();
        HtxtZip = new javax.swing.JTextField();
        HtxtState = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        JPanelWorkAdd = new javax.swing.JPanel();
        cityLbl1 = new javax.swing.JLabel();
        zipLBL1 = new javax.swing.JLabel();
        WtxtStreetAdd1 = new javax.swing.JTextField();
        WtxtUnitNo1 = new javax.swing.JTextField();
        WtxtCity1 = new javax.swing.JTextField();
        WtxtPhone1 = new javax.swing.JTextField();
        streetaddLBL1 = new javax.swing.JLabel();
        unitLBL1 = new javax.swing.JLabel();
        phoneLBL1 = new javax.swing.JLabel();
        stateLBL1 = new javax.swing.JLabel();
        WtxtZip1 = new javax.swing.JTextField();
        WtxtState1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        weightlb1 = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 255));

        backbtnc.setBackground(new java.awt.Color(0, 0, 0));
        backbtnc.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        backbtnc.setForeground(new java.awt.Color(204, 204, 255));
        backbtnc.setText("<<<Back");
        backbtnc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtncActionPerformed(evt);
            }
        });

        routinglb.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        routinglb.setForeground(new java.awt.Color(0, 51, 51));
        routinglb.setText("first name");

        accountlb.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        accountlb.setForeground(new java.awt.Color(0, 51, 51));
        accountlb.setText("Last nAME");

        banknamelb.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        banknamelb.setForeground(new java.awt.Color(0, 51, 51));
        banknamelb.setText("social security number");

        balancelb.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        balancelb.setForeground(new java.awt.Color(0, 51, 51));
        balancelb.setText("age");

        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });

        createaccbtn.setBackground(new java.awt.Color(0, 0, 0));
        createaccbtn.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        createaccbtn.setForeground(new java.awt.Color(204, 204, 255));
        createaccbtn.setText("Create ");
        createaccbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createaccbtnActionPerformed(evt);
            }
        });

        createLabel.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        createLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        createLabel.setText("Create person account");
        createLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        JPanelHomeAdd.setBackground(new java.awt.Color(255, 255, 255));

        cityLbl.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        cityLbl.setForeground(new java.awt.Color(0, 51, 51));
        cityLbl.setText("city");

        zipLBL.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        zipLBL.setForeground(new java.awt.Color(0, 51, 51));
        zipLBL.setText("zip code");

        HtxtStreetAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HtxtStreetAddActionPerformed(evt);
            }
        });

        streetaddLBL.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        streetaddLBL.setForeground(new java.awt.Color(0, 51, 51));
        streetaddLBL.setText("Street address");

        unitLBL.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        unitLBL.setForeground(new java.awt.Color(0, 51, 51));
        unitLBL.setText("unit number");

        phoneLBL.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        phoneLBL.setForeground(new java.awt.Color(0, 51, 51));
        phoneLBL.setText("Phone No.");

        stateLBL.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        stateLBL.setForeground(new java.awt.Color(0, 51, 51));
        stateLBL.setText("State");

        javax.swing.GroupLayout JPanelHomeAddLayout = new javax.swing.GroupLayout(JPanelHomeAdd);
        JPanelHomeAdd.setLayout(JPanelHomeAddLayout);
        JPanelHomeAddLayout.setHorizontalGroup(
            JPanelHomeAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelHomeAddLayout.createSequentialGroup()
                .addGroup(JPanelHomeAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(JPanelHomeAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(JPanelHomeAddLayout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(JPanelHomeAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(HtxtPhone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(HtxtState, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(HtxtZip, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(JPanelHomeAddLayout.createSequentialGroup()
                            .addGap(245, 245, 245)
                            .addComponent(HtxtUnitNo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(JPanelHomeAddLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(JPanelHomeAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stateLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(JPanelHomeAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(JPanelHomeAddLayout.createSequentialGroup()
                                    .addComponent(cityLbl)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(HtxtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(unitLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(JPanelHomeAddLayout.createSequentialGroup()
                                    .addComponent(streetaddLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(HtxtStreetAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(zipLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phoneLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        JPanelHomeAddLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {HtxtPhone, HtxtUnitNo, HtxtZip, cityLbl, phoneLBL, stateLBL, streetaddLBL, unitLBL, zipLBL});

        JPanelHomeAddLayout.setVerticalGroup(
            JPanelHomeAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelHomeAddLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(JPanelHomeAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HtxtStreetAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(streetaddLBL))
                .addGap(18, 18, 18)
                .addGroup(JPanelHomeAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HtxtUnitNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unitLBL))
                .addGap(18, 18, 18)
                .addGroup(JPanelHomeAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HtxtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cityLbl))
                .addGap(18, 18, 18)
                .addGroup(JPanelHomeAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HtxtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stateLBL))
                .addGap(18, 18, 18)
                .addGroup(JPanelHomeAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HtxtZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zipLBL))
                .addGap(18, 18, 18)
                .addGroup(JPanelHomeAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HtxtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneLBL))
                .addGap(15, 15, 15))
        );

        JPanelHomeAddLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {HtxtCity, HtxtPhone, HtxtUnitNo, HtxtZip, cityLbl, phoneLBL, stateLBL, streetaddLBL, unitLBL, zipLBL});

        jLabel1.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        jLabel1.setText("work Address");

        JPanelWorkAdd.setBackground(new java.awt.Color(255, 255, 255));

        cityLbl1.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        cityLbl1.setForeground(new java.awt.Color(0, 51, 51));
        cityLbl1.setText("city");

        zipLBL1.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        zipLBL1.setForeground(new java.awt.Color(0, 51, 51));
        zipLBL1.setText("zip code");

        WtxtStreetAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WtxtStreetAdd1ActionPerformed(evt);
            }
        });

        streetaddLBL1.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        streetaddLBL1.setForeground(new java.awt.Color(0, 51, 51));
        streetaddLBL1.setText("Street address");

        unitLBL1.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        unitLBL1.setForeground(new java.awt.Color(0, 51, 51));
        unitLBL1.setText("unit number");

        phoneLBL1.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        phoneLBL1.setForeground(new java.awt.Color(0, 51, 51));
        phoneLBL1.setText("Phone No.");

        stateLBL1.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        stateLBL1.setForeground(new java.awt.Color(0, 51, 51));
        stateLBL1.setText("State");

        javax.swing.GroupLayout JPanelWorkAddLayout = new javax.swing.GroupLayout(JPanelWorkAdd);
        JPanelWorkAdd.setLayout(JPanelWorkAddLayout);
        JPanelWorkAddLayout.setHorizontalGroup(
            JPanelWorkAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelWorkAddLayout.createSequentialGroup()
                .addGroup(JPanelWorkAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(JPanelWorkAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(JPanelWorkAddLayout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(JPanelWorkAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(WtxtPhone1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(WtxtState1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(WtxtZip1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(JPanelWorkAddLayout.createSequentialGroup()
                            .addGap(245, 245, 245)
                            .addComponent(WtxtUnitNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(JPanelWorkAddLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(JPanelWorkAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stateLBL1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(JPanelWorkAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(JPanelWorkAddLayout.createSequentialGroup()
                                    .addComponent(cityLbl1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(WtxtCity1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(unitLBL1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(JPanelWorkAddLayout.createSequentialGroup()
                                    .addComponent(streetaddLBL1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(WtxtStreetAdd1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(zipLBL1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phoneLBL1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        JPanelWorkAddLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {WtxtCity1, WtxtPhone1, WtxtState1, WtxtStreetAdd1, WtxtUnitNo1, WtxtZip1});

        JPanelWorkAddLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cityLbl1, phoneLBL1, stateLBL1, streetaddLBL1, unitLBL1, zipLBL1});

        JPanelWorkAddLayout.setVerticalGroup(
            JPanelWorkAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelWorkAddLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(JPanelWorkAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(WtxtStreetAdd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(streetaddLBL1))
                .addGap(18, 18, 18)
                .addGroup(JPanelWorkAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(WtxtUnitNo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unitLBL1))
                .addGap(18, 18, 18)
                .addGroup(JPanelWorkAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(WtxtCity1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cityLbl1))
                .addGap(18, 18, 18)
                .addGroup(JPanelWorkAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(WtxtState1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stateLBL1))
                .addGap(18, 18, 18)
                .addGroup(JPanelWorkAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(WtxtZip1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zipLBL1))
                .addGap(18, 18, 18)
                .addGroup(JPanelWorkAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(WtxtPhone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneLBL1))
                .addGap(15, 15, 15))
        );

        JPanelWorkAddLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {WtxtCity1, WtxtPhone1, WtxtState1, WtxtStreetAdd1, WtxtUnitNo1, WtxtZip1});

        JPanelWorkAddLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cityLbl1, phoneLBL1, stateLBL1, streetaddLBL1, unitLBL1, zipLBL1});

        jLabel3.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        jLabel3.setText("Home Address");

        weightlb1.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        weightlb1.setForeground(new java.awt.Color(0, 51, 51));
        weightlb1.setText("Weight");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backbtnc)
                        .addGap(294, 294, 294)
                        .addComponent(createLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JPanelHomeAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JPanelWorkAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29))
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(accountlb, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(banknamelb))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtLastName)
                            .addComponent(txtSSN)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(routinglb, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(balancelb, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(weightlb1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtAge)
                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(119, 119, 119))
            .addGroup(layout.createSequentialGroup()
                .addGap(499, 499, 499)
                .addComponent(createaccbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {accountlb, balancelb, banknamelb, routinglb, weightlb1});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtAge, txtFirstName, txtLastName, txtSSN});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(createLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(backbtnc, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(routinglb)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(accountlb)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(balancelb))
                            .addComponent(txtAge, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(weightlb1)
                            .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(banknamelb)
                    .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JPanelHomeAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JPanelWorkAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48)
                .addComponent(createaccbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {accountlb, balancelb, banknamelb, routinglb, weightlb1});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtAge, txtFirstName, txtLastName, txtSSN});

    }// </editor-fold>//GEN-END:initComponents

    private void backbtncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtncActionPerformed
        // TODO add your handling code here:
        //back button action
        userProcessContainer.remove(this);
        CardLayout layout= (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backbtncActionPerformed

    private void createaccbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createaccbtnActionPerformed
        // TODO add your handling code here:  
        
        //getting values from text fields
        
        //getting values for 
        long SSN;
        int age;
        double weight;
        String firstName= txtFirstName.getText();
        String lastName= txtLastName.getText();
        
        if(firstName.isBlank() || lastName.isBlank())
        {
            JOptionPane.showMessageDialog(this,"All fields are mandatory","Error",JOptionPane.ERROR_MESSAGE);
            //validification for create account , checking if the text fields are empty
            //stops the process if it's empty
            return;
        }
        
        
        // validation for home address and work address
         
        
         try{
            SSN= Long.parseLong(txtSSN.getText());
            age = Integer.parseInt(txtAge.getText());
            weight = Double.parseDouble(txtWeight.getText());
        } catch(Exception e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Please check the SSN , age and weight input. They should me numbers", "Warning", JOptionPane.WARNING_MESSAGE);
            return;//validation for balance input text field 
        }
        
        
        // geting test feilds of home address
        String hStreet = HtxtStreetAdd.getText();
        String hUnit = HtxtUnitNo.getText();
        String hCity = HtxtCity.getText();
        String hState = HtxtState.getText();
        String hZip = HtxtZip.getText();
        String hPhone = HtxtPhone.getText();
        
        //getting values of work address
        String wStreet = WtxtStreetAdd1.getText();
        String wUnit = WtxtUnitNo1.getText();
        String wCity = WtxtCity1.getText();
        String wState = WtxtState1.getText();
        String wZip = WtxtZip1.getText();
        String wPhone = WtxtPhone1.getText();

        if(hStreet.isBlank()||hUnit.isBlank()||hCity.isBlank()||hState.isBlank()||hZip.isBlank()||hPhone.isBlank()){
            JOptionPane.showMessageDialog(this,"All home address feilds are mandatory","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(wStreet.isBlank()|| wUnit.isBlank()|| wCity.isBlank()||wState.isBlank()||wZip.isBlank()|| wPhone.isBlank()){
            JOptionPane.showMessageDialog(this,"All work address feilds are mandatory","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        
        
       
        //setting the retreived txt feilds to person
        Person p = personDirectory.addPerson();
        
        p.setFirstName(firstName);
        p.setLastName(lastName);
        p.setSSN(SSN);
        p.setAge(age);
        p.setWeight(weight);
        
        
        
        //address objects for home and work
        
//        Address homeAdd = new Address(hStreet, hUnit, hCity,hState,hZip,hPhone);
//        Address workAdd = new Address(wStreet, wUnit, wCity,wState,wZip,wPhone);
        
        //setting home address and work address for the person class
        p.getHomeAddress().setStreetAddress(hStreet);
        p.getHomeAddress().setUnitNumber(hUnit);
        p.getHomeAddress().setCity(hCity);
        p.getHomeAddress().setState(hState);
        p.getHomeAddress().setZipCode(hPhone);
        p.getHomeAddress().setPhoneNumber(hPhone);


        p.getWorkAddress().setStreetAddress(wStreet);
        p.getWorkAddress().setUnitNumber(wUnit);
        p.getWorkAddress().setCity(wCity);
        p.getWorkAddress().setState(wState);
        p.getWorkAddress().setZipCode(wPhone);
        p.getWorkAddress().setPhoneNumber(wPhone);
        
        //Dialog box for creating Person
        JOptionPane.showMessageDialog(null, "Person Profile Created!", "Success", JOptionPane.INFORMATION_MESSAGE);
        
        //clearing text fields after submitting
        txtFirstName.setText("");
        txtLastName.setText("");
        txtSSN.setText("");
        txtAge.setText("");
        txtWeight.setText("");
        
        HtxtStreetAdd.setText("");
        HtxtUnitNo.setText("");
        HtxtCity.setText("");
        HtxtState.setText("");
        HtxtZip.setText("");
        HtxtPhone.setText("");
        
        WtxtStreetAdd1.setText("");
        WtxtUnitNo1.setText("");
        WtxtCity1.setText("");
        WtxtState1.setText("");
        WtxtZip1.setText("");
        WtxtPhone1.setText("");
    }//GEN-LAST:event_createaccbtnActionPerformed

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void HtxtStreetAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HtxtStreetAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HtxtStreetAddActionPerformed

    private void WtxtStreetAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WtxtStreetAdd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WtxtStreetAdd1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField HtxtCity;
    private javax.swing.JTextField HtxtPhone;
    private javax.swing.JTextField HtxtState;
    private javax.swing.JTextField HtxtStreetAdd;
    private javax.swing.JTextField HtxtUnitNo;
    private javax.swing.JTextField HtxtZip;
    private javax.swing.JPanel JPanelHomeAdd;
    private javax.swing.JPanel JPanelWorkAdd;
    private javax.swing.JTextField WtxtCity1;
    private javax.swing.JTextField WtxtPhone1;
    private javax.swing.JTextField WtxtState1;
    private javax.swing.JTextField WtxtStreetAdd1;
    private javax.swing.JTextField WtxtUnitNo1;
    private javax.swing.JTextField WtxtZip1;
    private javax.swing.JLabel accountlb;
    private javax.swing.JButton backbtnc;
    private javax.swing.JLabel balancelb;
    private javax.swing.JLabel banknamelb;
    private javax.swing.JLabel cityLbl;
    private javax.swing.JLabel cityLbl1;
    private javax.swing.JLabel createLabel;
    private javax.swing.JButton createaccbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel phoneLBL;
    private javax.swing.JLabel phoneLBL1;
    private javax.swing.JLabel routinglb;
    private javax.swing.JLabel stateLBL;
    private javax.swing.JLabel stateLBL1;
    private javax.swing.JLabel streetaddLBL;
    private javax.swing.JLabel streetaddLBL1;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtSSN;
    private javax.swing.JTextField txtWeight;
    private javax.swing.JLabel unitLBL;
    private javax.swing.JLabel unitLBL1;
    private javax.swing.JLabel weightlb1;
    private javax.swing.JLabel zipLBL;
    private javax.swing.JLabel zipLBL1;
    // End of variables declaration//GEN-END:variables
}
