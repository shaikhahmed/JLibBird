/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sadi
 */

public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
     //@SuppressWarnings()
    
     public MainWindow() {
         initComponents();
    }

     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jShowDataTable = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        addItem = new javax.swing.JMenuItem();
        issueItem = new javax.swing.JMenuItem();
        exitWin = new javax.swing.JMenuItem();
        searchMenu = new javax.swing.JMenu();
        searchBookItem = new javax.swing.JMenuItem();
        searchIssueItem = new javax.swing.JMenuItem();

        jScrollPane1.setViewportView(jTree1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jShowDataTable.setText("Show Data Table");
        jShowDataTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jShowDataTableActionPerformed(evt);
            }
        });

        fileMenu.setText("File");

        addItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        addItem.setText("Add book");
        addItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemActionPerformed(evt);
            }
        });
        fileMenu.add(addItem);

        issueItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        issueItem.setText("Issue to anyone");
        issueItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issueItemActionPerformed(evt);
            }
        });
        fileMenu.add(issueItem);

        exitWin.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        exitWin.setText("Exit");
        exitWin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitWinActionPerformed(evt);
            }
        });
        fileMenu.add(exitWin);

        jMenuBar1.add(fileMenu);

        searchMenu.setText("Search");

        searchBookItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        searchBookItem.setText("Search Book");
        searchBookItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBookItemActionPerformed(evt);
            }
        });
        searchMenu.add(searchBookItem);

        searchIssueItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        searchIssueItem.setText("Search Issue");
        searchIssueItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchIssueItemActionPerformed(evt);
            }
        });
        searchMenu.add(searchIssueItem);

        jMenuBar1.add(searchMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(jShowDataTable)
                .addContainerGap(205, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jShowDataTable)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void issueItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issueItemActionPerformed
        /*open another page code*/
          java.awt.EventQueue.invokeLater(new Runnable() {
              @Override
            public void run() {
                new issueWindow().setVisible(true); /*First is page name*/
                         }
               });
          this.dispose();
    }//GEN-LAST:event_issueItemActionPerformed

    private void exitWinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitWinActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitWinActionPerformed

    private void addItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemActionPerformed
       /*open another page code*/
          java.awt.EventQueue.invokeLater(new Runnable() {
              @Override
            public void run() {
                new JEntryWindow().setVisible(true); /*First is page name*/
                         }
               });
          this.dispose();
           /*open another page code*/ 
           //this.dispose();/*close a page*/


    }//GEN-LAST:event_addItemActionPerformed

    private void searchBookItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBookItemActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JsearchWindow().setVisible(true);
            }
        });
        this.dispose();
    }//GEN-LAST:event_searchBookItemActionPerformed

    private void jShowDataTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jShowDataTableActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new jTableData().setVisible(true);
            }
        });
        this.dispose();
    }//GEN-LAST:event_jShowDataTableActionPerformed

    private void searchIssueItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchIssueItemActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new issueSearch().setVisible(true);
            }
        });
        this.dispose();
    }//GEN-LAST:event_searchIssueItemActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addItem;
    private javax.swing.JMenuItem exitWin;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem issueItem;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jShowDataTable;
    private javax.swing.JTree jTree1;
    private javax.swing.JMenuItem searchBookItem;
    private javax.swing.JMenuItem searchIssueItem;
    private javax.swing.JMenu searchMenu;
    // End of variables declaration//GEN-END:variables
}
