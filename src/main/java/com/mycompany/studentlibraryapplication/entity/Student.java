package com.mycompany.studentlibraryapplication.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Alex Lysun
 */

@Entity
@Table (name = "students")
public class Student extends Librarian implements Serializable {

    private static final long serialVersionUID = -4862926644813433707L;
    // number of books that a student can have
    public static final int QUANTITY_BOOKS = 1;
    
    @ManyToMany (cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Book> books = new ArrayList<>(0);
    
    @ElementCollection
    @CollectionTable (name = "date", joinColumns = @JoinColumn(name="student_id"))                   
    @Column(name = "dates", nullable = false)
    @Temporal(TemporalType.DATE)
    private List<Date> dates = new ArrayList<>(0);

    // default constructor
    public Student() {
        super();
    }

    // constructor that takes parameters
    public Student(String id, String firstName, String lastName, String email, String password) {
        super(id, firstName, lastName, email, password);
    }

    // getters and setters
    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Date> getDates() {
        return dates;
    }

    public void setDates(List<Date> dates) {
        this.dates = dates;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
