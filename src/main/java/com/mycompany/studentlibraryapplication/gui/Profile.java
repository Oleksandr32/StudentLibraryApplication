package com.mycompany.studentlibraryapplication.gui;

import com.mycompany.studentlibraryapplication.entity.Librarian;
import com.mycompany.studentlibraryapplication.entity.Student;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;


/**
 *
 * @author Alex Lysun
 */
public class Profile extends JFrame {
	// generated serial version UID
	private static final long serialVersionUID = -3515764971521661383L;
	
	//data fields
    private Student student;
    private Librarian librarian;
    private boolean isLibrarian;
    private boolean rightToChange;
    private Color color;
    
    /**
     * Creates new form Profile
     * default constructor
     */
    public Profile() {
        initComponents();
    }
    
    // constructor that takes parameters
    public Profile(Object person, boolean isLibrarian, boolean rightToChange) {
        this.isLibrarian = isLibrarian;  
        this.rightToChange = rightToChange;
        
        if (isLibrarian)
            librarian = (Librarian) person;
        else
            student = (Student) person;
        
        initComponents();
        initDataPanel();      
        color = panelContinue.getBackground();
    }
    
    // init panel with personal data and 
    private void initDataPanel() {            
        if (isLibrarian) {
            valueStudentID.setText( librarian.getId() );
            valueFirstName.setText( librarian.getFirstName() );
            valueLastName.setText( librarian.getLastName() );
            valueEmail.setText( librarian.getEmail() );
            labelNumOfBooks.setVisible( false );
        } 
        else {
            valueStudentID.setText( student.getId() );
            valueFirstName.setText( student.getFirstName() );
            valueLastName.setText( student.getLastName() );
            valueEmail.setText( student.getEmail() );
            valueNumOfBooks.setText( String.valueOf( student.getBooks().size() ) );
        }          
        
        panelChangeAvatar.setBackground(Color.getHSBColor(198.0f, 115.0f, 89.0f)); 
        buttonChangeAvatar.setVisible( rightToChange );
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. 
     */
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        mainPanel = new javax.swing.JPanel();
        avatar = new javax.swing.JLabel();
        panelChangeAvatar = new javax.swing.JPanel();
        buttonChangeAvatar = new javax.swing.JButton();
        panelData = new javax.swing.JPanel();
        labelID = new javax.swing.JLabel();
        labelFirstName = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        labelLastName = new javax.swing.JLabel();
        labelNumOfBooks = new javax.swing.JLabel();
        panelContinue = new javax.swing.JPanel();
        buttonContinue = new javax.swing.JButton();
        valueStudentID = new javax.swing.JLabel();
        valueFirstName = new javax.swing.JLabel();
        valueLastName = new javax.swing.JLabel();
        valueEmail = new javax.swing.JLabel();
        valueNumOfBooks = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("My Profile");
        setIconImage((new ImageIcon("img/mainProgram-icon.png")).getImage());
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                activatedProfile(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                closedProfile(evt);
            }
        });

        mainPanel.setBackground(new java.awt.Color(255, 254, 244));

        avatar.setBackground(new java.awt.Color(255, 204, 153));

        panelChangeAvatar.setBackground(new java.awt.Color(255, 204, 204));

        buttonChangeAvatar.setBackground(new java.awt.Color(153, 153, 153));
        buttonChangeAvatar.setFont(new java.awt.Font("Vrinda", 1, 14)); // NOI18N
        buttonChangeAvatar.setForeground(new java.awt.Color(255, 255, 255));
        buttonChangeAvatar.setText("Change avatar");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, buttonChangeAvatar, org.jdesktop.beansbinding.ELProperty.create("false"), buttonChangeAvatar, org.jdesktop.beansbinding.BeanProperty.create("contentAreaFilled"));
        bindingGroup.addBinding(binding);

        buttonChangeAvatar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                hoverChangeAvatar(evt);
            }
        });
        buttonChangeAvatar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickChangeAvatar(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitedChangeAvatar(evt);
            }
        });

        javax.swing.GroupLayout panelChangeAvatarLayout = new javax.swing.GroupLayout(panelChangeAvatar);
        panelChangeAvatar.setLayout(panelChangeAvatarLayout);
        panelChangeAvatarLayout.setHorizontalGroup(
            panelChangeAvatarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonChangeAvatar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
        );
        panelChangeAvatarLayout.setVerticalGroup(
            panelChangeAvatarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonChangeAvatar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelData.setBackground(new java.awt.Color(253, 253, 199));

        labelID.setBackground(new java.awt.Color(255, 255, 255));
        labelID.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        labelID.setForeground(new java.awt.Color(102, 153, 255));
        labelID.setText("ID:");

        labelFirstName.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        labelFirstName.setForeground(new java.awt.Color(102, 153, 255));
        labelFirstName.setText("First Name:");

        labelEmail.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        labelEmail.setForeground(new java.awt.Color(102, 153, 255));
        labelEmail.setText("Email:");

        labelLastName.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        labelLastName.setForeground(new java.awt.Color(102, 153, 255));
        labelLastName.setText("Last Name:");

        labelNumOfBooks.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        labelNumOfBooks.setForeground(new java.awt.Color(102, 153, 255));
        labelNumOfBooks.setText("Number Of Books:");

        panelContinue.setBackground(new java.awt.Color(255, 102, 51));
        panelContinue.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        buttonContinue.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        buttonContinue.setForeground(new java.awt.Color(255, 255, 255));
        buttonContinue.setText("Continue");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, buttonContinue, org.jdesktop.beansbinding.ELProperty.create("false"), buttonContinue, org.jdesktop.beansbinding.BeanProperty.create("contentAreaFilled"));
        bindingGroup.addBinding(binding);

        buttonContinue.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                hoverContinue(evt);
            }
        });
        buttonContinue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickContinue(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitedContinue(evt);
            }
        });

        javax.swing.GroupLayout panelContinueLayout = new javax.swing.GroupLayout(panelContinue);
        panelContinue.setLayout(panelContinueLayout);
        panelContinueLayout.setHorizontalGroup(
            panelContinueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonContinue, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );
        panelContinueLayout.setVerticalGroup(
            panelContinueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonContinue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        valueStudentID.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        valueStudentID.setForeground(new java.awt.Color(255, 102, 102));

        valueFirstName.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        valueFirstName.setForeground(new java.awt.Color(255, 102, 102));

        valueLastName.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        valueLastName.setForeground(new java.awt.Color(255, 102, 102));

        valueEmail.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        valueEmail.setForeground(new java.awt.Color(255, 102, 102));

        valueNumOfBooks.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        valueNumOfBooks.setForeground(new java.awt.Color(255, 102, 102));

        javax.swing.GroupLayout panelDataLayout = new javax.swing.GroupLayout(panelData);
        panelData.setLayout(panelDataLayout);
        panelDataLayout.setHorizontalGroup(
            panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDataLayout.createSequentialGroup()
                .addGroup(panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDataLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(panelContinue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDataLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNumOfBooks)
                            .addComponent(labelEmail)
                            .addComponent(labelLastName)
                            .addComponent(labelFirstName)
                            .addComponent(labelID))
                        .addGap(34, 34, 34)
                        .addGroup(panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(valueFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(valueLastName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(valueEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(valueNumOfBooks, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                            .addComponent(valueStudentID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        panelDataLayout.setVerticalGroup(
            panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDataLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelID)
                    .addComponent(valueStudentID))
                .addGap(18, 18, 18)
                .addGroup(panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFirstName)
                    .addComponent(valueFirstName))
                .addGap(18, 18, 18)
                .addGroup(panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLastName)
                    .addComponent(valueLastName))
                .addGap(18, 18, 18)
                .addGroup(panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEmail)
                    .addComponent(valueEmail))
                .addGap(18, 18, 18)
                .addGroup(panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNumOfBooks)
                    .addComponent(valueNumOfBooks))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(panelContinue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(avatar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelChangeAvatar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(panelData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(avatar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelChangeAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void closedProfile(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closedProfile
        if ( rightToChange ) {
            if (isLibrarian)
                MainProgramForLibrarian.start( librarian );
            else
                MainProgramForStudent.start( student );
        }
    }//GEN-LAST:event_closedProfile

    private void exitedChangeAvatar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitedChangeAvatar
        panelChangeAvatar.setBackground(Color.getHSBColor(198.0f, 115.0f, 89.0f));
    }//GEN-LAST:event_exitedChangeAvatar

    private void hoverChangeAvatar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hoverChangeAvatar
        panelChangeAvatar.setBackground(Color.getHSBColor(198.0f, 125.0f, 89.0f));
    }//GEN-LAST:event_hoverChangeAvatar

    private void clickChangeAvatar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickChangeAvatar
        if ( isLibrarian )
            ChangeAvatar.start(librarian, isLibrarian);
        else
            ChangeAvatar.start(student, isLibrarian);
    }//GEN-LAST:event_clickChangeAvatar

    private void activatedProfile(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_activatedProfile
        if ( isLibrarian )
            avatar.setIcon( new ImageIcon( librarian.getAvatarUrl() ) );
        else
            avatar.setIcon( new ImageIcon( student.getAvatarUrl() ) );
    }//GEN-LAST:event_activatedProfile

    private void clickContinue(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickContinue
        dispose();
    }//GEN-LAST:event_clickContinue

    private void exitedContinue(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitedContinue
        panelContinue.setBackground(color);
    }//GEN-LAST:event_exitedContinue

    private void hoverContinue(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hoverContinue
        panelContinue.setBackground(Color.ORANGE);
    }//GEN-LAST:event_hoverContinue

    
    public static void start(Object person, boolean isLibrarian, boolean rightToChange) {
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
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Profile( person, isLibrarian, rightToChange ).setVisible(true);
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel avatar;
    private javax.swing.JButton buttonChangeAvatar;
    private javax.swing.JButton buttonContinue;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelFirstName;
    private javax.swing.JLabel labelID;
    private javax.swing.JLabel labelLastName;
    private javax.swing.JLabel labelNumOfBooks;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel panelChangeAvatar;
    private javax.swing.JPanel panelContinue;
    private javax.swing.JPanel panelData;
    private javax.swing.JLabel valueEmail;
    private javax.swing.JLabel valueFirstName;
    private javax.swing.JLabel valueLastName;
    private javax.swing.JLabel valueNumOfBooks;
    private javax.swing.JLabel valueStudentID;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration
}
