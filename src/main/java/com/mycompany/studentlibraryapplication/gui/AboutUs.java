package com.mycompany.studentlibraryapplication.gui;

import com.mycompany.studentlibraryapplication.entity.Librarian;
import com.mycompany.studentlibraryapplication.entity.Student;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Alex Lysun
 */
public class AboutUs extends JFrame {
	// generated serial version UID
	private static final long serialVersionUID = 730492927453849342L;
	
	// data fields
    private Student student;
    private Librarian librarian;
    private boolean isLibrarian;
    
    /**
     * Creates new form AboutUs
     * @param person
     * @param isLibrarian
     */
    public AboutUs(Object person, boolean isLibrarian) {
        this.isLibrarian = isLibrarian;
        
        if (isLibrarian)
            librarian = (Librarian) person;
        else 
            student = (Student) person;
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. 
     */
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        mainPanel = new javax.swing.JPanel();
        labelTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        panelContinue = new javax.swing.JPanel();
        buttonContinue = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("About Us");
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage((new ImageIcon("img/mainProgram-icon.png")).getImage());
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                closedAboutUs(evt);
            }
        });

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));

        labelTitle.setBackground(new java.awt.Color(255, 255, 255));
        labelTitle.setFont(new java.awt.Font("SimHei", 0, 48)); // NOI18N
        labelTitle.setForeground(new java.awt.Color(0, 204, 204));
        labelTitle.setText("About Us");

        textArea.setEditable(false);
        textArea.setBackground(new java.awt.Color(249, 255, 222));
        textArea.setColumns(20);
        textArea.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        textArea.setRows(5);
        textArea.setText("  Hello, my name is Alex.\n  It's my first project using Hibernate. \n  The main purpose of this program is to facilitate work librarians in student libraries.\n  I'm a student and I study at the third year in Lviv Polytechnic National University on Department \n  of Information Security.\n  I love programming.\n\n  Thank you for using my program!!! Good luck. :-)\n\t\t\t\t\t\n\t\t\t\t\t\tMade in Lviv \n\t\t\t\t\t\t01.09.2017");
        textArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));
        textArea.setFocusable(false);
        textArea.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(textArea);

        panelContinue.setBackground(java.awt.Color.orange);

        buttonContinue.setBackground(new java.awt.Color(204, 204, 204));
        buttonContinue.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        buttonContinue.setForeground(new java.awt.Color(255, 255, 255));
        buttonContinue.setText("Сontinue");
        buttonContinue.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, buttonContinue, org.jdesktop.beansbinding.ELProperty.create("false"), buttonContinue, org.jdesktop.beansbinding.BeanProperty.create("contentAreaFilled"));
        bindingGroup.addBinding(binding);

        buttonContinue.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                hoverButtonContinue(evt);
            }
        });
        buttonContinue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disposeAboutUs(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitedButtonContinue(evt);
            }
        });
        buttonContinue.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                enterButtonContinue(evt);
            }
        });

        javax.swing.GroupLayout panelContinueLayout = new javax.swing.GroupLayout(panelContinue);
        panelContinue.setLayout(panelContinueLayout);
        panelContinueLayout.setHorizontalGroup(
            panelContinueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonContinue, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
        );
        panelContinueLayout.setVerticalGroup(
            panelContinueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContinueLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(buttonContinue, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mainPanelLayout.createSequentialGroup()
                            .addGap(282, 282, 282)
                            .addComponent(labelTitle))
                        .addGroup(mainPanelLayout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelContinue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitle)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelContinue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    } // end initComponents method

    private void closedAboutUs(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closedAboutUs
        if ( isLibrarian )
            MainProgramForLibrarian.start( librarian );
        else
            MainProgramForStudent.start( student );
    }//GEN-LAST:event_closedAboutUs

    private void exitedButtonContinue(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitedButtonContinue
        panelContinue.setBackground(Color.ORANGE);
    }//GEN-LAST:event_exitedButtonContinue

    private void hoverButtonContinue(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hoverButtonContinue
        panelContinue.setBackground(Color.YELLOW);
    }//GEN-LAST:event_hoverButtonContinue

    private void disposeAboutUs(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disposeAboutUs
        dispose();
    }//GEN-LAST:event_disposeAboutUs

    private void enterButtonContinue(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enterButtonContinue
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) 
            dispose();
    }//GEN-LAST:event_enterButtonContinue
            

    public static void start(Object person, boolean isLibrarian) {
        /* Set the Nimbus look and feel */
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AboutUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AboutUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AboutUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AboutUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AboutUs(person, isLibrarian).setVisible(true);
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton buttonContinue;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel panelContinue;
    private javax.swing.JTextArea textArea;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration
}
