package com.mycompany.studentlibraryapplication.gui;

import com.mycompany.studentlibraryapplication.db.Dao;
import com.mycompany.studentlibraryapplication.entity.Student;
import com.mycompany.studentlibraryapplication.entity.Librarian;
import com.mycompany.studentlibraryapplication.utils.MD5Util;
import com.mycompany.studentlibraryapplication.validation.Validator;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.ImageIcon;

/**
 *
 * @author Alex Lysun
 */
public class Signup extends JFrame {
	// generated serial version UID
	private static final long serialVersionUID = -8380590578508263857L;
	
	// data field
    private Color color;
    
    /**
     * Creates new form Signup
     */
    public Signup() {
        initComponents();
        textFieldID.requestFocus();
        color = panelGoback.getBackground();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. 
     */
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        labelTitle = new javax.swing.JLabel();
        img2 = new javax.swing.JLabel();
        img1 = new javax.swing.JLabel();
        panelSubmit = new javax.swing.JPanel();
        buttonSubmit = new javax.swing.JButton();
        buttonClear = new javax.swing.JButton();
        panelSignup = new javax.swing.JPanel();
        labelID = new javax.swing.JLabel();
        labelFirstName = new javax.swing.JLabel();
        labelLastName = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        labelPassword1 = new javax.swing.JLabel();
        labelPassword2 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        passwordFieldConfirm = new javax.swing.JPasswordField();
        textFieldID = new javax.swing.JTextField();
        textFieldFirstName = new javax.swing.JTextField();
        textFieldLastName = new javax.swing.JTextField();
        textFieldEmail = new javax.swing.JTextField();
        panelGoback = new javax.swing.JPanel();
        buttonGoback = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Library Application");
        setIconImage((new ImageIcon("img/mainProgram-icon.png")).getImage());
        setName("frame"); // NOI18N
        setResizable(false);

        labelTitle.setFont(new java.awt.Font("Trebuchet MS", 3, 36)); // NOI18N
        labelTitle.setForeground(new java.awt.Color(0, 153, 204));
        labelTitle.setText("Registration Form");

        img2.setIcon(new ImageIcon("img/signup2.png"));

        img1.setIcon(new ImageIcon("img/signup.png"));

        panelSubmit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        buttonSubmit.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        buttonSubmit.setText("Submit");
        buttonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSubmitActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSubmitLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelSubmitLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {buttonClear, buttonSubmit});

        panelSubmitLayout.setVerticalGroup(
            panelSubmitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSubmitLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSubmitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelSubmitLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {buttonClear, buttonSubmit});

        panelSignup.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        labelID.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        labelID.setText("ID: ");

        labelFirstName.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        labelFirstName.setText("First Name:");

        labelLastName.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        labelLastName.setText("Last Name:");

        labelEmail.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        labelEmail.setText("Email: ");

        labelPassword1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        labelPassword1.setText("Password:");

        labelPassword2.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        labelPassword2.setText("<html>Confirm<br>\nPassword:\n</html> "); // NOI18N

        passwordField.setFont(new java.awt.Font("Wide Latin", 3, 14)); // NOI18N
        passwordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                enterPassword(evt);
            }
        });

        passwordFieldConfirm.setFont(new java.awt.Font("Wide Latin", 3, 14)); // NOI18N
        passwordFieldConfirm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                confirmPassword(evt);
            }
        });

        textFieldID.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        textFieldID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                enterID(evt);
            }
        });

        textFieldFirstName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        textFieldFirstName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                enterFirstName(evt);
            }
        });

        textFieldLastName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        textFieldLastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                enterLastName(evt);
            }
        });

        textFieldEmail.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        textFieldEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                enterEmail(evt);
            }
        });

        javax.swing.GroupLayout panelSignupLayout = new javax.swing.GroupLayout(panelSignup);
        panelSignup.setLayout(panelSignupLayout);
        panelSignupLayout.setHorizontalGroup(
            panelSignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSignupLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panelSignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPassword1)
                    .addComponent(labelEmail)
                    .addComponent(labelLastName)
                    .addComponent(labelFirstName)
                    .addComponent(labelPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelID))
                .addGap(23, 23, 23)
                .addGroup(panelSignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSignupLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelSignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                            .addComponent(passwordFieldConfirm, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                            .addComponent(textFieldID)))
                    .addComponent(textFieldFirstName)
                    .addComponent(textFieldLastName)
                    .addComponent(textFieldEmail))
                .addGap(29, 29, 29))
        );

        panelSignupLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {passwordField, passwordFieldConfirm});

        panelSignupLayout.setVerticalGroup(
            panelSignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSignupLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelID)
                    .addComponent(textFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelSignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelFirstName)
                    .addComponent(textFieldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelSignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLastName)
                    .addComponent(textFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelSignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelEmail)
                    .addComponent(textFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelSignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSignupLayout.createSequentialGroup()
                        .addGroup(panelSignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelPassword1)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(labelPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(passwordFieldConfirm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelSignupLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {passwordField, passwordFieldConfirm});

        panelGoback.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));

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
            .addComponent(buttonGoback, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelGobackLayout.setVerticalGroup(
            panelGobackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGobackLayout.createSequentialGroup()
                .addComponent(buttonGoback, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(img2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addComponent(img1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelSignup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelGoback, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelTitle)
                .addGap(146, 146, 146))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelTitle))
                    .addComponent(panelGoback, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelSignup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(panelSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(img2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(img1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    } // end initComponents method

    private void buttonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClearActionPerformed
        clear();
    }//GEN-LAST:event_buttonClearActionPerformed
    
    private void clear() {
        textFieldID.setText("");
        textFieldID.requestFocus();
        textFieldFirstName.setText("");
        textFieldLastName.setText("");
        textFieldEmail.setText("");
        passwordField.setText("");
        passwordFieldConfirm.setText("");
    }
    
    private void enterID(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enterID
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) 
            checkFields();
    }//GEN-LAST:event_enterID

    private void enterFirstName(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enterFirstName
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) 
            checkFields();
    }//GEN-LAST:event_enterFirstName

    private void enterLastName(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enterLastName
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
            checkFields();
    }//GEN-LAST:event_enterLastName

    private void enterEmail(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enterEmail
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) 
            checkFields();
    }//GEN-LAST:event_enterEmail

    private void enterPassword(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enterPassword
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
            checkFields();
    }//GEN-LAST:event_enterPassword

    private void confirmPassword(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_confirmPassword
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
            checkFields();
    }//GEN-LAST:event_confirmPassword

    private void buttonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSubmitActionPerformed
        checkFields();
    }//GEN-LAST:event_buttonSubmitActionPerformed

    private void exitedGoback(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitedGoback
        panelGoback.setBackground(color);
    }//GEN-LAST:event_exitedGoback

    private void hoverGoback(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hoverGoback
        panelGoback.setBackground(Color.GRAY);
    }//GEN-LAST:event_hoverGoback

    private void clickGoback(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickGoback
        dispose();
        Login.start(null, null);
    }//GEN-LAST:event_clickGoback

    // validate all text and password fields
    private void checkFields() {
        if ( (Validator.validateStudentId( textFieldID.getText() ) 
                || Validator.validateLibrarianId(textFieldID.getText() ) )
                && Validator.validateName( textFieldFirstName.getText() )
                && Validator.validateName( textFieldLastName.getText() )
                && Validator.validateEmail(textFieldEmail.getText() )
                && Validator.validatePassword(new String( passwordField.getPassword() ) )
                && Validator.validatePassword(new String( passwordFieldConfirm.getPassword() ) ) ) 
            signup();
        else if ( !Validator.validateStudentId(textFieldID.getText()) && !Validator.validateLibrarianId(textFieldID.getText() ) ) {
            JOptionPane.showMessageDialog(null, "ID must begin with 'S' for student or with 'L' for librarian and then contains 6 digits."
                    + "\nFor example, S000001 or L000002.",
                    "Info", JOptionPane.INFORMATION_MESSAGE);
            textFieldID.requestFocus();
            textFieldID.setText("");
        } else if ( !Validator.validateName( textFieldFirstName.getText() ) ) {
            JOptionPane.showMessageDialog(null, "First Name must begin with uppercase letter(A-Z) and then contains lowercase letters(a-z)."
                    + "\nFor example: Alex, Kate.",
                    "Info", JOptionPane.INFORMATION_MESSAGE);
            textFieldFirstName.requestFocus();
            textFieldFirstName.setText("");
        } else if ( !Validator.validateName( textFieldLastName.getText() ) ) {
            JOptionPane.showMessageDialog(null, "Last Name must begin with uppercase letter(A-Z) and then contains lowercase letters(a-z)."
                    + "\nFor example: Lysun, Winslet.",
                    "Info", JOptionPane.INFORMATION_MESSAGE);
            textFieldLastName.requestFocus();
            textFieldLastName.setText("");
        } else if ( !Validator.validateEmail(textFieldEmail.getText() ) ) {
            JOptionPane.showMessageDialog(null, "Email " + textFieldEmail.getText() + " is not valid.",
                    "Info", JOptionPane.INFORMATION_MESSAGE);
            textFieldEmail.requestFocus();
            textFieldEmail.setText("");
        } else if ( !Validator.validatePassword( new String( passwordField.getPassword() ) ) ) {
            JOptionPane.showMessageDialog(null, "Password is not valid.\nThe valid password must have:"
                    + "\n# digit from 0-9\n# lowercase characters"
                    + "\n# uppercase characters\n# special symbols in the list \"@#$%\""
                    + "\n# length at least 6 characters and maximum of 20."
                    + "For example: g1fS5gF@L$",
                    "Info", JOptionPane.INFORMATION_MESSAGE);
            passwordField.requestFocus();
            passwordField.setText("");
        } else if ( !Validator.validatePassword( new String( passwordFieldConfirm.getPassword() ) ) ) {
            JOptionPane.showMessageDialog(null, "Confirm Password is not valid.\nThe valid password must have:"
                    + "\n# digit from 0-9\n# lowercase characters"
                    + "\n# uppercase characters\n# special symbols in the list \"@#$%\""
                    + "\n# length at least 6 characters and maximum of 20."
                    + "For example: g1fS5gF@L$",
                    "Info", JOptionPane.INFORMATION_MESSAGE);
            passwordFieldConfirm.requestFocus();
            passwordFieldConfirm.setText("");
        }        
    }
    
    // check confirm password that it equal password
    private boolean checkPassword() {
        String password = new String(passwordField.getPassword());
        String confirmPassword = new String(passwordFieldConfirm.getPassword());
        if (password.equals(confirmPassword))
            return true;
        else
            return false;
    }
    
    // signup student or librarian
    private void signup() {
        // validate password
        if (checkPassword()) {
            // take input data
            String id = textFieldID.getText();
            String firstName = textFieldFirstName.getText();
            String lastName = textFieldLastName.getText();
            String email = textFieldEmail.getText();
            String password = new String(passwordField.getPassword());
            String passwordHash = MD5Util.md5Custom(password);
            Object person = null;
            String infoMessage = null;
            
            if (Validator.validateLibrarianId(id)) {
                // create Student object                
                person = new Librarian(id, firstName, lastName, email, passwordHash);
                infoMessage = "The librarian was successfully registered!";
            } else {
                // create Student object
                person  = new Student(id, firstName, lastName, email, passwordHash);
                infoMessage = "The student was successfully registered!";
            }            
            
            // signup new student or librarian
            if ( Dao.signup( person, id )) {            
                JOptionPane.showMessageDialog(null, infoMessage,
                        "Info", JOptionPane.INFORMATION_MESSAGE);
                dispose();
                // call login form with parameters
                Login.start(id, password);
            } else {
                JOptionPane.showMessageDialog(null, "Error! Could not register you."
                    + " Please try again. Maybe a student or librarian with such an ID is already registered.", 
                    "Error", JOptionPane.ERROR_MESSAGE);
                clear();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Confirm Password is not equal Password",
                    "Warning", JOptionPane.WARNING_MESSAGE);
            passwordField.setText("");
            passwordFieldConfirm.setText("");
            passwordField.requestFocus();
        }
    }

    public static void start() {
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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Signup().setVisible(true);
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton buttonClear;
    private javax.swing.JButton buttonGoback;
    private javax.swing.JButton buttonSubmit;
    private javax.swing.JLabel img1;
    private javax.swing.JLabel img2;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelFirstName;
    private javax.swing.JLabel labelID;
    private javax.swing.JLabel labelLastName;
    private javax.swing.JLabel labelPassword1;
    private javax.swing.JLabel labelPassword2;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JPanel panelGoback;
    private javax.swing.JPanel panelSignup;
    private javax.swing.JPanel panelSubmit;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JPasswordField passwordFieldConfirm;
    private javax.swing.JTextField textFieldEmail;
    private javax.swing.JTextField textFieldFirstName;
    private javax.swing.JTextField textFieldID;
    private javax.swing.JTextField textFieldLastName;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration
}
