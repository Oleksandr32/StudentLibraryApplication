package com.mycompany.studentlibraryapplication.gui;

import com.mycompany.studentlibraryapplication.db.Dao;
import com.mycompany.studentlibraryapplication.db.StudentDao;
import com.mycompany.studentlibraryapplication.entity.Book;
import com.mycompany.studentlibraryapplication.entity.Student;

import javax.swing.table.DefaultTableCellRenderer;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Alex Lysun
 */
public class BookOperation extends JFrame {
	// generated serial version UID
	private static final long serialVersionUID = -6325795612124404989L;
	
	// data fields
    private Student student;
    private Book book;
    private boolean isAddition;
    private Color color;
    
    /**
     * Creates new form BookOperation
     * default constructor
     */
    public BookOperation() {
        initComponents();
    }
    
    // constructor that takes parameters
    public BookOperation(Student student, boolean isAddition) {
        this.student = student;
        this.isAddition = isAddition;
        
        initComponents();
        initMainPanel();
        initTable();
        
        color = panelOperation.getBackground();
    }

    // method init all components on the main panel
    private void initMainPanel() {
        if ( !isAddition ) {
            labelOperation.setText( "Remove Book" );
            buttonOperation.setText( "Remove Book" );
            buttonOperation.setIcon( new ImageIcon( "img/remove.png" ) );
            tableOfBooks.getColumnModel().getColumn( 3 ).setHeaderValue( "Date" );
        }
        
        initTable();
        fillingTables();
    }
    
    // method init table of books on the frame
    private void initTable() {
        tableOfBooks.getColumnModel().getColumn(0).setPreferredWidth(80);
        tableOfBooks.getColumnModel().getColumn(0).setMaxWidth(80);
        tableOfBooks.getColumnModel().getColumn(0).setMinWidth(80);
        tableOfBooks.getColumnModel().getColumn(1).setPreferredWidth(250);
        tableOfBooks.getColumnModel().getColumn(1).setMaxWidth(300);
        tableOfBooks.getColumnModel().getColumn(1).setMinWidth(250);
        tableOfBooks.getColumnModel().getColumn(2).setPreferredWidth(250);
        tableOfBooks.getColumnModel().getColumn(2).setMaxWidth(300);
        tableOfBooks.getColumnModel().getColumn(2).setMinWidth(250);
        tableOfBooks.getColumnModel().getColumn(3).setMaxWidth(100);
        tableOfBooks.getColumnModel().getColumn(3).setMinWidth(100);
        
        ((DefaultTableCellRenderer)tableOfBooks.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
    }
    
    // method adds book object in the table
    private void fillingTables() {
        DefaultTableModel model = (DefaultTableModel) tableOfBooks.getModel();
        Object[] row = new Object[tableOfBooks.getColumnCount()];
        
        if ( isAddition ) {
            fillingTableOfAllBooks( model, row );
        } else {
            fillingTableOfBooks( model, row );
        } 
    }
    
    // method adds all book in the table
    private void fillingTableOfAllBooks(DefaultTableModel model, Object[] row) {
        List<Book> allBooks = Dao.getAllBooks();
        // sort list of all books by title
        allBooks.sort( (o1, o2) -> o1.getTitle().compareTo( o2.getTitle() ) );
        for (int i = 0; i < allBooks.size(); i++) {
            Book b = allBooks.get(i);
            row[0] = i + 1;
            row[1] = b.getTitle();
            row[2] = b.getAuthor();
            row[3] = b.getQuantity();
            model.addRow(row);
        }   
    }
    
    // method adds student book in the table
    private void fillingTableOfBooks(DefaultTableModel model, Object[] row) {
        for (int i = 0; i < student.getBooks().size(); i++) {
            Book b = student.getBooks().get(i);
            row[0] = i + 1;
            row[1] = b.getTitle();
            row[2] = b.getAuthor();
            row[3] = student.getDates().get(i);
            model.addRow(row);
        }
    }
    
    //  method deletes all rows from the table
    private void clearTableOfBooks(DefaultTableModel model) {
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. 
     */
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        mainPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableOfBooks = new javax.swing.JTable();
        labelOperation = new javax.swing.JLabel();
        labelSearch = new javax.swing.JLabel();
        labelTitle = new javax.swing.JLabel();
        labelAuthor = new javax.swing.JLabel();
        textFieldTitle = new javax.swing.JTextField();
        textFieldAuthor = new javax.swing.JTextField();
        buttonClear = new javax.swing.JButton();
        panelContinue = new javax.swing.JPanel();
        buttonContinue = new javax.swing.JButton();
        panelOperation = new javax.swing.JPanel();
        buttonOperation = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Book Operation");
        setIconImage((new ImageIcon("img/mainProgram-icon.png")).getImage());
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));

        tableOfBooks.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        tableOfBooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "№", "Title", "Author", "Quantity"
            }
        ));
        tableOfBooks.setFillsViewportHeight(true);
        tableOfBooks.setRowHeight(25);
        tableOfBooks.setSelectionBackground(new java.awt.Color(153, 153, 255));
        tableOfBooks.setSelectionForeground(new java.awt.Color(0, 0, 0));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tableOfBooks, org.jdesktop.beansbinding.ELProperty.create("true"), tableOfBooks, org.jdesktop.beansbinding.BeanProperty.create("showHorizontalLines"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tableOfBooks, org.jdesktop.beansbinding.ELProperty.create("true"), tableOfBooks, org.jdesktop.beansbinding.BeanProperty.create("showVerticalLines"));
        bindingGroup.addBinding(binding);

        jScrollPane1.setViewportView(tableOfBooks);

        labelOperation.setBackground(new java.awt.Color(255, 255, 255));
        labelOperation.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        labelOperation.setForeground(new java.awt.Color(255, 102, 102));
        labelOperation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelOperation.setText("Add Book");

        labelSearch.setBackground(new java.awt.Color(255, 255, 255));
        labelSearch.setFont(new java.awt.Font("Vrinda", 1, 18)); // NOI18N
        labelSearch.setForeground(new java.awt.Color(153, 153, 153));
        labelSearch.setText("Search:");

        labelTitle.setBackground(new java.awt.Color(255, 255, 255));
        labelTitle.setFont(new java.awt.Font("Vrinda", 1, 14)); // NOI18N
        labelTitle.setForeground(new java.awt.Color(153, 153, 153));
        labelTitle.setText("Title:");

        labelAuthor.setBackground(new java.awt.Color(255, 255, 255));
        labelAuthor.setFont(new java.awt.Font("Vrinda", 1, 14)); // NOI18N
        labelAuthor.setForeground(new java.awt.Color(153, 153, 153));
        labelAuthor.setText("Author:");

        textFieldTitle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                enterTitle(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchByTitle(evt);
            }
        });

        textFieldAuthor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchByAuthor(evt);
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

        panelContinue.setBackground(new java.awt.Color(0, 153, 204));

        buttonContinue.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        buttonContinue.setForeground(new java.awt.Color(255, 255, 255));
        buttonContinue.setText("Continue");
        buttonContinue.setBorder(null);

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
            .addComponent(buttonContinue, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
        );
        panelContinueLayout.setVerticalGroup(
            panelContinueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonContinue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelOperation.setBackground(new java.awt.Color(0, 153, 204));

        buttonOperation.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        buttonOperation.setForeground(new java.awt.Color(255, 255, 255));
        buttonOperation.setIcon(new ImageIcon("img/add.png"));
        buttonOperation.setText("   Add Book   ");
        buttonOperation.setBorder(null);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, buttonOperation, org.jdesktop.beansbinding.ELProperty.create("false"), buttonOperation, org.jdesktop.beansbinding.BeanProperty.create("contentAreaFilled"));
        bindingGroup.addBinding(binding);

        buttonOperation.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                hoverOperation(evt);
            }
        });
        buttonOperation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickOperation(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitedOperation(evt);
            }
        });

        javax.swing.GroupLayout panelOperationLayout = new javax.swing.GroupLayout(panelOperation);
        panelOperation.setLayout(panelOperationLayout);
        panelOperationLayout.setHorizontalGroup(
            panelOperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonOperation, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
        );
        panelOperationLayout.setVerticalGroup(
            panelOperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonOperation, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelOperation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 781, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(labelSearch)
                        .addGap(62, 62, 62)
                        .addComponent(labelTitle)
                        .addGap(18, 18, 18)
                        .addComponent(textFieldTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93)
                        .addComponent(labelAuthor)
                        .addGap(18, 18, 18)
                        .addComponent(textFieldAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(panelOperation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(165, 165, 165)
                .addComponent(panelContinue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelOperation)
                .addGap(23, 23, 23)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSearch)
                    .addComponent(labelTitle)
                    .addComponent(textFieldTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAuthor)
                    .addComponent(textFieldAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelOperation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelContinue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(12, Short.MAX_VALUE))
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
    } // end iniyComponents method

    // buttonClear mouse click event
    private void clickClear(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickClear
        clear();
    }//GEN-LAST:event_clickClear

    // textfieldTitle key released event
    private void searchByTitle(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchByTitle
        search();
    }//GEN-LAST:event_searchByTitle

    // textfieldAythor key released event
    private void searchByAuthor(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchByAuthor
        search();
    }//GEN-LAST:event_searchByAuthor

    // buttonOperation mouse exited event
    private void exitedOperation(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitedOperation
        panelOperation.setBackground( color );
    }//GEN-LAST:event_exitedOperation

    // buttonOperation mouse hover event
    private void hoverOperation(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hoverOperation
        panelOperation.setBackground( Color.BLUE );
    }//GEN-LAST:event_hoverOperation

    // buttonContinue mouse exited event
    private void exitedContinue(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitedContinue
        panelContinue.setBackground( color );
    }//GEN-LAST:event_exitedContinue

    // buttonContinue mouse hover event
    private void hoverContinue(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hoverContinue
        panelContinue.setBackground( Color.BLUE );
    }//GEN-LAST:event_hoverContinue
    
    // buttonOperation mouse click event
    private void clickOperation(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickOperation
        getBookFromTable();
        
        if ( book != null ) {
            boolean result = false;
            
            // check whether this regime "Add Book" or "Remove Book"
            if ( isAddition ) {
                // check if the student already has this book. Student can have only one copy of the book
                if ( student.getBooks().contains( book ) ) {
                    JOptionPane.showMessageDialog( null, "This student already has this book", "Warning", JOptionPane.WARNING_MESSAGE );
                    return;
                }
            
                // book quantity must be > 0
                if ( book.getQuantity() > 0) {
                    // add book to student
                    result = new StudentDao().addBook( student, book );

                    if (result) {
                        JOptionPane.showMessageDialog( null, "The book was successfully added to the student.",
                                "Info", JOptionPane.INFORMATION_MESSAGE );
                        
                        // delete all row with table and then fill table again
                        clear();
                        clearTableOfBooks( (DefaultTableModel) tableOfBooks.getModel() );
                        fillingTableOfAllBooks( (DefaultTableModel) tableOfBooks.getModel(), new Object[4] );                        
                    } else {
                        JOptionPane.showMessageDialog( null, "An error occurred!\nThe book was not added to the student.",
                                "Error", JOptionPane.ERROR_MESSAGE );
                    }

                } else {
                    JOptionPane.showMessageDialog( null, "Sorry but currently this book is not present in the library!",
                            "Warning", JOptionPane.WARNING_MESSAGE );
                }
            } else {
                // remove book from student
                result = StudentDao.removeBook( student, book );

                if (result) {
                    JOptionPane.showMessageDialog( null, "The book was successfully removed from the student.",
                            "Info", JOptionPane.INFORMATION_MESSAGE );
                    
                    // delete all row with table and then fill table again
                    clear();
                    clearTableOfBooks( (DefaultTableModel) tableOfBooks.getModel() );
                    fillingTableOfBooks( (DefaultTableModel) tableOfBooks.getModel(), new Object[4] );
                } else {
                    JOptionPane.showMessageDialog( null, "An error occurred!\nThe book was not removed.",
                            "Error", JOptionPane.ERROR_MESSAGE );
                }
            }
        }
    }//GEN-LAST:event_clickOperation
    // end clickOperation method
    
    // buttonContinue mouse click event
    private void clickContinue(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickContinue
        dispose();
    }//GEN-LAST:event_clickContinue

    // textFieldTitle key pressed event
    private void enterTitle(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enterTitle
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
            textFieldAuthor.requestFocus();
    }//GEN-LAST:event_enterTitle

    // method selects a book object from the table of books
    private void getBookFromTable() {        
        int rowCount = tableOfBooks.getSelectedRowCount();
        int rowIndex = tableOfBooks.getSelectedRow();
        book = null;
        
        if ( rowCount > 1) {
            JOptionPane.showMessageDialog( null, "Select only one book!", 
                    "Info", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (rowIndex != -1) {
                // get book title and author from table of books
                String title = tableOfBooks.getValueAt( rowIndex, 1 ).toString();
                String author = tableOfBooks.getValueAt( rowIndex, 2 ).toString();
                
                book = StudentDao.getBook( title, author );
            } else
                JOptionPane.showMessageDialog( null, "First select the book you want from the table!", 
                    "Info", JOptionPane.INFORMATION_MESSAGE );
        }
    } // end getBookFromTable() method
    
    // method finds values in the table that correspond to the entered values
    private void search() {       
        String searchQuery1 = textFieldTitle.getText().toLowerCase();
        String searchQuery2 = textFieldAuthor.getText().toLowerCase();
        
        DefaultTableModel model = (DefaultTableModel) tableOfBooks.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<DefaultTableModel>(model);
        tableOfBooks.setRowSorter( sorter );
        
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
    
    // clear all textfields on the form
    private void clear() {
        textFieldTitle.setText("");
        textFieldTitle.requestFocus();
        textFieldAuthor.setText("");
        
        search();
    }

    public static void start(Student student, boolean isAddition) {
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
            java.util.logging.Logger.getLogger(BookOperation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookOperation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookOperation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookOperation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new BookOperation( student, isAddition ).setVisible( true );
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton buttonClear;
    private javax.swing.JButton buttonContinue;
    private javax.swing.JButton buttonOperation;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAuthor;
    private javax.swing.JLabel labelOperation;
    private javax.swing.JLabel labelSearch;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel panelContinue;
    private javax.swing.JPanel panelOperation;
    private javax.swing.JTable tableOfBooks;
    private javax.swing.JTextField textFieldAuthor;
    private javax.swing.JTextField textFieldTitle;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration
}
