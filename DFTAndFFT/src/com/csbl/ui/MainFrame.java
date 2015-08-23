
package com.csbl.ui;

import com.csbl.ui.dft.DFTAnalyser;
import com.csbl.ui.dft.IDFTAnalyser;
import com.csbl.ui.fft.FFTAnalyser;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class MainFrame extends javax.swing.JFrame {

    SoftwareLabel label;
    
    public MainFrame() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setResizable(true);
        setBackground(new java.awt.Color(240, 253, 249));
        setContentPane(new JLabel());
        //setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/icon.png")));
        setLayout(new BorderLayout());
        label = new SoftwareLabel("Developed By - Md. Abu Noman, Software Programmer, Mobile - 01717717488");
        label.setBlinkingOn(true);
        add("South",label);
        setPreferredSize(new Dimension(600, 500));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        menuBar = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        menuItemDFT = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuItemIDFT = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        menuItemFFT = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        menuItemExit = new javax.swing.JMenuItem();
        menuAbout = new javax.swing.JMenu();
        menuItemDeveloper = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("DFT, IDFT & FFT Analysis");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(240, 253, 249));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 675, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        menuFile.setText("File");

        menuItemDFT.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        menuItemDFT.setText("DFT");
        menuItemDFT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemDFTActionPerformed(evt);
            }
        });
        menuFile.add(menuItemDFT);
        menuFile.add(jSeparator1);

        menuItemIDFT.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        menuItemIDFT.setText("IDFT");
        menuItemIDFT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemIDFTActionPerformed(evt);
            }
        });
        menuFile.add(menuItemIDFT);
        menuFile.add(jSeparator2);

        menuItemFFT.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        menuItemFFT.setText("FFT");
        menuItemFFT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemFFTActionPerformed(evt);
            }
        });
        menuFile.add(menuItemFFT);
        menuFile.add(jSeparator3);

        menuItemExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        menuItemExit.setText("Exit");
        menuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemExitActionPerformed(evt);
            }
        });
        menuFile.add(menuItemExit);

        menuBar.add(menuFile);

        menuAbout.setText("About");

        menuItemDeveloper.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        menuItemDeveloper.setText("Developer");
        menuItemDeveloper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemDeveloperActionPerformed(evt);
            }
        });
        menuAbout.add(menuItemDeveloper);

        menuBar.add(menuAbout);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemDFTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemDFTActionPerformed
        new DFTAnalyser(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_menuItemDFTActionPerformed

    private void menuItemIDFTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemIDFTActionPerformed
        new IDFTAnalyser(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_menuItemIDFTActionPerformed

    private void menuItemFFTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemFFTActionPerformed
        new FFTAnalyser(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_menuItemFFTActionPerformed

    private void menuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemExitActionPerformed
        int conf=javax.swing.JOptionPane.showConfirmDialog(rootPane, "Do you want to EXIT ?", "Confirm !", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(conf==0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_menuItemExitActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        menuItemExitActionPerformed(null);
    }//GEN-LAST:event_formWindowClosing

    private void menuItemDeveloperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemDeveloperActionPerformed
        new DeveloperUI(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_menuItemDeveloperActionPerformed

    public static void main(String args[]) {
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JMenu menuAbout;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenuItem menuItemDFT;
    private javax.swing.JMenuItem menuItemDeveloper;
    private javax.swing.JMenuItem menuItemExit;
    private javax.swing.JMenuItem menuItemFFT;
    private javax.swing.JMenuItem menuItemIDFT;
    // End of variables declaration//GEN-END:variables
}
