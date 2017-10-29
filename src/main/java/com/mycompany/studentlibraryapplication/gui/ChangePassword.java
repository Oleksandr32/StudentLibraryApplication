package com.mycompany.studentlibraryapplication.gui;

import com.mycompany.studentlibraryapplication.entity.Student;
import com.mycompany.studentlibraryapplication.entity.Librarian;
import com.mycompany.studentlibraryapplication.utils.MD5Util;
import com.mycompany.studentlibraryapplication.validation.Validator;
import com.mycompany.studentlibraryapplication.db.Dao;

import java.awt.Color;
import javax.swing.JFrame;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Alex Lysun
 */
public class ChangePassword extends JFrame {
	// generated serial version UID
	private static final long serialVersionUID = -5640084556763259590L;
	
	// data fields
    private Student student;
    private Librarian librarian;
    private boolean isLibrarian;
    private String previousPassword;
    private String newPassword;
    
    /**
     * Creates new form ChangePassword
     * default constructor
     */
    public ChangePassword() { 
        initComponents();
    }
    
    /**
     * Creates new form ChangePassword
     * 
     * constructor that takes parameters
     * @param person
     * @param isLibrarian
     */
    public ChangePassword(Object person, boolean isLibrarian) {
        this.isLibrarian = isLibrarian;
        previousPassword = null;
        newPassword = null;
        // check whether the person is a student or librarian object
        if (isLibrarian)
            librarian = (Librarian) person;
        else
            student = (Student) person;
        
        initComponents();
        passwordFieldPrevious.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code.
     */
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jPanel1 = new javax.swing.JPanel();
        icon = new javax.swing.JLabel();
        panelSubmit = new javax.swing.JPanel();
        buttonChange = new javax.swing.JButton();
        buttonClear = new javax.swing.JButton();
        panelChangePassword = new javax.swing.JPanel();
        passwordFieldNew = new javax.swing.JPasswordField();
        passwordFieldConfirm = new javax.swing.JPasswordField();
        passwordFieldPrevious = new javax.swing.JPasswordField();
        labelPreviousPassword = new javax.swing.JLabel();
        labelPreviousPassword1 = new javax.swing.JLabel();
        labelPreviousPassword2 = new javax.swing.JLabel();
        panelGoback = new javax.swing.JPanel();
        buttonGoback = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Change Password");
        setIconImage((new ImageIcon("img/mainProgram-icon.png")).getImage());
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                closedChangePassword(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        icon.setIcon(new ImageIcon("img/changePassword.png"));

        panelSubmit.setBackground(new java.awt.Color(255, 255, 255));
        panelSubmit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        buttonChange.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        buttonChange.setText("Change");
        buttonChange.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickButtonChange(evt);
            }
        });

        buttonClear.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        buttonClear.setText("Clear");
        buttonClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickButtonClear(evt);
            }
        });

        javax.swing.GroupLayout panelSubmitLayout = new javax.swing.GroupLayout(panelSubmit);
        panelSubmit.setLayout(panelSubmitLayout);
        panelSubmitLayout.setHorizontalGroup(
            panelSubmitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSubmitLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonChange, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(buttonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelSubmitLayout.setVerticalGroup(
            panelSubmitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSubmitLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSubmitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonChange, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(buttonClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelChangePassword.setBackground(new java.awt.Color(255, 255, 255));
        panelChangePassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        passwordFieldNew.setFont(new java.awt.Font("Wide Latin", 3, 14)); // NOI18N
        passwordFieldNew.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                enterNewPassword(evt);
            }
        });

        passwordFieldConfirm.setFont(new java.awt.Font("Wide Latin", 3, 14)); // NOI18N
        passwordFieldConfirm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                enterConfirmPassword(evt);
            }
        });

        passwordFieldPrevious.setFont(new java.awt.Font("Wide Latin", 3, 14)); // NOI18N
        passwordFieldPrevious.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                enterPreviousPassword(evt);
            }
        });

        labelPreviousPassword.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        labelPreviousPassword.setText("Previous Password:");

        labelPreviousPassword1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        labelPreviousPassword1.setText("New Password:");

        labelPreviousPassword2.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        labelPreviousPassword2.setText("<html>Confirm<br>\nNew Password:</html>");

        javax.swing.GroupLayout panelChangePasswordLayout = new javax.swing.GroupLayout(panelChangePassword);
        panelChangePassword.setLayout(panelChangePasswordLayout);
        panelChangePasswordLayout.setHorizontalGroup(
            panelChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChangePasswordLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPreviousPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPreviousPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPreviousPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordFieldConfirm)
                    .addComponent(passwordFieldNew)
                    .addComponent(passwordFieldPrevious))
                .addGap(20, 20, 20))
        );

        panelChangePasswordLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {labelPreviousPassword, labelPreviousPassword1});

        panelChangePasswordLayout.setVerticalGroup(
            panelChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChangePasswordLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordFieldPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPreviousPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordFieldNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPreviousPassword1))
                .addGap(11, 11, 11)
                .addGroup(panelChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelPreviousPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordFieldConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panelGoback.setBackground(new java.awt.Color(255, 255, 255));

        buttonGoback.setBackground(new java.awt.Color(255, 255, 255));
        buttonGoback.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        buttonGoback.setIcon(new ImageIcon("img/go back.png"));
        buttonGoback.setText("Go Back  ");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, buttonGoback, org.jdesktop.beansbinding.ELProperty.create("false"), buttonGoback, org.jdesktop.beansbinding.BeanProperty.create("contentAreaFilled"));
        bindingGroup.addBinding(binding);

        buttonGoback.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                hoverGoback(evt);
            }
        });
        buttonGoback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickGoback(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitedGoback(evt);
            }
        });

        javax.swing.GroupLayout panelGobackLayout = new javax.swing.GroupLayout(panelGoback);
        panelGoback.setLayout(panelGobackLayout);
        panelGobackLayout.setHorizontalGroup(
            panelGobackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonGoback, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelGobackLayout.setVerticalGroup(
            panelGobackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGobackLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(buttonGoback, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelChangePassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(panelGoback, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(icon)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(panelGoback, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(icon)
                        .addGap(18, 18, 18)))
                .addComponent(panelChangePassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    } // end initComponents method

    private void closedChangePassword(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closedChangePassword
        if ( isLibrarian )
            MainProgramForLibrarian.start( librarian );
        else
            MainProgramForStudent.start( student );
    }//GEN-LAST:event_closedChangePassword

    private void clickButtonClear(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickButtonClear
        passwordFieldPrevious.setText("");
        passwordFieldPrevious.requestFocus();
        passwordFieldNew.setText("");
        passwordFieldConfirm.setText("");
    }//GEN-LAST:event_clickButtonClear

    private void clickButtonChange(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickButtonChange
        checkField();
    }//GEN-LAST:event_clickButtonChange

    private void enterPreviousPassword(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enterPreviousPassword
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
            checkField();
    }//GEN-LAST:event_enterPreviousPassword

    private void enterNewPassword(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enterNewPassword
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
            checkField();
    }//GEN-LAST:event_enterNewPassword

    private void enterConfirmPassword(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enterConfirmPassword
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
            checkField();
    }//GEN-LAST:event_enterConfirmPassword

    private void hoverGoback(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hoverGoback
        panelGoback.setBackground(Color.PINK);
    }//GEN-LAST:event_hoverGoback

    private void clickGoback(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickGoback
        dispose();
    }//GEN-LAST:event_clickGoback

    private void exitedGoback(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitedGoback
        panelGoback.setBackground(Color.WHITE);
    }//GEN-LAST:event_exitedGoback

    // validate all password fields
    private void checkField() {
        if ( Validator.validatePassword( new String( passwordFieldPrevious.getPassword() ) ) 
                && Validator.validatePassword( new String( passwordFieldNew.getPassword() ) )
                && Validator.validatePassword( new String( passwordFieldConfirm.getPassword() ) ) ) {
            changePreviousPassword();
        } else if ( !Validator.validatePassword( new String( passwordFieldPrevious.getPassword() ) ) ) {            
            JOptionPane.showMessageDialog(null, "Previous Password is not valid.\nThe valid password must have:"
                    + "\n# digit from 0-9\n# lowercase characters"
                    + "\n# uppercase characters\n# special symbols in the list \"@#$%\""
                    + "\n# length at least 6 characters and maximum of 20."
                    + "For example: g1fS5gF@L$",
                    "Info", JOptionPane.INFORMATION_MESSAGE);
            passwordFieldPrevious.requestFocus();
            passwordFieldPrevious.setText("");
        } else if ( !Validator.validatePassword( new String( passwordFieldNew.getPassword() ) ) ) {            
            JOptionPane.showMessageDialog(null, "New Password is not valid.\nThe valid password must have:"
                    + "\n# digit from 0-9\n# lowercase characters"
                    + "\n# uppercase characters\n# special symbols in the list \"@#$%\""
                    + "\n# length at least 6 characters and maximum of 20."
                    + "For example: g1fS5gF@L$",
                    "Info", JOptionPane.INFORMATION_MESSAGE);
            passwordFieldNew.requestFocus();
            passwordFieldNew.setText("");
        } else if ( !Validator.validatePassword( new String( passwordFieldConfirm.getPassword() ) ) ) {            
            JOptionPane.showMessageDialog(null, "Confirm New Password is not valid.\nThe valid password must have:"
                    + "\n# digit from 0-9\n# lowercase characters"
                    + "\n# uppercase characters\n# special symbols in the list \"@#$%\""
                    + "\n# length at least 6 characters and maximum of 20."
                    + "For example: g1fS5gF@L$",
                    "Info", JOptionPane.INFORMATION_MESSAGE);
            passwordFieldConfirm.requestFocus();
            passwordFieldConfirm.setText("");
        } 
    }
    
    // check previous password for the password you entered
    private boolean checkPreviousPassword() {
        String previousPasswordHash = MD5Util.md5Custom( previousPassword );
        
        // check whether the person is a student or librarian object
        if ( isLibrarian ) {
            if ( librarian.getPassword().equals( previousPasswordHash ) )
                return true;
            else
                return false;
        } else {
            if ( student.getPassword().equals( previousPasswordHash ) )
                return true;
            else
                return false;
        }
        
    }
    
    // check new password and confirm
    private boolean checkNewPassword() {
        String confirmPassword = new String(passwordFieldConfirm.getPassword());  
        
        if (newPassword.equals(confirmPassword))
            return true;
        else
            return false;
    }
    
    // change the previous password for the password you entered
    private void changePreviousPassword() {
        previousPassword = new String(passwordFieldPrevious.getPassword());
        newPassword = new String(passwordFieldNew.getPassword());
        String newPasswordHash = MD5Util.md5Custom(newPassword);
        String previousPasswordHash = null;
        
        // check previous password for the password you entered
        if ( checkPreviousPassword() ) {
            // check new password and confirm
            if ( checkNewPassword() ) {
                // check whether the person is a student or librarian object
                if ( isLibrarian ) {
                    previousPasswordHash = librarian.getPassword();
                    librarian.setPassword( newPasswordHash );
                    // changes password for librarian in database
                    if (Dao.changePassword( librarian )) {
                        JOptionPane.showMessageDialog(null, "The password was successfully changed!",
                            "Info", JOptionPane.INFORMATION_MESSAGE);
                        dispose();
                    } else {
                        librarian.setPassword( previousPasswordHash );
                        JOptionPane.showMessageDialog(null, "An error occurred. The password was not changed! Please try again.",
                            "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    
                } else {
                    previousPasswordHash = student.getPassword();
                    student.setPassword( newPasswordHash );
                    // changes password for student in database
                    if (Dao.changePassword( student )) {
                        JOptionPane.showMessageDialog(null, "The password was successfully changed!",
                            "Info", JOptionPane.INFORMATION_MESSAGE);
                        dispose();
                    } else {
                        student.setPassword( previousPasswordHash );
                        JOptionPane.showMessageDialog(null, "An error occurred. The password was not changed! Please try again.",
                            "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    
                } // end if ( isLibrarian )
                
            } else {
                JOptionPane.showMessageDialog(null, "Confirm New Password is not equal New Password. Please try again.",
                    "Warning", JOptionPane.WARNING_MESSAGE);
                passwordFieldNew.setText("");
                passwordFieldNew.requestFocus();
                passwordFieldConfirm.setText("");            
            } // end if ( checkNewPassword() )
            
        } else {
            JOptionPane.showMessageDialog(null, "The previous password you entered is incorrect. Please try again.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            passwordFieldPrevious.setText("");
            passwordFieldPrevious.requestFocus();
        } // end if ( checkPreviousPassword() )
    } // end changePreviousPassword method
    
    
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
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ChangePassword( person, isLibrarian ).setVisible( true );
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton buttonChange;
    private javax.swing.JButton buttonClear;
    private javax.swing.JButton buttonGoback;
    private javax.swing.JLabel icon;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelPreviousPassword;
    private javax.swing.JLabel labelPreviousPassword1;
    private javax.swing.JLabel labelPreviousPassword2;
    private javax.swing.JPanel panelChangePassword;
    private javax.swing.JPanel panelGoback;
    private javax.swing.JPanel panelSubmit;
    private javax.swing.JPasswordField passwordFieldConfirm;
    private javax.swing.JPasswordField passwordFieldNew;
    private javax.swing.JPasswordField passwordFieldPrevious;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration
}
