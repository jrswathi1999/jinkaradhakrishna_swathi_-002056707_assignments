/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import model.person;

/**
 *
 * @author jrswa
 */
public class MainJFrame extends javax.swing.JFrame {

    person person;
    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        person= new person();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitpanel = new javax.swing.JSplitPane();
        menu = new javax.swing.JPanel();
        createprof = new javax.swing.JButton();
        viewProf = new javax.swing.JButton();
        workspace = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menu.setMinimumSize(new java.awt.Dimension(150, 150));

        createprof.setText("Create Profile");
        createprof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createprofActionPerformed(evt);
            }
        });

        viewProf.setText("View Profile");
        viewProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewProfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(createprof, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewProf, javax.swing.GroupLayout.PREFERRED_SIZE, 85, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        menuLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {createprof, viewProf});

        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(createprof)
                .addGap(34, 34, 34)
                .addComponent(viewProf)
                .addContainerGap(330, Short.MAX_VALUE))
        );

        menuLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {createprof, viewProf});

        splitpanel.setLeftComponent(menu);

        workspace.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout workspaceLayout = new javax.swing.GroupLayout(workspace);
        workspace.setLayout(workspaceLayout);
        workspaceLayout.setHorizontalGroup(
            workspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 734, Short.MAX_VALUE)
        );
        workspaceLayout.setVerticalGroup(
            workspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 569, Short.MAX_VALUE)
        );

        splitpanel.setRightComponent(workspace);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitpanel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitpanel)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createprofActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createprofActionPerformed
        // TODO add your handling code here:
        Createprofpanel createprofpanel = new Createprofpanel(person);
        splitpanel.setRightComponent(createprofpanel);
    }//GEN-LAST:event_createprofActionPerformed

    private void viewProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewProfActionPerformed
        // TODO add your handling code here:
        
        Viewprofpanel viewprofpanel = new Viewprofpanel(person);
        splitpanel.setRightComponent(viewprofpanel);
    }//GEN-LAST:event_viewProfActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createprof;
    private javax.swing.JPanel menu;
    private javax.swing.JSplitPane splitpanel;
    private javax.swing.JButton viewProf;
    private javax.swing.JPanel workspace;
    // End of variables declaration//GEN-END:variables
}
