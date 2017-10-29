package com.mycompany.studentlibraryapplication.gui;

import com.mycompany.studentlibraryapplication.db.Dao;
import com.mycompany.studentlibraryapplication.db.StudentDao;
import com.mycompany.studentlibraryapplication.entity.Book;
import com.mycompany.studentlibraryapplication.entity.Student;

import java.awt.Color;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Alex Lysun
 */

public class MainProgramForStudent extends JFrame {
	// generated serial version UID
	private static final long serialVersionUID = 7807541750883743383L;
	
	// data fields
    private Student student;   
    private boolean showingSettings;
    private boolean showingMenu;
    
    /**
     * Creates new form MainProgram
     */
    // default constructor
    public MainProgramForStudent() {
        initComponents();     
    }
    
    // constructor that take parameters
    public MainProgramForStudent(Student student) {
        this.student = student; 
        showingMenu = false;
        showingSettings = false;
        
        initComponents();
        initPanel();
        initTables();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code.
     */
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        mainPanel = new javax.swing.JPanel();
        labelTitle = new javax.swing.JLabel();
        panelTools = new javax.swing.JPanel();
        panelAbout = new javax.swing.JPanel();
        buttonAboutUS = new javax.swing.JButton();
        panelSettings = new javax.swing.JPanel();
        buttonSettings = new javax.swing.JButton();
        panelSignout = new javax.swing.JPanel();
        buttonSignout = new javax.swing.JButton();
        panelMenu = new javax.swing.JPanel();
        buttonMenu = new javax.swing.JButton();
        panelTools1 = new javax.swing.JPanel();
        panelFooter = new javax.swing.JPanel();
        labelFooter = new javax.swing.JLabel();
        labelBooks = new javax.swing.JLabel();
        panelSettingsOption = new javax.swing.JPanel();
        buttonChangeEmail = new javax.swing.JButton();
        buttonChangePassword = new javax.swing.JButton();
        buttonViewProfile = new javax.swing.JButton();
        labelWelcome = new javax.swing.JLabel();
        panelMenuOption = new javax.swing.JPanel();
        buttonYourBooks = new javax.swing.JButton();
        buttonAllBooks = new javax.swing.JButton();
        buttonHistory = new javax.swing.JButton();
        tabbedPane = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        panelYourBook = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableOfBooks = new javax.swing.JTable();
        buttonClear1 = new javax.swing.JButton();
        labelSearchAuthor1 = new javax.swing.JLabel();
        textFieldAuthor1 = new javax.swing.JTextField();
        textFieldTitle1 = new javax.swing.JTextField();
        labelSearchTitle1 = new javax.swing.JLabel();
        labelSearch1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        panelAllBook = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableOfAllBooks = new javax.swing.JTable();
        textFieldTitle2 = new javax.swing.JTextField();
        labelSearch2 = new javax.swing.JLabel();
        labelSearchTitle2 = new javax.swing.JLabel();
        labelSearchAuthor2 = new javax.swing.JLabel();
        textFieldAuthor2 = new javax.swing.JTextField();
        buttonClear2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        panelHistory = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableOfHistory = new javax.swing.JTable();
        labelSearch3 = new javax.swing.JLabel();
        labelSearchTitle3 = new javax.swing.JLabel();
        textFieldTitle3 = new javax.swing.JTextField();
        labelSearchAuthor3 = new javax.swing.JLabel();
        textFieldAuthor3 = new javax.swing.JTextField();
        buttonClear3 = new javax.swing.JButton();


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Library Application");
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage((new ImageIcon("img/mainProgram-icon.png")).getImage());
        setSize(Toolkit.getDefaultToolkit().getScreenSize());

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));

        labelTitle.setFont(new java.awt.Font("SimSun-ExtB", 1, 48)); // NOI18N
        labelTitle.setForeground(new java.awt.Color(0, 153, 153));
        labelTitle.setIcon(new ImageIcon("img/logotype.png"));
        labelTitle.setText("        Student Library Application");

        panelTools.setBackground(java.awt.Color.gray);

        panelAbout.setBackground(java.awt.Color.gray);

        buttonAboutUS.setBackground(java.awt.Color.gray);
        buttonAboutUS.setFont(new java.awt.Font("Vrinda", 1, 14)); // NOI18N
        buttonAboutUS.setForeground(new java.awt.Color(255, 255, 255));
        buttonAboutUS.setText("About Us");
        buttonAboutUS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, buttonAboutUS, org.jdesktop.beansbinding.ELProperty.create("false"), buttonAboutUS, org.jdesktop.beansbinding.BeanProperty.create("contentAreaFilled"));
        bindingGroup.addBinding(binding);

        buttonAboutUS.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                hoverAboutUS(evt);
            }
        });
        buttonAboutUS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickAboutUs(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitedAboutUs(evt);
            }
        });

        javax.swing.GroupLayout panelAboutLayout = new javax.swing.GroupLayout(panelAbout);
        panelAbout.setLayout(panelAboutLayout);
        panelAboutLayout.setHorizontalGroup(
            panelAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonAboutUS, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
        );
        panelAboutLayout.setVerticalGroup(
            panelAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonAboutUS, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        panelSettings.setBackground(java.awt.Color.gray);

        buttonSettings.setBackground(java.awt.Color.gray);
        buttonSettings.setFont(new java.awt.Font("Vrinda", 1, 14)); // NOI18N
        buttonSettings.setForeground(new java.awt.Color(255, 255, 255));
        buttonSettings.setText("Settings");
        buttonSettings.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));
        buttonSettings.setBorderPainted(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, buttonSettings, org.jdesktop.beansbinding.ELProperty.create("false"), buttonSettings, org.jdesktop.beansbinding.BeanProperty.create("contentAreaFilled"));
        bindingGroup.addBinding(binding);

        buttonSettings.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                hoverSettings(evt);
            }
        });
        buttonSettings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showSettings(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitedSettings(evt);
            }
        });

        javax.swing.GroupLayout panelSettingsLayout = new javax.swing.GroupLayout(panelSettings);
        panelSettings.setLayout(panelSettingsLayout);
        panelSettingsLayout.setHorizontalGroup(
            panelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonSettings, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
        );
        panelSettingsLayout.setVerticalGroup(
            panelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonSettings, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelSignout.setBackground(java.awt.Color.gray);

        buttonSignout.setBackground(java.awt.Color.gray);
        buttonSignout.setFont(new java.awt.Font("Vrinda", 1, 14)); // NOI18N
        buttonSignout.setForeground(new java.awt.Color(255, 255, 255));
        buttonSignout.setText("Sign out");
        buttonSignout.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, buttonSignout, org.jdesktop.beansbinding.ELProperty.create("false"), buttonSignout, org.jdesktop.beansbinding.BeanProperty.create("contentAreaFilled"));
        bindingGroup.addBinding(binding);

        buttonSignout.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                hoverSignout(evt);
            }
        });
        buttonSignout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitedSignout(evt);
            }
        });
        buttonSignout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSignoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSignoutLayout = new javax.swing.GroupLayout(panelSignout);
        panelSignout.setLayout(panelSignoutLayout);
        panelSignoutLayout.setHorizontalGroup(
            panelSignoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonSignout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
        );
        panelSignoutLayout.setVerticalGroup(
            panelSignoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonSignout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelMenu.setBackground(java.awt.Color.gray);

        buttonMenu.setBackground(java.awt.Color.gray);
        buttonMenu.setFont(new java.awt.Font("Vrinda", 1, 14)); // NOI18N
        buttonMenu.setForeground(new java.awt.Color(255, 255, 255));
        buttonMenu.setText("Menu");
        buttonMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, buttonMenu, org.jdesktop.beansbinding.ELProperty.create("false"), buttonMenu, org.jdesktop.beansbinding.BeanProperty.create("contentAreaFilled"));
        bindingGroup.addBinding(binding);

        buttonMenu.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                hoverMenu(evt);
            }
        });
        buttonMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showMenu(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitedMenu(evt);
            }
        });

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelTools1.setBackground(java.awt.Color.gray);

        javax.swing.GroupLayout panelTools1Layout = new javax.swing.GroupLayout(panelTools1);
        panelTools1.setLayout(panelTools1Layout);
        panelTools1Layout.setHorizontalGroup(
            panelTools1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelTools1Layout.setVerticalGroup(
            panelTools1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelToolsLayout = new javax.swing.GroupLayout(panelTools);
        panelTools.setLayout(panelToolsLayout);
        panelToolsLayout.setHorizontalGroup(
            panelToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelToolsLayout.createSequentialGroup()
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTools1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelAbout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelSettings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelSignout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelToolsLayout.setVerticalGroup(
            panelToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAbout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelSettings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelSignout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelTools1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelFooter.setBackground(new java.awt.Color(204, 204, 204));

        labelFooter.setFont(new java.awt.Font("Vrinda", 1, 14)); // NOI18N
        labelFooter.setText("© Lviv 2017");

        javax.swing.GroupLayout panelFooterLayout = new javax.swing.GroupLayout(panelFooter);
        panelFooter.setLayout(panelFooterLayout);
        panelFooterLayout.setHorizontalGroup(
            panelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFooterLayout.createSequentialGroup()
                .addGap(598, 598, 598)
                .addComponent(labelFooter)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelFooterLayout.setVerticalGroup(
            panelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelFooter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        labelBooks.setBackground(new java.awt.Color(255, 255, 255));
        labelBooks.setFont(new java.awt.Font("Utsaah", 1, 24)); // NOI18N
        labelBooks.setForeground(new java.awt.Color(153, 153, 153));
        labelBooks.setText("These are your books");

        panelSettingsOption.setBackground(java.awt.Color.gray);
        panelSettingsOption.setFocusable(false);

        buttonChangeEmail.setFont(new java.awt.Font("Vrinda", 1, 14)); // NOI18N
        buttonChangeEmail.setForeground(new java.awt.Color(255, 255, 255));
        buttonChangeEmail.setText("Change email");
        buttonChangeEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        buttonChangeEmail.setBorderPainted(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, buttonChangeEmail, org.jdesktop.beansbinding.ELProperty.create("false"), buttonChangeEmail, org.jdesktop.beansbinding.BeanProperty.create("contentAreaFilled"));
        bindingGroup.addBinding(binding);

        buttonChangeEmail.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                hoverChangeEmail(evt);
            }
        });
        buttonChangeEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickChangeEmail(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitedChangeEmail(evt);
            }
        });

        buttonChangePassword.setFont(new java.awt.Font("Vrinda", 1, 14)); // NOI18N
        buttonChangePassword.setForeground(new java.awt.Color(255, 255, 255));
        buttonChangePassword.setText("Change password");
        buttonChangePassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        buttonChangePassword.setBorderPainted(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, buttonChangePassword, org.jdesktop.beansbinding.ELProperty.create("false"), buttonChangePassword, org.jdesktop.beansbinding.BeanProperty.create("contentAreaFilled"));
        bindingGroup.addBinding(binding);

        buttonChangePassword.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                hoverChangePassword(evt);
            }
        });
        buttonChangePassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickChangePassword(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitedChangePassword(evt);
            }
        });

        buttonViewProfile.setFont(new java.awt.Font("Vrinda", 1, 14)); // NOI18N
        buttonViewProfile.setForeground(new java.awt.Color(255, 255, 255));
        buttonViewProfile.setText("View profile");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, buttonViewProfile, org.jdesktop.beansbinding.ELProperty.create("false"), buttonViewProfile, org.jdesktop.beansbinding.BeanProperty.create("contentAreaFilled"));
        bindingGroup.addBinding(binding);

        buttonViewProfile.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                hoverViewProfile(evt);
            }
        });
        buttonViewProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickViewProfile(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitedViewProfile(evt);
            }
        });

        javax.swing.GroupLayout panelSettingsOptionLayout = new javax.swing.GroupLayout(panelSettingsOption);
        panelSettingsOption.setLayout(panelSettingsOptionLayout);
        panelSettingsOptionLayout.setHorizontalGroup(
            panelSettingsOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonChangeEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(buttonChangePassword, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
            .addComponent(buttonViewProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelSettingsOptionLayout.setVerticalGroup(
            panelSettingsOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSettingsOptionLayout.createSequentialGroup()
                .addComponent(buttonViewProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonChangeEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonChangePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        labelWelcome.setFont(new java.awt.Font("Vrinda", 1, 36)); // NOI18N
        labelWelcome.setForeground(new java.awt.Color(153, 153, 153));
        labelWelcome.setText("Welcome, ");

        panelMenuOption.setBackground(java.awt.Color.gray);
        panelMenuOption.setFocusable(false);

        buttonYourBooks.setBackground(java.awt.Color.gray);
        buttonYourBooks.setFont(new java.awt.Font("Vrinda", 1, 14)); // NOI18N
        buttonYourBooks.setForeground(java.awt.Color.white);
        buttonYourBooks.setText("Your books");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, buttonYourBooks, org.jdesktop.beansbinding.ELProperty.create("false"), buttonYourBooks, org.jdesktop.beansbinding.BeanProperty.create("contentAreaFilled"));
        bindingGroup.addBinding(binding);

        buttonYourBooks.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                hoverYourBooks(evt);
            }
        });
        buttonYourBooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickYourBooks(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitedYourBooks(evt);
            }
        });

        buttonAllBooks.setBackground(java.awt.Color.gray);
        buttonAllBooks.setFont(new java.awt.Font("Vrinda", 1, 14)); // NOI18N
        buttonAllBooks.setForeground(java.awt.Color.white);
        buttonAllBooks.setText("All books");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, buttonAllBooks, org.jdesktop.beansbinding.ELProperty.create("false"), buttonAllBooks, org.jdesktop.beansbinding.BeanProperty.create("contentAreaFilled"));
        bindingGroup.addBinding(binding);

        buttonAllBooks.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                hoverAllBooks(evt);
            }
        });
        buttonAllBooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickAllBooks(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitedAllBooks(evt);
            }
        });

        buttonHistory.setBackground(java.awt.Color.gray);
        buttonHistory.setFont(new java.awt.Font("Vrinda", 1, 14)); // NOI18N
        buttonHistory.setForeground(java.awt.Color.white);
        buttonHistory.setText("History");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, buttonHistory, org.jdesktop.beansbinding.ELProperty.create("false"), buttonHistory, org.jdesktop.beansbinding.BeanProperty.create("contentAreaFilled"));
        bindingGroup.addBinding(binding);

        buttonHistory.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                hoverHistory(evt);
            }
        });
        buttonHistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickHistory(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitedHistory(evt);
            }
        });

        javax.swing.GroupLayout panelMenuOptionLayout = new javax.swing.GroupLayout(panelMenuOption);
        panelMenuOption.setLayout(panelMenuOptionLayout);
        panelMenuOptionLayout.setHorizontalGroup(
            panelMenuOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonYourBooks, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
            .addComponent(buttonAllBooks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(buttonHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelMenuOptionLayout.setVerticalGroup(
            panelMenuOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuOptionLayout.createSequentialGroup()
                .addComponent(buttonYourBooks)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonAllBooks)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonHistory))
        );

        tabbedPane.setBackground(new java.awt.Color(255, 255, 255));
        tabbedPane.setAutoscrolls(true);
        tabbedPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabbedPane.setEnabled(false);

        panelYourBook.setBackground(new java.awt.Color(255, 255, 255));
        panelYourBook.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        tableOfBooks.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        tableOfBooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "№", "Title ", "Author", "Date"
            }
        ) {
        	// generated serial version UID
			private static final long serialVersionUID = 1L;
        				
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableOfBooks.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tableOfBooks.setFillsViewportHeight(true);
        tableOfBooks.setMaximumSize(new java.awt.Dimension(214748, 64));
        tableOfBooks.setName("table"); // NOI18N
        tableOfBooks.setRowHeight(25);
        tableOfBooks.setSelectionBackground(new java.awt.Color(153, 153, 255));
        tableOfBooks.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tableOfBooks.setUpdateSelectionOnSort(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tableOfBooks, org.jdesktop.beansbinding.ELProperty.create("true"), tableOfBooks, org.jdesktop.beansbinding.BeanProperty.create("showHorizontalLines"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tableOfBooks, org.jdesktop.beansbinding.ELProperty.create("true"), tableOfBooks, org.jdesktop.beansbinding.BeanProperty.create("showVerticalLines"));
        bindingGroup.addBinding(binding);

        jScrollPane1.setViewportView(tableOfBooks);

        buttonClear1.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        buttonClear1.setText("Clear");
        buttonClear1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickClear1(evt);
            }
        });

        labelSearchAuthor1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        labelSearchAuthor1.setForeground(new java.awt.Color(153, 153, 153));
        labelSearchAuthor1.setText("Author: ");

        textFieldAuthor1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchByAuthor1(evt);
            }
        });

        textFieldTitle1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchByTitle1(evt);
            }
        });

        labelSearchTitle1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        labelSearchTitle1.setForeground(new java.awt.Color(153, 153, 153));
        labelSearchTitle1.setText("Title: ");

        labelSearch1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        labelSearch1.setForeground(new java.awt.Color(153, 153, 153));
        labelSearch1.setText("Search");

        javax.swing.GroupLayout panelYourBookLayout = new javax.swing.GroupLayout(panelYourBook);
        panelYourBook.setLayout(panelYourBookLayout);
        panelYourBookLayout.setHorizontalGroup(
            panelYourBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelYourBookLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 808, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelYourBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelYourBookLayout.createSequentialGroup()
                        .addGroup(panelYourBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelYourBookLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(labelSearchTitle1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelYourBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textFieldTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelYourBookLayout.createSequentialGroup()
                                        .addComponent(labelSearch1)
                                        .addGap(72, 72, 72))))
                            .addGroup(panelYourBookLayout.createSequentialGroup()
                                .addGap(0, 10, Short.MAX_VALUE)
                                .addComponent(labelSearchAuthor1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                .addComponent(textFieldAuthor1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelYourBookLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonClear1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))))
        );
        panelYourBookLayout.setVerticalGroup(
            panelYourBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
            .addGroup(panelYourBookLayout.createSequentialGroup()
                .addComponent(labelSearch1)
                .addGap(38, 38, 38)
                .addGroup(panelYourBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSearchTitle1))
                .addGap(18, 18, 18)
                .addGroup(panelYourBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldAuthor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSearchAuthor1))
                .addGap(18, 18, 18)
                .addComponent(buttonClear1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelYourBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelYourBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabbedPane.addTab("", jPanel1);

        panelAllBook.setBackground(new java.awt.Color(255, 255, 255));
        panelAllBook.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        tableOfAllBooks.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        tableOfAllBooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "№", "Title ", "Author", "Quantity"
            }
        ) {
        	// generated serial version UID
			private static final long serialVersionUID = 1L;
        				
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableOfAllBooks.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tableOfAllBooks.setFillsViewportHeight(true);
        tableOfAllBooks.setMaximumSize(new java.awt.Dimension(214748, 64));
        tableOfAllBooks.setName("table"); // NOI18N
        tableOfAllBooks.setRowHeight(25);
        tableOfAllBooks.setSelectionBackground(new java.awt.Color(153, 153, 255));
        tableOfAllBooks.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tableOfAllBooks.setUpdateSelectionOnSort(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tableOfAllBooks, org.jdesktop.beansbinding.ELProperty.create("true"), tableOfAllBooks, org.jdesktop.beansbinding.BeanProperty.create("showHorizontalLines"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tableOfAllBooks, org.jdesktop.beansbinding.ELProperty.create("true"), tableOfAllBooks, org.jdesktop.beansbinding.BeanProperty.create("showVerticalLines"));
        bindingGroup.addBinding(binding);

        jScrollPane2.setViewportView(tableOfAllBooks);
        tableOfAllBooks.getAccessibleContext().setAccessibleName("");

        textFieldTitle2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchByTitle2(evt);
            }
        });

        labelSearch2.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        labelSearch2.setForeground(new java.awt.Color(153, 153, 153));
        labelSearch2.setText("Search");

        labelSearchTitle2.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        labelSearchTitle2.setForeground(new java.awt.Color(153, 153, 153));
        labelSearchTitle2.setText("Title: ");

        labelSearchAuthor2.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        labelSearchAuthor2.setForeground(new java.awt.Color(153, 153, 153));
        labelSearchAuthor2.setText("Author: ");

        textFieldAuthor2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchByAuthor2(evt);
            }
        });

        buttonClear2.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        buttonClear2.setText("Clear");
        buttonClear2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickClear2(evt);
            }
        });

        javax.swing.GroupLayout panelAllBookLayout = new javax.swing.GroupLayout(panelAllBook);
        panelAllBook.setLayout(panelAllBookLayout);
        panelAllBookLayout.setHorizontalGroup(
            panelAllBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAllBookLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 808, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelAllBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAllBookLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addGroup(panelAllBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAllBookLayout.createSequentialGroup()
                                .addComponent(labelSearch2)
                                .addGap(82, 82, 82))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAllBookLayout.createSequentialGroup()
                                .addComponent(labelSearchTitle2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                .addComponent(textFieldTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAllBookLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelAllBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAllBookLayout.createSequentialGroup()
                                .addComponent(labelSearchAuthor2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textFieldAuthor2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAllBookLayout.createSequentialGroup()
                                .addComponent(buttonClear2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41))))))
        );
        panelAllBookLayout.setVerticalGroup(
            panelAllBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
            .addGroup(panelAllBookLayout.createSequentialGroup()
                .addComponent(labelSearch2)
                .addGap(38, 38, 38)
                .addGroup(panelAllBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSearchTitle2))
                .addGap(18, 18, 18)
                .addGroup(panelAllBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldAuthor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSearchAuthor2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonClear2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAllBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAllBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabbedPane.addTab("", jPanel2);

        panelHistory.setBackground(new java.awt.Color(255, 255, 255));
        panelHistory.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        tableOfHistory.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        tableOfHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "№", "Title ", "Author", "action"
            }
        ) {
        	// generated serial version UID
			private static final long serialVersionUID = 1L;
        				
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableOfHistory.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tableOfHistory.setFillsViewportHeight(true);
        tableOfHistory.setMaximumSize(new java.awt.Dimension(214748, 64));
        tableOfHistory.setName("table"); // NOI18N
        tableOfHistory.setRowHeight(25);
        tableOfHistory.setSelectionBackground(new java.awt.Color(153, 153, 255));
        tableOfHistory.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tableOfHistory.setUpdateSelectionOnSort(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tableOfHistory, org.jdesktop.beansbinding.ELProperty.create("true"), tableOfHistory, org.jdesktop.beansbinding.BeanProperty.create("showHorizontalLines"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tableOfHistory, org.jdesktop.beansbinding.ELProperty.create("true"), tableOfHistory, org.jdesktop.beansbinding.BeanProperty.create("showVerticalLines"));
        bindingGroup.addBinding(binding);

        jScrollPane3.setViewportView(tableOfHistory);

        labelSearch3.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        labelSearch3.setForeground(new java.awt.Color(153, 153, 153));
        labelSearch3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSearch3.setText("  Search");

        labelSearchTitle3.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        labelSearchTitle3.setForeground(new java.awt.Color(153, 153, 153));
        labelSearchTitle3.setText("Title: ");

        textFieldTitle3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        textFieldTitle3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchByTitle3(evt);
            }
        });

        labelSearchAuthor3.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        labelSearchAuthor3.setForeground(new java.awt.Color(153, 153, 153));
        labelSearchAuthor3.setText("Author: ");

        textFieldAuthor3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchByAuthor3(evt);
            }
        });

        buttonClear3.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        buttonClear3.setText("Clear");
        buttonClear3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickClear3(evt);
            }
        });

        javax.swing.GroupLayout panelHistoryLayout = new javax.swing.GroupLayout(panelHistory);
        panelHistory.setLayout(panelHistoryLayout);
        panelHistoryLayout.setHorizontalGroup(
            panelHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHistoryLayout.createSequentialGroup()
                .addGroup(panelHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelHistoryLayout.createSequentialGroup()
                        .addGroup(panelHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelHistoryLayout.createSequentialGroup()
                                .addGroup(panelHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelHistoryLayout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(labelSearchTitle3))
                                    .addGroup(panelHistoryLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(labelSearchAuthor3)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textFieldAuthor3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textFieldTitle3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(labelSearch3, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHistoryLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonClear3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 811, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelHistoryLayout.setVerticalGroup(
            panelHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
            .addGroup(panelHistoryLayout.createSequentialGroup()
                .addComponent(labelSearch3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSearchTitle3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldTitle3, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldAuthor3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSearchAuthor3))
                .addGap(26, 26, 26)
                .addComponent(buttonClear3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        panelHistoryLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {textFieldAuthor3, textFieldTitle3});

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 1025, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabbedPane.addTab("", jPanel3);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTools, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(panelMenuOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(293, 293, 293)
                .addComponent(labelWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelSettingsOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 1336, Short.MAX_VALUE))
            .addComponent(panelFooter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1030, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(542, 542, 542)
                        .addComponent(labelBooks)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(labelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTools, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(panelSettingsOption, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(panelMenuOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(labelWelcome)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelBooks)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(panelFooter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tabbedPane.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    } // end initComponents method

    private void initTables() {
        initTableColumn( tableOfBooks );
        initTableColumn( tableOfAllBooks );
        initTableColumn( tableOfHistory );
        fillingTable();
    }
    
    private void initPanel() {
        panelSettingsOption.setVisible( false );
        panelMenuOption.setVisible( false );
        labelWelcome.setText(labelWelcome.getText() + " " + student.getFirstName() + " " + student.getLastName());
    }
    
    // init column width
    private void initTableColumn(JTable table) {        
        table.getColumnModel().getColumn(0).setPreferredWidth(80);
        table.getColumnModel().getColumn(0).setMaxWidth(80);
        table.getColumnModel().getColumn(0).setMinWidth(80);
        table.getColumnModel().getColumn(1).setPreferredWidth(350);
        table.getColumnModel().getColumn(1).setMaxWidth(400);
        table.getColumnModel().getColumn(1).setMinWidth(300);
        table.getColumnModel().getColumn(2).setPreferredWidth(350);
        table.getColumnModel().getColumn(2).setMaxWidth(400);
        table.getColumnModel().getColumn(2).setMinWidth(300);
        table.getColumnModel().getColumn(3).setPreferredWidth(200);
        table.getColumnModel().getColumn(3).setMaxWidth(200);
        table.getColumnModel().getColumn(3).setMinWidth(120);
        
        ((DefaultTableCellRenderer)table.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
    }
    
    // method adds book's object in the table
    private void fillingTable() {
        DefaultTableModel model = (DefaultTableModel) tableOfBooks.getModel();
        Object[] row = new Object[tableOfBooks.getColumnCount()];
        
        for (int i = 0; i < student.getBooks().size(); i++) {
            Book book = student.getBooks().get(i);
            row[0] = i + 1;
            row[1] = book.getTitle();
            row[2] = book.getAuthor();
            row[3] = student.getDates().get(i);
            model.addRow(row);
        }
        
        model = (DefaultTableModel) tableOfAllBooks.getModel();
        List<Book> allBooks = Dao.getAllBooks();
        // sort list of all books by title
        allBooks.sort( (o1, o2) -> o1.getTitle().compareTo( o2.getTitle() ) );
        for (int i = 0; i < allBooks.size(); i++) {
            Book book = allBooks.get(i);
            row[0] = i + 1;
            row[1] = book.getTitle();
            row[2] = book.getAuthor();
            row[3] = book.getQuantity();
            model.addRow(row);
        }
        
        model = (DefaultTableModel) tableOfHistory.getModel();
        List<Object[]> history = StudentDao.getHistory( student.getId() );
        for (int i = 0; i < history.size(); i++) {
            Object[] r = history.get( i );
            row[0] = i + 1;
            row[1] = r[1];
            row[2] = r[2];
            row[3] = r[3];
            model.addRow(row);
        }
    } //end fillingTable method
    
    private void buttonSignoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSignoutActionPerformed
        dispose();
        Login.start(student.getId(), null);
    }//GEN-LAST:event_buttonSignoutActionPerformed

    private void hoverSignout(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hoverSignout
        panelSignout.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_hoverSignout

    private void hoverAboutUS(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hoverAboutUS
        panelAbout.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_hoverAboutUS

    private void exitedAboutUs(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitedAboutUs
        panelAbout.setBackground(Color.GRAY);
    }//GEN-LAST:event_exitedAboutUs

    private void exitedSettings(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitedSettings
        panelSettings.setBackground(Color.GRAY);
        panelTools.setBackground(Color.GRAY);
    }//GEN-LAST:event_exitedSettings

    private void hoverSettings(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hoverSettings
        panelSettings.setBackground(Color.LIGHT_GRAY);
        panelTools.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_hoverSettings

    private void exitedSignout(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitedSignout
        panelSignout.setBackground(Color.GRAY);
    }//GEN-LAST:event_exitedSignout

    private void exitedMenu(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitedMenu
        panelMenu.setBackground(Color.GRAY);
    }//GEN-LAST:event_exitedMenu

    private void hoverMenu(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hoverMenu
        panelMenu.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_hoverMenu

    private void clickAboutUs(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickAboutUs
        setEnabled( false );
        AboutUs.start( student, false );
        dispose();
    }//GEN-LAST:event_clickAboutUs

    private void showSettings(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showSettings
        if (!showingSettings) {
            panelSettingsOption.setVisible( true );
            showingSettings = true;
        } else {
            panelSettingsOption.setVisible( false );
            showingSettings = false;
        }
    }//GEN-LAST:event_showSettings

    private void exitedViewProfile(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitedViewProfile
        buttonViewProfile.setForeground(Color.WHITE);
    }//GEN-LAST:event_exitedViewProfile

    private void hoverViewProfile(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hoverViewProfile
        buttonViewProfile.setForeground(Color.RED);
    }//GEN-LAST:event_hoverViewProfile

    private void exitedChangeEmail(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitedChangeEmail
        buttonChangeEmail.setForeground(Color.WHITE);
    }//GEN-LAST:event_exitedChangeEmail

    private void hoverChangeEmail(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hoverChangeEmail
        buttonChangeEmail.setForeground(Color.RED);
    }//GEN-LAST:event_hoverChangeEmail

    private void exitedChangePassword(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitedChangePassword
        buttonChangePassword.setForeground(Color.WHITE);
    }//GEN-LAST:event_exitedChangePassword

    private void hoverChangePassword(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hoverChangePassword
        buttonChangePassword.setForeground(Color.RED);
    }//GEN-LAST:event_hoverChangePassword

    private void showMenu(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showMenu
        if (!showingMenu) {
            panelMenuOption.setVisible(true);
            showingMenu = true;
        } else {
            panelMenuOption.setVisible(false);
            showingMenu = false;
        }
    }//GEN-LAST:event_showMenu

    private void exitedYourBooks(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitedYourBooks
        buttonYourBooks.setForeground(Color.WHITE);
    }//GEN-LAST:event_exitedYourBooks

    private void hoverYourBooks(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hoverYourBooks
        buttonYourBooks.setForeground(Color.RED);
    }//GEN-LAST:event_hoverYourBooks

    private void exitedAllBooks(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitedAllBooks
        buttonAllBooks.setForeground(Color.WHITE);
    }//GEN-LAST:event_exitedAllBooks

    private void hoverAllBooks(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hoverAllBooks
        buttonAllBooks.setForeground(Color.RED);
    }//GEN-LAST:event_hoverAllBooks

    private void exitedHistory(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitedHistory
        buttonHistory.setForeground(Color.WHITE);
    }//GEN-LAST:event_exitedHistory

    private void hoverHistory(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hoverHistory
        buttonHistory.setForeground(Color.RED);
    }//GEN-LAST:event_hoverHistory

    private void clickChangeEmail(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickChangeEmail
        String newEmail = null;
        do {
            newEmail = JOptionPane.showInputDialog(null, "Please, enter a your new valid email address:",
                    "Change Email", JOptionPane.WARNING_MESSAGE);
            if (newEmail == null)
                break;
        } while(newEmail.equals(""));
        
        if (newEmail != null) {
            String previousEmail = student.getEmail();
            
            student.setEmail( newEmail );
            // change email address in database
            if (Dao.changeEmail( student ))  {
                JOptionPane.showMessageDialog(null, "The email address was successfully changed!",
                        "Info", JOptionPane.INFORMATION_MESSAGE);
            } else {
                student.setEmail( previousEmail );
                JOptionPane.showMessageDialog(null, "An error occurred. The email was not changed! Please try again.",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_clickChangeEmail

    private void clickChangePassword(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickChangePassword
        dispose();
        ChangePassword.start( student, false );
    }//GEN-LAST:event_clickChangePassword

    private void clickViewProfile(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickViewProfile
        dispose();
        Profile.start( student, false, true );
    }//GEN-LAST:event_clickViewProfile

    private void clickYourBooks(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickYourBooks
        tabbedPane.setSelectedIndex(0);
        labelBooks.setText("These are your books");
        clear();
    }//GEN-LAST:event_clickYourBooks

    private void clickAllBooks(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickAllBooks
        tabbedPane.setSelectedIndex(1);
        labelBooks.setText("These are all books");
        clear();
    }//GEN-LAST:event_clickAllBooks

    private void clickHistory(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickHistory
        tabbedPane.setSelectedIndex(2);
        labelBooks.setText("             History");
        clear();
    }//GEN-LAST:event_clickHistory

    private void searchByTitle2(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchByTitle2
        search( tableOfAllBooks, textFieldTitle2, textFieldAuthor2 );
    }//GEN-LAST:event_searchByTitle2

    private void searchByAuthor2(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchByAuthor2
        search( tableOfAllBooks, textFieldTitle2, textFieldAuthor2 );
    }//GEN-LAST:event_searchByAuthor2

    private void clickClear2(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickClear2
        clear();
    }//GEN-LAST:event_clickClear2

    private void clickClear1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickClear1
        clear();
    }//GEN-LAST:event_clickClear1

    private void searchByAuthor1(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchByAuthor1
        search( tableOfBooks, textFieldTitle1, textFieldAuthor1 );
    }//GEN-LAST:event_searchByAuthor1

    private void searchByTitle1(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchByTitle1
        search( tableOfBooks, textFieldTitle1, textFieldAuthor1 );
    }//GEN-LAST:event_searchByTitle1

    private void searchByTitle3(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchByTitle3
        search( tableOfHistory, textFieldTitle3, textFieldAuthor3 );
    }//GEN-LAST:event_searchByTitle3

    private void searchByAuthor3(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchByAuthor3
        search( tableOfHistory, textFieldTitle3, textFieldAuthor3 );
    }//GEN-LAST:event_searchByAuthor3

    private void clickClear3(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickClear3
        clear();
    }//GEN-LAST:event_clickClear3

    private void search(JTable table, JTextField field1, JTextField field2) {
        String searchQuery1 = field1.getText().toLowerCase();
        String searchQuery2 = field2.getText().toLowerCase();
        
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<DefaultTableModel>( model );
        table.setRowSorter( sorter );
        
        List<RowFilter<Object, Object>> filters = new ArrayList<RowFilter<Object, Object>>();         
        if (!searchQuery1.equals("")) {
            filters.add(RowFilter.regexFilter(searchQuery1, 1));
                    
            if (!searchQuery2.equals(""))
                filters.add(RowFilter.regexFilter(searchQuery2, 2));                
        } else {
            if (!searchQuery2.equals(""))
                filters.add(RowFilter.regexFilter(searchQuery2, 2));
        }
        
        sorter.setRowFilter( RowFilter.andFilter(filters) );
    }
    
    private void clear() {
        textFieldTitle1.setText("");
        textFieldAuthor1.setText("");
        textFieldTitle2.setText("");
        textFieldAuthor2.setText("");
        textFieldTitle3.setText("");
        textFieldAuthor3.setText("");
        
        search( tableOfBooks, textFieldTitle1, textFieldAuthor1 );
        search( tableOfAllBooks, textFieldTitle2, textFieldAuthor2 );
        search( tableOfHistory, textFieldTitle3, textFieldAuthor3 );
    }


    public static void start(Student student) {
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
            java.util.logging.Logger.getLogger(MainProgramForStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainProgramForStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainProgramForStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainProgramForStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainProgramForStudent( student ).setVisible(true);
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton buttonAboutUS;
    private javax.swing.JButton buttonAllBooks;
    private javax.swing.JButton buttonChangeEmail;
    private javax.swing.JButton buttonChangePassword;
    private javax.swing.JButton buttonClear1;
    private javax.swing.JButton buttonClear2;
    private javax.swing.JButton buttonClear3;
    private javax.swing.JButton buttonHistory;
    private javax.swing.JButton buttonMenu;
    private javax.swing.JButton buttonSettings;
    private javax.swing.JButton buttonSignout;
    private javax.swing.JButton buttonViewProfile;
    private javax.swing.JButton buttonYourBooks;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelBooks;
    private javax.swing.JLabel labelFooter;
    private javax.swing.JLabel labelSearch1;
    private javax.swing.JLabel labelSearch2;
    private javax.swing.JLabel labelSearch3;
    private javax.swing.JLabel labelSearchAuthor1;
    private javax.swing.JLabel labelSearchAuthor2;
    private javax.swing.JLabel labelSearchAuthor3;
    private javax.swing.JLabel labelSearchTitle1;
    private javax.swing.JLabel labelSearchTitle2;
    private javax.swing.JLabel labelSearchTitle3;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JLabel labelWelcome;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel panelAbout;
    private javax.swing.JPanel panelAllBook;
    private javax.swing.JPanel panelFooter;
    private javax.swing.JPanel panelHistory;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelMenuOption;
    private javax.swing.JPanel panelSettings;
    private javax.swing.JPanel panelSettingsOption;
    private javax.swing.JPanel panelSignout;
    private javax.swing.JPanel panelTools;
    private javax.swing.JPanel panelTools1;
    private javax.swing.JPanel panelYourBook;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JTable tableOfAllBooks;
    private javax.swing.JTable tableOfBooks;
    private javax.swing.JTable tableOfHistory;
    private javax.swing.JTextField textFieldAuthor1;
    private javax.swing.JTextField textFieldAuthor2;
    private javax.swing.JTextField textFieldAuthor3;
    private javax.swing.JTextField textFieldTitle1;
    private javax.swing.JTextField textFieldTitle2;
    private javax.swing.JTextField textFieldTitle3;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration
}
