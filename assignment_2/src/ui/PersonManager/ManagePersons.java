/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.PersonManager;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Person;
import model.PersonDirectory;

/**
 *
 * @author jrswa
 */
public class ManagePersons extends javax.swing.JPanel {
    JPanel userProcessContainer;
    PersonDirectory personDirectory;

    /**
     * Creates new form ManageAccounts
     */
    public ManagePersons(JPanel container, PersonDirectory directory) {
        initComponents();
        userProcessContainer = container;
        personDirectory= directory;
        
        populateTable(); //populate Jtable with account directory
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backbtnm = new javax.swing.JButton();
        searchbtn = new javax.swing.JButton();
        viewdetailsbtn = new javax.swing.JButton();
        delaccbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPerson = new javax.swing.JTable();
        txtsearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));

        backbtnm.setBackground(new java.awt.Color(0, 0, 0));
        backbtnm.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        backbtnm.setForeground(new java.awt.Color(204, 204, 255));
        backbtnm.setText("<<<Back");
        backbtnm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnmActionPerformed(evt);
            }
        });

        searchbtn.setBackground(new java.awt.Color(0, 0, 0));
        searchbtn.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        searchbtn.setForeground(new java.awt.Color(204, 204, 255));
        searchbtn.setText("Search");
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });

        viewdetailsbtn.setBackground(new java.awt.Color(0, 0, 0));
        viewdetailsbtn.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        viewdetailsbtn.setForeground(new java.awt.Color(204, 204, 255));
        viewdetailsbtn.setText("View Details");
        viewdetailsbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewdetailsbtnActionPerformed(evt);
            }
        });

        delaccbtn.setBackground(new java.awt.Color(0, 0, 0));
        delaccbtn.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        delaccbtn.setForeground(new java.awt.Color(204, 204, 255));
        delaccbtn.setText("Delete Account");
        delaccbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delaccbtnActionPerformed(evt);
            }
        });

        tblPerson.setBackground(new java.awt.Color(0, 0, 0));
        tblPerson.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        tblPerson.setForeground(new java.awt.Color(204, 204, 255));
        tblPerson.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "SSN", "Age", "Weight", "Home City", "Home Zip code", "Work City", "Work Zip Code"
            }
        ));
        jScrollPane1.setViewportView(tblPerson);

        jLabel1.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Person directory");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(backbtnm, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(309, 309, 309)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(viewdetailsbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delaccbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(searchbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(txtsearch, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {delaccbtn, searchbtn, viewdetailsbtn});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backbtnm, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewdetailsbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delaccbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {delaccbtn, searchbtn, viewdetailsbtn});

    }// </editor-fold>//GEN-END:initComponents

    private void backbtnmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnmActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout= (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
                                           
    }//GEN-LAST:event_backbtnmActionPerformed

    private void delaccbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delaccbtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblPerson.getSelectedRow();
        
        if(selectedRow>=0)
        {
            
            int dialogButton = JOptionPane.YES_NO_OPTION;//option dialog box for deleting the person
            int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete the person?", "Warning", dialogButton);
            if(dialogResult == JOptionPane.YES_OPTION)
            {
                Person selectedAccount = personDirectory.getPerson().get(selectedRow);
                personDirectory.deletePerson(selectedAccount);//methhod declared in person directory
                populateTable();//refresh list
            }
            
            else//if no is an option
            {
                JOptionPane.showMessageDialog(null,"Please select a person profile from the list","Warning",JOptionPane.WARNING_MESSAGE);
            }
        }
        else// if no row is selected
        {
            JOptionPane.showMessageDialog(null,"Please select a person profile from the list","Warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_delaccbtnActionPerformed

    private void viewdetailsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewdetailsbtnActionPerformed
        // TODO add your handling code here:
        // opening view details for the selected account
        int selectedRow = tblPerson.getSelectedRow();
        //check if user selected any account
        if(selectedRow>= 0){
           

             Person selectedAccount = personDirectory.getPerson().get(selectedRow);
            
//            Person selectedAccount= (Person) tblPerson.getValueAt(selectedRow,0);//the row which user selected
            
            ViewPerson panel= new ViewPerson(userProcessContainer,personDirectory,selectedAccount);
            userProcessContainer.add("ViewPerson",panel);
            CardLayout layout=(CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        } else {//if row is not selected
            JOptionPane.showMessageDialog(null, "You need to select a profile to view  details","Warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_viewdetailsbtnActionPerformed

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
        // TODO add your handling code here:
        if(!txtsearch.getText().isBlank())
        {
            String accountNumber = txtsearch.getText();
            Person foundPerson = personDirectory.searchPerson(accountNumber);
            
            if(foundPerson!=null)//if not empty, according to the method in account directory 
            {
                ViewPerson panel= new ViewPerson(userProcessContainer,personDirectory,foundPerson);
                userProcessContainer.add("ViewPerson",panel);
                CardLayout layout=(CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
                
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Person not found. Try again");
                //if account is not found among directory
            }
            
        }else
        {
            JOptionPane.showMessageDialog(null, "Please type details to view","Warning",JOptionPane.WARNING_MESSAGE);
            //if search text field is empty
        }
        
    }//GEN-LAST:event_searchbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtnm;
    private javax.swing.JButton delaccbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchbtn;
    private javax.swing.JTable tblPerson;
    private javax.swing.JTextField txtsearch;
    private javax.swing.JButton viewdetailsbtn;
    // End of variables declaration//GEN-END:variables

    void populateTable() {
      DefaultTableModel model = (DefaultTableModel) tblPerson.getModel();
      model.setRowCount(0);
      
      for(Person p : personDirectory.getPerson()){
          
          Object[] row = new Object[9];
//          row[0] = p;
          row[0] = p.getFirstName();
          row[1]= p.getLastName();
          row[2]= p.getSSN();
          row[3]=p.getAge();
          row[4]=p.getWeight();
          if (p.getHomeAddress()!=null){
            row[5]=p.getHomeAddress().getCity().toString();
            row[6]=p.getHomeAddress().getZipCode().toString();
          }
          if(p.getWorkAddress()!=null){
            row[7]=p.getWorkAddress().getCity().toString();
            row[8]=p.getWorkAddress().getZipCode().toString();
          }
          
          
//          row[8]=p;
          
          model.addRow(row);
      }
    }
}
