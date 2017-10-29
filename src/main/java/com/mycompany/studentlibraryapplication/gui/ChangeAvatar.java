package com.mycompany.studentlibraryapplication.gui;

import com.mycompany.studentlibraryapplication.db.Dao;
import com.mycompany.studentlibraryapplication.entity.Student;
import com.mycompany.studentlibraryapplication.entity.Librarian;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


/**
 *
 * @author Alex Lysun
 */
public class ChangeAvatar extends JFrame {
	// generated serial version UID
	private static final long serialVersionUID = -6562872354313197810L;
	
	// data fields
    private Student student;
    private Librarian librarian;
    private boolean isLibrarian;
    private String avatarUrl;
    
    /**
     * Creates new form ChangeAvatar
     * default constructor
     */
    public ChangeAvatar() {
        initComponents();
    }

    // constructor that takes parameters
    public ChangeAvatar(Object person, boolean isLibrarian) {
        this.isLibrarian = isLibrarian;
        // check whether the person is a student or librarian object
        if (isLibrarian) {
            librarian = (Librarian) person;
            avatarUrl = librarian.getAvatarUrl();
        } else {
            student = (Student) person;
            avatarUrl = student.getAvatarUrl();
        }
                
        initComponents();
        initAvatars();
    }
    
    // initialize all avatars
    private void initAvatars() {
        int index = 1;
        for (JButton avatar : getAvatars()) {
            // sets Icon for every buttons
            avatar.setIcon(new ImageIcon("img/profile/" + index + ".png"));
            index++;
            // add MouseListener for avatars
            avatar.addMouseListener(new CustomListener());
        }
        
        panelContinue.setBackground(Color.getHSBColor(198.0f, 115.0f, 89.0f));
    }
    
    // get all avatars with malePanel and femalePanel
    private ArrayList<JButton> getAvatars() {
        ArrayList<JButton> avatars = new ArrayList<>();
        Component c = null;
        int length = malePanel.getComponentCount() + femalePanel.getComponentCount();
        
        for (int i = 0; i < length; i++) {
            if (i < (length / 2)) {
                c = malePanel.getComponent(i);
                if (c instanceof JButton) 
                    avatars.add((JButton) c);
            } else {
                c = femalePanel.getComponent(i - (length / 2));
                if (c instanceof JButton) 
                    avatars.add((JButton) c);
            }
        }
        
        return avatars;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code.
     */
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        mainPanel = new javax.swing.JPanel();
        tabbedPane = new javax.swing.JTabbedPane();
        femalePanel = new javax.swing.JPanel();
        avatar11 = new javax.swing.JButton();
        avatar16 = new javax.swing.JButton();
        avatar12 = new javax.swing.JButton();
        avatar17 = new javax.swing.JButton();
        avatar18 = new javax.swing.JButton();
        avatar13 = new javax.swing.JButton();
        avatar14 = new javax.swing.JButton();
        avatar19 = new javax.swing.JButton();
        avatar15 = new javax.swing.JButton();
        avatar20 = new javax.swing.JButton();
        malePanel = new javax.swing.JPanel();
        avatar1 = new javax.swing.JButton();
        avatar2 = new javax.swing.JButton();
        avatar4 = new javax.swing.JButton();
        avatar3 = new javax.swing.JButton();
        avatar9 = new javax.swing.JButton();
        avatar6 = new javax.swing.JButton();
        avatar7 = new javax.swing.JButton();
        avatar8 = new javax.swing.JButton();
        avatar5 = new javax.swing.JButton();
        avatar10 = new javax.swing.JButton();
        labelTitle = new javax.swing.JLabel();
        panelContinue = new javax.swing.JPanel();
        buttonContinue = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Change Avatar");
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));

        tabbedPane.setBackground(new java.awt.Color(255, 255, 255));

        femalePanel.setBackground(new java.awt.Color(255, 255, 255));

        avatar11.setBackground(new java.awt.Color(255, 255, 255));
        avatar11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        avatar16.setBackground(new java.awt.Color(255, 255, 255));
        avatar16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        avatar12.setBackground(new java.awt.Color(255, 255, 255));
        avatar12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        avatar17.setBackground(new java.awt.Color(255, 255, 255));
        avatar17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        avatar18.setBackground(new java.awt.Color(255, 255, 255));
        avatar18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        avatar13.setBackground(new java.awt.Color(255, 255, 255));
        avatar13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        avatar14.setBackground(new java.awt.Color(255, 255, 255));
        avatar14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        avatar19.setBackground(new java.awt.Color(255, 255, 255));
        avatar19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        avatar15.setBackground(new java.awt.Color(255, 255, 255));
        avatar15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        avatar20.setBackground(new java.awt.Color(255, 255, 255));
        avatar20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout femalePanelLayout = new javax.swing.GroupLayout(femalePanel);
        femalePanel.setLayout(femalePanelLayout);
        femalePanelLayout.setHorizontalGroup(
            femalePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(femalePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(femalePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(femalePanelLayout.createSequentialGroup()
                        .addComponent(avatar11, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(avatar12, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(avatar13, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(avatar14, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(avatar15, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(femalePanelLayout.createSequentialGroup()
                        .addComponent(avatar16, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(avatar17, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(avatar18, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(avatar19, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(avatar20, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        femalePanelLayout.setVerticalGroup(
            femalePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(femalePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(femalePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(avatar15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(avatar14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(avatar11, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(avatar12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(avatar13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(femalePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(avatar19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(avatar17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(avatar16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(avatar20, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(avatar18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );

        tabbedPane.addTab("Female   ", femalePanel);

        malePanel.setBackground(new java.awt.Color(255, 255, 255));

        avatar1.setBackground(new java.awt.Color(255, 255, 255));
        avatar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        avatar2.setBackground(new java.awt.Color(255, 255, 255));
        avatar2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        avatar4.setBackground(new java.awt.Color(255, 255, 255));
        avatar4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        avatar3.setBackground(new java.awt.Color(255, 255, 255));
        avatar3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        avatar9.setBackground(new java.awt.Color(255, 255, 255));
        avatar9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        avatar6.setBackground(new java.awt.Color(255, 255, 255));
        avatar6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        avatar7.setBackground(new java.awt.Color(255, 255, 255));
        avatar7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        avatar8.setBackground(new java.awt.Color(255, 255, 255));
        avatar8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        avatar5.setBackground(new java.awt.Color(255, 255, 255));
        avatar5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        avatar10.setBackground(new java.awt.Color(255, 255, 255));
        avatar10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout malePanelLayout = new javax.swing.GroupLayout(malePanel);
        malePanel.setLayout(malePanelLayout);
        malePanelLayout.setHorizontalGroup(
            malePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(malePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(malePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(malePanelLayout.createSequentialGroup()
                        .addComponent(avatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(avatar2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(avatar3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(avatar4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(avatar5, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(malePanelLayout.createSequentialGroup()
                        .addComponent(avatar6, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(avatar7, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(avatar8, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(avatar9, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(avatar10, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        malePanelLayout.setVerticalGroup(
            malePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(malePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(malePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(avatar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(avatar2, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(avatar3, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(avatar4, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(avatar5, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(malePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(avatar6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(avatar7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(avatar8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(avatar9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(avatar10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        malePanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {avatar6, avatar7});

        tabbedPane.addTab("   Male   ", malePanel);

        labelTitle.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        labelTitle.setForeground(new java.awt.Color(255, 102, 102));
        labelTitle.setText("Choose an avatar for yourself");

        panelContinue.setBackground(new java.awt.Color(153, 153, 153));

        buttonContinue.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        buttonContinue.setForeground(new java.awt.Color(255, 255, 255));
        buttonContinue.setText("Continue");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, buttonContinue, org.jdesktop.beansbinding.ELProperty.create("false"), buttonContinue, org.jdesktop.beansbinding.BeanProperty.create("contentAreaFilled"));
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
            .addComponent(buttonContinue, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
        );
        panelContinueLayout.setVerticalGroup(
            panelContinueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonContinue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(labelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(panelContinue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelContinue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3))
        );

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    } // end initComponents method

    private void exitedContinue(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitedContinue
        panelContinue.setBackground(Color.getHSBColor(198.0f, 115.0f, 89.0f));
    }//GEN-LAST:event_exitedContinue

    private void hoverContinue(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hoverContinue
        panelContinue.setBackground(Color.getHSBColor(198.0f, 125.0f, 89.0f));
    }//GEN-LAST:event_hoverContinue

    private void clickContinue(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickContinue
        int index = 0;
        for (JButton avatar : getAvatars()) {
            if (avatar.getBackground() == Color.BLACK) {
                avatarUrl = "img/profile/" + (index + 1) + ".png";
            }           
            index++;
        }
        
        changeAvatar();
    }//GEN-LAST:event_clickContinue
    
    // method changes avatar url for current student or librarian
    private void changeAvatar() {
        String previousAvatarUrl = null;
        // check whether the person is a student or librarian object
        if ( isLibrarian ) {
            if ( !avatarUrl.equals( librarian.getAvatarUrl() ) ) {
                previousAvatarUrl = librarian.getAvatarUrl();
                librarian.setAvatarUrl( avatarUrl );
                // changes avatar url for librarian in database
                if (Dao.changeAvatarUrl( librarian )) {
                    JOptionPane.showMessageDialog(null, "The avatar was successfully changed!",
                            "Info", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    librarian.setAvatarUrl( previousAvatarUrl );
                    JOptionPane.showMessageDialog(null, "An error occurred. The avatar was not changed! Please try again.",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            if (!avatarUrl.equals( student.getAvatarUrl() ) ) {
                previousAvatarUrl = student.getAvatarUrl();
                student.setAvatarUrl( avatarUrl );
                // changes avatar url for student in database
                if (Dao.changeAvatarUrl( student )) {
                    JOptionPane.showMessageDialog(null, "The avatar was successfully changed!",
                            "Info", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    student.setAvatarUrl( previousAvatarUrl );
                    JOptionPane.showMessageDialog(null, "An error occurred. The avatar was not changed! Please try again.",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
                
        dispose();
    }

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
            java.util.logging.Logger.getLogger(ChangeAvatar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangeAvatar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangeAvatar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangeAvatar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ChangeAvatar(person, isLibrarian).setVisible(true);
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton avatar1;
    private javax.swing.JButton avatar10;
    private javax.swing.JButton avatar11;
    private javax.swing.JButton avatar12;
    private javax.swing.JButton avatar13;
    private javax.swing.JButton avatar14;
    private javax.swing.JButton avatar15;
    private javax.swing.JButton avatar16;
    private javax.swing.JButton avatar17;
    private javax.swing.JButton avatar18;
    private javax.swing.JButton avatar19;
    private javax.swing.JButton avatar2;
    private javax.swing.JButton avatar20;
    private javax.swing.JButton avatar3;
    private javax.swing.JButton avatar4;
    private javax.swing.JButton avatar5;
    private javax.swing.JButton avatar6;
    private javax.swing.JButton avatar7;
    private javax.swing.JButton avatar8;
    private javax.swing.JButton avatar9;
    private javax.swing.JButton buttonContinue;
    private javax.swing.JPanel femalePanel;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel malePanel;
    private javax.swing.JPanel panelContinue;
    private javax.swing.JTabbedPane tabbedPane;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration
    
    // implements MouseListener for  mouseClicked event
    public class CustomListener implements MouseListener {
        // event for select avatar
        @Override
        public void mouseClicked(MouseEvent e) {     
            if (e.getSource() instanceof JButton) {
                clearBackground();
                JButton b = (JButton) e.getSource();
                // set background color to black for selected avatar
                b.setBackground(Color.BLACK);
            }
        }
        
        // set background colot to white for all avatars
        private void clearBackground() {      
            getAvatars().forEach((avatar) -> { 
                avatar.setBackground(Color.WHITE);
            });
        }

        @Override
        public void mousePressed(MouseEvent e) {        
        }

        @Override
        public void mouseReleased(MouseEvent e) {       
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
    }   
}
