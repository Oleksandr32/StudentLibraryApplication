package com.mycompany.studentlibraryapplication.gui;

import com.mycompany.studentlibraryapplication.db.Dao;
import com.mycompany.studentlibraryapplication.db.LibrarianDao;
import com.mycompany.studentlibraryapplication.entity.Book;
import com.mycompany.studentlibraryapplication.entity.Librarian;
import com.mycompany.studentlibraryapplication.entity.Student;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Alex Lysun
 */

public class MainProgramForLibrarian extends JFrame {
    // generated serial version UID
	private static final long serialVersionUID = 7909771909950914889L;
	
	// data fields
    private Librarian librarian;   
    private Student student;
    private boolean showingSettings;
    private boolean showingMenu;
    
    /**
    * Creates new form MainProgram
    * default constructor
    */ 
    public MainProgramForLibrarian() {
        initComponents();     
    }
    
    // constructor that take parameters
    public MainProgramForLibrarian(Librarian librarian) {
        this.librarian = librarian; 
        
        student = null;
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
        panelToolsCenter = new javax.swing.JPanel();
        panelFooter = new javax.swing.JPanel();
        labelFooter = new javax.swing.JLabel();
        labelBooks = new javax.swing.JLabel();
        panelSettingsOption = new javax.swing.JPanel();
        buttonChangeEmail = new javax.swing.JButton();
        buttonChangePassword = new javax.swing.JButton();
        buttonViewProfile = new javax.swing.JButton();
        labelWelcome = new javax.swing.JLabel();
        panelMenuOption = new javax.swing.JPanel();
        buttonAllStudents = new javax.swing.JButton();
        buttonAddBook = new javax.swing.JButton();
        buttonAllBooks = new javax.swing.JButton();
        tabbedPane = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        panelAllStudents = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableOfAllStudents = new javax.swing.JTable();
        labelSearchStudents = new javax.swing.JLabel();
        labelSearchId = new javax.swing.JLabel();
        textFieldID = new javax.swing.JTextField();
        textFieldFirstName = new javax.swing.JTextField();
        labelSearchFName = new javax.swing.JLabel();
        buttonClearStudents = new javax.swing.JButton();
        labelSearchLName = new javax.swing.JLabel();
        textFieldLastName = new javax.swing.JTextField();
        buttonAddBooks = new javax.swing.JButton();
        buttonRemoveBook = new javax.swing.JButton();
        buttonProfile = new javax.swing.JButton();
        labelActions = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        panelAllBook = new javax.swing.JPanel();
        labelNewTitle = new javax.swing.JLabel();
        labelNewAuthor = new javax.swing.JLabel();
        labelNewAuthor1 = new javax.swing.JLabel();
        radioAdd = new javax.swing.JRadioButton();
        radioUpdate = new javax.swing.JRadioButton();
        textFieldAddTitle = new javax.swing.JTextField();
        textFieldAddAuthor = new javax.swing.JTextField();
        textFieldAddQuantity = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableOfAddBooks = new javax.swing.JTable();
        buttonAdd = new javax.swing.JButton();
        buttonClear = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        panelAllBooks = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableOfAllBooks = new javax.swing.JTable();
        buttonClearBooks = new javax.swing.JButton();
        labelSearchAuthor = new javax.swing.JLabel();
        textFieldAuthor = new javax.swing.JTextField();
        textFieldTitle = new javax.swing.JTextField();
        labelSearchTitle = new javax.swing.JLabel();
        labelSearchBooks = new javax.swing.JLabel();

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
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addComponent(buttonMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelToolsCenter.setBackground(java.awt.Color.gray);

        javax.swing.GroupLayout panelToolsCenterLayout = new javax.swing.GroupLayout(panelToolsCenter);
        panelToolsCenter.setLayout(panelToolsCenterLayout);
        panelToolsCenterLayout.setHorizontalGroup(
            panelToolsCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelToolsCenterLayout.setVerticalGroup(
            panelToolsCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelToolsLayout = new javax.swing.GroupLayout(panelTools);
        panelTools.setLayout(panelToolsLayout);
        panelToolsLayout.setHorizontalGroup(
            panelToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelToolsLayout.createSequentialGroup()
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelToolsCenter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addComponent(panelToolsCenter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        labelBooks.setText("These are all students");

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

        buttonAllStudents.setBackground(java.awt.Color.gray);
        buttonAllStudents.setFont(new java.awt.Font("Vrinda", 1, 14)); // NOI18N
        buttonAllStudents.setForeground(java.awt.Color.white);
        buttonAllStudents.setText("All students");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, buttonAllStudents, org.jdesktop.beansbinding.ELProperty.create("false"), buttonAllStudents, org.jdesktop.beansbinding.BeanProperty.create("contentAreaFilled"));
        bindingGroup.addBinding(binding);

        buttonAllStudents.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                hoverAllStudents(evt);
            }
        });
        buttonAllStudents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickAllStudents(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitedAllStudents(evt);
            }
        });

        buttonAddBook.setBackground(java.awt.Color.gray);
        buttonAddBook.setFont(new java.awt.Font("Vrinda", 1, 14)); // NOI18N
        buttonAddBook.setForeground(java.awt.Color.white);
        buttonAddBook.setText("Add book to library");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, buttonAddBook, org.jdesktop.beansbinding.ELProperty.create("false"), buttonAddBook, org.jdesktop.beansbinding.BeanProperty.create("contentAreaFilled"));
        bindingGroup.addBinding(binding);

        buttonAddBook.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                hoverAddBook(evt);
            }
        });
        buttonAddBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickAddBooks(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitedAddBook(evt);
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

        javax.swing.GroupLayout panelMenuOptionLayout = new javax.swing.GroupLayout(panelMenuOption);
        panelMenuOption.setLayout(panelMenuOptionLayout);
        panelMenuOptionLayout.setHorizontalGroup(
            panelMenuOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonAllStudents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(buttonAddBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(buttonAllBooks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelMenuOptionLayout.setVerticalGroup(
            panelMenuOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuOptionLayout.createSequentialGroup()
                .addComponent(buttonAllStudents)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonAddBook)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonAllBooks))
        );

        tabbedPane.setBackground(new java.awt.Color(255, 255, 255));
        tabbedPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabbedPane.setEnabled(false);

        panelAllStudents.setBackground(new java.awt.Color(255, 255, 255));
        panelAllStudents.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        tableOfAllStudents.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        tableOfAllStudents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "№", "Student ID", "First Name", "Last Name"
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
        tableOfAllStudents.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tableOfAllStudents.setFillsViewportHeight(true);
        tableOfAllStudents.setMaximumSize(new java.awt.Dimension(214748, 64));
        tableOfAllStudents.setName("tableOfAllStudents"); // NOI18N
        tableOfAllStudents.setRowHeight(25);
        tableOfAllStudents.setSelectionBackground(new java.awt.Color(153, 153, 255));
        tableOfAllStudents.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tableOfAllStudents.setUpdateSelectionOnSort(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tableOfAllStudents, org.jdesktop.beansbinding.ELProperty.create("true"), tableOfAllStudents, org.jdesktop.beansbinding.BeanProperty.create("showHorizontalLines"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tableOfAllStudents, org.jdesktop.beansbinding.ELProperty.create("true"), tableOfAllStudents, org.jdesktop.beansbinding.BeanProperty.create("showVerticalLines"));
        bindingGroup.addBinding(binding);

        jScrollPane3.setViewportView(tableOfAllStudents);

        labelSearchStudents.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        labelSearchStudents.setForeground(new java.awt.Color(153, 153, 153));
        labelSearchStudents.setText("Search");

        labelSearchId.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        labelSearchId.setForeground(new java.awt.Color(153, 153, 153));
        labelSearchId.setText("ID:    ");

        textFieldID.setFont(new java.awt.Font("Vrinda", 1, 14)); // NOI18N
        textFieldID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchByID(evt);
            }
        });

        textFieldFirstName.setFont(new java.awt.Font("Vrinda", 1, 14)); // NOI18N
        textFieldFirstName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchByFirstName(evt);
            }
        });

        labelSearchFName.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        labelSearchFName.setForeground(new java.awt.Color(153, 153, 153));
        labelSearchFName.setText("First Name:");

        buttonClearStudents.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        buttonClearStudents.setForeground(new java.awt.Color(102, 102, 102));
        buttonClearStudents.setText("Clear");
        buttonClearStudents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickClearStudents(evt);
            }
        });

        labelSearchLName.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        labelSearchLName.setForeground(new java.awt.Color(153, 153, 153));
        labelSearchLName.setText("Last Name:");

        textFieldLastName.setFont(new java.awt.Font("Vrinda", 1, 14)); // NOI18N
        textFieldLastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchByLastName(evt);
            }
        });

        buttonAddBooks.setBackground(new java.awt.Color(204, 204, 204));
        buttonAddBooks.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        buttonAddBooks.setForeground(new java.awt.Color(102, 102, 102));
        buttonAddBooks.setIcon(new ImageIcon("img/book_add.png")
        );
        buttonAddBooks.setText("   Add Book    ");
        buttonAddBooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickAddBook(evt);
            }
        });

        buttonRemoveBook.setBackground(new java.awt.Color(204, 204, 204));
        buttonRemoveBook.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        buttonRemoveBook.setForeground(new java.awt.Color(102, 102, 102));
        buttonRemoveBook.setIcon(new ImageIcon("img/book_remove.png"));
        buttonRemoveBook.setText("Remove Book");
        buttonRemoveBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickRemoveBook(evt);
            }
        });

        buttonProfile.setBackground(new java.awt.Color(204, 204, 204));
        buttonProfile.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        buttonProfile.setForeground(new java.awt.Color(102, 102, 102));
        buttonProfile.setIcon(new ImageIcon("img/profile.png"));
        buttonProfile.setText("    Profile       ");
        buttonProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickProfile(evt);
            }
        });

        labelActions.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        labelActions.setForeground(new java.awt.Color(153, 153, 153));
        labelActions.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelActions.setText("Actions");

        javax.swing.GroupLayout panelAllStudentsLayout = new javax.swing.GroupLayout(panelAllStudents);
        panelAllStudents.setLayout(panelAllStudentsLayout);
        panelAllStudentsLayout.setHorizontalGroup(
            panelAllStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAllStudentsLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelAllStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonRemoveBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonAddBooks, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                    .addComponent(buttonProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelActions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelAllStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAllStudentsLayout.createSequentialGroup()
                        .addGroup(panelAllStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelAllStudentsLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(panelAllStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelSearchId)
                                    .addComponent(labelSearchLName)
                                    .addComponent(labelSearchFName))
                                .addGap(8, 8, 8)
                                .addGroup(panelAllStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textFieldFirstName)
                                    .addComponent(textFieldLastName)
                                    .addGroup(panelAllStudentsLayout.createSequentialGroup()
                                        .addComponent(textFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(panelAllStudentsLayout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(labelSearchStudents)))
                        .addGap(1265, 1265, 1265))
                    .addGroup(panelAllStudentsLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(buttonClearStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelAllStudentsLayout.setVerticalGroup(
            panelAllStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAllStudentsLayout.createSequentialGroup()
                .addComponent(labelSearchStudents)
                .addGap(27, 27, 27)
                .addGroup(panelAllStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSearchId)
                    .addComponent(textFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(panelAllStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSearchFName)
                    .addComponent(textFieldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelAllStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSearchLName))
                .addGap(18, 18, 18)
                .addComponent(buttonClearStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(panelAllStudentsLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelAllStudentsLayout.createSequentialGroup()
                .addComponent(labelActions)
                .addGap(18, 18, 18)
                .addComponent(buttonAddBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonRemoveBook, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelAllStudentsLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {textFieldFirstName, textFieldID, textFieldLastName});

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAllStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 1107, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panelAllStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 231, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabbedPane.addTab("", jPanel1);

        panelAllBook.setBackground(new java.awt.Color(255, 255, 255));
        panelAllBook.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        labelNewTitle.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        labelNewTitle.setForeground(new java.awt.Color(102, 102, 102));
        labelNewTitle.setText("Title:");

        labelNewAuthor.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        labelNewAuthor.setForeground(new java.awt.Color(102, 102, 102));
        labelNewAuthor.setText("Author:");

        labelNewAuthor1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        labelNewAuthor1.setForeground(new java.awt.Color(102, 102, 102));
        labelNewAuthor1.setText("Quantity:");

        radioAdd.setBackground(new java.awt.Color(255, 255, 255));
        radioAdd.setFont(new java.awt.Font("Vrinda", 1, 14)); // NOI18N
        radioAdd.setForeground(new java.awt.Color(102, 102, 102));
        radioAdd.setSelected(true);
        radioAdd.setText("Add New");

        radioUpdate.setBackground(new java.awt.Color(255, 255, 255));
        radioUpdate.setFont(new java.awt.Font("Vrinda", 1, 14)); // NOI18N
        radioUpdate.setForeground(new java.awt.Color(102, 102, 102));
        radioUpdate.setText("Update Quantity");

        textFieldAddTitle.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        textFieldAddTitle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                enterTitle(evt);
            }
        });

        textFieldAddAuthor.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        textFieldAddAuthor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                enterAuthor(evt);
            }
        });

        textFieldAddQuantity.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        textFieldAddQuantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                enterQuantity(evt);
            }
        });

        tableOfAddBooks.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        tableOfAddBooks.setModel(new javax.swing.table.DefaultTableModel(
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
        tableOfAddBooks.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tableOfAddBooks.setFillsViewportHeight(true);
        tableOfAddBooks.setMaximumSize(new java.awt.Dimension(214748, 64));
        tableOfAddBooks.setName("tableOfAllBooks"); // NOI18N
        tableOfAddBooks.setRowHeight(25);
        tableOfAddBooks.setSelectionBackground(new java.awt.Color(153, 153, 255));
        tableOfAddBooks.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tableOfAddBooks.setUpdateSelectionOnSort(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tableOfAddBooks, org.jdesktop.beansbinding.ELProperty.create("true"), tableOfAddBooks, org.jdesktop.beansbinding.BeanProperty.create("showHorizontalLines"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tableOfAddBooks, org.jdesktop.beansbinding.ELProperty.create("true"), tableOfAddBooks, org.jdesktop.beansbinding.BeanProperty.create("showVerticalLines"));
        bindingGroup.addBinding(binding);

        jScrollPane2.setViewportView(tableOfAddBooks);

        buttonAdd.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        buttonAdd.setForeground(new java.awt.Color(102, 102, 102));
        buttonAdd.setText("Add/Update");
        buttonAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickAdd(evt);
            }
        });

        buttonClear.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        buttonClear.setForeground(new java.awt.Color(102, 102, 102));
        buttonClear.setText("Clear");
        buttonClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickClear(evt);
            }
        });

        javax.swing.GroupLayout panelAllBookLayout = new javax.swing.GroupLayout(panelAllBook);
        panelAllBook.setLayout(panelAllBookLayout);
        panelAllBookLayout.setHorizontalGroup(
            panelAllBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAllBookLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAllBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelAllBookLayout.createSequentialGroup()
                        .addComponent(radioAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(radioUpdate))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelAllBookLayout.createSequentialGroup()
                        .addComponent(buttonAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelAllBookLayout.createSequentialGroup()
                        .addGroup(panelAllBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNewTitle)
                            .addComponent(labelNewAuthor)
                            .addComponent(labelNewAuthor1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelAllBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(textFieldAddQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(textFieldAddAuthor)
                            .addComponent(textFieldAddTitle))))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelAllBookLayout.setVerticalGroup(
            panelAllBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAllBookLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAllBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioAdd)
                    .addComponent(radioUpdate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAllBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNewTitle)
                    .addComponent(textFieldAddTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAllBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNewAuthor)
                    .addComponent(textFieldAddAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAllBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNewAuthor1)
                    .addComponent(textFieldAddQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelAllBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(buttonClear, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
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

        panelAllBooks.setBackground(new java.awt.Color(255, 255, 255));
        panelAllBooks.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

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
        tableOfAllBooks.setName("tableOfAllBooks"); // NOI18N
        tableOfAllBooks.setRowHeight(25);
        tableOfAllBooks.setSelectionBackground(new java.awt.Color(153, 153, 255));
        tableOfAllBooks.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tableOfAllBooks.setUpdateSelectionOnSort(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tableOfAllBooks, org.jdesktop.beansbinding.ELProperty.create("true"), tableOfAllBooks, org.jdesktop.beansbinding.BeanProperty.create("showHorizontalLines"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tableOfAllBooks, org.jdesktop.beansbinding.ELProperty.create("true"), tableOfAllBooks, org.jdesktop.beansbinding.BeanProperty.create("showVerticalLines"));
        bindingGroup.addBinding(binding);

        jScrollPane1.setViewportView(tableOfAllBooks);

        buttonClearBooks.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        buttonClearBooks.setForeground(new java.awt.Color(102, 102, 102));
        buttonClearBooks.setText("Clear");
        buttonClearBooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickClearBooks(evt);
            }
        });

        labelSearchAuthor.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        labelSearchAuthor.setForeground(new java.awt.Color(153, 153, 153));
        labelSearchAuthor.setText("Author: ");

        textFieldAuthor.setFont(new java.awt.Font("Vrinda", 1, 14)); // NOI18N
        textFieldAuthor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchByAuthor(evt);
            }
        });

        textFieldTitle.setFont(new java.awt.Font("Vrinda", 1, 14)); // NOI18N
        textFieldTitle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchByTitle(evt);
            }
        });

        labelSearchTitle.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        labelSearchTitle.setForeground(new java.awt.Color(153, 153, 153));
        labelSearchTitle.setText("Title: ");

        labelSearchBooks.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        labelSearchBooks.setForeground(new java.awt.Color(153, 153, 153));
        labelSearchBooks.setText("Search");

        javax.swing.GroupLayout panelAllBooksLayout = new javax.swing.GroupLayout(panelAllBooks);
        panelAllBooks.setLayout(panelAllBooksLayout);
        panelAllBooksLayout.setHorizontalGroup(
            panelAllBooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAllBooksLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelAllBooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAllBooksLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(panelAllBooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelSearchTitle)
                            .addComponent(labelSearchAuthor))
                        .addGroup(panelAllBooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelAllBooksLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(panelAllBooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textFieldTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textFieldAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAllBooksLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelSearchBooks)
                                .addGap(107, 107, 107)))
                        .addContainerGap(29, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAllBooksLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonClearBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93))))
        );
        panelAllBooksLayout.setVerticalGroup(
            panelAllBooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
            .addGroup(panelAllBooksLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(labelSearchBooks)
                .addGap(18, 18, 18)
                .addGroup(panelAllBooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSearchTitle))
                .addGap(18, 18, 18)
                .addGroup(panelAllBooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSearchAuthor)
                    .addComponent(textFieldAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(buttonClearBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelAllBooksLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {textFieldAuthor, textFieldTitle});

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAllBooks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAllBooks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addGap(542, 542, 542)
                        .addComponent(labelBooks))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
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

    // method init components of main panel 
    private void initPanel() {
        panelSettingsOption.setVisible(false);
        panelMenuOption.setVisible(false);
        labelWelcome.setText(labelWelcome.getText() + " " + librarian.getFirstName() + " " + librarian.getLastName());
        
        ButtonGroup group = new ButtonGroup();
        group.add( radioAdd );
        group.add( radioUpdate );
    }
    
    // method init all tables on the frame
    private void initTables() {
        initTableColumn(tableOfAllBooks, 0, 1, 2, 3);
        initTableColumn(tableOfAllStudents, 0, 2, 3, 1);
        initTableColumn(tableOfAddBooks, 0, 1, 2, 3);
        
        fillingTables();
    }
    
    // init column width
    private void initTableColumn(JTable table, int one, int two, int three, int four) {        
        table.getColumnModel().getColumn(one).setPreferredWidth(80);
        table.getColumnModel().getColumn(one).setMaxWidth(80);
        table.getColumnModel().getColumn(one).setMinWidth(80);
        table.getColumnModel().getColumn(two).setPreferredWidth(250);
        table.getColumnModel().getColumn(two).setMaxWidth(300);
        table.getColumnModel().getColumn(two).setMinWidth(250);
        table.getColumnModel().getColumn(three).setPreferredWidth(250);
        table.getColumnModel().getColumn(three).setMaxWidth(300);
        table.getColumnModel().getColumn(three).setMinWidth(250);
        table.getColumnModel().getColumn(four).setPreferredWidth(100);
        table.getColumnModel().getColumn(four).setMaxWidth(100);
        table.getColumnModel().getColumn(four).setMinWidth(100);
        
        ((DefaultTableCellRenderer)table.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
    }
    
    // method adds book's object and student's in the table
    private void fillingTables() {
        DefaultTableModel model = (DefaultTableModel) tableOfAllStudents.getModel();
        Object[] row = new Object[tableOfAllStudents.getColumnCount()];
        
        List<Student> allStudents = LibrarianDao.getAllStudents();
        // sort list of all students by id
        allStudents.sort( (o1, o2) -> o1.getId().compareTo(o2.getId()) );
        for (int i = 0; i < allStudents.size(); i++) {
            Student s = allStudents.get(i);
            row[0] = i + 1;
            row[1] = s.getId();
            row[2] = s.getFirstName();
            row[3] = s.getLastName();
            model.addRow(row);
        }   
        
        // filling table of all books
        fillingTableOfBooks( (DefaultTableModel) tableOfAddBooks.getModel() );
        fillingTableOfBooks( (DefaultTableModel) tableOfAllBooks.getModel() );
    }
    
    // method fills the table with book object 
    private void fillingTableOfBooks(DefaultTableModel model) {    
        // book has 4 fields, so row.length = 4
        Object[] row = new Object[4];
        
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
    } 
    
    //  method deletes all rows from the table
    private void clearTableOfBooks(DefaultTableModel model) {
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
    }
    
    private void buttonSignoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSignoutActionPerformed
        dispose();
        Login.start(librarian.getId(), null);
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
        setEnabled(false);
        AboutUs.start(librarian, true);
        dispose();
    }//GEN-LAST:event_clickAboutUs

    private void showSettings(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showSettings
        if (!showingSettings) {
            panelSettingsOption.setVisible(true);
            showingSettings = true;
        } else {
            panelSettingsOption.setVisible(false);
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

    private void exitedAllStudents(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitedAllStudents
        buttonAllStudents.setForeground(Color.WHITE);
    }//GEN-LAST:event_exitedAllStudents

    private void hoverAllStudents(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hoverAllStudents
        buttonAllStudents.setForeground(Color.RED);
    }//GEN-LAST:event_hoverAllStudents

    private void exitedAddBook(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitedAddBook
        buttonAddBook.setForeground(Color.WHITE);
    }//GEN-LAST:event_exitedAddBook

    private void hoverAddBook(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hoverAddBook
        buttonAddBook.setForeground(Color.RED);
    }//GEN-LAST:event_hoverAddBook

    private void exitedAllBooks(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitedAllBooks
        buttonAllBooks.setForeground(Color.WHITE);
    }//GEN-LAST:event_exitedAllBooks

    private void hoverAllBooks(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hoverAllBooks
        buttonAllBooks.setForeground(Color.RED);
    }//GEN-LAST:event_hoverAllBooks

    private void clickChangeEmail(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickChangeEmail
        String newEmail = null;
        do {
            newEmail = JOptionPane.showInputDialog(null, "Please, enter a your new valid email address:",
                    "Change Email", JOptionPane.WARNING_MESSAGE);
            if (newEmail == null)
                break;
        } while(newEmail.equals(""));
        
        if (newEmail != null) {
            String previousEmail = librarian.getEmail();
            
            librarian.setEmail( newEmail );
            // change email address in database
            if (Dao.changeEmail( librarian ))  {
                JOptionPane.showMessageDialog(null, "The email address was successfully changed!",
                        "Info", JOptionPane.INFORMATION_MESSAGE);
            } else {
                librarian.setEmail( previousEmail );
                JOptionPane.showMessageDialog(null, "An error occurred. The email was not changed! Please try again.",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_clickChangeEmail

    private void clickChangePassword(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickChangePassword
        dispose();
        ChangePassword.start(librarian, true);
    }//GEN-LAST:event_clickChangePassword

    private void clickViewProfile(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickViewProfile
        dispose();
        Profile.start(librarian, true, true );
    }//GEN-LAST:event_clickViewProfile

    private void clickAllStudents(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickAllStudents
        tabbedPane.setSelectedIndex(0);
        labelBooks.setText("These are all students");
        clear();
    }//GEN-LAST:event_clickAllStudents

    private void clickAddBooks(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickAddBooks
        tabbedPane.setSelectedIndex(1);
        labelBooks.setText("Add books to the library");
        clear();
    }//GEN-LAST:event_clickAddBooks

    private void clickAllBooks(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickAllBooks
        tabbedPane.setSelectedIndex(2);
        labelBooks.setText("These are all books");
        clear();
    }//GEN-LAST:event_clickAllBooks

    private void searchByID(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchByID
        search(tableOfAllStudents);
    }//GEN-LAST:event_searchByID

    private void searchByFirstName(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchByFirstName
        search(tableOfAllStudents);
    }//GEN-LAST:event_searchByFirstName

    private void clickClearStudents(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickClearStudents
        clear();
    }//GEN-LAST:event_clickClearStudents

    private void clickClearBooks(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickClearBooks
        clear();
    }//GEN-LAST:event_clickClearBooks

    private void searchByAuthor(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchByAuthor
        search(tableOfAllBooks);
    }//GEN-LAST:event_searchByAuthor

    private void searchByTitle(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchByTitle
        search(tableOfAllBooks);
    }//GEN-LAST:event_searchByTitle

    private void searchByLastName(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchByLastName
        search(tableOfAllStudents);
    }//GEN-LAST:event_searchByLastName

    private void enterTitle(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enterTitle
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
            checkFields();
    }//GEN-LAST:event_enterTitle

    private void enterAuthor(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enterAuthor
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
            checkFields();
    }//GEN-LAST:event_enterAuthor

    private void enterQuantity(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enterQuantity
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
            checkFields();
    }//GEN-LAST:event_enterQuantity
    
    // buttonAdd mouse click event 
    private void clickAdd(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickAdd
        checkFields();
    }//GEN-LAST:event_clickAdd

    // buttonClear mouse click event 
    private void clickClear(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickClear
        clear();
    }//GEN-LAST:event_clickClear

    // click profile button event
    private void clickProfile(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickProfile
        getStudentFromTable();
        
        if ( student != null )
            // start Profile form with selected student and regime "no change" 
            Profile.start( student, false, false );
    }//GEN-LAST:event_clickProfile
    
    // method selects a student object from the table of all student
    private void getStudentFromTable() {        
        int rowCount = tableOfAllStudents.getSelectedRowCount();
        int rowIndex = tableOfAllStudents.getSelectedRow();
        student = null;
        
        if ( rowCount > 1) {
            JOptionPane.showMessageDialog( null, "Select only one student!", 
                    "Info", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (rowIndex != -1) {
                // get student id from table of all students
                String id = tableOfAllStudents.getValueAt( rowIndex, 1 ).toString();
                
                student = LibrarianDao.getStudent( id );
            } else
                JOptionPane.showMessageDialog( null, "First select the student you want from the table!", 
                    "Info", JOptionPane.INFORMATION_MESSAGE );
        }
    } // end getStudentFromTable() method
    
    // buttonRemoveBook mouse click event
    private void clickRemoveBook(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickRemoveBook
        getStudentFromTable();
        
        if ( student != null )
            // start BookOperation form with selected student and regime "Remove Book"
            BookOperation.start( student, false );
    }//GEN-LAST:event_clickRemoveBook

    // buttonAddBook mouse click event
    private void clickAddBook(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickAddBook
        getStudentFromTable();
        
        if ( student != null )
            // start BookOperation form with selected student and regime "Add Book"
            BookOperation.start( student, true );
    }//GEN-LAST:event_clickAddBook

    // check the fields for emptiness
    private void checkFields() {
        if (textFieldAddTitle.getText().length() > 0 
            && textFieldAddAuthor.getText().length() > 0
            && textFieldAddQuantity.getText().length() > 0)               
               addBook();
        else if (textFieldAddTitle.getText().length() == 0) {            
            JOptionPane.showMessageDialog(null, "Title is required!", "Info", JOptionPane.INFORMATION_MESSAGE);
            textFieldAddTitle.requestFocus();
        } else if (textFieldAddAuthor.getText().length() == 0) {            
            JOptionPane.showMessageDialog(null, "Author is required!", "Info", JOptionPane.INFORMATION_MESSAGE);
            textFieldAddAuthor.requestFocus();
        } else if (textFieldAddQuantity.getText().length() == 0) {            
            JOptionPane.showMessageDialog(null, "Quantity is required!", "Info", JOptionPane.INFORMATION_MESSAGE);
            textFieldAddQuantity.requestFocus();
        }
    }
    
    // add new book to the library update quantity of books in the library
    private void addBook() {
        String title = textFieldAddTitle.getText().toLowerCase();
        String author = textFieldAddAuthor.getText().toLowerCase();
        try {
            int quantity = Integer.parseInt( textFieldAddQuantity.getText() );
            if (quantity < 0) {
                JOptionPane.showMessageDialog(null, "Quantity is incorrect!",
                            "Warning", JOptionPane.WARNING_MESSAGE );
                
                textFieldAddQuantity.setText("");
                textFieldAddQuantity.requestFocus();
                return;
            }
            
            Book book = new Book(title, author, quantity);
            
            if ( radioAdd.isSelected() ) {
                if ( new LibrarianDao().addBook( student, book ) ) {
                    JOptionPane.showMessageDialog(null, "The book was successfully added to the library.",
                            "Info", JOptionPane.INFORMATION_MESSAGE );
                } else {
                    JOptionPane.showMessageDialog( null, "An error occurred. The book was not added!"
                            + "\nPerhaps a book with such a title already exists in the database."
                            + "Try to update the quantity for this book.",
                            "Error", JOptionPane.ERROR_MESSAGE );  
                }
                
            } else {
                if ( LibrarianDao.updateQuantity( book ) ) {
                    JOptionPane.showMessageDialog( null, "The quantity of book was successfully updated in the library.",
                            "Info", JOptionPane.INFORMATION_MESSAGE );
                } else {
                    JOptionPane.showMessageDialog( null, "An error occurred. The quantity of book was not updated!"
                            + "\nPerhaps a book with this title does not exist in the database yet" 
                            + "or you have entered a wrong title.",
                            "Error", JOptionPane.ERROR_MESSAGE );
                }                
            }
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog( null, "Quantity is incorrect", "Warning", JOptionPane.WARNING_MESSAGE );
        }
        
        clear();
        clearTableOfBooks( (DefaultTableModel) tableOfAddBooks.getModel() );
        fillingTableOfBooks( (DefaultTableModel) tableOfAddBooks.getModel() );
    } // end method addBook()
    
    // method finds values in the table that correspond to the entered values
    private void search(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<DefaultTableModel>(model);
        table.setRowSorter( sorter );
        
        List<RowFilter<Object, Object>> filters = new ArrayList<RowFilter<Object, Object>>();         
        if (table.getName().equals(tableOfAllBooks.getName()))
            searchBook(filters);
        else
            searchStudent(filters);
        
        sorter.setRowFilter( RowFilter.andFilter(filters) );
    }
    
    // method creates filters for finding a book by title and author
    private void searchBook(List<RowFilter<Object, Object>> filters) {
        String searchQuery1 = textFieldTitle.getText().toLowerCase();
        String searchQuery2 = textFieldAuthor.getText().toLowerCase();
        
        if (!searchQuery1.equals("")) {
            filters.add(RowFilter.regexFilter(searchQuery1, 1));
                    
            if (!searchQuery2.equals(""))
                filters.add(RowFilter.regexFilter(searchQuery2, 2));  
            
        } else {
            if (!searchQuery2.equals(""))
                filters.add(RowFilter.regexFilter(searchQuery2, 2));
        }
    }
    
    // method creates filters for finding a student by id, first name and last name
    private void searchStudent(List<RowFilter<Object, Object>> filters) {
        String searchQuery1 = textFieldID.getText();
        String searchQuery2 = textFieldFirstName.getText();
        String searchQuery3 = textFieldLastName.getText();
        
        if (!searchQuery1.equals("")) {
            filters.add(RowFilter.regexFilter(searchQuery1, 1));
                    
            if (!searchQuery2.equals(""))
                filters.add(RowFilter.regexFilter(searchQuery2, 2));     
            
            if (!searchQuery3.equals(""))
                filters.add(RowFilter.regexFilter(searchQuery3, 3)); 
            
        } else if (!searchQuery2.equals("")) {
            filters.add(RowFilter.regexFilter(searchQuery2, 2));
            
            if (!searchQuery1.equals(""))
                filters.add(RowFilter.regexFilter(searchQuery1, 1));
            
            if (!searchQuery3.equals(""))
                filters.add(RowFilter.regexFilter(searchQuery3, 3));
            
        } else {
            if (!searchQuery3.equals(""))
                filters.add(RowFilter.regexFilter(searchQuery3, 3));
        }
    } // end searchStudent method
    
    // clear all textfields on the form
    private void clear() {
        textFieldAddTitle.setText("");
        textFieldAddTitle.requestFocus();
        textFieldAddAuthor.setText("");
        textFieldAddQuantity.setText("");
        radioAdd.setSelected( true );
        
        textFieldID.setText("");
        textFieldFirstName.setText("");
        textFieldLastName.setText("");
        textFieldTitle.setText("");
        textFieldAuthor.setText("");
        
        search(tableOfAllStudents);
        search(tableOfAllBooks);
    }


    public static void start(Librarian librarian) {
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
            java.util.logging.Logger.getLogger(MainProgramForLibrarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainProgramForLibrarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainProgramForLibrarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainProgramForLibrarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainProgramForLibrarian( librarian ).setVisible( true );
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton buttonAboutUS;
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonAddBook;
    private javax.swing.JButton buttonAddBooks;
    private javax.swing.JButton buttonAllBooks;
    private javax.swing.JButton buttonAllStudents;
    private javax.swing.JButton buttonChangeEmail;
    private javax.swing.JButton buttonChangePassword;
    private javax.swing.JButton buttonClear;
    private javax.swing.JButton buttonClearBooks;
    private javax.swing.JButton buttonClearStudents;
    private javax.swing.JButton buttonMenu;
    private javax.swing.JButton buttonProfile;
    private javax.swing.JButton buttonRemoveBook;
    private javax.swing.JButton buttonSettings;
    private javax.swing.JButton buttonSignout;
    private javax.swing.JButton buttonViewProfile;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelActions;
    private javax.swing.JLabel labelBooks;
    private javax.swing.JLabel labelFooter;
    private javax.swing.JLabel labelNewAuthor;
    private javax.swing.JLabel labelNewAuthor1;
    private javax.swing.JLabel labelNewTitle;
    private javax.swing.JLabel labelSearchAuthor;
    private javax.swing.JLabel labelSearchBooks;
    private javax.swing.JLabel labelSearchFName;
    private javax.swing.JLabel labelSearchId;
    private javax.swing.JLabel labelSearchLName;
    private javax.swing.JLabel labelSearchStudents;
    private javax.swing.JLabel labelSearchTitle;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JLabel labelWelcome;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel panelAbout;
    private javax.swing.JPanel panelAllBook;
    private javax.swing.JPanel panelAllBooks;
    private javax.swing.JPanel panelAllStudents;
    private javax.swing.JPanel panelFooter;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelMenuOption;
    private javax.swing.JPanel panelSettings;
    private javax.swing.JPanel panelSettingsOption;
    private javax.swing.JPanel panelSignout;
    private javax.swing.JPanel panelTools;
    private javax.swing.JPanel panelToolsCenter;
    private javax.swing.JRadioButton radioAdd;
    private javax.swing.JRadioButton radioUpdate;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JTable tableOfAddBooks;
    private javax.swing.JTable tableOfAllBooks;
    private javax.swing.JTable tableOfAllStudents;
    private javax.swing.JTextField textFieldAddAuthor;
    private javax.swing.JTextField textFieldAddQuantity;
    private javax.swing.JTextField textFieldAddTitle;
    private javax.swing.JTextField textFieldAuthor;
    private javax.swing.JTextField textFieldFirstName;
    private javax.swing.JTextField textFieldID;
    private javax.swing.JTextField textFieldLastName;
    private javax.swing.JTextField textFieldTitle;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration
}
