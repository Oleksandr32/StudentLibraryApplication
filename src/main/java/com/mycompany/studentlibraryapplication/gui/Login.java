package com.mycompany.studentlibraryapplication.gui;

import com.mycompany.studentlibraryapplication.db.Dao;
import com.mycompany.studentlibraryapplication.entity.Librarian;
import com.mycompany.studentlibraryapplication.entity.Student;
import com.mycompany.studentlibraryapplication.utils.MD5Util;
import com.mycompany.studentlibraryapplication.validation.Validator;

import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

/**
 *
 * @author Alex Lysun
 */
public class Login extends JFrame {
	// generated serial version UID
	private static final long serialVersionUID = -1420378466223908158L;
	
	// data field
    private String id;
    private String password;
    private String passwordHash;
    
    /**
     * Creates new form Login
     * @param id
     * @param password
     */   
    // constructor that take parameters
    public Login(String id, String password) {
        this.id = id;
        this.password = password;
        passwordHash = "";
        initComponents();
        initTextField();
    }
    
    // default constructor
    public Login() {
        initComponents();
    }
    
    // // initialize student ID and passwords fields
    private void initTextField() {
        if (id == null)
            textFieldID.setText("");
        else
            textFieldID.setText(id);
        
        if (password == null)
            passwordField.setText("");
        else
            passwordField.setText(password);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. 
     */
    private void initComponents() {
        mainPanel = new javax.swing.JPanel();
        panelLogin = new javax.swing.JPanel();
        labelID = new javax.swing.JLabel();
        textFieldID = new javax.swing.JTextField();
        labePassword = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        panelSubmit = new javax.swing.JPanel();
        buttonLogin = new javax.swing.JButton();
        buttonClear = new javax.swing.JButton();
        buttonSignup = new javax.swing.JButton();
        labelSignup = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Library Application");
        setIconImage((new ImageIcon("img/mainProgram-icon.png")).getImage());
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(239, 245, 255));

        panelLogin.setBackground(new java.awt.Color(239, 245, 255));
        panelLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        labelID.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        labelID.setText("ID:");

        textFieldID.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        textFieldID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                enterID(evt);
            }
        });

        labePassword.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        labePassword.setText("Password:");

        passwordField.setFont(new java.awt.Font("Wide Latin", 3, 14)); // NOI18N
        passwordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                enterPassword(evt);
            }
        });

        javax.swing.GroupLayout panelLoginLayout = new javax.swing.GroupLayout(panelLogin);
        panelLogin.setLayout(panelLoginLayout);
        panelLoginLayout.setHorizontalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labePassword)
                    .addComponent(labelID))
                .addGap(18, 18, 18)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textFieldID)
                    .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLoginLayout.setVerticalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelID)
                    .addComponent(textFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labePassword)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        panelSubmit.setBackground(new java.awt.Color(239, 245, 255));
        panelSubmit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        buttonLogin.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        buttonLogin.setText("Log in");
        buttonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLoginActionPerformed(evt);
            }
        });

        buttonClear.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        buttonClear.setText("Clear");
        buttonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSubmitLayout = new javax.swing.GroupLayout(panelSubmit);
        panelSubmit.setLayout(panelSubmitLayout);
        panelSubmitLayout.setHorizontalGroup(
            panelSubmitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSubmitLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(buttonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelSubmitLayout.setVerticalGroup(
            panelSubmitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSubmitLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelSubmitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonLogin)
                    .addComponent(buttonClear))
                .addContainerGap())
        );

        buttonSignup.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        buttonSignup.setText("Sign up!");
        buttonSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSignupActionPerformed(evt);
            }
        });

        labelSignup.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        labelSignup.setText("New to Student Library Application?");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(labelSignup)
                        .addGap(10, 10, 10)
                        .addComponent(buttonSignup, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
                    .addComponent(panelSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(panelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(labelSignup))
                    .addComponent(buttonSignup))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// end initComponents method

    private void enterID(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enterID
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        checkFields();
    }//GEN-LAST:event_enterID

    private void enterPassword(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enterPassword
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        checkFields();
    }//GEN-LAST:event_enterPassword

    private void buttonSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSignupActionPerformed
        dispose();
        Signup.start();
    }//GEN-LAST:event_buttonSignupActionPerformed

    private void buttonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClearActionPerformed
        textFieldID.setText("");
        passwordField.setText("");
        textFieldID.requestFocus();
    }//GEN-LAST:event_buttonClearActionPerformed

    private void buttonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLoginActionPerformed
        checkFields();
    }//GEN-LAST:event_buttonLoginActionPerformed

    // check the fields for emptiness
    private void checkFields() {
        if (textFieldID.getText().length() > 0 && passwordField.getPassword().length > 0)
            login();
        else if (textFieldID.getText().length() == 0) {            
            JOptionPane.showMessageDialog(null, "ID is required", "Info", JOptionPane.INFORMATION_MESSAGE);
            textFieldID.requestFocus();
        } else if (passwordField.getPassword().length == 0) {            
            JOptionPane.showMessageDialog(null, "Password is required", "Info", JOptionPane.INFORMATION_MESSAGE);
            passwordField.requestFocus();
        }
    }
    
    // check entered password
    private boolean checkPassword(String passwordHash, Librarian user) {
        if (user.getPassword().equals(passwordHash))
            return true;
        else
            return false;
    }
    
    // login
    private void login() {
        id = textFieldID.getText();
        password = new String(passwordField.getPassword());
        passwordHash = MD5Util.md5Custom(password);

        Librarian librarian = null;
        Student student = null;
        
        // check entered id
        if ( Validator.validateLibrarianId( id ) ) {
            librarian = (Librarian) Dao.login( id, true );
            
            if (librarian != null) {
                if (checkPassword(passwordHash, librarian)) {
                    dispose();   
                    
                    MainProgramForLibrarian.start( librarian );
                } else
                    errorIncorrectPassword();
                
            } else
                errorIdNotExit();
            // end if (librarian != null)
        } // end if Validator.validateLibrarianId( id )
        else if ( Validator.validateStudentId(id ) ) {
            student = (Student) Dao.login( id, false );
            
            if (student != null) {
                if ( checkPassword( passwordHash, student ) ) {
                    dispose();   
                    
                    MainProgramForStudent.start( student );
                } else
                    errorIncorrectPassword();
                
            } else
                errorIdNotExit();
            // end if (student != null)
        } // end if Validator.validateStudentId(id )
        else {
            errorIdNotExit();
        } 
        // end if "check entered id"
    } // end login method
    
    // error message for the case when id does not exit
    private void errorIdNotExit() {
        JOptionPane.showMessageDialog(null, "A student or librarian with such ID is not in the database. Please first sign up.",
                    "Warning", JOptionPane.WARNING_MESSAGE);
        textFieldID.setText("");
        textFieldID.requestFocus();
        passwordField.setText("");
    }
    
    // error message for the case when id does not exit
    private void errorIncorrectPassword() {
        JOptionPane.showMessageDialog(null, "The password you entered is incorrect. Please try again.",
                        "Warning", JOptionPane.WARNING_MESSAGE);
        passwordField.setText("");
        passwordField.requestFocus();
    }
    
    
    public static void start(String studentID, String password) {
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login(studentID, password).setVisible(true);
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton buttonClear;
    private javax.swing.JButton buttonLogin;
    private javax.swing.JButton buttonSignup;
    private javax.swing.JLabel labePassword;
    private javax.swing.JLabel labelID;
    private javax.swing.JLabel labelSignup;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPanel panelSubmit;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField textFieldID;
    // End of variables declaration
}
